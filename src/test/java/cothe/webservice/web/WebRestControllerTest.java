package cothe.webservice.web;

import org.junit.Test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

/**
 * @author Jeongjin Kim
 * @since 2018. 2. 23.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class WebRestControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void checkProfile () {
        //when
        String profile = this.restTemplate.getForObject("/profile", String.class);

        //then
        assertThat(profile).isEqualTo("local");
    }
}
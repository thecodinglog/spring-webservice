package cothe.webservice.domain.posts;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * @author Jeongjin Kim
 * @since 2018. 2. 13.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PostsRepositoryTest {
    @Autowired
    PostsRepository postsRepository;

    @After
    public void cleanup(){
        postsRepository.deleteAll();
    }

    @Test
    public void saveAndLoadPost(){
        //given
        postsRepository.save(Posts.builder()
        .title("테스트 게시글")
        .content("테스트 본문")
        .author("haha@mail")
        .build());

        //when
        List<Posts> postsList = postsRepository.findAll();

        //then
        Posts posts = postsList.get(0);
        assertThat(posts.getTitle(), is("테스트 게시글"));
        assertThat(posts.getContent(), is("테스트 본문"));


    }

    @Test
    public void addBaseTimeEntity(){
        //given
        LocalDateTime now = LocalDateTime.now();
        postsRepository.save(Posts.builder()
        .title("테스트 게시글")
        .content("테스트 본문")
        .author("jfjfj@mil")
        .build());

        //when
        List<Posts> postsList = postsRepository.findAll();

        //then
        Posts posts= postsList.get(0);
        assertTrue(posts.getCreatedDate().isAfter(now));
        assertTrue(posts.getModiLocalDate().isAfter(now));


    }

}
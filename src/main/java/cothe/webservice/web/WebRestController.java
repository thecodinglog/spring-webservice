package cothe.webservice.web;

import cothe.webservice.domain.posts.PostsRepository;
import cothe.webservice.service.PostsService;
import lombok.AllArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * @author Jeongjin Kim
 * @since 2018. 2. 13.
 */
/*
@RestController
 @ResponseBody를 모든 메소드에 적용을 해 준다.
* */
@RestController
@AllArgsConstructor
public class WebRestController {
    private PostsService postsService;
    private Environment env;

    @GetMapping("/hello")
    public String hello(){
        return "HelloWorld";
    }

    @PostMapping("/posts")
    public Long savePosts(@RequestBody PostsSaveRequestDto dto){
        return postsService.save(dto);
    }

    @GetMapping("/profile")
    public String getProfile() {
        return Arrays.stream(env.getActiveProfiles())
                .findFirst()
                .orElse("");
    }
}

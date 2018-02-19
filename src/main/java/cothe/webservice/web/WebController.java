package cothe.webservice.web;

import cothe.webservice.service.PostsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Jeongjin Kim
 * @since 2018. 2. 14.
 */
@Controller
@AllArgsConstructor
public class WebController {
    private PostsService postsService;

     @GetMapping("/")
    public String main(Model model){
        model.addAttribute("posts", postsService.findAllDesc());


        return "main";
    }
}

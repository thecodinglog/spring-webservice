package cothe.webservice.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jeongjin Kim
 * @since 2018. 2. 13.
 */
/*
@RestController
 @ResponseBody를 모든 메소드에 적용을 해 준다.
* */
@RestController
public class WebRestController {
    @GetMapping("/hello")
    public String hello(){
        return "HelloWorld";
    }
}

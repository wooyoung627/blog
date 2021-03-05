package wooyoung.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/")
    public String home(){
        return "home/login";
    }

    @GetMapping("/loginSuccess")
    public String loginSuccess(){
        return "home/success";
    }

    /**
     * 커스텀 로그인 페이지로 이동(반드시 GET 방식이어야 함)
     * @return 커스텀 로그인 페이지로 리턴
     */
    @GetMapping("/login")
    public String login() {
        return "home/login";
    }
}

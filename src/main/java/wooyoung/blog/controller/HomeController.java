package wooyoung.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import wooyoung.blog.dao.HomeDao;
import wooyoung.blog.dto.HomeDto;

import java.util.List;

@Controller
public class HomeController {
    private final HomeDao homeDao;

    @Autowired
    public HomeController(HomeDao homeDao){
        this.homeDao = homeDao;
    }

    @GetMapping("/")
    public String home(){
        return "home/index";
    }

    @GetMapping("/signup")
    public String success(String name, String phone){
        homeDao.ins(name, phone);
        List<HomeDto> homeDtoList = homeDao.sel();
        for(HomeDto homeDto : homeDtoList){
            System.out.println(homeDto);
        }
        return "home/success";
    }
}

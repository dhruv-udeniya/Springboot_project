package ProductProj.SimplewebApp.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

    @RequestMapping("/")
//    @ResponseBody
    public String home(){
        System.out.println("Welcome to home page");
        return "Welcome to home page dhruv";
    }

    @RequestMapping("/about")
    public String about(){
        return "Welcome to About Page...";
    }


}

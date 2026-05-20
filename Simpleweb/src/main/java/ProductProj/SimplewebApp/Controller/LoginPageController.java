package ProductProj.SimplewebApp.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginPageController {

    @RequestMapping("/login")
    public String login(){
        System.out.println("Login");
        return "Welcome to login page..";
    }

}

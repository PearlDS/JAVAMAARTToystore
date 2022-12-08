package toyStore.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import toyStore.data.User;
import toyStore.services.interfaces.UserService;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {


    private UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }



    @GetMapping("/login")
    public String goToLoginPage(HttpSession httpSession){

        if (httpSession.getAttribute("loggedInUserName")==null){
            return "login";
        }
        else {
            return "redirect:/productsBS";
        }
    }

    @PostMapping("/login")
    public String login(User userReceived, HttpSession httpSession){
        System.out.println(userReceived);

        if (userService.getUserByUserNameAndPassword(userReceived.getUserName(), userReceived.getPassWord())!=null){
            httpSession.setAttribute("loggedInUserName", userReceived.getUserName());
            return "redirect:/productsBS";//don't forget the forward slash, try to run this without it
        }
        else {
            return "redirect:/login";
        }


    }
//    @GetMapping("/badlogin")
//    public String goToLoginPageBad(){
//
//
//            return "login";
//
//    }



}

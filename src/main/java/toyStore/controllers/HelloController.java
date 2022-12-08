package toyStore.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "test";
    }

    @GetMapping("/hello2")
    public String hello2(Model model){
        String greeting= "Hello Mars";
        model.addAttribute("message", greeting);
        model.addAttribute("message2", greeting+"!!!!!!");
        return "dynamicTest";
    }


}

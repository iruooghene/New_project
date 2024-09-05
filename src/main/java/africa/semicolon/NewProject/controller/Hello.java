package africa.semicolon.NewProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping(
            "/newProject")
    public String hi(){
        return "i am connected to the internet!!!!!";
    }


}

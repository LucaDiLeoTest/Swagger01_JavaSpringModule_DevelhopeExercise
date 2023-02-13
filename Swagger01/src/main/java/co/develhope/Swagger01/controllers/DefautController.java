package co.develhope.Swagger01.controllers;

import io.swagger.annotations.ApiModelProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefautController {

    @GetMapping("/")
    public String defaultWelcome(){
        return "welcome !";
    }
}

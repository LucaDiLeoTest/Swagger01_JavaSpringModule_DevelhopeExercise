package co.develhope.Swagger01.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/name")
public class NameController {


    @GetMapping("/{name}")
    public String getName(@PathVariable String name){
        return name;
    }
}

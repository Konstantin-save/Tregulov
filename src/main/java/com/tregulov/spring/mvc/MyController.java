package com.tregulov.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
@RequestMapping("/")
    public String showFirstView() {  //метод для вызова view
        return "first-view";
    }
}

package com.ilya.backend.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String redirectToEntries() {
        return "redirect:/entries";
    }
}

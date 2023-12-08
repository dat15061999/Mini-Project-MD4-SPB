package com.cg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class HomeController {

    @GetMapping("")
    public ModelAndView index() {return new ModelAndView("index"); }

    @GetMapping("/cart")
    public ModelAndView showCart() {
        return new ModelAndView("cart");
    }

    @GetMapping("/dashBoard")
    public ModelAndView showDashBoard() {
        return new ModelAndView("dashboard");
    }
}

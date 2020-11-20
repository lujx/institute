package com.darkbright.frameworks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class LoginController {
    
    /**
     * /@RequestMapping来处理多个URI<br/>
     * 这些URL都会由indexMultipleMapping()处理<br/>
     * @return 首页
     */
    @GetMapping(
            {"","/index","/page","/home"}
    )
    public String login(){
        return "redirect:/index.jsp";
    }
}

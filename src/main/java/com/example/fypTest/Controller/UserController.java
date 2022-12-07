package com.example.fypTest.Controller;

import com.example.fypTest.DAO.UserEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;


@Controller

public class UserController {
    @Autowired
    UserEntityRepository testUser;
    @GetMapping("/userInfo")
    public String getUserEmail(HttpSession session) throws Exception {
        System.out.println(testUser.findByIdEquals(1).getEmail());
        session.setAttribute("email", testUser.findByIdEquals(1).getEmail());
        return "home.html";
    }
}

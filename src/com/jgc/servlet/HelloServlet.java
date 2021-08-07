package com.jgc.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("检测到post请求");
        //response.setHeader("Access-Control-Allow-Origin","http://localhost:8080");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("检测到get请求");
//        response.setHeader("Access-Control-Allow-Origin","http://localhost:8080");

//        System.out.println(Thread.currentThread().getId());
    }
}

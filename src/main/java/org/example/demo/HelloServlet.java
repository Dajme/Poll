package org.example.demo;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
public class HelloServlet extends HttpServlet {

    static final String TEMPLATE = "<html>" +
            "<head><title>Profile</title></head>" +
            "<body><p> Your name is: %s</p> " +
            "<p> Your last name is: %s<p/>" +
            "<p>Your favourite colors is: %s</p> " +
            "<p>Your favourite car is: %s </p> " +
            "<p>Your favourite beer is: %s</p> </body></html>";

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String name = req.getParameter("name");
        String lastName = req.getParameter("lastName");
        String color = req.getParameter("color");
        String car = req.getParameter("car");
        String beer = req.getParameter("beer");

        res.setContentType("text/html");

        res.getWriter().println(String.format(TEMPLATE, name, lastName, color, car, beer));
    }


}
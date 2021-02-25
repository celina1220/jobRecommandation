package com.laioffer.job.servlet.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.laioffer.job.servlet.entity.ResultResponse;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LogoutServlet", urlPatterns = {"/logout"})
public class LogoutServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);  // get session, do not create new session
        if (session != null) {
            session.invalidate();  // delete session from memory
        }

        response.sendRedirect("indexhtml");

//        ObjectMapper mapper = new ObjectMapper();
//        response.setContentType("application/json");
//        ResultResponse resultResponse = new ResultResponse("OK");
//        mapper.writeValue(response.getWriter(), resultResponse);
    }
}


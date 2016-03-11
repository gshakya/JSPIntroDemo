/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gunjan.WAP.JSP;

import com.gunjan.WAP.JSP.model.RadioState;
import java.io.*;
import java.net.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class ChooseServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatch = request.getRequestDispatcher("Choose.jsp");
        dispatch.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        if (request.getParameter("radioJSPCool") != null) {
            RadioState jsp = new RadioState();

            if (request.getParameter("radioJSPCool").equals("1")) {

                jsp.setCheckedYes("checked");
                jsp.setCheckedNo("");
            } else {
                jsp.setCheckedYes("");
                jsp.setCheckedNo("checked");
            }
            request.setAttribute("jsp", jsp);
        }

        if (request.getParameter("JSFwayCool") != null) {
            RadioState jsf = new RadioState();
            if (request.getParameter("JSFwayCool").equals("1")) {

                jsf.setCheckedYes("checked");
                jsf.setCheckedNo("");
            } else {
                jsf.setCheckedYes("");
                jsf.setCheckedNo("checked");
            }
            request.setAttribute("jsf", jsf);
        }

        if (request.getParameter("moonCheese") != null) {
            RadioState moon = new RadioState();
            if (request.getParameter("moonCheese").equals("1")) {

                moon.setCheckedYes("checked");
                moon.setCheckedNo("");
            } else {
                moon.setCheckedYes("");
                moon.setCheckedNo("checked");
            }

            request.setAttribute("moon", moon);

        }

        RequestDispatcher dispatch = request.getRequestDispatcher("Choose.jsp");
        dispatch.forward(request, response);
    }
}

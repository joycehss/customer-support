package com.joycehss;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by joyce on 2017/7/8.
 */
@WebServlet(
        name = "sessionListServlet",
        urlPatterns = "/sessions"
)
public class SessionListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(req.getSession().getAttribute("username") == null) {
            resp.sendRedirect("login");
            return;
        }

        req.setAttribute("numberOfSessions", SessionRegistry.getNumberOfSessions());
        req.setAttribute("sessionList", SessionRegistry.getAllSessions());
        req.getRequestDispatcher("/WEB-INF/jsp/view/sessions.jsp").forward(req, resp);
    }
}

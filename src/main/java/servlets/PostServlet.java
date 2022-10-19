package servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class PostServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String num = req.getParameter("num");

        if((name == "")||(num=="")){

            req.setAttribute("alarm", true);
            req.getRequestDispatcher("index.jsp").forward(req, resp);
        }
        else req.getRequestDispatcher("views/1.jsp").forward(req, resp);

    }
}

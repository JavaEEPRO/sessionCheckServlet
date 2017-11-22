package si.meeting;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = "servlet")
public class Servlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().append("forgive me Lord " + req.getMethod());

        HttpSession session = req.getSession();

        if (session.getValue("name") == null) {
            session.putValue("name", " forgive us Lord in this session");
            resp.getWriter().append(" (no session yet) ");
        }else{
            resp.getWriter().append((String)session.getValue("name"));
        }
    }
}

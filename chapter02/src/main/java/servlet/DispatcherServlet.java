package servlet;

import controller.InputProductController;
import controller.SaveProductController;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 传统Servlet形式，耦合度较高，不推荐
 */
public class DispatcherServlet extends HttpServlet {

    private static final long serialVersionUID = -6395821976983329589L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        process(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        process(req, resp);
    }

    private void process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        int lastIndex = uri.lastIndexOf("/");
        String action = uri.substring(lastIndex + 1);

        //forward to a view
        String dispatchUrl = null;
        if (action.equals("product_input.action")) {
            InputProductController inputCtrl = new InputProductController();
            dispatchUrl = inputCtrl.handleRequest(req, resp);
        } else if (action.equals("product_save.action")) {
            SaveProductController saveCtrl = new SaveProductController();
            dispatchUrl = saveCtrl.handleRequest(req, resp);
        }

        if (dispatchUrl != null) {
            RequestDispatcher dispatcher = req.getRequestDispatcher(dispatchUrl);
            dispatcher.forward(req, resp);
        }

    }
}

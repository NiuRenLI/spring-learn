package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 返回ProductForm.jsp的路径
 */
public class InputProductController implements Controller {
    @Override
    public String handleRequest(HttpServletRequest req, HttpServletResponse resp) {
        return "/WEB-INF/jsp/ProductForm.jsp";
    }
}

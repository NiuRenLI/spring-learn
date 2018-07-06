package controller;

import domain.Product;
import form.ProductForm;
import validator.ProductValidator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 通过请求参数来构造一个ProductForm对象，调用验证方法，然后通过该ProductForm对象创建Product对象，并返回ProductForm.jsp路径。
 */
public class SaveProductController implements Controller {
    @Override
    public String handleRequest(HttpServletRequest req, HttpServletResponse resp) {

        ProductForm productForm = new ProductForm();
        //从form表单中取值，并赋值给productForm
        productForm.setName(req.getParameter("name"));
        productForm.setDescription(req.getParameter("description"));
        productForm.setPrice(req.getParameter("price"));

        //唯一需要验证的地方
        ProductValidator validator = new ProductValidator();
        List<String> errors = validator.validate(productForm);
        //错误列表为空，则代表通过验证，接下来创造视图。否则打印错误信息。
        if (errors.isEmpty()) {
            //创建试图
            Product product = new Product();
            product.setName(productForm.getName());
            product.setDescription(productForm.getDescription());
            product.setPrice(Float.parseFloat(productForm.getPrice()));

            req.setAttribute("product", product);
            return "/WEB-INF/jsp/ProductDetails.jsp";
        } else {
            req.setAttribute("errors", errors);
            req.setAttribute("form", productForm);
            return "WEB-INF/jsp/ProductForm.jsp";
        }
    }
}

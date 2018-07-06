package controller;

import domain.Product;
import form.ProductForm;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 通过请求参数来构造一个ProductForm对象，然后通过该ProductForm对象创建Product对象，并返回ProductForm.jsp路径。
 */
public class SaveProductController implements Controller {
    @Override
    public String handleRequest(HttpServletRequest req, HttpServletResponse resp) {

        ProductForm productForm = new ProductForm();
        //从form表单中取值，并赋值给productForm
        productForm.setName(req.getParameter("name"));
        productForm.setDescription(req.getParameter("description"));
        productForm.setPrice(req.getParameter("price"));

        //创建试图
        Product product = new Product();
        product.setName(productForm.getName());
        product.setDescription(productForm.getDescription());
        try {
            product.setPrice(Float.parseFloat(productForm.getPrice()));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        req.setAttribute("product", product);
        return "/WEB-INF/jsp/ProductDetails.jsp";
    }
}

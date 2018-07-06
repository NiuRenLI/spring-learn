package validator;

import form.ProductForm;

import java.util.ArrayList;
import java.util.List;

public class ProductValidator {
    /**
     *返回错误消息，若列表为空，则代表输入合法，通过验证。
     * @param productForm
     * @return
     */
    public List<String> validate(ProductForm productForm) {
        List<String> errors = new ArrayList<>();
        //验证产品名称，不能为空。
        String name = productForm.getName();
        if (name == null || name.trim().isEmpty()) {
            errors.add("Product must have a name");
        }

        //验证价格，第一：不能为空。第二：要符合float类型。
        String price = productForm.getPrice();
        if (price == null || price.trim().isEmpty()) {
            errors.add("Product must have a price");
        } else {
            try {
                Float.parseFloat(price);
            } catch (NumberFormatException e) {
                errors.add("Invalid price value");
            }
        }


        return errors;
    }
}


package form;

/**
 * 和实体类的不通：1 不需要实现Serializable接口。
 * 2 属性price类型为String。<br>
 *
 *     form对象是否有存在的必要？
 *     答：有存在的必要。第一：表单对象有可能传递ServletRequest给其它组件，违反了迪米特法则。
 *     第二：即使验证失败，表单对象也可保存和展示原始表单的输入。
 */
public class ProductForm {
    private String name;
    private String description;
    private String price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}

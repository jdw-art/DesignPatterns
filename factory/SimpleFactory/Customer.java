package factory.SimpleFactory;


/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/6/20 10:20
 * @Version: 1.0
 */
public class Customer {
    public static void main(String[] args) {
        ShapeFactory.getShape("circle").draw();
        ShapeFactory.getShape("rect").draw();
    }
}

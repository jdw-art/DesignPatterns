package factory.SimpleFactory;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/6/20 10:15
 * @Version: 1.0
 */
public class CircleShape implements Shape{
    public CircleShape() {
        System.out.println("CircleShape: created");
    }

    @Override
    public void draw() {
        System.out.println("draw: CircleShape");
    }
}

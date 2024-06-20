package factory.SimpleFactory;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/6/20 10:17
 * @Version: 1.0
 */
public class ShapeFactory {
    public static final String TAG = "ShapeFactory";
    public static Shape getShape(String type) {
        if ("circle".equals(type)) {
            return new CircleShape();
        } else if ("rect".equals(type)) {
            return new RectShape();
        } else {
            return null;
        }
    }
}

package factory.AbstractFactory;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/6/20 10:42
 * @Version: 1.0
 */
public class IOSOperationController implements OperationController{
    @Override
    public void control() {
        System.out.println("IOSOperationController");
    }
}

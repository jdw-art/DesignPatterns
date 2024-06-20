package factory.AbstractFactory;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/6/20 10:44
 * @Version: 1.0
 */
public class IOSFactory implements SystemFactory{
    @Override
    public UIController createInterfaceController() {
        return new IOSUIController();
    }

    @Override
    public OperationController createOperationController() {
        return new IOSOperationController();
    }
}

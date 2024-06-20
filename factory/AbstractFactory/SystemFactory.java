package factory.AbstractFactory;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/6/20 10:43
 * @Version: 1.0
 */
public interface SystemFactory {
    UIController createInterfaceController();
    OperationController createOperationController();
}

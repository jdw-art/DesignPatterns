package factory.AbstractFactory;

/**
 * @Author: Jacob
 * @Description: 抽象工厂模式，抽象工厂模式可以创建出多个对象
 * @Date: 2024/6/20 10:45
 * @Version: 1.0
 */
public class Customer {

    public static void main(String[] args) {
        SystemFactory mFactory;
        UIController uiController;
        OperationController operationController;

        // IOS
        mFactory = new IOSFactory();

        // Android
//        mFactory = new AndroidFactory();

        operationController = mFactory.createOperationController();
        uiController = mFactory.createInterfaceController();
        operationController.control();
        uiController.display();
    }

}

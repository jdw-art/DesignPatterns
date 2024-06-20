package strategy;

/**
 * @Author: Jacob
 * @Description: 策略模式
 * @Date: 2024/6/20 13:49
 * @Version: 1.0
 */
public class Customer {
    public static void main(String[] args) {

        int a = 4, b = 2;
        CalculateContext contextAdd = new CalculateContext(new OperationAdd());
        System.out.println("a + b = " + contextAdd.executeStrategy(a, b));

        CalculateContext contextSub = new CalculateContext(new OperationSub());
        System.out.println("a - b = " + contextSub.executeStrategy(a, b));

        CalculateContext contextMul = new CalculateContext(new OperationMul());
        System.out.println("a * b = " + contextMul.executeStrategy(a, b));

        CalculateContext contextDiv = new CalculateContext(new OperationDiv());
        System.out.println("a / b = " + contextDiv.executeStrategy(a, b));

    }
}

package strategy;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/6/20 13:48
 * @Version: 1.0
 */
public class OperationSub implements CalculateStrategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}

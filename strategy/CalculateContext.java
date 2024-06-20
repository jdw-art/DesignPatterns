package strategy;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/6/20 13:49
 * @Version: 1.0
 */
public class CalculateContext {
    private CalculateStrategy strategy;

    public CalculateContext(CalculateStrategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}

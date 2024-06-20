package factory.FactoryMethod;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/6/20 10:27
 * @Version: 1.0
 */
public class PngReader implements Reader{
    @Override
    public void read() {
        System.out.println("png reader");
    }
}

package factory.FactoryMethod;

/**
 * @Author: Jacob
 * @Description: 工厂方法模式，为每个对象创建一个工厂
 * @Date: 2024/6/20 10:29
 * @Version: 1.0
 */
public class Customer {
    public static void main(String[] args) {
        ReaderFactory factory = new PNGReaderFactory();
        Reader reader = factory.getReader();
        reader.read();
    }
}

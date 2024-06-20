package factory.FactoryMethod;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/6/20 10:29
 * @Version: 1.0
 */
public class PNGReaderFactory implements ReaderFactory{
    @Override
    public Reader getReader() {
        return new PngReader();
    }
}

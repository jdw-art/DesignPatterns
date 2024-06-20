/**
 * @Author: Jacob
 * @Description: 单例模式
 * @Date: 2024/6/19 22:45
 * @Version: 1.0
 */
public class Singleton {
}

/**
 * 饿汉模式-静态属性
 */
class Singleton_1 {

    private Singleton_1() {}

    private static Singleton_1 instance = new Singleton_1();

    public static Singleton_1 getInstance() {
        return instance;
    }

}

/**
 * 饿汉模式-静态代码块
 */
class Singleton_2 {
    private Singleton_2() {}

    private static Singleton_2 instance;

    static {
        instance = new Singleton_2();
    }

    public static Singleton_2 getInstance() {
        return instance;
    }
}

/**
 * 懒汉模式-线程不安全
 */
class Singleton_3 {
    private Singleton_3() {}

    private static Singleton_3 instance;

    public Singleton_3 getInstance() {
        if (instance == null) {
            instance = new Singleton_3();
        }
        return instance;
    }
}

/**
 * 懒汉模式-线程安全
 */
class Singleton_5 {
    private Singleton_5() {}

    private static Singleton_5 instance;

    public static synchronized Singleton_5 getInstance() {
        if (instance == null) {
            instance = new Singleton_5();
        }
        return instance;
    }
}

/**
 * 懒汉模式-线程安全-双重锁检查
 */
class Singleton_6 {
    private Singleton_6() {}

    private static Singleton_6 instance;

    public static Singleton_6 getInstance() {
        if (instance == null) {
            synchronized (Singleton_6.class) {
                if (instance == null) {
                    instance = new Singleton_6();
                }

            }
        }
        return instance;
    }
}

/**
 * 静态内部类
 */
class Singleton_7 {
    private static class SingletonHandler {
        private static Singleton_7 instance = new Singleton_7();
    }

    private Singleton_7() {}

    private static Singleton_7 getInstance() {
        return SingletonHandler.instance;
    }
}

/**
 * 枚举模式
 */
enum Singleton_8 {
    INSTANCE;
}

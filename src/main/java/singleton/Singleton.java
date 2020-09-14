package singleton;

/**
 * @author liangze
 * 静态内部类实现单例模式
 * @create 2020-09-14 上午10:57
 */
public class Singleton {

    static {
        //静态代码块会随着类加载执行
        System.out.println("外部类加载");
    }

    //类加载时候,内部类并不会被加载
    private static class SingletonStaticClass {
        private static final Singleton STATIC_INSTANCE;
        //内部类的静态代码块随着内部类的加载进行
        static {
            System.out.println("静态内部类加载");
            STATIC_INSTANCE = new Singleton();
        }
    }

    private  class SingletonNotStaticClass {
        private  final Singleton NOT_STATIC_INSTANCE;
        //内部类的代码块随着内部类的加载进行
          {
            System.out.println("内部类加载");
             NOT_STATIC_INSTANCE = new Singleton();
        }
        private Singleton getNOT_STATIC_INSTANCE(){
              return NOT_STATIC_INSTANCE;
        }
    }

    public static Singleton getStaticInstance() {
        return SingletonStaticClass.STATIC_INSTANCE;
    }

    public  Singleton getNotStaticInstance() {
        return new SingletonNotStaticClass().getNOT_STATIC_INSTANCE();
    }

}

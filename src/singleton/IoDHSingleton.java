package singleton;
//在单例类中添加一个静态内部类，在该内部类中创建单例对象，再将该单例对象通过getInstance()方法返回给外部使用。
public class IoDHSingleton {

    private IoDHSingleton(){
        System.out.println("########初始化########");
    }
    public static class HolderClass{
        private final static IoDHSingleton instance = new IoDHSingleton();
    }

    public static IoDHSingleton getInstance(int i){
        System.out.println("thread--"+i+"--enter");
        return HolderClass.instance;
    }
}

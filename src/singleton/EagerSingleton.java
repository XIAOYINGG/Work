package singleton;
//饿汉式单例
public class EagerSingleton {

    private static final EagerSingleton instance = new EagerSingleton();
    private EagerSingleton(){
        System.out.println("######初始化######");
    };

    public static EagerSingleton getInstance(int i){
        System.out.println("thread--"+i+"--enter");
        return instance;
    }
}

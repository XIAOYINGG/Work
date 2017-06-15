package singleton;
/*  带双重检查锁定机制的懒汉式单例，在需要单例对象的时候，才创建唯一的单例对象，
    以后再次调用，返回的也是第一创建的单例对象，将静态成员初始化为null，在获取单例的时候才创建，故此叫懒汉式*/

public class LazySingleton {

    private static LazySingleton instance = null;
    private LazySingleton(){
        System.out.println("#######初始化######");
    }

    public static LazySingleton getInstance(int i){
        System.out.println("thread--"+i+"--enter");
        if(instance==null){  //第一次判断是否为null
            System.out.println("thread--"+i+"--enter status 1");
            synchronized(LazySingleton.class){  //在代码块中加同步锁
                if(instance==null){
                    System.out.println("thread--"+i+"--enter status 2");
                    instance=new LazySingleton();
                }
            }
        }
        return instance;
    }
}

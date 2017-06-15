package singleton;
//多线程测试懒汉式单例
public class LazyMyThread extends Thread {
    private int s;
    public LazyMyThread(int i){
        this.s=i;
    }
    @Override
    public void run() {
        LazySingleton.getInstance(s);
    }
    public static void main(String[] args){
        System.out.println("LazySingleton!!");
        for(int i = 0;i<4;i++){
            new LazyMyThread(i).start();
        }
    }

}

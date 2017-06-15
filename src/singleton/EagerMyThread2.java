package singleton;
//多线程测试饿汉式单例
public class EagerMyThread2 extends Thread {

    private int s;
    public EagerMyThread2(int i){
        this.s=i;
    }
    @Override
    public void run() {
        EagerSingleton.getInstance(s);
    }
    public static void main(String[] args){
        System.out.println("EagerSingleton!!");
        for(int i = 0;i<4;i++){
            new EagerMyThread2(i).start();
        }
    }
}

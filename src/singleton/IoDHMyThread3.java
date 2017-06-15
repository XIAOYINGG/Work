package singleton;
//多线程测试IoDH
public class IoDHMyThread3 extends Thread {
    private int s;
    public IoDHMyThread3(int i){
        this.s=i;
    }
    @Override
    public void run() {
        IoDHSingleton.getInstance(s);
    }
    public static void main(String[] args){
        System.out.println("IoDHSingleton!!");
        for(int i = 0;i<4;i++){
            new IoDHMyThread3(i).start();
        }
    }
}

package singleton;
//多线程测试懒汉式单例
public class DCLMyThread extends Thread {
    private int s;
    public DCLMyThread(int i){
        this.s=i;
    }
    @Override
    public void run() {
        DCLSingleton.getInstance();
    }
    public static void main(String[] args){
        System.out.println("DCLSingleton!!");
        for(int i = 0;i<4;i++){
            new DCLMyThread(i).start();
        }
    }

}

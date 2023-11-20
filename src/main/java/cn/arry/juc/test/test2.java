package cn.arry.juc.test;

/**
 * @author arry
 * @description 演示线程的交替执行
 * @since 1.0
 */
public class test2 {

    public static void main(String[] args) {
        Thread thread1 = new Thread(){
            @Override
            public void run() {
                while (true){
                    System.out.println("t1-running...");
                }
            }
        };
        thread1.start();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                while (true){
                    System.out.println("t2-runing...");
                }
            }
        };
        Thread thread2 = new Thread(runnable);
        thread2.start();
    }
}

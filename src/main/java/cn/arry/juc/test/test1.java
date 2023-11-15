package cn.arry.juc.test;




/**
 * @author arry
 * @description juc测试
 * @since 1.0
 */
public class test1 {

    public static void main(String[] args) throws InterruptedException {
/**
 * 创建线程的方法1：直接使用Thread
 */
        Thread thread1 = new Thread(){
            @Override
            public void run() {
                System.out.println("thread1-running...");
            }
        };
        thread1.setName("t1");
        thread1.start();
        //Thread.sleep(100);
        System.out.println("main-running...");

        /**
         * 创建线程的方法2：使用Runnable配合Thread
         */
        Runnable runnable = new Runnable(){

            @Override
            public void run() {
                System.out.println("runnable-running...");
            }
        };
        Thread thread2 = new Thread(runnable);
        thread2.start();

    }


}

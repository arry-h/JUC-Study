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
        Thread thread = new Thread(){
            @Override
            public void run() {
                System.out.println("running...");
            }
        };
        thread.setName("t1");
        thread.start();
        //Thread.sleep(100);
        System.out.println("main-running...");
    }
}

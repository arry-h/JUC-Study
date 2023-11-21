package cn.arry.juc.test;

/**
 * @author arry
 * @description 多个线程同时运行，断点模式要选择Thread
 * @since 1.0
 */
public class test3 {

    public static void main(String[] args) {
        Thread thread = new Thread(){
            @Override
            public void run() {
                method(20);
            }
        };
        thread.start();
        method(10);
    }
    private static void method(int x){
        System.out.println(x + "method running...");
    }

}

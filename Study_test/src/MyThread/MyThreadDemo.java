package MyThread;

public class MyThreadDemo {

    public static void main(String[] args) {

        MyThread my1 = new MyThread();
        MyThread my2 = new MyThread();

        /*my1.run();
        my2.run();*/

        my1.setName("hh");
        my2.setName("gg");

//       MyThread my1=new MyThread("hh");
//       MyThread my2=new MyThread("gg");

        //void start​() 导致此线程开始执行; Java虚拟机调用此线程的run方法。
//        my1.start();
//        my2.start();

//        System.out.println(Thread.currentThread().getName());
    }
}

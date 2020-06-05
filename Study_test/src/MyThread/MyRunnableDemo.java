package MyThread;

public class MyRunnableDemo {

    public static void main(String[] args) {

        MyRunnable mr = new MyRunnable();

        //Thread​(Runnable target) 分配一个新的 Thread对象
//        Thread t1=new Thread(mr);
//        Thread t2=new Thread(mr);

        //Thread​(Runnable target , String name)	分配一个新的 Thread对象*
        Thread t1 = new Thread(mr,"hh");
        Thread t2 = new Thread(mr,"gg");


        t1.start();
        t2.start();
    }
}

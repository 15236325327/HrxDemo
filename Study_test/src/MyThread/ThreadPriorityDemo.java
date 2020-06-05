package MyThread;

public class ThreadPriorityDemo {

    public static void main(String[] args) {

        ThreadPriority th1=new ThreadPriority();
        ThreadPriority th2=new ThreadPriority();
        ThreadPriority th3=new ThreadPriority();

        th1.setName("自行车");
        th2.setName("电车");
        th3.setName("摩托车");

        //public final int getPriority() 返回此线程的优先级
//        System.out.println(th1.getPriority());//优先级=5
//        System.out.println(th2.getPriority());//优先级=5
//        System.out.println(th3.getPriority());//优先级=5

        //public final void setPriority() 更改线程优先级
//        th1.setPriority(10000);//IllegalArgumentException
//        System.out.println(Thread.MAX_PRIORITY);//10
//        System.out.println(Thread.MIN_PRIORITY);//1

        th1.setPriority(10);
        th2.setPriority(8);
        th3.setPriority(5);

        th1.start();
        th2.start();
        th3.start();
    }
}

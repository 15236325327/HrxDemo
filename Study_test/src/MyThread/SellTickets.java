package MyThread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SellTickets implements Runnable {

//    private int tickets = 100;
//    private  Object obj=new Object();
//
//    @Override
//    public void run() {
//
//        while (true) {
//            synchronized (obj) {
//                if (tickets > 0) {
//                    try {
//                        Thread.sleep(100);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
//                    tickets--;
//                }
//            }
//        }
//    }


//    private int tickets = 100;
//    private Lock lock = new ReentrantLock();
//
//    @Override
//    public void run() {
//
//        try {
//            lock.lock();
//
//            while (true) {
//                if (tickets > 0) {
//                    try {
//                        Thread.sleep(100);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
//                    tickets--;
//                }
//            }
//        } finally {
//            lock.unlock();
//        }
//    }


    private  static int tickets = 100;
    private Object obj = new Object();
    private int x = 0;

    @Override
    public void run() {
        while (true) {

            if (x % 2 == 0) {
                synchronized (SellTickets.class) {
                    if (tickets > 0) {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
                        tickets--;
                    }
                }
            } else {

                selltickets();

            }
            x++;
        }
    }

    private static synchronized void selltickets() {

            if (tickets > 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
                tickets--;
            }
        }
    }
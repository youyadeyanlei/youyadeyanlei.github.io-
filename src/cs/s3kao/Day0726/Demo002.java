package cs.s3kao.Day0726;

/**
 * setName,设置线程名称
 * getname，获取线程名称
 * Thread.currentThread().获得线程对象
 * run()线程体，线程要执行的方法
 * start，线程开始执行
 * Thread.sleep,睡眠
 * join等待线程结束
 * join(时间)等待调用的线程到指定的时间，然后继续执行
 * yield()暂停一个线程，该线程会释放cpu的控制权限，此时该线程和其他线程再去抢xpu
 * setPriority线程的优先级，并不会一定执行，只是提高了执行几率
 * getPriority线程的优先级
 * setDaemon守护线程，当用户线程全部结束，才会结束
 */

public class Demo002 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new SubThread2();
        Thread t2 = new SubThread2();
        t1.setName("线程1");
        t2.setName("线程2");
        t1.start();
        t2.start();
        Thread.sleep(100);
        System.out.println("--------------------");
    }
}

class SubThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "+" + i);
        }
    }
}
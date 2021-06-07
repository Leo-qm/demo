import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 线程创建示例 3
 */
public class MyThread {
    // 创建方式 3：实现 Callable 接口
    static class MyCallable implements Callable<Integer> {

        @Override
        public Integer call() throws Exception {
            int num = new Random().nextInt(10);
            System.out.println("生成随机数：" + num);
            return num;
        }
    }
    // 代码测试
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 创建 Callable 子对象
        MyCallable callable = new MyCallable();
        // 使用 FutureTask 配合 Callable 子对象得到执行结果
        FutureTask<Integer> futureTask = new FutureTask<>(callable);
        // 创建线程
        Thread thread = new Thread(futureTask);
        // 启动线程
        thread.start();
        // 得到线程执行的结果
        int result = futureTask.get();
        System.out.println("主线程中拿到子线程执行结果：" + result);
    }
}


//// 创建方式 1：继承 Thread
//class MyThread extends Thread {
//    @Override
//    public void run() {
//        System.out.println("你好，线程~");
//    }
//}
//// 测试
//public class ThreadExample {
//    public static void main(String[] args) {
//        // 创建线程
//        Thread thread = new MyThread();
//        // 启动线程
//        thread.start();
//    }
//}


//    // 变种 1：匿名方式创建线程
//    Thread t1 = new Thread() {
//        @Override
//        public void run() {
//            System.out.println("线程变种");
//        }
//    };
//// 启动线程
//t1.start();
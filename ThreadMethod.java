public class ThreadMethod extends Thread{
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Thread"+i+"="+Thread.currentThread().getName());
//               Thread.yield();
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(e);
            }

        }
    }

    public static void main(String[] args)throws InterruptedException {
        ThreadMethod t1=new ThreadMethod();
        ThreadMethod t2=new ThreadMethod();

        t1.start();
        t2.start();

//       t1.join();
//        t2.join();
    }
}
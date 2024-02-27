package anonymousclass;

public class MyRunnableMain3 {
    public static void main(String[] args) {

        MyRunnable myRunnable = new MyRunnable() {
            @Override
            public void run() {
                System.out.println("hello!!!");
            }
        };

        RunnableExecute runnableExecute = new RunnableExecute();
        System.out.println("----------");
        runnableExecute.execute(() -> {
            System.out.println("hello!!!");
        });
        System.out.println("----------");
    }
}

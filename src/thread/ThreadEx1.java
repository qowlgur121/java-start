package thread;

public class ThreadEx1 {
    public static void main(String[] args) {
        System.out.println("1");

        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }).start();

        System.out.println();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                }
            }
        }).start();

        System.out.println();

        System.out.println("2");
    }
}

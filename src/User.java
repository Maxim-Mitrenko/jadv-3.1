public class User extends Thread {

    private static final long TIME_WAIT = 1000;
    private static final int COUNT_WORK = 5;
    private final Toy toy;

    public User(Toy toy) {
        this.toy = toy;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < COUNT_WORK; i++) {
                System.out.println("Пользователь включил тумблер!");
                toy.open();
                Thread.sleep(TIME_WAIT);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            toy.interrupt();
        }
    }
}
public class Toy extends Thread{

    private volatile boolean isOpen;

    @Override
    public void run() {
        while (!isInterrupted()) {
            if (isOpen) {
                System.out.println("Игрушка выключает тумблер!");
                isOpen = false;
            }
        }
    }

    public void open() {
        isOpen = true;
    }
}
import java.util.Random;

public class AlphabetThread extends Thread {

    @Override
    public void run() {
        Random random = new Random();

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println(ch);
            int sleepTime = 100 + random.nextInt(401);

            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        AlphabetThread alphabetThread = new AlphabetThread();
        alphabetThread.start();

        try {
            alphabetThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }

        System.out.println("All alphabets printed!");
    }
}

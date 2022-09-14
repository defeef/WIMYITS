import java.util.Random;

public class Main {
    public static void main(String args[]) {
        Random rnd = new Random();
        for (int i = 0; i >= 0; i++) {
            try {
                Thread.sleep(rnd.nextInt(1000) + 1);
                System.out.println("Wenimechaindasuma");
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
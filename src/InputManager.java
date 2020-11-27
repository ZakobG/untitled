import java.util.Scanner;

public enum InputManager {
    INSTANCE;
   private Scanner scam = new Scanner(System.in);

    public String getString() {
        return InputManager.INSTANCE.scam.nextLine();
    }
}

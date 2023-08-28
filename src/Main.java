import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner (System.in);
        System.out.println("what game would you like to play");
        System.out.println("1. Titactoe");
        int option = keyboard.nextInt();
        if (option == 1) {
            Tictactoe.main(args);
        }
        keyboard.close();
    }
}

import java.util.Scanner;
import java.util.HashSet;

public class Tictactoe {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";
    static Scanner keyboard = new Scanner(System.in);
    static HashSet<Short> player1 = new  HashSet<Short>();
    static HashSet<Short> player2 = new  HashSet<Short>();
    static short y = 0;
    static short x;
    static boolean p1won = false;
    static boolean p2won = false;
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Tictactoe by Akash");
        start();
        for (int a = 0; a < 5; a++) {
            playerone();
            clear();
            draw();
            check();
            if (p1won == true) {
                System.out.println("player 1 won!");
                break;
            } else if (p2won == true) {
                System.out.println("player 2 won!");
                break;
            }
            playertwo();
            clear();
            draw();
            check();
            if (p1won == true) {
                System.out.println("player 1 won!");
                break;
            } else if (p2won == true) {
                System.out.println("player 2 won!");
                break;
            }
            
        }
        System.out.print("Game has ended");

    }

    public static void start() {
        for (short i = 0; i < 3; i++) {
            for (short j = 0; j < 3; j++) {
                y++;
                System.out.print(y + " ");
            }
            System.out.println("");
        }
    }

    public static void playerone() {
        System.out.println("Player one: Enter number");
        x = keyboard.nextShort();
        player1.add(x);
    }

    public static void playertwo() {
        System.out.println("Player two: Enter number");
        x = keyboard.nextShort();
        player2.add(x);
    }

    public static void clear() {
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

    public static void draw() {
        y = 0;
        for (short i = 0; i < 3; i++) {
            for (short j = 0; j < 3; j++) {
                y++;
                if (player2.contains(y)) {
                    System.out.print(ANSI_BLUE + "O " + ANSI_RESET); 
                }else if (player1.contains(y)) {
                    System.out.print(ANSI_RED + "X " + ANSI_RESET);
                } else {
                    System.out.print(y + " ");
                }
            }
            System.out.println("");
        }
    }

    public static void check() {

        if (player1.contains((short) 1) && player1.contains((short)2) && player1.contains((short) 3)) {
            p1won = true;
        } else if (player2.contains((short)1) && player2.contains((short) 2) && player2.contains((short) 3)){
            p2won = true;
        }

        if (player1.contains((short) 1) && player1.contains((short)4) && player1.contains((short)7)) {
            p1won = true;
        } else if (player2.contains((short)1) && player2.contains((short)4) && player2.contains((short)7)){
            p2won = true;
        }

        if (player1.contains((short)2) && player1.contains((short)5) && player1.contains((short)8)) {
            p1won = true;
        } else if (player2.contains((short)2) && player2.contains((short)5) && player2.contains((short)8)) {
            p2won = true;
        }

        if (player1.contains((short)3) && player1.contains((short)6) && player1.contains((short)9)) {
            p1won = true;
        } else if (player2.contains((short)3) && player2.contains((short)6) && player2.contains((short)9)) {
            p2won = true;
        }

        if (player1.contains((short)4) && player1.contains((short)5) && player1.contains((short)6)) {
            p1won = true;
        } else if (player2.contains((short)4) && player2.contains((short)5) && player2.contains((short)6)) {
            p2won = true;
        }

        if (player1.contains((short)7) && player1.contains((short)8) && player1.contains((short)9)) {
            p1won = true;
        } else if (player2.contains((short)7) && player2.contains((short)8) && player2.contains((short)9)) {
            p2won = true;
        }

        if (player1.contains((short)1) && player1.contains((short)5) && player1.contains((short)9)) {
            p1won = true;
        } else if (player2.contains((short)1) && player2.contains((short)5) && player2.contains((short)9)) {
            p2won = true;
        }

        if (player1.contains((short)3) && player1.contains((short)5) && player1.contains((short)7)) {
            p1won = true;
        } else if (player1.contains((short)3) && player1.contains((short)5) && player1.contains((short)7)) {
            p2won = true;
        }


    }
}

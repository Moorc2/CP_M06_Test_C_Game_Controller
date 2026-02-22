import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder path = new StringBuilder();
        String command = "";
        boolean gotCmd = false;

        do {
            while (!gotCmd) {
                System.out.print("Enter a command: U-Up, D-Down, L-Left, R-Right, Q-Quit: ");
                command = in.nextLine().trim().toUpperCase();

                if (command.matches("[UDLRQ]")) {
                    gotCmd = true;
                } else {
                    System.out.println("Invalid input. Please enter U, D, L, R, or Q.");
                }
            }

            gotCmd = false;

            switch (command) {
                case "U":
                    path.append(command);
                    System.out.println("Moving up");
                    break;
                case "D":
                    path.append(command);
                    System.out.println("Moving down");
                    break;
                case "L":
                    path.append(command);
                    System.out.println("Moving left");
                    break;
                case "R":
                    path.append(command);
                    System.out.println("Moving right");
                    break;
                case "Q":
                    System.out.println("Quitting the game");
                    break;
            }

            if (!command.equals("Q")) {
                System.out.println("Path: " + path.toString());
            }

        } while (!command.equals("Q"));

        System.out.println("Final Path: " + path.toString());
    }
}
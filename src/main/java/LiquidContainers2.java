
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

Container firstContainer = new Container();
Container secondContainer = new Container();
        while (true) {
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);
            String input = scan.nextLine();
            String[] parts = input.split(" ");

            if (parts.length != 2) {
                if (input.equals("quit")) {
                    break;
                }
                continue;
            }

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            switch (command) {
                case "add":
                    firstContainer.add(amount);
                    break;
                case "move":
                    if (firstContainer.contains() < amount) {
                        int amountToMove = firstContainer.contains();
                        firstContainer.remove(amount);
                        secondContainer.add(amountToMove);
                    } else {
                        firstContainer.remove(amount);
                        secondContainer.add(amount);
                    }
                    break;
                case "remove":
                    secondContainer.remove(amount);
                    break;
                default:
                    System.out.println("Unknown command");
                    break;
            }
        }
    }
}


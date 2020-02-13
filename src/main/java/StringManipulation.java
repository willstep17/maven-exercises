import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;

        while(true) {
            System.out.print("Enter Something: ");
            userInput = scanner.nextLine();
            if(StringUtils.isNumeric(userInput)) {
                System.out.println("\"" + userInput + "\"" + " is numeric");
            } else {
                System.out.println("\"" + userInput + "\"" + " is not numeric");
            }
            System.out.println("Flipped Case: " + StringUtils.swapCase(userInput));
            System.out.println("Reversed: " + StringUtils.reverse(userInput));
            System.out.println("\nExit? (y/n):");
            if(scanner.nextLine().toLowerCase().equals("y")) {
                return;
            }
        }

    }

}

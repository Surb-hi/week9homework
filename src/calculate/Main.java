package calculate;

import java.util.Locale;
import java.util.Scanner;

public class Main extends Calculator {
    public static void main(String[] args) {
        Scanner OBJ = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Enter a First number:");
            int a = OBJ.nextInt();
            System.out.println("Enter a Second Number:");
            int b = OBJ.nextInt();
            System.out.println("Please enter one of symbol +,-,*, /");
            char symbol = OBJ.next().charAt(0);
            Calculator obj1 = new Calculator();
            obj1.calculateResult(a, b, symbol);
            System.out.println("Would you like to do more calculation Please enter Y or N");
            answer = OBJ.next().toLowerCase(Locale.ROOT);
        } while (answer.startsWith("y"));

    }
}

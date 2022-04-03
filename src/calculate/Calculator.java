package calculate;

public class Calculator {
    public void addition(int a, int b) {
        System.out.println("Addition " + a + " and " + b +" is: " +(a+b));
    }

    public void subtraction(int a, int b) {
        System.out.println("subtraction " + a + " and " + b +" is: " +(a-b));
    }

    public void multiplication(int a, int b) {
        System.out.println("multiplication " + a + " and " + b +" is: " +(a*b));
    }

    public void division(int a, int b) {
        System.out.println("division " + a + " and " + b +" is: " +(a/b));
    }

    public void calculateResult(int a, int b, char symbol) {
        if (symbol == '+') {
            addition(a, b);

        } else if (symbol == '-') {
            subtraction(a, b);

        } else if (symbol == '*') {
            multiplication(a, b);

        } else if (symbol == '/') {
            division(a, b);

        }else
            System.out.println("Invalid Symbol");
    }
}

package homeworkweek8;

import java.util.ArrayList;
import java.util.Scanner;

public class Program6_Retrievea_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> vegetables = new ArrayList<>();
        vegetables.add("Cucumber");
        vegetables.add("Mashroom");
        vegetables.add("Potatoes");
        vegetables.add("Green beans");
        vegetables.add("Onion");
        vegetables.add("Beatroot");
        vegetables.add("Peas");
        vegetables.add("Cabbage");
        vegetables.add("Garlic");
        vegetables.add("Peppers");
        vegetables.add("Chile");
        vegetables.add("Broccli");
        vegetables.add("Corn");
        System.out.println(vegetables);
        Scanner obj1=new Scanner(System.in);
        System.out.println("Enter any index number:");
        int index=obj1.nextInt();
        System.out.println(vegetables.get(index));


    }
}

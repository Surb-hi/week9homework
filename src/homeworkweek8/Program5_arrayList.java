package homeworkweek8;

import java.util.ArrayList;
import java.util.ListIterator;

public class Program5_arrayList {
    public static void main(String[] args) {
        ArrayList<String> colorList = new ArrayList<>();
        colorList.add("red");
        colorList.add("blue");
        colorList.add("Pink");
        colorList.add("Yellow");
        colorList.add("Brown");
        colorList.add("Purple");
        colorList.add("Black");
        colorList.add("White");
        colorList.add("Green");
        colorList.add("Orange");
        //for (String Colorname : colorList)
        //  System.out.println(Colorname);

        ListIterator<String> iterate = colorList.listIterator();
        System.out.println("Iterating over ArrayList:");
        while (iterate.hasNext()) {
            System.out.print(iterate.next() + ", ");
        }
    }
}
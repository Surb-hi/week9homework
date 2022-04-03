package homeworkweek8;

import java.util.ArrayList;

public class Program4_Collection {
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
        for (String Colorname : colorList) {
            System.out.println(Colorname);
        }
    }
}
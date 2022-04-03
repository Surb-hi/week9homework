package homeworkweek8;

import java.util.Arrays;

//Write a Java program to reverse an array of integer values.
public class Program3_ReverseAnArray {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Original array: "+ Arrays.toString(a));
      for(int i=0;i<a.length/2;i++){
          int t=a[i];
          a[i]=a[a.length-i-1];
          a[a.length-i-1]=t;
      }
        System.out.println("Reverse array :"+ Arrays.toString(a));
    }
}
package Input;
import java.io.*;
import java.util.Scanner;
class io{
    public static void main (String args[]){

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Num");
        num = sc.nextInt();
        System.out.println("Num is :"+ num);
    }
}
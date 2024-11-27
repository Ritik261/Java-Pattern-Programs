/*
 
  ****
  ***
  **
  *
  
 */

 import java.util.Scanner;

 class pattern4{
     public static void main(String args[]){
         int n;
 
         System.out.println("Enter Rows");
         Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
 
         for(int i = n ; i >= 1 ;i--){
             for (int j = 1; j <= i ; j++){
                 System.out.print("*");
             }
             System.out.print("\n");
         }
     }
  }
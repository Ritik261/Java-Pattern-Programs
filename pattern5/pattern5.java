/*
       * 
      **
     ***
    ****
 */


import java.util.Scanner;

class pattern5{
    public static void main(String args[]){
        int n;

        System.out.println("Enter Rows");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i = 1 ; i <= n ;i++){
            
            // for printing spaces
            for (int j = 1; j <= n-i ; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <=i; j++)
                System.out.print("*");
            System.out.print("\n");
        }
    }
 }
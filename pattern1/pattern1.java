/*  print this pattern in java

****
****
****
****

*/

import java.util.Scanner;

class pattern1{
    public static void main(String[] args) {
        int n,m;

        System.out.println("Enter Value of Rows");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        System.out.println("Enter value of column");
        Scanner s = new Scanner(System.in);
        m = s.nextInt();

        System.out.println("Output Pattern is :");

        for (int i = 0; i< n ;i++){
            for(int j = 0; j<m ;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
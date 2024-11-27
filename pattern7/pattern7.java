/*
Inverted Half Numbered Pattern
    1234
    123
    12
    1
 */
import java.util.*;
 class pattern7{
    public static void main(String args[]){
        int n, i, j;
        System.out.println("Enter the col");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for( i =1; i <= n ; i++){
            for( j = 1 ; j<= n-i+1; j++){
                System.out.print(j +" ");
            }
            System.out.println();
         }
    }
 }
/*
    1
    12
    123
    1234
    1234
 */
import java.util.*;
 class pattern6{
    public static void main(String args[]){
        int n;
        System.out.println("Enter the col");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i =1; i <= n ; i++){
            for(int j = 1 ; j<= i; j++){
                System.out.print(j +" ");
            }
            System.out.print("\n");
        }
    }
 }
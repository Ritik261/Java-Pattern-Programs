import java.util.Scanner;

class forloop{
    public static void main(String arg[]){
        int num = 0;

        System.out.println("Enter the number");
        Scanner s = new Scanner(System.in);

        num = s.nextInt();

        for(int i =0 ; i<num ;i++){
            System.out.println("Num is:"+ i);
        }

        System.out.println("Enter Value of n");
        Scanner n = new Scanner(System.in);

        int val = n.nextInt();
        while(val > 0){
            System.out.println("New val:"+ val);
            val--;
        }

    }
}
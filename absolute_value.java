import java.util.Scanner;

public class absolute_value {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        System.out.println("Enter the number :");
        int x = S.nextInt();
        S.close();

        if(x<0){
            System.out.println("Absolute value is : " + (-1*x));
        }
        else{
            System.out.println("Absolute value is : "+ x);
        }
    }
}

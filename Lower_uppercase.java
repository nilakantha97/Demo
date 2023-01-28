import java.util.Scanner;

public class Lower_uppercase {
   public static void main(String[] args) {
       Scanner S = new Scanner(System.in);
       System.out.println("Enter the character :");
       char ch = S.next().charAt(0);

       S.close();

       if(ch>='A' && ch<='Z'){//if it is true ,display upper case
        System.out.println(ch+" is an upper case letter ");
       }
       else if(ch>='a' && ch<='z'){//if it is true ,display lower case
        System.out.println(ch+" is a lower case letter ");
       }
       else{
        System.out.println(ch+" is not a Alphabet ");
       }
   } 
}

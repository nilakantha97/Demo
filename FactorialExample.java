import java.util.Scanner;

class FactorialExample{  
    public static void main(String args[]){
        Scanner Scan = new Scanner(System.in);
     int fact=1; 
     System.out.println("Enter the number");
     int num= Scan.nextInt();//It is the number to calculate factorial    
     System.out.println("The number for which is factorial is needed is :" +num );
     System.out.println();//blank line

     Scan.close();

     //for loop statement

     for(int i=1;i<=num;i++){    
         fact=fact*i;    
     }    
     System.out.println("Factorial of "+num+" is: "+fact);    
    } 
    
   }  
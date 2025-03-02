import java.util.*;
class relationaloperator{
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);
         System.out.println("enter the number1");
         int num1 = obj.nextInt();
         System.out.println("enter the number2");
         int num2 = obj.nextInt();
         
         if(num1 == num2)
         {
            System.out.println("num1 and num2 are equal");
         
         }
         else if(num1 > num2)
         {
            System.out.println("num1 is greater");
         }
        else
         {
            System.out.println("num2 is greater");
         }
    }
}
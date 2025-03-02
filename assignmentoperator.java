import java.util.*;
class assignmentoperator{
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);
         System.out.println("enter the number1");
         int num1 = obj.nextInt();
         System.out.println("enter the number2");
         int num2 = obj.nextInt();
         System.out.println("the result is" +(num2 += num1));
         System.out.println("the result is" +(num2 -= num1));
         System.out.println("the result is" +(num2 *= num1));
         System.out.println("the result is" +(num2 /= num1));
         System.out.println("the result is" +(num2 %= num1));

         
    }
}
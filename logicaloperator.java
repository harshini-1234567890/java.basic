import java.util.*;
class logicaloperator{
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);
         System.out.println("enter the number1");
         int num1 = obj.nextInt();
         
         if(num1%3==0 && num1%5==0)
         {
            System.out.println("it is divisible");
         
         }
         else 
         {
            System.out.println("not divisible");
  }
}
}
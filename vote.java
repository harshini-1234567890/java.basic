import java.util.*;
class vote{
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the age");
        int age = obj.nextInt();
        if(age >= 18)
        {
            System.out.println("eligible to vote");


        }
        else
        {
            System.out.println("not eligible to vote");
        }
    }
}
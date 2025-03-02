import java.util.*;
class grade{
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the mark");
        int mark = obj.nextInt();
        if(mark >= 90 && mark <= 100 )
        {
            System.out.println("A GRADE");
        }
        else if(mark >= 80 && mark <= 89)
        {
            System.out.println("B GRADE");
        }
        else if(mark >= 70 && mark <= 79)
        {
            System.out.println("C GRADE");
        }
        else if(mark >= 60 && mark <= 68)
        {
            System.out.println("D GRADE");
        }
        else 
        {
            System.out.println("FAIL");
        }




    }

}
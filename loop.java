/**class loop{
    public static void main(String[] args){
        int i=1;
    
       while (i<=10){
            System.out.println(+i);
            i++;


        }
    }
}
*/
/**class loop{
    public static void main(String[] args){
        int num=2;
        int sum =0;
        
        while(num<=50){
            if(num%2==0){
             sum += num;

            }
            num++;
             

            }
            System.out.println("sum of even number is : "+sum);
        }
}
*/
/**import java.util.*;
class loop{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int rem,q,rev=0;
                System.out.print("Enter the Num: ");
        int num = obj.nextInt();
        {
            while(num!=0){
                rem= num%10;
                rev=rev*10+rem;
                num/=10;
            }
        }
        System.out.println("reverse number: "+rev);

    }
}*/

/**import java.util.*;
class loop{
    public static void main(String[] args){
        Scanner obj= new Scanner(System.in);
int choice;
        do{

            System.out.println("------MENU------\t");
            System.out.println("1. Kari Dosa");
            System.out.println("2. Kadai Chicken");
            System.out.println("3. Chicken Rice");
            System.out.println("4. Chilli Chicken Biriyani");
            System.out.println("Menu Exist");
            System.out.println("Enter Your Choice: ");
            choice = obj.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(" Selected Option 1 ");
                    break;
                case 2:
                    System.out.println("Selected option 2");
                    break;
                case 3:
                    System.out.println("Selected option 3");
                    break;
                case 4:
                    System.out.println("Slected option 4");
                    break;
                case 5:
                    System.out.println("Menu is existing");
                    break;
                default:
                    break;
            }
        }while(choice != 5);
    }
}*/
/**import java.util.*;

class loop {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int fact = 1;
        int num;
        System.out.print("Enter the number: ");
        num = obj.nextInt();
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int originalNum = num;
            do {
                fact = fact * num;
                num--; 
            } while (num > 0); 

            System.out.println("Factorial of " + originalNum + " = " + fact);
        }
    }
}*/
/**import java.util.Scanner;

class loop {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int sum = 0;
        int num;
        System.out.println("Enter positive numbers to sum :");
        do {
            System.out.print("Enter a number: ");
            num = obj.nextInt(); 
            if (num >= 0) { 
                sum += num;
            }
        } while (num >= 0); 
        System.out.println("Sum of positive numbers = " + sum);
    }
}*/
/**import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = obj.nextInt();

        System.out.println("Multiplication Table of " + num + ":");
        for (int i = 1; i <= 10; i++) { 
            int pro = num * i;
            System.out.println(num + " x " + i + " = " + pro); 
        }
    }
}*/
/**import java.util.*;
class loop{
public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    int a=0, b=1,c;
    System.out.println("Enter a number: ");
    int n=obj.nextInt();
    System.out.print("Fibonacci Series: " + a + " " + b +" ");
    for(int i=2;i<n;i++){
        c=a+b;
        System.out.print(c);
        a=b;
        b=c;

    }
}
}*/
/**import java.util.*;
    class loop{
        public static void main(String [] args){
            Scanner obj = new Scanner(System.in);
            System.out.println("Entter a number");
            int num = obj.nextInt();
            int count=0;
    
            
            while(num != 0){
              int  rem = num % 10;
        
              count++;
                num/=10;

            }
            System.out.print("The number of digits:" +count);
        }

    }*/
/**class loop{
        public static void main(String[] args) {
            for(int i = 1;i <= 5;i++){
                for(int j = 1;j <= i;j++){
                    System.out.print("*");
                }
                System.out.println();
                
            }
        }
    }*/
/**import java.util.*;
class loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}*/
/**class loop{
    public static void main(String [] args){
        for(int i = 0;i < 4;i++){
            for(int j = 0;j < 4;j++){
                if(i == 0 || i == 3 || j == 0 || j == 3)
                System.out.print("*");
                else
                System.out.print(" ");
             
            }
            System.out.println();
            
        }
    }
}*/
/**class loop {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i == 13) {
                break; 
            }
            System.out.println(i);
        }
    }
}*/
/**class loop {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 5 == 0) {
                continue; 
            }
            System.out.println(i);
        }
    }
}*/ 
/**import java.util.Scanner;

 class loop{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = scanner.nextInt();
    scanner.close();

    String result = "Prime";
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        result = "Not Prime";
        break;
      }
    }

    System.out.println(+num + " is " +result);
  }
}*/
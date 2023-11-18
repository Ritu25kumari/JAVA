import java.util.*;
public class Functions {

    //program for print name
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        printMyName("My Name is " +name);

    }    



    // program for sum of two number
    // public static int calculateSum(int a,int b){
    //     int sum = a+b;
    //     return sum;
    // }
    // public static void main(String args[]){
    //     Scanner sc=new Scanner(System.in);
    //     int a= sc.nextInt();
    //     int b= sc.nextInt();

    //     int sum=calculateSum(a,b);
    //     System.out.println("sum of 2 number is :"+ sum);
    // }



    //program for multiplication of two numbers
//     public static int calculateProduct(int a, int b){
//         return a*b;}

// public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int a= sc.nextInt();
//         int b= sc.nextInt();

//         System.out.println("Product  of 2 number is :"+ cal35culateProduct(a ,b));
//     }
    


//Program for find the Factorial
// public static void printFactorial(int n){
//     if(n < 0){
//         System.out.println("Invalid number");
//         return;
//     }
 

//     //for loop
//     int factorial = 1;
//     for (int i=n; i>=1; i--){
//         factorial = factorial *i;
//     }
//    System.out.println(factorial);
//    return;
// }
// public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();

//     printFactorial(n);

// }

}

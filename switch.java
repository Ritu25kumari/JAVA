import java.util.*;
class Switch {
    public static void main(String args[])
    {
    // Scanner SC=new Scanner(System.in);
    // int button=SC.nextInt();
    // switch(button){
    //     case 1: System.out.println("HELLO");
    //     break;
    //     case 2: System.out.println("NAMESTE");
    //     break;
    //     case 3: System.out.println("BONJOUR");
    //     break;
    //     default: System.out.println("GIVEN NUMBER IS INVALID");
    // }
    Scanner SC=new Scanner(System.in);
    int n=SC.nextInt();
    //int n=1;
    switch(n){
        case 1: System.out.println("MONDAY");
        break;
        case 2: System.out.println("TUESDAY");
        break;
        case 3: System.out.println("WEDNESDAY");
        break;
        case 4: System.out.println("THURSDAY");
        break;
        case 5: System.out.println("FRIDAY");
        break;
        case 6: System.out.println("SATURDAY");
        break;
        default: System.out.println("SUNDAY");

    }
   }
}

package Quiz;
import java.util.*;
public class Statements {
    public static void main(String[] args) {
        Statement1();
        Statement2();
        Statement3();
    }
    public static void Statement1 () {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        System.out.print("Wer bist Du: ");
        String name = in.nextLine();
        if (name.equals("Ich bin Ich")){
            System.out.println("Du bist : "+ name);
        }
        else if (name.equals("Ich")){
            System.out.println("Du bist : "+ name);
        }
        else
        {
            System.out.println(name +", "+"Wer bist Du!?");
        }
        in.close();
    }
    public static void Statement2 (){
        var i = 1; // 1. simple assignment

        while(i<4) // 2. decision to execute code
        {
            System.out.println("I am " + i + " times executed"); // 3. conditionally executed code
            i++;
        }
    }
    public static void Statement3 (){
        int age = 35; //declares variable, assigns an initial value
        if (age > 20) { // decision to execute code
            System.out.println("I am of age"); // conditionally executed code
        }
        else { //optional
            System.out.println("I am a kid"); // conditionally executed code
        }
        switch (age) {
            case 17:
                System.out.println("I am of age 17");
            case 18:
                System.out.println("I am of age 18");
            case 19:
                System.out.println("I am of age 19");
        }
    }
}

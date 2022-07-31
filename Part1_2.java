import java.util.Scanner;
//Created by Bhautik Vekariya
//ID NO: 21CE151
public class Part1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = sc.next();

        if(str.charAt(0) == 'o'){   //check first character of string is same or not
            System.out.print("o");
            if(str.charAt(1) == 'z'){   //check second character of string is same or not
                System.out.println("z");
            }
        }
        else if(str.charAt(1) == 'z'){
            System.out.println("z");
        }
    }
}

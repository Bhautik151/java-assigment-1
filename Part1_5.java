import java.util.Scanner;
//Created by Bhautik Vekariya
//ID NO: 21CE151
public class Part1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two string: ");
        String str1 = sc.next();
        String str2 = sc.next();
        int count = 0,n = 0;
        int a = str1.length();
        int b = str2.length();

        if(b>a){
            n=a;
        }
        else{
            n=b;
        }

        for (int i = 0; i<n-1; i++){
            if (str1.charAt(i) == str2.charAt(i)){   //check first character of string
                if (str1.charAt(i + 1) == str2.charAt(i + 1)){   //check second character of string
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
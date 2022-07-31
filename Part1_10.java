import java.util.Scanner;
//Created by Bhautik Vekariya
//ID NO: 21CE151
public class Part1_10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String a;
        char[] b=new char[40];
        a=sc.next();
        char x;
        int y;
        int n = a.length();
        for(int i=0;i<n;i++)
        {
            x=a.charAt(i);
            y=x+13;
            if(y>122)
            {
                y=y-26;
            } else if (y>90) {
                y=y-26;
            }
            b[i]=(char)y;
        }
        System.out.println("main String: "+a);
        System.out.print("Encrypt: ");
        for (int i=0;i<n;i++)
        {
            System.out.print(b[i]);
        }
    }
}


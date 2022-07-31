import java.util.Scanner;
//Created by Bhautik Vekariya
//ID NO: 21CE151
public class Part1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number: ");
        int first = sc.nextInt();
        int last = sc.nextInt();

        if(last%10 == first){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}

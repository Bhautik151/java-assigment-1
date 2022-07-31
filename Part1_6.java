import java.util.Scanner;
//Created by Bhautik Vekariya
//ID NO: 21CE151
public class Part1_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int l = sc.nextInt();
        String []str1 = new String[l];
        String []str3 = new String[l];
        int k=0;

        for(int i=0; i<l; i++){
            str1[i] = sc.next();
        }
        String str2 = sc.next();

        for(int j=0; j<l; j++){
            if(!str1[j].contains(str2)){
                str3[k] = str1[j];
                k++;
            }
        }

        for(int m=0; m<k; m++){
            System.out.print(str3[m]+ " ");
        }
    }
}
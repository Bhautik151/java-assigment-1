import java.util.Scanner;
//Created by Bhautik Vekariya
//ID NO: 21CE151
public class Part1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr size of array: ");
        int size = sc.nextInt();
        int []arr = new int[size];
        int i,c=0;

        System.out.println("Enter elements of array: ");
        for(i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }

        for(i=0;i<size-2;i++) {
            if(arr[i] == 1 && arr[i+1]==2 && arr[i+2]==3)  //check element of array
            {
                c=1;
                break;
            }
            else {
                c=0;
            }
        }
        if(c==1){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

//        String ste1 = sc.next();
//        String str2 = "123";
//        if(str1.contains(str2)){
//            System.out.println("true");
//        }
//        else{
//            System.out.println("false");
//        }
    }
}

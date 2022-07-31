import java.util.Scanner;
//Created by Bhautik Vekariya
//ID no: 21CE151
public class Part1_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char [][]str1 = new char[][]{
                {'A','B','A','C','C','D','E','E','A','D'},
                {'D','B','A','B','C','A','E','E','A','D'},
                {'E','D','D','A','C','B','E','E','A','D'},
                {'C','B','A','E','D','C','E','E','A','D'},
                {'A','B','D','C','C','D','E','E','A','D'},
                {'B','B','E','C','C','D','E','E','A','D'},
                {'B','B','A','C','C','D','E','E','A','D'},
                {'E','B','E','C','C','D','E','E','A','D'},
        };
        char []str2 = new char[]{'D','B','D','C','C','D','A','E','A','D'};

//        Take input from user
//       for(int i=0;i<8;i++){
//            for(int j=0;j<10;j++){
//                str1[i][j]= sc.next().charAt(0);
//            }
//        }

        for(int i=0;i<8;i++){
            int count=0;
            for(int j=0;j<10;j++){
                if(str1[i][j] == str2[j]){   //check character is same or not
                    count++;
                }
            }
            System.out.println("Correct answer of student "+i+ ": "+count);
        }
    }
}
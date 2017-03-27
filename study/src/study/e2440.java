package study;

import java.util.Scanner;

public class e2440 {
     public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int row = sc.nextInt();
            while(row>0){
                for(int i=0;i<row;i++){
                    System.out.print("*");
                }
                System.out.println();
                row--;
            }
     }
}

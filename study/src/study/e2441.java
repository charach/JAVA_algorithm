package study;

import java.util.Scanner;

public class e2441 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for(int k=row;k>0;k--){
            for(int j=row;j>k;j--){
                System.out.print(" ");
            }
            for(int i=0;i<k;i++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}

package study;

import java.util.Scanner;

public class e2439 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=row;i++){
            for(int k=row;k>i;k--){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}

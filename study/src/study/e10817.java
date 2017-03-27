package study;

import java.util.Arrays;
import java.util.Scanner;

public class e10817 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] ary = new int[3];
        for(int i=0;i<3;i++){
            ary[i] = sc.nextInt();
        }
        Arrays.sort(ary);
        System.out.println(ary[1]);
    }
}

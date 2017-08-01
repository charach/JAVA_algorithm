package study;

import java.util.Scanner;

public class e2839 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();
        int five = 0,three = 0;
        five = weight/5;
        weight = weight %5;
        while(five>=0){
            if(weight % 3 ==0){
                three = weight /3;
                weight = 0;
                break;
            }
            five--;
            weight += 5;
        }
        System.out.println(weight == 0?five+three:-1);

    }

}

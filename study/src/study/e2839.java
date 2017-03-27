package study;

import java.util.Scanner;

public class e2839 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();
        int count = 0;
        if(weight%5 != 3 && weight%3 == 0){
            System.out.println(weight/3);
            return;
        }
        while(weight >=5){
            weight -= 5;
            count++;
        }
        while(weight>=3){
            weight -= 3;
            count++;
        }
        if(weight != 0){

            System.out.println("-1");
        }else{
            System.out.println(count);
        }

    }

}

package study;

import java.util.Scanner;

public class e1463 {
    static int minCount = 9999999;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        searchMinNum(num,0);

        System.out.println(minCount);
        sc.close();

    }
    public static void searchMinNum(int num,int count){

        if(num > 1){
            if(count > minCount)
                return;
            if(num %3 == 0){
                searchMinNum(num/3,count +1);
            }
            else if(num %2 ==0){
                searchMinNum(num/2,count+ 1);
            }
            searchMinNum(num - 1,count+ 1);

        }else if(num <1){
            return;
        }else{
            if(minCount > count){
                minCount = count;
            }
            return;
        }
    }

}

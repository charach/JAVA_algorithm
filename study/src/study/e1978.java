package study;

import java.util.Scanner;

public class e1978 {
    int[] ary = new int[1000];
    public e1978(){

        initAry();

        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int countNumber = 0;
        int number;

        while(count-->0){
            number = sc.nextInt();
            if(ary[number] == 0){
                countNumber++;
            }
        }

        System.out.println(countNumber);
    }

    /*init 1000 ary*/
    public void initAry(){
        ary[1] = 1;
        for(int i=2;i<Math.sqrt(1000d);i++){
            if(ary[i*1] != 1){
                for(int j=2;j*i < 1000;j++){
                    if(ary[i*j] == 1){
                        continue;
                    }else{
                        ary[i*j] = 1;
                    }
                }
            }
        }
    }

    public static void main(String[] args){
        new e1978();
    }
}

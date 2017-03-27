package study;

import java.util.ArrayList;
import java.util.Scanner;

public class e1003 {
    ArrayList<FibNum> fibo;
    public e1003(){

        Scanner sc = new Scanner(System.in);
        fibo = new ArrayList<FibNum>();

        int count = sc.nextInt();
        int number;

        fibo.add(new FibNum(0,1,0));
        fibo.add(new FibNum(1,0,1));
        while(count-->0){
            number = sc.nextInt();
            FibNum fiboBuf;
            if(number > fibo.size()-1){
                fiboBuf = fiboCal(number);
            }else{
                fiboBuf = fibo.get(number);
            }
            System.out.println(fiboBuf.count0+" "+fiboBuf.count1);
        }
    }

    public FibNum fiboCal(int number){
        for(int i=fibo.size();i<=number;i++){
                fibo.add(new FibNum(fibo.get(i-1).value+fibo.get(i-2).value,
                        fibo.get(i-1).count0+fibo.get(i-2).count0,
                        fibo.get(i-1).count1+fibo.get(i-2).count1));

        }
        return fibo.get(number);
    }
    class FibNum{
        int value;
        int count0 = 0;
        int count1 = 0;
        public FibNum(){

        }
        public FibNum(int value,int count0,int count1){
            this.value  = value;
            this.count0 = count0;
            this.count1 = count1;
        }
    }
    public static void main(String[] args) {
       new e1003();
    }
}


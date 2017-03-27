package study;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class e11720 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        System.out.println(num(str,length));
    }
    public static int num(String str,int length){
        int num = 0;

        for(int i=0;i<str.length();i++){
            num += Integer.parseInt(str.charAt(i)+"");
        }
        return num;
    }
}

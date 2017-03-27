package study;

import java.util.Scanner;

public class e11721 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String strbuf;
        while(true){
            if(str.length() >= 10){
                System.out.println(str.substring(0, 10));
                str = str.substring(10);
            }else{
                System.out.println(str.substring(0));
                break;
            }
        }
    }
}

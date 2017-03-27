package study;

import java.util.Scanner;

public class e2167 {
    int[][] ary;

    public e2167(){
        Scanner sc = new Scanner(System.in);
        int height  = sc.nextInt();
        int width = sc.nextInt();

        int startX,startY,endX,endY,startXBuf;
        int sum;
        ary = new int[height][width];

        /* init ary*/
        for(int y=0;y<height;y++){
            for(int x=0;x<width;x++){
                ary[y][x] = sc.nextInt();
            }
        }

        int count  = sc.nextInt();

        /*count ary */
        while(count-->0){
            sum = 0;
            startY = sc.nextInt()-1;
            startX = sc.nextInt()-1;
            endY = sc.nextInt()-1;
            endX = sc.nextInt()-1;

            while(startY <= endY){
                startXBuf = startX;
                while(startXBuf <= endX){
                    sum += ary[startY][startXBuf];

                    startXBuf++;
                }
                startY++;
            }

            System.out.println(sum);
        }

    }


    public static void main(String[] args) {
        new e2167();
    }

}

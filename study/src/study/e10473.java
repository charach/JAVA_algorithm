package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class e10473 {
    //시작점과 끝점
    Pos startPos;
    Pos endPos;

    public e10473() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        startPos = new Pos();
        endPos = new Pos();

        startPos.x = Float.parseFloat(st.nextToken());
        startPos.y = Float.parseFloat(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        endPos.x = Float.parseFloat(st.nextToken());
        endPos.y = Float.parseFloat(st.nextToken());

        int countCircle = Integer.parseInt(br.readLine());
        Pos[] circleAry = new Pos[countCircle+2];
        float[][] timePos = new float[countCircle+2][countCircle+2];
        float distanceBuf;

        circleAry[0] = startPos;
        for(int i=1;i<countCircle+1;i++){
            circleAry[i] = new Pos();

            st = new StringTokenizer(br.readLine(), " ");
            circleAry[i].x = Float.parseFloat(st.nextToken());
            circleAry[i].y = Float.parseFloat(st.nextToken());
            timePos[i][i] = 0;
        }
        circleAry[countCircle+1] = endPos;

       //각지점에 도착하는 최소 시간
       for(int i=0;i<circleAry.length;i++){
           for(int j=0;j<circleAry.length;j++){
               if(i != j){
                   distanceBuf = calcPos(circleAry[i],circleAry[j]);

                   if( i==0 || i== circleAry.length-1){
                       timePos[i][j] = (distanceBuf)/5;
                   }else{

                       if(distanceBuf > 50){
                           timePos[i][j] = 2+((distanceBuf - 50)/5);

                       }else if(distanceBuf == 50){
                           timePos[i][j] = 2;

                       }else{
                           timePos[i][j] = Math.min(2+(50-distanceBuf)/5, distanceBuf/5);
                       }
                   }
               }

           }
       }
       float minTime= 999999;
       for(int i=0;i<timePos.length;i++){
           for(int j=0;j<timePos.length;j++){
               System.out.print(timePos[i][j] + " ");
           }
           System.out.println();
       }
       System.out.println(minTime);
    }



    //Calculate distance
    float calcPos(Pos a,Pos b){
        return (float) Math.sqrt(((a.x-b.x)*(a.x-b.x))+((a.y-b.y)*(a.y-b.y)));
    }


    public static void main(String[] args) throws IOException {
        new e10473();
    }

}
class Pos{
    float x;
    float y;
}

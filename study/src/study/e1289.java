package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class e1289 {

    public e1289() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n =  Integer.parseInt(br.readLine());
        int totalWeight = 0;
        ArrayList<Line> lineAry = new ArrayList<>();

        for(int i=0;i<n-1;i++){
            st = new StringTokenizer(br.readLine(), " ");
            lineAry.add(new Line(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())));
        }
        Collections.sort(lineAry,new Comparator<Line>() {
            @Override
            public int compare(Line o1, Line o2) {
                if(o1.startX > o2.startX)
                    return 1;
                else if(o1.startX == o2.startX)
                    return 0;
                else
                    return -1;
            }
        });
        Queue<Line> queue = new LinkedList<>();
        Iterator<Line> iterator = lineAry.iterator();
        // i==0 ÀÏ¶§
        Line lineBuf;
        Line lineBuff;
        while(iterator.hasNext()){
            lineBuf =iterator.next();
            totalWeight += lineBuf.weight;
            queue.add(lineBuf);
        }


        // i>=1 , i<n-1
        for(int i=1;i<n-1;i++){
            iterator = lineAry.iterator();

            while(iterator.hasNext()){
                lineBuf = iterator.next();
                if((queue.peek().path.contains(lineBuf.startX+"") && !queue.peek().path.contains(lineBuf.endX+""))
                    || (!queue.peek().path.contains(lineBuf.startX+"") && queue.peek().path.contains(lineBuf.endX+""))){
                    lineBuff = queue.poll();
                    lineBuff.endX = lineBuf.endX;
                    lineBuff.path += ","+lineBuf.startX+","+lineBuf.endX;
                    lineBuff.weight = lineBuff.weight * lineBuf.weight;
                    totalWeight += lineBuff.weight;
                    queue.add(lineBuff);
                }
            }
        }
        System.out.println(totalWeight);
    }


    public static void main(String[] args) throws IOException {
        new e1289();

    }

}
class Line{
    int startX;
    int endX;
    int weight;
    String path="";
    public Line(){

    }
    public Line(int startX,int endX,int weight){
        if(startX > endX){
            this.startX = endX;
            this.endX = startX;
        }else{
            this.startX = startX;
            this.endX = endX;
        }
        this.weight = weight;
        path = startX+","+endX;
   }
}
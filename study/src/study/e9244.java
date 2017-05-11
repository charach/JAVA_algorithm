package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class e9244 {
    static int key;
    public e9244() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int pointCount = Integer.parseInt(br.readLine());
        StringTokenizer st;
        PointNode[] ary = new PointNode[pointCount];
        HashMap<Integer,LinkedList<PointNode>> xMap = new HashMap<Integer,LinkedList<PointNode>>();;
        for(int i=0;i<pointCount;i++){
            st = new StringTokenizer(br.readLine()," ");
            ary[i] = new PointNode(Integer.parseInt(st.nextToken()),
                                   Integer.parseInt(st.nextToken()),
                                   Integer.parseInt(st.nextToken()),
                                   Integer.parseInt(st.nextToken()));
            int start = ary[i].startX > ary[i].endX ? ary[i].endX : ary[i].startX;
            int end   = ary[i].startX < ary[i].endX ? ary[i].endX : ary[i].startX;

            for(;start<end;start++){
                if(xMap.get(start) == null){
                    xMap.put(start, new LinkedList<PointNode>());
                }
                xMap.get(start).add(ary[i]);
            }
            System.out.println(i);
        }
        Set<Integer> keySet = xMap.keySet();
        Iterator iterator = keySet.iterator();

        while(iterator.hasNext()){
            key = (Integer)iterator.next();
            Collections.sort( (List<PointNode>)xMap.get(key));
        }


        int point  =  Integer.parseInt(br.readLine());
        int yPoint = 1000001;
        PointNode pnBuf;
        while(xMap.get(point) != null && xMap.get(point).size() != 0){
            iterator = xMap.get(point).iterator();
            while(iterator.hasNext()){
                pnBuf = (PointNode)iterator.next();
                if(pnBuf.calculateY(point) < yPoint){
                    yPoint = pnBuf.endY;
                    point  = pnBuf.endX;
                    iterator.remove();
                    break;
                }
                iterator.remove();
            }
            System.out.println(point);
        }
        System.out.println(point);
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        new e9244();
    }

}
class PointNode implements Comparable<PointNode>{
    int startX;
    int startY;
    int endX;
    int endY;
    public PointNode(){

    }
    public PointNode(int startX, int startY, int endX, int endY) {
        super();
        if(startY>endY){
            this.startX = startX;
            this.startY = startY;
            this.endX = endX;
            this.endY = endY;
        }else{
            this.startX = endX;
            this.startY = endY;
            this.endX = startX;
            this.endY = startY;
        }
    }
    float calculateY(int x){
        return (x * startY)/startX;
    }

    @Override
    public int compareTo(PointNode o) {
        return this.calculateY(e9244.key) < o.calculateY(e9244.key)?1:-1;
    }

}

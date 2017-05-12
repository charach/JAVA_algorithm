package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class e1753 {
    PriorityQueue<GraphNode> queue[];
    int dikAry[];
    final int BIGNUM = 2100000000;
    int rePoint;
    public e1753() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");
        int pointCount = Integer.parseInt(st.nextToken());
        int lineCount = Integer.parseInt(st.nextToken());
        dikAry = new int[pointCount+1];
        queue = new PriorityQueue[pointCount+1];
        rePoint = Integer.parseInt(br.readLine());

        int startPoint,endPoint,weight;
        for(int i=0;i<lineCount;i++){
            st = new StringTokenizer(br.readLine(), " ");
            startPoint = Integer.parseInt(st.nextToken());
            endPoint = Integer.parseInt(st.nextToken());
            weight  = Integer.parseInt(st.nextToken());
            if(queue[startPoint] == null)
                queue[startPoint] = new PriorityQueue<GraphNode>();
            queue[startPoint].add(new GraphNode(endPoint,weight));
        }
        if(queue[rePoint] == null){
            for(int j=1;j<dikAry.length;j++){
                if(j == rePoint)
                    System.out.println(0);
                else
                    System.out.println("INF");
            }
            return;
        }
        GraphNode nodeBuf;
        queue[0] = new PriorityQueue<GraphNode>();
        while(queue[rePoint].size() != 0){
            nodeBuf = queue[rePoint].poll();
            if(dikAry[nodeBuf.index] == 0 || dikAry[nodeBuf.index] > nodeBuf.weight){
                dikAry[nodeBuf.index] = nodeBuf.weight;
            }

            queue[0].add(nodeBuf);
        }
        //initAry
        for(int i=1;i<dikAry.length;i++){
            if(dikAry[i] == 0)
                dikAry[i] = BIGNUM;
        }
        dikAry[rePoint] = 0;
        rePoint = 0;

        dik();
        for(int i=1;i<dikAry.length;i++){
            if(dikAry[i] == BIGNUM){
                System.out.println("INF");
            }else{
                System.out.println(dikAry[i]);
            }
        }
        br.close();
    }

    void dik(){
        GraphNode nodeBuf,nodeBuff;
        while(!queue[rePoint].isEmpty()){
            nodeBuf = queue[rePoint].poll();

            while(queue[nodeBuf.index] != null &&!queue[nodeBuf.index].isEmpty()){
                nodeBuff = queue[nodeBuf.index].poll();
                if(dikAry[nodeBuff.index] > (dikAry[nodeBuf.index] + nodeBuff.weight)){
                    dikAry[nodeBuff.index] = dikAry[nodeBuf.index] + nodeBuff.weight;
                    nodeBuff.weight = dikAry[nodeBuff.index];
                    queue[rePoint].add(nodeBuff);
                }
            }
        }

    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        new e1753();
    }

}

class GraphNode implements Comparable<GraphNode>{
    int index;
    int weight;

    public GraphNode(int index, int weight) {
        super();
        this.index = index;
        this.weight = weight;
    }

    @Override
    public int compareTo(GraphNode o) {
        return this.weight>o.weight?1:-1;
    }




}

package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class e2178 {
    int count,height,width;
    int[][] road;
    boolean[][] visited;
    int[] xPos = {-1,1,0,0};
    int[] yPos = {0,0,-1,1};
    public e2178() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        height = Integer.parseInt(st.nextToken());
        width = Integer.parseInt(st.nextToken());

        road = new int[height][width];
        visited = new boolean[height][width];

        String strBuf;
        for(int i=0;i<height;i++){
            strBuf = br.readLine();
            for(int j=0;j<width;j++){
                road[i][j] = (int)strBuf.charAt(j)-48;
            }
        }
        bfs();
        System.out.println(count);

    }
    void bfs(){
        count = 1;
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(0);
        int verti,hori,xBuf,yBuf,qSize;
        visited[0][0] = true;

        while(!visited[height-1][width-1]){
            qSize = queue.size();
                for(int i=0;i<qSize;i++){
                    verti = queue.poll();
                    hori  = verti%100;
                    verti = verti/100;
                    for(int j=0;j<4;j++){
                        xBuf = hori-xPos[j];
                        yBuf = verti-yPos[j];
                        if(yBuf < 0 || yBuf >= height || xBuf < 0 || xBuf >= width)
                            continue;

                        if(!visited[yBuf][xBuf] && road[yBuf][xBuf] == 1){
                            visited[yBuf][xBuf] = true;
                            queue.add(yBuf*100 + xBuf);
                        }
                    }
            }
                count++;
        }


    }
    public static void main(String[] args) throws IOException {
        new e2178();
    }

}

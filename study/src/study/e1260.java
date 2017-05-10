package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class e1260 {
    ArrayList<Integer>[] tree;
    boolean visited[];
    public e1260() throws IOException {
        int countPoint,countLine,startPoint;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        countPoint = Integer.parseInt(st.nextToken());
        countLine =  Integer.parseInt(st.nextToken());
        startPoint = Integer.parseInt(st.nextToken());
        tree = new ArrayList[countPoint+1];
        visited = new boolean[countPoint+1];
        for(int i=1;i<tree.length;i++)
            tree[i] = new ArrayList<>();
        int numBuf1,numBuf2,temp;
        for(int i=0;i<countLine;i++){
            st = new StringTokenizer(br.readLine()," ");
            numBuf1 = Integer.parseInt(st.nextToken());
            numBuf2 = Integer.parseInt(st.nextToken());
            if(numBuf1>numBuf2){
                temp = numBuf1;
                numBuf1 = numBuf2;
                numBuf2 = temp;
                if(tree[numBuf1] != null && checkArrayList(tree[numBuf1],numBuf2))
                    continue;
            }
            if(tree[numBuf1] == null)
                tree[numBuf1] = new ArrayList<>();

            if(tree[numBuf2] == null)
                tree[numBuf2] = new ArrayList<>();

            tree[numBuf1].add(numBuf2);
            tree[numBuf2].add(numBuf1);

        }
        for(int i=1;i<tree.length;i++){
            Collections.sort(tree[i]);
        }
        dfs(tree[startPoint],startPoint);
        System.out.println();
        visited = new boolean[countPoint+1];
        bfs(startPoint);
    }
    void dfs(ArrayList<Integer> treeNode,int num){
        System.out.print(num+" ");
        visited[num] = true;
        if(treeNode.size() != 0){
            for(int i=0;i<treeNode.size();i++){
                if(visited[treeNode.get(i)] == true)
                    continue;
                visited[treeNode.get(i)] = true;
                dfs(tree[treeNode.get(i)],treeNode.get(i));
            }
        }
    }

    void bfs(int startPoint){
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(startPoint);
        visited[startPoint] = true;
        System.out.print(startPoint+" ");
        int value;
        while(queue.size() != 0){
            startPoint = queue.poll();
            for(int i=0;i<tree[startPoint].size();i++){
                if(visited[tree[startPoint].get(i)])
                    continue;
                value = tree[startPoint].get(i);
                visited[value] = true;
                System.out.print(value+" ");
                queue.add(value);
            }
        }
    }

    // 배열 체크 포함 == true , 비포함 == false
    boolean checkArrayList(ArrayList<Integer> list,int num){
        for(int i=0;i<list.size();i++){
            if(list.get(i) == num)
                return true;
        }
        return false;
    }
    public static void main(String[] args) throws IOException{
        new e1260();
    }
}

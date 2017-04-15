package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.Vector;

public class e1068 {
    int tree[];
    Vector<Integer> childTree[];
    int treeSize;
    int aryIndex;
    int root;
    boolean checkMeet[];

    e1068() throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        treeSize = Integer.parseInt(br.readLine());
        tree = new int[treeSize];
        childTree = new Vector[treeSize];
        checkMeet = new boolean[treeSize];


        for(int i=0;i<treeSize;i++){
            childTree[i] = new Vector<Integer>(10);
        }

        int intBuf;
        aryIndex = 0;
        StringTokenizer st = new StringTokenizer(br.readLine(),	" ");

        while(st.hasMoreTokens()){
            intBuf = Integer.parseInt(st.nextToken());
            tree[aryIndex] = intBuf;
            aryIndex++;
        }

        for(int i=0;i<treeSize;i++){
            intBuf = tree[i];
            if(intBuf == -1){
                root = i;
                continue;
            }
            childTree[tree[i]].add(i);
           }

        int deleteAryNum = Integer.parseInt(br.readLine());

        DFS(deleteAryNum);

        System.out.println(DFS(root));

    }

    public int DFS(int deleteAryNum){
        Queue<Integer> queue = new LinkedList<>();
        int count = 0;

        if(checkMeet[deleteAryNum]){
            return 0;
        }

        checkMeet[deleteAryNum] = true;
        queue.add(deleteAryNum);

        boolean flag;

        while(!queue.isEmpty()){
            deleteAryNum = queue.poll();
            flag = false;
            for (int aryNum : childTree[deleteAryNum]) {
                if(!checkMeet[aryNum]){
                    flag = true;
                    queue.add(aryNum);
                    checkMeet[aryNum] = true;
                }

            }
            if(!flag){

                count++;
            }

        }

        return count;
    }

    public static void main(String[] args) throws Exception {
        new e1068();
    }

}

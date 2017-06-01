package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Àý´ë°ª Èü
 * @author "SukHwanYoon"
 *
 */
public class e11286 {
    int[] heap;
    int heapPointer;
    public e11286() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int op;
        initHeap();
        while(count-->0){
            op = Integer.parseInt(br.readLine());
            if(op == 0){
                System.out.println(deleteHeap());
            }else{
                insertHeap(op);
            }
        }
    }

    void initHeap(){
        heap = new int[200000];
        heapPointer = 1;
    }
    void swap(int index1,int index2){
        int temp = heap[index1];
        heap[index1] = heap[index2];
        heap[index2] = temp;
    }

    void insertHeap(int num){
        heap[heapPointer] = num;
        int absNum = Math.abs(num);
        if(heapPointer != 1){
            int root = heapPointer/2;
            int currentPos = heapPointer;
            while(root >=1 && Math.abs(heap[root]) >= absNum){
                if(Math.abs(heap[root]) == absNum && num>heap[root]){
                    break;
                }
                swap(root,currentPos);
                currentPos = root;
                root = root/2;
            }
        }
        heapPointer++;
    }

    int deleteHeap(){
        if(heapPointer == 1){
            return 0;
        }
        int value = heap[1];
        heap[1] = heap[heapPointer-1];
        heap[heapPointer-1] = 0;
        int rootBuf = 1;
        while(true){
            if(heap[rootBuf*2] == 0){
                break;
            }else if(heap[rootBuf*2+1] == 0){
                if(Math.abs(heap[rootBuf]) < Math.abs(heap[rootBuf*2])){
                    swap(rootBuf*2,rootBuf);

                }else if(Math.abs(heap[rootBuf]) == Math.abs(heap[rootBuf*2])){
                    if(heap[rootBuf] > heap[rootBuf*2]){
                        swap(rootBuf*2,rootBuf);

                    }

                }
                break;
            }else if(Math.abs(heap[rootBuf]) < Math.abs(heap[rootBuf*2]) && Math.abs(heap[rootBuf]) > Math.abs(heap[rootBuf*2+1])){
                swap(rootBuf,rootBuf*2);
                rootBuf = rootBuf *2;
            }else if(Math.abs(heap[rootBuf]) > Math.abs(heap[rootBuf*2]) && Math.abs(heap[rootBuf]) < Math.abs(heap[rootBuf*2+1])){
                swap(rootBuf,rootBuf*2+1);
                rootBuf = rootBuf *2+1;
            }else if(Math.abs(heap[rootBuf]) < Math.abs(heap[rootBuf*2]) && Math.abs(heap[rootBuf]) < Math.abs(heap[rootBuf*2+1])){
                break;
            }else{
                if(Math.abs(heap[rootBuf]) == Math.abs(heap[rootBuf*2]) && Math.abs(heap[rootBuf]) == Math.abs(heap[rootBuf*2+1])){
                    if(heap[rootBuf] < heap[rootBuf*2] && heap[rootBuf] < heap[rootBuf*2+1])
                        break;
                }
                if(Math.abs(heap[rootBuf*2]) == Math.abs(heap[rootBuf*2+1])){
                    if(heap[rootBuf*2] < heap[rootBuf*2+1]){
                        swap(rootBuf,rootBuf*2);
                        rootBuf = rootBuf*2;
                    }else{
                        swap(rootBuf,rootBuf*2+1);
                        rootBuf = rootBuf*2+1;
                    }
                }else if(Math.abs(heap[rootBuf*2]) < Math.abs(heap[rootBuf*2+1])){
                    swap(rootBuf,rootBuf*2);
                    rootBuf = rootBuf*2;
                }else{
                    swap(rootBuf,rootBuf*2+1);
                    rootBuf = rootBuf*2+1;
                }
            }

        }

        heapPointer--;
        return value;
    }

    public static void main(String[] args) throws IOException {
        new e11286();
    }

}

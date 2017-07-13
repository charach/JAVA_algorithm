package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class e1157 {

    public e1157() throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         char chAry[] = br.readLine().toCharArray();
         int count[] = new int[26];
         for(int i=0;i<chAry.length;i++){
             if('A'<= chAry[i] && chAry[i] <= 'Z'){
                 count[(int)(chAry[i]-'A')]++;
             }else{
                 count[(int)(chAry[i]-'a')]++;
             }
         }
         int max = 0;
         int index = 0;
         for(int i=0;i<count.length;i++){
             if(max < count[i]){
                 index = i;
                 max =count[i];
             }
         }
         for(int i=0;i<count.length;i++){
            if(max == count[i] && i != index){
                System.out.println("?");
                return;
            }
         }
         System.out.println((char)('A'+index));
    }

    public static void main(String[] args) throws IOException {
        new e1157();
    }

}

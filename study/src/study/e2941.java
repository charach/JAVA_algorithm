package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class e2941 {

    String dic[] = {"c=","c-","dz=","d-","lj","nj","s=","z="};

    public e2941() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char chAry[] = br.readLine().toCharArray();
        int total = 0;
        int pos;
        String str = "";
        String buf = "";
        for(int i=0;i<chAry.length;i++){
            buf += chAry[i];
            pos = chkString(buf);
            if(pos != -1){
                str += buf.substring(0,pos);
                buf = "";
                total++;
            }
        }
        System.out.println(str.length()+buf.length()+total);
    }

    public int chkString(String str1){

        for(int i=0;i<dic.length;i++){
            if(str1.contains(dic[i])){
                return str1.indexOf(dic[i]);
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        new e2941();
    }

}

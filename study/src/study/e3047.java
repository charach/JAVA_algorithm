package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class e3047 {

    public e3047() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] ary = new int[3];
        ary[0] = Integer.parseInt(st.nextToken());
        ary[1] = Integer.parseInt(st.nextToken());
        ary[2] = Integer.parseInt(st.nextToken());
        String abc = br.readLine();
        String strBuf;
        int numBuf;
        for(int i=0;i<3;i++){
            strBuf = ""+abc.charAt(i);
            if(strBuf.equals("A")){
                numBuf = ary[0]>ary[1]?ary[1]:ary[0];
                numBuf = ary[2]>numBuf?numBuf:ary[2];
                System.out.print(numBuf+" ");
            }else if(strBuf.equals("B")){
                if(ary[0]>ary[1]){
                    if(ary[0] < ary[2])
                        System.out.print(ary[0]+" ");
                    else{
                        if(ary[1] > ary[2])
                            System.out.print(ary[1]+" ");
                        else
                            System.out.print(ary[2]+" ");
                    }
                }else{
                    if(ary[1] < ary[2])
                        System.out.print(ary[1]+" ");
                    else{
                        if(ary[0] > ary[2])
                            System.out.print(ary[0]+" ");
                        else
                            System.out.print(ary[2]+" ");
                    }
               }
            }else{
                numBuf = ary[0]<ary[1]?ary[1]:ary[0];
                numBuf = ary[2]<numBuf?numBuf:ary[2];
                System.out.print(numBuf+" ");
            }
        }

    }

    public static void main(String[] args) throws IOException {
        new e3047();
    }

}

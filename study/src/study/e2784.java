package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class e2784 {

    public e2784() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String strAry[] = new String[6];
        boolean checkAry[];
        boolean checkPuz[];
        String puz[] = new String[3];
        for(int i=0;i<6;i++){
            strAry[i] = br.readLine();
        }
        int m;
        for(int i=0;i<6;i++){

            puz[0] = strAry[i];

            for(int j=0;j<6;j++){

                if(j==i)
                    continue;

                puz[1] = strAry[j];

                for(int k=0;k<6;k++){
                    if(k==i || k==j)
                        continue;

                    checkAry = new boolean[6];
                    checkPuz = new boolean[3];
                    checkAry[i] = checkAry[j] = checkAry[k]= true;

                    puz[2] = strAry[k];
                    checkAry[k] = true;
                    for(int l=0;l<3;l++){
                        for(m=0;m<6;m++){
                            if(!checkAry[m])
                                break;
                        }
                        int x;
                        for(x=0;x<3;x++){
                            String str = ""+puz[0].charAt(x)+puz[1].charAt(x)+puz[2].charAt(x);
                            if(str.equals(strAry[m]) && !checkPuz[x]){
                                checkPuz[x] = true;
                                checkAry[m] = true;
                                break;
                            }
                        }
                        if(x == 3){
                            break;
                        }
                    }
                    for(m=0;m<6;m++){
                        if(!checkAry[m])
                            break;
                    }
                    if(m==6){
                        System.out.println(puz[0]);
                        System.out.println(puz[1]);
                        System.out.println(puz[2]);
                        return;
                    }
                }
            }
        }
        System.out.println(0);
    }

    public static void main(String[] args) throws IOException {
        new e2784();
    }

}

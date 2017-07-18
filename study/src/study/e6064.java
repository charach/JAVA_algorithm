package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class e6064 {
    public int gcd(int a,int b){
        if(a%b == 0) return b;
        else return gcd(b,a%b);
    }
    public e6064() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int m,n,x,y,cnt;
        while(count-->0){
            st = new StringTokenizer(br.readLine(), " ");
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            cnt = (m*n)/gcd(m,n);
            while(x<=cnt && x!=y){
                if(x<y){
                    x +=m;
                }else{
                    y +=n;
                }
            }
            if(x != y){
                System.out.println("-1");
            }else{
                System.out.println(x);
            }

        }
        br.close();
    }

    public static void main(String[] args) throws IOException{
        new e6064();
    }

}

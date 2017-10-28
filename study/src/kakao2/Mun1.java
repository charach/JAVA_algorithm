package kakao2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Mun1 {
	
	static String[] reformatDate(String[] dates) {
        
		StringTokenizer st;
		StringBuilder sb;
		
		String[] month = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		
		int n = dates.length;
		
		String[] answer = new String[n];
		
		String buf;
		for(int i=0;i<n;i++){
		
			st = new StringTokenizer(dates[i],  " ");
			sb = new StringBuilder();
			
			buf = st.nextToken();
			
			if(buf.contains("s")){
				buf = buf.substring(0, buf.indexOf('s'));
			}else if(buf.contains("n")){
				buf = buf.substring(0, buf.indexOf('n'));
			}else if(buf.contains("r")){
				buf = buf.substring(0, buf.indexOf('r'));
			}else if(buf.contains("t")){
				buf = buf.substring(0, buf.indexOf('t'));
			}
			if(Integer.parseInt(buf) < 10){
				sb.append("-0"+buf);
			}else{
				sb.append("-"+buf);
			}
			
			
			buf = st.nextToken();

			for(int j=0;j<month.length;j++){
				if(buf.equals(month[j])){
					if(j < 9){
						sb.insert(0,"-0"+(j+1));
					}else{
						sb.insert(0,"-"+(j+1));
					}
					break;
				}
			}
			
			sb.insert(0,st.nextToken());
			answer[i] = sb.toString();
		}
        return answer;
    }
	
	public Mun1() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] ary = new String[Integer.parseInt(br.readLine())];
		
		for(int i=0;i<ary.length;i++){
			ary[i] = br.readLine();
		}
		ary = reformatDate(ary);
		
		for(int i=0;i<ary.length;i++){
			System.out.println(ary[i]);
		}
	}

	public static void main(String[] args) throws IOException {
		new Mun1();
	}

}

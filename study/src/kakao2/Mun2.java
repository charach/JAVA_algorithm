package kakao2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Mun2 {
	static String[] ary1 = {"I","II","III","IV","V","VI","VII","VIII","IX"};
	static String[] ary2 = {"X","XX","XXX","XL"};
	
	public static int checkNum(String str){
		int num = 0;
		int index = 0;
		boolean flag = false;
		if(str.charAt(0) == 'L'){
			return 50;
		}else if(str.charAt(0) != 'I' && str.contains("X")){
			for(int i=0;i<ary2.length;i++){
				if(str.contains(ary2[i])){
					num = (i+1) * 10;
					index = i;
					flag = true;
				}
			}
		}
	
		if(flag){
			str = str.replaceFirst(ary2[index], "");	
		}
		
		if(str.charAt(0) == 'I'){
			if(str.contains("X")){
				num += 9;
			}else if(str.contains("V")){
				num += 4;
			}else{
				num += str.length();
			}
		}else{
			num += str.length()+4;
		}
		
		return num;
	}
	
	static String[] getSortedList(String[] names) {
		String[] answer = new String[names.length];
		String[] strBuf = new String[names.length];
		boolean[] flag = new boolean[names.length];
		for(int i=0;i<strBuf.length;i++){
			strBuf[i] = names[i].substring(0, names[i].indexOf(' '));
		}
		
		Arrays.sort(strBuf);
		
		for(int i=0;i<strBuf.length;i++){
			for(int j=0;j<names.length;j++){
				if(!flag[j] && strBuf[i].equals(names[j].substring(0, names[j].indexOf(' ')))){
					answer[i] = names[j];
					flag[j] = true;
					break;
				}
			}
		}
		
		String str1,str2;
		int num1,num2;
		String buf;
		
		for(int i=1;i<answer.length;i++){
			if(!answer[i-1].substring(0, answer[i-1].indexOf(' ')).equals(answer[i].substring(0, answer[i].indexOf(' ')))){
				continue;
			}
			num1 =  num2 = 0;
			str1 = answer[i-1].substring(answer[i-1].indexOf(' '));
			str2 = answer[i].substring(answer[i].indexOf(' '));
			
			num1 = checkNum(str1);
			num2 = checkNum(str2);
			if(num2 < num1){
				buf = answer[i-1];
				answer[i-1] = answer[i];
				answer[i] = buf;
			}
			
		}
		
		return answer;
	}
	
	public Mun2() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String[] ary = new String[n];
		
		for(int i=0;i<n;i++){
			ary[i] = br.readLine();
		}
		System.out.println(Arrays.toString(getSortedList(ary)));
	}
	


	public static void main(String[] args) throws IOException {
		new Mun2();

	}

}

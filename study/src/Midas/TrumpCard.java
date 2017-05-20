package Midas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TrumpCard {
	String str1;
	String str2;
	ArrayList<String> str2List;
	public TrumpCard() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		str1 = br.readLine();
		str2 = br.readLine();
		char[] str1Ary;
		char[] str2Ary;
		String str1Buf,str2Buf;
		if(str1.equals(str2)){
			System.out.println(str1.length());
			return;
		}
		for(int i=1;i>str1.length();i--){
			
		}
		
		br.close();
	}
	String makeSubString1(int length){
		if(length == 0){
			return "";
		}else{
			String str1Buf;
			String str2Buf;
			str2List = new ArrayList<String>();
			makeSubString2(length);
			for(int i=0;i<str1.length();i++){
				str1Buf = ""+str1.charAt(i) + makeSubString1(length-1);
				
			}
		}
	}
	String makeSubString2(int length){
		if(length == 0){
			return "";
		}else{
			for(int i=0;i<str1.length();i++){
				str2List.add(""+str1.charAt(i) + makeSubString1(length-1));
			}
			return "";
		}
	}
	public static void main(String[] args) throws IOException {
		new TrumpCard();
	}

}

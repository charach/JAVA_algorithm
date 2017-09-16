package kakaoNew;

public class mun1 {

	public String[] solution(int n, int[] arr1, int[] arr2) {
		String answer[] = new String[arr1.length];
		String buf; 
		for(int i=0;i<arr1.length;i++){
			buf = Integer.toBinaryString(arr1[i] | arr2[i]);
			buf = buf.replaceAll("1", "#");
			buf = buf.replaceAll("0"," ");
			while(buf.length() != n){
				buf = " "+buf;
			}
			answer[i] = buf;
		}
		return answer;
	}
	
	
}

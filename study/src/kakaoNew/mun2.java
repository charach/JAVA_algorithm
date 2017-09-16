package kakaoNew;

public class mun2 {

	public int solution(String dartResult) {
		int answer = 0;
		
		int[] num = new int[3];
		int pos = 0;
		for(int i=0;i<dartResult.length();i++){
			// 숫자일 경우
			if('0' <= dartResult.charAt(i) && dartResult.charAt(i) <= '9'){
				if(num[pos] != 0){
					num[pos] = num[pos] * 10 + Character.getNumericValue(dartResult.charAt(i));
				}else{
					num[pos] = Character.getNumericValue(dartResult.charAt(i));
				}
			}
			// SDT일 경우
			else if(dartResult.charAt(i) == 'S'){
				pos++;
			}else if(dartResult.charAt(i) == 'D'){
				num[pos] = (int) Math.pow(num[pos], 2);
				pos++;
			}else if(dartResult.charAt(i) == 'T'){
				num[pos] = (int) Math.pow(num[pos], 3);
				pos++;
			}
			// * , #일경우
			else if(dartResult.charAt(i) == '#'){
				num[pos-1] *= -1;
			}else{
				if(pos == 1){
					num[pos-1] *= 2;
				}else{
					num[pos-1] *= 2;
					num[pos-2] *= 2;
				}
			}
		}
		answer = num[0] + num[1] + num[2];
	    return answer;
	}
	
	public mun2(){
		System.out.println(solution("1D2S#10S"));
	}
	public static void main(String[] args){
		new mun2();
	}
}

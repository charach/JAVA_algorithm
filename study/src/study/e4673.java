package study;

public class e4673 {
	public static void main(String[] args){
	
		int[] ary = new int[10000];
		boolean[] aryy = new boolean[10000];
		int sum=0;
		for(int i=0;i<ary.length;i++){
			ary[i] = i+1;
			aryy[i] = true;
		}
		
		for(int i=0;i<ary.length;i++){
			sum = sumCompute(ary[i]);
				
			while(sum<=ary.length){
					if(aryy[sum-1]){
						
						aryy[sum-1] = false;
						sum = sumCompute(sum);
						
					}else{
						break;
					}
			}
			
		}
		for(int i=0;i<ary.length;i++)
			if(aryy[i])
				System.out.println(ary[i]);
		}
	
	static int sumCompute(int num){
		
		int sum = num;
		
		do{
			sum += (num % 10);
			num /= 10;
		}while( (num/10) != 0 || (num % 10) != 0);
		return sum;
	}
}

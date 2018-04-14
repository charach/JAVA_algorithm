package SWExpertAcadmy;

public class l3 {

	public static void main(String[] args) {
		int[] arr = {-7, -3, -2 ,5, 8};
		int n = arr.length;
		
		int sum;
		
		boolean ret = false;
		
		for(int i=1; i < (1<<(n)); i++){
			sum = 0;
			for(int j = 0; j < n ;j++){
				if((i & (1 << j)) == 1){
					sum += arr[i];
				}
			}
			if(sum == 0){
				ret = true;
				break;
			}
		}
		
		System.out.println(ret == true? "True" : "False");
	}

}

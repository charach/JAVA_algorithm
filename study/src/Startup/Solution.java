package Startup;

public class Solution {
    public Solution() {
        int[] nums = {1,2,7,6,4};
        System.out.println(solution(nums));
    }
    int[] sumAry = new int[20000];
    int sumLength;

    public boolean checkPrime(int num){
        for(int i=2;i<num;i++){
            if(num%i == 0)
                return false;
        }
        return true;
    }
    public void initSumAry(int[] nums){
        sumLength = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    sumAry[sumLength] = nums[i] + nums[j]+ nums[k];
                    sumLength++;
                }
            }
        }
    }
    public int solution(int[] nums) {
        int answer = 0;
        initSumAry(nums);
        for(int i=0;i<sumLength;i++){
            if(checkPrime(sumAry[i])){
                    answer++;
                    break;
                }
        }
        return answer;
    }




    public static void main(String[] args) {
        new Solution();
    }

}

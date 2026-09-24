class Solution {
    int sum(int a){
        int sum=0;
        while(a>0){
            int digit=a%10;
            sum+=digit;
            a=a/10;
        }
        return sum;
    }
    public int smallestIndex(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(sum(nums[i])==i){
                return i;
            }
        }
        return -1;
    }
}
class Solution {
    public int jump(int[] nums) {
        int far = 0, jump=0, current=0;
        for(int i=0; i<nums.length-1; i++){
            if(i+nums[i]>far){
                far = i+nums[i];
            }
            if(i==current){
                jump++;
                current=far;
            }
        }
        return jump;
    }
}
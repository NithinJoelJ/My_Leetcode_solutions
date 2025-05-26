class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int[] count = new int[26];

        for(char x:s.toCharArray()){
            int index = x-'a';
            count[index]++;
        }

        for(char x:t.toCharArray()){
            int index = x-'a';
            count[index]--;
        }

        boolean result = true;

        for(int nums:count){
            if(nums!=0){
                result = false;
                break;
            }
        }

        if(result==true){
            return true;
        }else{
            return false;
        }
    }
}
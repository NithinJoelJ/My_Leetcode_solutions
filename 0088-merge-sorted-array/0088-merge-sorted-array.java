class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      int left = 0;
      int right = 0;
      int k = 0;
      int[] b = new int[m+n];

      while(left<m && right<n){
        if(nums1[left]>=nums2[right]){
            b[k] = nums2[right];
            right++;
        }else{
            b[k] = nums1[left];
            left++;
        }
        k++;
      }

      if(left==m){
        while(right<n){
            b[k]=nums2[right];
            k++;
            right++;
        }
      }else{
        while(left<m){
            b[k]=nums1[left];
            k++;
            left++;
        }
      }
      for (int p=0; p<b.length; p++){
        nums1[p] = b[p];
      }

    }
}
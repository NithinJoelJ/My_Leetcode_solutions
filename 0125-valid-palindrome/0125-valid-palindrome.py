class Solution:
    def isPalindrome(self, s: str) -> bool:
        norm=[]
        for i in s:
            if(i.isalnum()):
                norm.append(i.lower())
                
        norm_str=''.join(norm)

        left=0
        right=len(norm_str)-1

        while left<right:
            if norm_str[left] != norm_str[right]:
                return False
            left+=1
            right-=1
        return True

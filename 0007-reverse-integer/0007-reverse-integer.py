class Solution:
    def reverse(self, x: int) -> int:
        sign=1
        sum=0
        if x<0:
            sign=-1
            x=x*-1
        while x>0:
            a=x%10
            sum=sum*10+a
            x=x//10
        if not -2147483648<sum<2147483647:
            return 0
        else:
            return sign*sum
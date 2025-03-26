class Solution:
    def longestPalindrome(self, s: str) -> str:
        n = len(s)
        if n < 2:
            return s
        start, max_len = 0, 1
        for i in range(n):
            odd_len = self.expandAroundCenter(s, i, i)
            even_len = self.expandAroundCenter(s, i, i + 1)
            cur_len = max(odd_len, even_len)
            if cur_len > max_len:
                start = i - (cur_len - 1) // 2
                max_len = cur_len
        return s[start:start + max_len]
    
    def expandAroundCenter(self, s, left, right):
        while left >= 0 and right < len(s) and s[left] == s[right]:
            left -= 1
            right += 1
        return right - left - 1
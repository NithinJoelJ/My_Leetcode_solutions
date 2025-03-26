class Solution:
    def isValid(self, s: str) -> bool:
        stack=[]
        brac={')':'(' , ']':'[' , '}':'{'}

        for char in s:
            if(char in brac):
                if(stack):
                    top_element = stack.pop()
                else:
                    top_element='#'
                if(brac[char]!=top_element):
                    return False
            else:
                stack.append(char)  
        return not stack           
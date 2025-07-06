class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        result=[]

        if not matrix:
            return result

        top = 0
        bottom = len(matrix)-1
        left = 0
        right = len(matrix[0])-1

        while(top <= bottom and left<=right):

            #Moving from left to right
            for i in range(left, right+1):
                result.append(matrix[top][i])
            top +=1

            #Moving from top to bottom
            for i in range(top, bottom+1):
                result.append(matrix[i][right])
            right -=1

            #Moving from right to left
            if(top<=bottom):
                for i in range(right, left-1, -1):
                    result.append(matrix[bottom][i])
                bottom -=1


            #Moving from bottom to top
            if(left<=right):
                for i in range(bottom, top-1, -1):
                    result.append(matrix[i][left])
                left +=1

        return result
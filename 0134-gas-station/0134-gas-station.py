class Solution:
    def canCompleteCircuit(self, gas: List[int], cost: List[int]) -> int:
        if sum(gas)<sum(cost):
            return -1
        p=0
        s=0
        for i in range(0,len(gas)):
            p+=gas[i]
            p-=cost[i]
            if p<0:
                p=0
                s=i+1
        return s
        
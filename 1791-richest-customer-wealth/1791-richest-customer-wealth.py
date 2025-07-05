class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        rich=[]
        for i in range(len(accounts)):
            rich.append(sum(accounts[i]))
        return max(rich)

        
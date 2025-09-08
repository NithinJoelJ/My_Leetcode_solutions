class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int index=0, tank=0, total=0;
        for(int i=0; i<gas.length; i++){
            int remain = gas[i]-cost[i];
            tank += remain;
            total += remain;
            if(tank<0){
                index=i+1;
                tank=0;
            }
        }
        if(total>=0){
            return index;
        }else{
            return -1;
        }

    }
}
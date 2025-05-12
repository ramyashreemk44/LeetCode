class Solution {
    public int minCostToMoveChips(int[] position) {
        int stepe=0,stepo=0;
        for(int i=0;i<position.length;i++){
            if(position[i]%2!=0) stepe++;
            else stepo++;
        }
        return Math.min(stepe,stepo);
    }
}
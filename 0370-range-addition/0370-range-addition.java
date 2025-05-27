class Solution {
    public int[] getModifiedArray(int length, int[][] updates) {
        int[] arr=new int[length];
        for(int i=0;i<length;i++){
            arr[i]=0;
        }

        int left=0, right=0, val=0;
        for(int[] range:updates){
            left=range[0];
            right=range[1];
            val=range[2];
            arr[left]+=val;
            if(right<length-1) arr[right+1]-=val;
        }

        for(int i=1;i<length;i++){
            arr[i]+=arr[i-1];
        }
        return arr;
    }
}
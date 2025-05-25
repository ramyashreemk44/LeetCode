class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
      int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=0;
        }
        int left=0, right=0, val=0;
        for(int[] range:bookings){
            left=range[0]-1;
            right=range[1]-1;
            val=range[2];
            arr[left]+=val;
            if(right<n-1) arr[right+1]-=val;
        }

        for(int i=1;i<n;i++){
            arr[i]+=arr[i-1];
        }
        return arr;
    }
}

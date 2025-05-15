class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0,j=0,k=0,n1=nums1.length,n2=nums2.length;

        int[] mergedarray=new int[n1+n2];
        while(i<n1 && j< n2){
            if(nums1[i]<=nums2[j]) mergedarray[k++]=nums1[i++];
            else mergedarray[k++]=nums2[j++];
        }
        while(i<n1) mergedarray[k++]=nums1[i++];
        while(j<n2) mergedarray[k++]=nums2[j++];
        int mid=mergedarray.length/2;
        if ((n1 + n2) % 2 != 0) return (double) mergedarray[mid];

        return (mergedarray[mid - 1] + mergedarray[mid]) / 2.0;
    }
}
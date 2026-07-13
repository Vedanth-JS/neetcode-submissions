class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];

        System.arraycopy(arr1, 0, merged, 0, arr1.length);
        System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);
        Arrays.sort(merged);
        int n=merged.length;
        if(n%2==0){
            return (float)(merged[n/2]+merged[(n-1)/2])/2;
        }
        else{
           return (float)merged[n/2];
        }
        
    }
}

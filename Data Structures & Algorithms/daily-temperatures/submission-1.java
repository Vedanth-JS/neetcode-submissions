class Solution {
    public int[] dailyTemperatures(int[] a) {
        int n=a.length;
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[j]>a[i]){
                    res[i]=j-i;
                    break;
                }
            }
        }
        return res;
    }
}
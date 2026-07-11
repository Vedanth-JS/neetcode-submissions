class Solution {
    public int maxArea(int[] a) {
        int n=a.length;
        int area;
        int maxa=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                area=(j-i)*Math.min(a[i],a[j]);
                maxa=Math.max(area,maxa);

            }
        }
        return maxa;
        
    }
}

class Solution {
    public boolean searchMatrix(int[][] a, int target) {
        int m=a.length;
        int n=a[0].length;
        int flag=0;
        for(int i=0;i<m;i++){
            if(a[i][n-1]<target){
                continue;
            }else{
                for(int j=0;j<n;j++){
                    if(a[i][j]==target){
                        flag =1;
                        break;
                    }
                }
            }
        }
        if(flag==1){
            return true;
        }else{
        return false;
        }
        
    }
}

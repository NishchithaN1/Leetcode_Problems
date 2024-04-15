class Solution {
    public void rotate(int[][] matrix) {
      int n=matrix.length;
    //   List<int[]> ans=new ArrayList<>();
      int l=0;
      int r=n-1;

      for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){
             
           int temp=matrix[i][j];
            matrix[i][j]=matrix[j][i];
            matrix[j][i]=temp;

        }
      }

      while(l<=r){
        for(int i=0;i<n;i++){
            int temp=matrix[i][l];
            matrix[i][l]=matrix[i][r];
            matrix[i][r]=temp;

        }
        l++;
        r--;
     
      }

    }

    
}
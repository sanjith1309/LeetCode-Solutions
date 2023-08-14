class Solution {
    public void setZeroes(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    matrix[i][j]=-999;
                }
            }
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==-999){
                    makeZeros(matrix,i,j);
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==-999){
                    matrix[i][j]=0;
                }
            }
        }
    }
    public void makeZeros(int[][] matrix,int i,int j){
        for(int k=0;k<matrix.length;k++){
            if(matrix[k][j]!=-999){
            matrix[k][j]=0;
            }
        }
        for(int k=0;k<matrix[0].length;k++){
            if(matrix[i][k]!=-999){
            matrix[i][k]=0;
            }
        }
    }
}

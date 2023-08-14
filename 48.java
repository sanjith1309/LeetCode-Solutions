lass Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=i+1; j<matrix.length;j++){
                int temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
        int first = 0;
        int last  = matrix.length-1;
        while(last>first){
            for(int i = 0;i<matrix.length;i++){
                int temp = matrix[i][last];
                matrix[i][last] = matrix[i][first];
                matrix[i][first] = temp;
            }
            last--;
            first++;
        }
    }
}

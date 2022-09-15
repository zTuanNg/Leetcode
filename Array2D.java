public class Array2D {
    public static void main(String[] args) {

        int[][] arr = {{1,1,1},{2,2},{3,3,3,3}};

        for(int i = 0 ; i < arr.length; i++){
            for(int j = 0 ; j < arr[i].length; j++){
                System.out.print(arr[i][j] +"\t");
            }
            System.out.println();
        }
    }
}

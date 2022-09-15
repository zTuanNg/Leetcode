import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _1380 {
    public static void main(String[] args) {


    }

    public static List<Integer> luckyNumbers (int[][] matrix) {

        ArrayList<Integer> rs = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            int position = findMinRow(matrix[i]);
            int minVal=matrix[i][position];
            boolean check = isMaxColumn(matrix , position , minVal);

            if(check){
                rs.add(matrix[i][position]);
            }
        }
        return rs;
    }

    public static int findMinRow(int []arr){
        int value=0;
        for(int i=0;i<arr.length;i++){
            if(arr[value]>arr[i]){
                value=i;
            }
        }
        return value;
    }

    public static boolean isMaxColumn(int [][] matrix , int position ,int minVal){
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][position]>minVal){
                return false;
            }
        }
        return true;
    }





}

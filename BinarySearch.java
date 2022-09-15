public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {3,1,2,4};

    }

    public static int binaryFind(int[] a, int x, int L, int R){

        if(L > R){
            return -1;
        }

        int k = (L+R)/2;
        if(a[k] == x){
            return k;
        }else if( a[k] > x){
            return binaryFind(a,x,L,k-1);
        }else {
            return binaryFind(a,x,k+1,R);
        }

    }
}

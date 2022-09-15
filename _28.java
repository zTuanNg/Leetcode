public class _28 {
    public static void main(String[] args) {

    }
    public int strStr(String haystack, String needle) {
        if(needle.length() == 1){
            return 0;
        }
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        return -1;
    }
}

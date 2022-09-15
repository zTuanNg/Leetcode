public class _9 {
    public static void main(String[] args) {
        int x = 1231;
        String s = x+"";

        int i = 0;
        int j = s.length();
        while(i < j){
            if(!s.substring(i,i+1).equals(s.substring(j-1,j))){
                System.out.println(s.substring(i,i+1));
                System.out.println(s.substring(j-1,j));

                System.out.println("false");
                break;
            }else{
                i++;
                j--;
            }
        }
        System.out.println("true");


    }
}

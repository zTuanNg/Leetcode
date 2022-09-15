public class _1859 {
    public static void main(String[] args) {

        String s = "Myself2 Me1 I4 and3";
        System.out.println(s.substring(s.length()-1));

//        System.out.println(sortSentence(s));

        String str = "Myself2";
        System.out.println(str.length());
        System.out.println(str.substring(0,6));
    }


    public static String sortSentence(String s) {

        String[] str = s.split(" ");
        String[] rs = new String[str.length];
        String result = "";

        for(String text : str){
            String num = text.substring(text.length()-1);
            int index = text.length()-1;
            rs[Integer.parseInt(num)-1] = text.substring(0,text.length()-1);
        }

        for(String text : rs){
            result += text + " ";

        }

        return result.trim();
    }

}

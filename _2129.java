import java.util.Locale;

public class _2129 {
    public static void main(String[] args) {

        String s = "l hV";

        System.out.println(capitalizeTitle(s));
    }

    public static String capitalizeTitle(String title) {

        String rs="";

        String[] arr = title.split(" ");
        for(String s : arr){
            String str = "";

            if(s.equalsIgnoreCase("of")){
                 str = s.toLowerCase();
            }else{
                if(s.length() < 3){
                    str = s.toUpperCase();
                }else{
                    str = s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase();
                }

            }

            rs += str +" ";
        }

        return rs.trim();
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class _155 {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(-3);
        st.push(2);

        System.out.println(getMin(st));
    }

    public static int getMin(Stack<Integer> st){
        int i = 0;
        List<Integer> lst = new ArrayList<>();
        while(!st.isEmpty()){
            lst.add(st.pop());
            i++;
        }
        for(int j = lst.size(); j>0; j--){
            st.push(lst.get(j));
        }
        Collections.sort(lst);
        return lst.get(0);
    }
}

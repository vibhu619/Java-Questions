package Stack;

import java.util.Stack;

public class ReversingStack2 {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();

        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);
        System.out.println(st);
        reverseAStack(st,st.size());
        System.out.println(st);
    }

    private static void reverseAStack(Stack<Integer> st, int size) {
        if(st.empty()){
            return;
        }
        int x=st.peek();
        st.pop();
        reverseAStack(st,size);
        insertAtBottom(st,x);
    }

    private static void insertAtBottom(Stack<Integer> st, int x) {
        if(st.empty()){
            st.push(x);
            return;
        }
        int y=st.peek();
        st.pop();
        insertAtBottom(st,x);
        st.push(y);
    }
}

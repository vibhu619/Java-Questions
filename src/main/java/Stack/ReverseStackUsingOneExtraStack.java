package Stack;

import java.util.Stack;

public class ReverseStackUsingOneExtraStack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        Stack<Integer> temp=new Stack<>();

        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);
        System.out.println(st);
        reverseStack(st,temp,st.size());

        System.out.println(st);

    }

    private static void reverseStack(Stack<Integer> st, Stack<Integer> temp, int size) {
        //base condition - when 1 element is left to reverse
        if(size==1){
            return;
        }

        //1. take the top element
        int x=st.peek();
        //2.pop that element
        st.pop();

        //3.move n-i-1 elements from st to temp
        int i=1;
        while(i<size){
            temp.push(st.peek());
            st.pop();
            i++;

        }

        //4.push x into top of st
        st.push(x);

        //5. move n-i-1 elements from temp to st
        i=1;
        while(i<size){
            st.push(temp.peek());
            temp.pop();
            i++;
        }

        //recursive call
        reverseStack(st,temp,size-1);
    }
}

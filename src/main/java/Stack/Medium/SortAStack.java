package Stack.Medium;

import java.util.Stack;
//We can use the below algorithm to sort stack elements:
//
//        sortStack(stack S)
//        if stack is not empty:
//        temp = pop(S);
//        sortStack(S);
//        sortedInsert(S, temp);
//        Below algorithm is to insert element is sorted order:
//
//        sortedInsert(Stack S, element)
//        if stack is empty OR element > top element
//        push(S, elem)
//        else
//        temp = pop(S)
//        sortedInsert(S, element)
//        push(S, temp)
public class SortAStack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();

        st.push(11);
        st.push(2);
        st.push(32);
        st.push(41);
        st.push(8);
        System.out.println(st);

        sortStack(st);
        System.out.println(st);
    }

    private static void sortStack(Stack<Integer> st) {
        if(st.isEmpty()){
            return;
        }
        int temp=st.pop();
        sortStack(st);
        sortInsert(st,temp);
    }

    private static void sortInsert(Stack<Integer> st, int element) {
        if(st.isEmpty() || element>st.peek()){
            st.push(element);
        }
        else{
            int temp=st.pop();
            sortInsert(st,element);
            st.push(temp);
        }
    }
}

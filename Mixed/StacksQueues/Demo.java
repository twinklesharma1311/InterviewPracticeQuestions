import java.util.Stack;

/**
 * Created by Twinkle on 2/6/2016.
 */
 class StackADT {
    private Stack<Integer> st = new Stack<>();
    private Stack<Integer> min_stack = new Stack<>();

    void push(int item) {
        st.push(item);
        if (min_stack.isEmpty()) {
            min_stack.push(item);
        } else {
            int top = min_stack.peek();
            if (top > item) {
                min_stack.push(item);
            }
        }

    }

    int pop() {
        int item=0;
        if (st.isEmpty()) {
            System.out.println("stack is empty");

        } else {
            item = st.pop();
            if (item == min_stack.peek())
                min_stack.pop();

        }
        return item;
    }

    int min() {
        if (st.isEmpty()) {
            System.out.println("stack is empty");
            return 0;
        } else
            return min_stack.peek();
    }

}
public class Demo {

    public static void main(String args [])
    { int min;
        StackADT OB=new StackADT();
        OB.push(5);
        OB.push(3);
        OB.push(2);
        OB.push(6);
        OB.push(7);
        OB.push(1);
        min=OB.min();
        System.out.println("minimum element in the stack is "+min);//1
        OB.pop();
        min=OB.min();
        System.out.println("minimum element in the stack is "+min);//2
        OB.pop();
        min=OB.min();
        System.out.println("minimum element in the stack is "+min);//2
        OB.pop();
        min=OB.min();
        System.out.println("minimum element in the stack is "+min);//2
        OB.pop();
        min=OB.min();
        System.out.println("minimum element in the stack is "+min);//3
        OB.pop();
        min=OB.min();
        System.out.println("minimum element in the stack is "+min);//5
        OB.pop();
        min=OB.min();
        System.out.println("minimum element in the stack is "+min);//


    }
}

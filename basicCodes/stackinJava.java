// Stack implementation in Java

class stackImplementation{
    int top = -1;
    int capacity = 10;
    int arr[] = new int[capacity];

    public boolean isEmpty() {
        return top == -1;
    }
    public boolean isFull() {
        return top == capacity - 1;
    }
    public int push (int data) {
        if ( isFull() ){
            System.out.println("Stack is Full !");
            return 0;
        }
        else{
            return arr[++top]=data;
        }
    }
    public int pop () {
        if (isEmpty()) {
            System.out.println("Stack is Empty !");
            return 0;
        }
        else {
            return arr[--top];
        }
    }
    public int peek() {
        return arr[top];
    }

}
public class stackinJava{
    public static void main(String[] args) {
        
        stackImplementation st = new stackImplementation();
        st.push(10);
        st.push(123);
        st.push(145);
        st.push(1789);
        st.push(3434);
        st.push(167);
        System.out.println(st);
        st.pop();
        st.pop();
        st.pop();
        st.push(3000);
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
    }
}
public class stackinJava{

    public class stackImplementation{
        int top;
        int capacity;
        int stack[];

        stackImplementation() {
            top = -1;
            capacity = 10;
            int stack[] = new int[capacity];
        }
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
                return stack[++top]=data;
            }
        }
        public int pop () {
            if (isEmpty()) {
                System.out.println("Stack is Empty !");
                return 0;
            }
            else {
                return stack[--top];
            }
        }
        public int peek() {
            return stack[top];
        }

    }
    public static void main(String[] args) {
        stackImplementation st = new stackImplementation();
        st.push(10);
        st.push(123);
        st.push(145);
        st.push(1789);
        st.push(3434);
        st.push(167);`
    }
}
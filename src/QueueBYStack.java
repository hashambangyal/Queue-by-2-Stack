import javax.crypto.spec.PSource;

public class QueueBYStack {                 // queue by 2 stacks

    private Stack stack;
    private Stack stack2;

    public QueueBYStack() {
        stack = new Stack();
        stack2 = new Stack();
    }

    public void push(int value){
   stack.push(value);

    }

    public int pop(){
        int pptr = stack.ptr;
        for( int i=0 ; i <= pptr ; i++){
            stack2.push(stack.pop());
        }
      int res=    stack2.pop();
        int ppttr = stack2.ptr;
        for ( int i=0 ; i<= ppttr; i++){
            stack.push(stack2.pop());
        }
        return  res;
    }

    public int peek(){
        int ppt = stack.ptr;
        for( int i=0 ; i <= ppt  ; i++){
            stack2.push(stack.pop());
        }
        int res=    stack2.peek();
        int ppttr = stack2.ptr;
        for ( int i=0 ; i<= ppttr; i++){
            stack.push(stack2.pop());
        }
        return  res;
    }

}

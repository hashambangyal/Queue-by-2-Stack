public class Stack {
     protected int data[];
     private static final int DEFAULT_size = 10 ;
     public int ptr = -1;





    public Stack() {
        this(DEFAULT_size);
    }

    public Stack(int size) {
        this.data = new int[size];
    }

    public boolean isEmpty(){
        return ptr == -1;
    }

    public boolean isFull(){
return ptr == data.length - 1 ;
    }

    public void push(int value){
        if( isFull()){
            System.out.println("Stack is now Full......");
            return ;
        }

        ptr += 1;
        data[ptr] = value;
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("Stack is Empty.....");
            return -1 ;
        }
         int res = data[ptr];
         ptr -= 1;

        return res;
    }

    public int peek(){
        if( isEmpty()){
            System.out.println("Stack is Empty...." );
            return -1;
        }
        int res = data[ptr];

        return res;
    }


}

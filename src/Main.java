public class Main {
    public static void main(String[] args) {

//     Stack list = new Stack(4);
//
//list.push(5);
//list.push(3);
//list.push(7);
//list.push(8);
//
//
//list.pop();
//list.peek();

        QueueBYStack list = new QueueBYStack();
        list.push(5);
        list.push(3);
        list.push(7);
        list.push(8);

        System.out.println(list.pop());
        System.out.println(list.pop());

        System.out.println(list.peek());


    }
}

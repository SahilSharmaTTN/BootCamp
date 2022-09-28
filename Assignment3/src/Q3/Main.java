package Q3;

public class Main {
    public static void main(String[] args) {
        SpecialStack specialStack = new SpecialStack(5);

        System.out.println("Is Full?" + specialStack.isFull());
        System.out.println("Is Empty?" + specialStack.isEmpty());

        specialStack.push(5);

        System.out.println(specialStack.peek());
        specialStack.push(3);
        specialStack.push(2);
        specialStack.push(1);
        specialStack.push(6);



        specialStack.printStack();

        specialStack.push(7);

        System.out.println("Element Popped :" + specialStack.pop());





    }
}

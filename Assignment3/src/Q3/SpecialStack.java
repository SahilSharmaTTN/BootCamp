package Q3;

public class SpecialStack {

    private int capacity;
    private int top ;
    private int arr[];

    private int minValue ;

    public SpecialStack(int capacity) {
        this.capacity = capacity;
        arr = new int[this.capacity];
        top = -1;
        minValue = Integer.MAX_VALUE;
    }

    public void push(int value){
        if(isFull()) {
            System.out.println("Stack overflow");
            return;
        }
        if(value < minValue){
            minValue = value;
        }

        arr[++top] = value;
        System.out.println(value + " Added to to the stack");
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack underflow");
            return -1;
        }
        int popped = arr[top];
        top --;
        return popped;
    }
    boolean isEmpty(){
        if(top == -1){
            return true;
        }
        return false;

    }

    boolean isFull(){
        if(top == capacity){
            return true;
        }
        return false;

    }

    int peek(){
        if(top == -1){
            return -1;
        }
        return arr[top];

    }
    public int getMin(){
        return minValue;
    }

    public void printStack(){

            for(int i = top; i >= 0; i--){
                System.out.println(arr[i]);
            }

    }



}

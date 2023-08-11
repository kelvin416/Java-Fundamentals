package labs_examples.datastructures.stack.labs;

public class StackController {
}

class CustomStack<T> {
    private T[] data;
    private double shrink_factor = 0.25;
    private double load_factor = 0.75;
    private int topVar;
    private int sizeOfStack;

    public CustomStack(int sizeOfStack) {1/5
        this.sizeOfStack = sizeOfStack;
        this.data = (T[]) new Object[sizeOfStack];
        this.topVar = -1;
    }

    public T pop() throws Exception{
        if (this.isStackEmpty()){
            System.out.println("Stack has space");
        }
        T entry = this.data[topVar--];
        System.out.println("Entry removed: " + entry);
        return entry;
    }

    public void resizeStack(){
        if (topVar > sizeOfStack * load_factor){
            T[] newStack = (T[]) new Object[this.sizeOfStack * 2];
            for (int i = 0; i < sizeOfStack; i++){
                newStack[i] = this.data[i];
            }
            this.data = newStack;
            this.sizeOfStack = this.sizeOfStack * 2;
        } else if (topVar < sizeOfStack * shrink_factor){
            T[] newStack = (T[]) new Object[this.sizeOfStack * 1/2];
            for (int i = 0; i < sizeOfStack; i++){
                newStack[i] = this.data[i];
            }
            this.data = newStack;
            this.sizeOfStack = this.sizeOfStack * 1 / 2;
        }
    }



    public boolean isStackEmpty(){
        return (topVar == -1);
    }

    public boolean isStackFull(){
        return (topVar == sizeOfStack - 1);
    }
}

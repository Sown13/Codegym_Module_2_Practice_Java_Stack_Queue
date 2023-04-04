package p1;

public class GenericStackClient {
    public static void main(String[] args) {
        stackOfStrings();
        stackOfIntergers();
    }
    public static void stackOfStrings() {
        MyGenericStack<String> stackString = new MyGenericStack<>();
        stackString.push("first");
        stackString.push("second");
        stackString.push("third");
        stackString.push("forth");
        stackString.push("fifth");
        System.out.println("Stack after push: " + stackString + " have size: " + stackString.size());
        stackString.pop();
        System.out.println("Stack after pop: " + stackString + " have size: " + stackString.size() + "  /Last in - First out/");
        while (!stackString.isEmpty()){
            stackString.pop();
        }
        System.out.println("Stack after pop all: " + stackString + " have size: " + stackString.size());
    }
    public static void stackOfIntergers(){
        MyGenericStack<Integer> intStack = new MyGenericStack<>();
        intStack.push(5);
        intStack.push(4);
        intStack.push(3);
        intStack.push(2);
        intStack.push(1);
        System.out.println("Stack after push: " + intStack + " have size: " + intStack.size());
        intStack.pop();
        System.out.println("Stack after pop: " + intStack + " have size: " + intStack.size() + " /Last in - First out/");
        while (!intStack.isEmpty()){
            intStack.pop();
        }
        System.out.println("Stack after pop all: " + intStack + " have size: " + intStack.size());
    }
}

package data_structure;

public class DataStructureTest {
    public static void main(String[] args) {
        MyStack stack = new MyStack(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.size());
        stack.push(4);
        System.out.println(stack.size());
        stack.push(5);
        System.out.println(stack.size());
    }
}

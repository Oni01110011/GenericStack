import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * A generic Classes created according to the Exercise: 3. Write a generic stack class. This class is supposed to mimic
 * a stack and incorporates all the Methods a stack should inherit according to the Wikipedia article:
 * https://en.wikipedia.org/wiki/Stack_(abstract_data_type)
 * @param <T> the Generic
 * @author Bernhard Aichinger-Ganas
 * @version 13-02-24
 */
public class GenericStack <T>{
    private T[] stack;
    private int length;
    private int count;

    /**
     * Empty Constructor
     */
    public GenericStack() {
        stack = (T[]) new Object[10];
        length = 10;
    }

    /**
     * Constructor that sets the number of fields the Stack should have
     * @param length the number of fields the Stack should have
     */
    public GenericStack(int length) {
        stack = (T[]) new Object[length];
        this.length = length;
    }

    /**
     * A Method that adds A generic to the first free field of the "Stack"
     * @param type the generic that gets added
     * @throws StackFullException throws if the Stack is full and another generic is tried to get added
     */
    public void push(T type) throws StackFullException {
        if(count >= length) throw new StackFullException();
        stack[count++] = type;
    }

    /**
     * A method that deletes the last used field of an Array
     * @return what the deleted field contained
     * @throws StackEmptyException if the "Stack" is empty but u still try to pop the it
     */
    public T pop() throws StackEmptyException {
        if(count == 0) throw new StackEmptyException();
        count--;
        T temp = stack[count];
        stack[count] = null;
        return temp;
    }

    /**
     * A method that returns the highest "layer" (Element[Generic]) of the Stack
     * @return the Element (Generic)
     * @throws StackEmptyException if u try to read the Element but the Stack is empty
     */
    public T peek() throws StackEmptyException {
        try {
            return stack[count - 1];
        } catch(Exception e) {
            throw new StackEmptyException();
        }
    }

    /**
     * A Method that returns the Stack as a String separated by " ; "
     * @return The Stack returned as a String separated by " ; "
     * @throws StackEmptyException If you try to list the Stack but its empty
     */
    public String list() throws StackEmptyException {
        if(count == 0) throw new StackEmptyException();
        return Arrays.stream(stack).map(Object::toString).collect(Collectors.joining(" ; "));
    }
}

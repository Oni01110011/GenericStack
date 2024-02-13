/**
 * Exception that gets thrown when the Stack is empty
 * @author Bernhard Aichinger-Ganas
 * @version 13-02-23
 */
public class StackEmptyException extends Exception{
    public StackEmptyException() {
        super("Sadly the Stack is Empty, use the push method, to add a new Generic to your Stack");
    }
}

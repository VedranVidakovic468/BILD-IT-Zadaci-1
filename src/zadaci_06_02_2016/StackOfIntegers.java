package zadaci_06_02_2016;

public class StackOfIntegers {
//StartCopyCode strana 378
		private int[] elements;
	    private int size;
	    public static final int MAX_SIZE = 16;

	    /** Construct a stack with the default capacity 16 */
	    public StackOfIntegers() {
	        this(MAX_SIZE);
	    }

	    /** Construct a stack with the specified maximum capacity */
	    public StackOfIntegers(int capacity) {
	        elements = new int[capacity];
	    }

	    /** Push a new integer into the top of the stack */
	    public int push(int value) {
	        if (size >= elements.length) {
	            int[] temp = new int[elements.length * 2];
	            System.arraycopy(elements, 0, temp, 0, elements.length);
	            elements = temp;
	        }

	        return elements[size++] = value;
	    }

	    /** Return and remove the top element from the stack */
	    public int pop() {
	        return elements[--size];
	    }

	    /** Return the top element from the stack */
	    public int peek() {
	        return elements[size - 1];
	    }

	    /** Test whether the stack is empty */
	    public boolean empty() {
	        return size == 0;
	    }

	    /** Return the number of elements in the stack */
	    public int getSize() {
	        return size;
	    }
	}
//EndCopyCode Ja Ahmed razumjem ovaj kod



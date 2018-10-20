package interfaces;

import java.util.EmptyStackException;

public class StringStack implements BasicCollection {

    private static final int INITIAL_CAPACITY = 5;
    private String[] elements;
    private int index = 0;

    public StringStack() {
        this.elements = new String[INITIAL_CAPACITY];
    }

    @Override
    public boolean addElement(String text) {
        if (index < INITIAL_CAPACITY) {
            elements[index++] = text;
            System.out.println("Dodano element");
            return true;
        } else {
            // todo: deletethis
            System.out.println("Stos pełny - nie można dodać - zwracam false");
            return false;
        }
    }

        @Override
        public String removeElement () {
        if (index > 0) {
            throw new EmptyStackException();
        }
            String elementToRemove = elements[index];
            elements[index] = null; // oznaczamy ten element jako do usunięcia przez garbage collector
            index--;
            return elementToRemove;
        }

        @Override
        public String removeElement ( int index){
            throw new UnsupportedOperationException();
        }

    }


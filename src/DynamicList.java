import java.util.*;

public class DynamicList<E> extends AbstractList<E> {
    private int size;
    private E[] array;

    @SuppressWarnings("unchecked")
    public DynamicList() {
        size = 0;
        array = (E[]) new Object[10];
    }

    @SuppressWarnings("unchecked")
    public DynamicList(int initialCapacity) {
        size = 0;
        array = (E[]) new Object[10];
    }

    @SuppressWarnings("unchecked")
    public void grow() {
        E[] temp = (E[]) new Object[2 * size];

        for (int i = 0; i < size; i++) {
            temp[i] = array[i];
        }

        array = temp;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(Object e) {
        return indexOf(e) != -1;
    }

    public int indexOf(Object e) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(e))
                return i;
        }

        return -1;
    }

    public int lastIndexOf(Object e) {
        for (int i = size - 1; i >= 0; i--) {
            if (array[i].equals(e))
                return i;
        }
        return -1;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(String.format("index %d out of bounds for length %d", index, size));
        }
        return array[index];
    }

    public E set(int index, E element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(String.format("index %d out of bounds for length %d", index, size));
        }
        E old = get(index);
        array[index] = element;
        return old;
    }

    public boolean add(E element) {
        if (size == array.length) {
            grow();
        }
        array[size] = element;
        size++;
        return true;
    }

    public void add(int index, E element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(String.format("index %d out of bounds for length %d", index, size));
        }

        if (size == array.length) {
            grow();
        }

        for (int i = size - 1; i >= index; i--) {
            array[i+1] = array[i];
        }

        array[index] = element;
        size++;
    }

    public E remove(int index) {
        E old = get(index);

        for (int i = index + 1; i < size; i++) {
            array[i-1] = array[i];
        }

        size--;
        return old;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        result.append("[");

        for (int i = 0; i < size; i++) {
            result.append(array[i]);
            result.append(i == size - 1 ? "]" : ", ");
        }

        return result.toString();
    }

    public Iterator<E> iterator() {
        return new DynamicListIterator();
    }

    private class DynamicListIterator implements Iterator<E> {
        private int index;

        public DynamicListIterator() {
            index = 0;
        }

        public boolean hasNext() {
            return index < size;
        }

        public E next() {
            index++;
            return array[index - 1];
        }
    }

}

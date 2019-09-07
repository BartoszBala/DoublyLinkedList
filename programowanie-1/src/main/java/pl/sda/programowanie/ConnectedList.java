package HomeWork;

import java.util.*;

public class ConnectedList<T> implements List<T> {
    private int size = 0;
    private Internal head;


    private class Internal {

        Internal next;
        T element;
    }

    private Internal getLast() {
        if (isEmpty()) {
            return null;
        }

        Internal current = head;
        while (true) {
            if (current.next == null) {
                break;
            } else {
                current = current.next;
            }
        }
        return current;
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(T t) {

        Internal internal = new Internal();
        internal.element = t;
        if (isEmpty()) {
            internal.element = t;
            head = internal;
            size++;

        } else {

            getLast().next = internal;
            if (size < Integer.MAX_VALUE)
                size++;
        }
        return true;
    }


    @Override
    public boolean remove(Object o) {

        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int index) {

        Internal current = head;

        int i = 0;
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        while (i < index) {
            if (!(current == null))
                current = current.next;
            i++;

        }
        return current.element;

    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }
}

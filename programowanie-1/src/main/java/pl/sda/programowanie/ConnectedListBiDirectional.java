package pl.sda.programowanie;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ConnectedListBiDirectional<T> implements List<T> {
    int size;
    Internal head = new Internal();
    Internal tail = new Internal();



    private class Internal {
        Internal next;
        Internal previous;
        T element;

        public Internal getNext() {
            return next;
        }



        public Internal getPrevious() {
            return previous;
        }
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {

        return head.element == null;

    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    public boolean addToStart(T t) {
        Internal internal = new Internal();
        Internal current;
        internal.element = t;
        if (size==0) {
            head = internal;
            size++;
        } else {
            current = head;
            current.previous = internal;
            internal.next = current;
            head = internal;
            size++;
        }

        return true;
    }

    public boolean addToEnd(T t) {
        if(size==0)
        {addToStart(t);}
        else {
            Internal internal = new Internal();
            Internal current;
            internal.element = t;
            if (size == 1) {
                internal.previous = head;
                head.next = internal;
                tail = internal;
            } else {

                current = tail;
                current.next = internal;
                internal.previous = current;
                tail = internal;
            }
            size++;

        }
        return true;
    }

    public boolean addToPosition(T t, int position) {

        Internal internal = new Internal();
        Internal current = head;


        internal.element = t;
if(position==size)
{
    addToEnd(t);
}
else {

    int i = 1;
    if (position < 0 || (position > size && size != 0) || position > size) {
        throw new IndexOutOfBoundsException();
    }

    if (position == 0) {
        addToStart(t);
        return true;
    } else {
        while (i < position) {

            current = current.next;

            i++;

        }
        internal.next = current.getNext();
        Internal current2 = current.getNext();
        current.next = internal;
        internal.previous = current;
        current2.previous = internal;
    }

    size++;
}

        return true;
    }

    @Override
    public boolean add(T t) {
        if (size == 0) {
            addToStart(t);
        } else {
            addToEnd(t);
        }

        return true;
    }


    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int index) {

        Internal current = new Internal();
        current = head;

        int i = 0;
        if (index >= size||index<0) {

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

        Internal current = head;
        T temporary = null;

        int i = 0;
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        while (i < index) {
            current = current.next;
            i++;

        }

        temporary = current.element;

        current.element = element;

        return temporary;


    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public T remove(int index) {

        Internal current = head;
        T temporary = null;
        int i = 0;
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        if(index==0)
        { head=head.next;
            head.previous=null;
        if(size==1)
        {

head.previous=null;
            head.element=null;
        tail.element=null;
        tail.previous=null;
        tail.next=null;
        }
             }
        else if(index==size-1)
        { tail=tail.previous;}
        else {
            while (i < index) {
                //        temporary = current.element;
//            if (i < index)
                current = current.next;

                i++;
            }
            current.previous.next = current.next;
            current.next.previous = current.previous;
        }
        size -= 1;
if(size==0)
{tail=head;}
        return temporary;
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
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}

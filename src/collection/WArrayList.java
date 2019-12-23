package collection;

import java.util.*;

public class WArrayList<E> implements List<E> {

    private int minCapacity = 10;
    private int curentindex;
    private Object[] elements;

    public WArrayList() {
        elements = new Object[minCapacity];
        curentindex = 0;
    }

    public WArrayList(int minCapacity) {
        if (minCapacity > 0)
            this.minCapacity = minCapacity;
        elements = new Object[minCapacity];
        curentindex = 0;
    }

    public WArrayList(Collection<? extends E> collection) {
        elements = collection.toArray();
        curentindex = collection.size();
    }

    @Override
    public String toString() {
        String s = "[";
        for (int i = 0; i < curentindex; i++) {
            s += elements[i];
            s += ", ";
        }
        s = s.substring(0, s.length() - 2);
        s = s.trim() + "]";
        return s;

    }

    @Override
    public int size() {
        return curentindex;
    }

    @Override
    public boolean isEmpty() {
        return curentindex == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (Object ob : elements) {
            if (o.equals(ob))
                return true;
        }
        return false;
    }


    @Override
    public Iterator<E> iterator() {
        Iterator<E> iterator = new Iterator<E>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < curentindex;
            }

            @Override
            public E next() {
                return (E) elements[index++];
            }
        };
        return iterator;
    }

    @Override
    public Object[] toArray() {
        return elements.clone();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        if (a.length < curentindex)
            a = Arrays.copyOf(a, curentindex);
        for (int i = 0; i < curentindex; i++) {
            a[i] = (T) elements[i];
        }
        return a;
    }

    @Override
    public boolean add(E e) {
        if (e != null) {
            if (elements.length == curentindex) {
                Object[] objects = new Object[elements.length];
                for (int i = 0; i < elements.length; i++) {
                    objects[i] = elements[i];
                }
                elements = new Object[(int) (minCapacity * 1.5)];
                for (int i = 0; i < elements.length; i++) {
                    elements[i] = objects[i];
                }
            }
            elements[curentindex++] = e;
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(Object o) {
        if (o != null) {
            if (contains(o)) {
                for (int i = 0; i < elements.length; i++) {
                    if (elements[i].equals(o)) {
                        remove(i);
                        return true;
                    }
                }
            }

        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        if (c.size() > this.size())
            return false;
        Object[] objects = c.toArray();
        for (Object ob : objects)
            if (ob != null && !contains(ob))
                return false;
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        if (c != null) {
            if (elements.length <= curentindex + c.size()) {
                Object[] objects = new Object[elements.length];
                for (int i = 0; i < elements.length; i++) {
                    objects[i] = elements[i];
                }
                elements = new Object[curentindex + c.size()];
                for (int i = 0; i < elements.length; i++) {
                    elements[i] = objects[i];
                }
            }
            Object[] objects = c.toArray();
            for (Object ob : objects)
                this.add((E) ob);
            return true;
        }
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        if (index >= curentindex || index < 0)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + this.size());
        Object[] objects = new Object[elements.length];
        for (int i = 0; i < elements.length; i++)
            objects[i] = elements[i];
        if (curentindex + c.size() >= elements.length)
            elements = new Object[curentindex + c.size()];
        for (int i = 0; i < index; i++)
            elements[i] = objects[i];
        curentindex = index;
        this.addAll(c);
        for (int i = index; i < objects.length; i++)
            this.add((E) objects[i]);
        return true;

    }

    @Override
    public boolean removeAll(Collection<?> c) {
        Object[] objects = c.toArray();
        if (this.containsAll(c)) {
            for (Object ob : objects)
                this.remove(ob);
            return true;
        }
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        int i=0;
        boolean t=false;
        while (i<curentindex) {
            if (!c.contains(elements[i])) {
                this.remove(i);
                t=true;
                continue;
            }
            i++;
        }
        return t;
    }

    @Override
    public void clear() {
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
        curentindex = 0;
    }

    @Override
    public E get(int index) {
        if (index >= curentindex || index < 0)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + this.size());

        return (E) elements[index];

    }

    @Override
    public E set(int index, E element) {
        if (index >= curentindex || index < 0)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + this.size());
        E temp = (E) elements[index];
        elements[index] = element;
        return temp;
    }

    @Override
    public void add(int index, E element) {
        if (index >= curentindex || index < 0)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + this.size());
        Object[] objects = elements.clone();
        elements = new Object[objects.length + 1];
        curentindex = 0;
        int j = 0;
        for (int i = 0; i < objects.length + 1; i++) {
            if (i == index)
                this.add(element);
            else {
                this.add((E) objects[j]);
                j++;
            }

        }
    }

    @Override
    public E remove(int index) {
        if (index < 0 || index >= curentindex)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + this.size());
        for (int i = 0; i < elements.length; i++) {
            if (index == i) {
                if (i != elements.length - 1) {
                    for (int j = i + 1; j < elements.length; j++) {
                        elements[j - 1] = elements[j];
                    }
                }
                E temp = (E) elements[elements.length - 1];
                elements[--curentindex] = null;
                return temp;
            }
        }
        return null;

    }

    @Override
    public int indexOf(Object o) {
        if (this.contains(o)) {
            for (int i = 0; i < curentindex; i++)
                if (elements[i].equals(o))
                    return i;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        if (this.contains(o)) {
            for (int i = curentindex - 1; i >= 0; i--)
                if (elements[i].equals(o))
                    return i;
        }
        return -1;
    }

    @Override
    public ListIterator<E> listIterator() {
        ListIterator<E> listIterator = new ListIterator<E>() {
            private int index = 0;
            private int temp;

            @Override
            public boolean hasNext() {
                return index < curentindex;
            }

            @Override
            public E next() {
                temp = -1;
                return (E) elements[index++];
            }

            @Override
            public boolean hasPrevious() {
                return index >= 0;
            }

            @Override
            public E previous() {
                temp = 1;
                if (index == curentindex)
                    index--;
                return (E) elements[index--];
            }

            @Override
            public int nextIndex() {
                return index < curentindex ? index : curentindex;
            }

            @Override
            public int previousIndex() {
                return index - 1 >= 0 ? index - 1 : -1;
            }

            @Override
            public void remove() {
                WArrayList.this.remove(index + temp);
            }

            @Override
            public void set(E e) {
                WArrayList.this.set(index + temp, e);
            }

            @Override
            public void add(E e) {
                WArrayList.this.add(index, e);
            }
        };
        return listIterator;
    }

    @Override
    public ListIterator<E> listIterator(int ptr) {
        ListIterator<E> listIterator = new ListIterator<E>() {
            private int index = ptr;
            private int temp;

            @Override
            public boolean hasNext() {
                return index < curentindex;
            }

            @Override
            public E next() {
                temp = -1;
                return (E) elements[index++];
            }

            @Override
            public boolean hasPrevious() {
                return index >= 0;
            }

            @Override
            public E previous() {
                temp = 1;
                if (ptr == index)
                    index--;
                if (index == curentindex)
                    index--;
                return (E) elements[index--];
            }

            @Override
            public int nextIndex() {
                return index < curentindex ? index : curentindex;
            }

            @Override
            public int previousIndex() {
                return index - 1 >= 0 ? index - 1 : -1;
            }

            @Override
            public void remove() {
                WArrayList.this.remove(index + temp);
            }

            @Override
            public void set(E e) {
                WArrayList.this.set(index + temp, e);
            }

            @Override
            public void add(E e) {
                WArrayList.this.add(index, e);
            }
        };
        return listIterator;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        if (fromIndex > toIndex)
            throw new IllegalArgumentException(fromIndex + " > " + toIndex);
        if (fromIndex < 0 || toIndex > curentindex)
            throw new IndexOutOfBoundsException();
        List<E> list = new WArrayList<>((toIndex - fromIndex) + 1);
        for (int i = fromIndex; i <= toIndex; i++) {
            list.add((E) this.elements[i]);
        }
        return list;
    }
}

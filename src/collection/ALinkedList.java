package collection;


import java.util.*;

public class ALinkedList<E> implements List<E>, Deque<E> {

    transient private Node<E> first;
    transient private Node<E> last;
    transient private int currentindex = 0;

    public ALinkedList() {

    }

    public ALinkedList(Collection<? extends E> ptr) {

        Iterator<?> iterator = ptr.iterator();
        while (iterator.hasNext())
            this.addLast((E) iterator.next());

    }

    @Override
    public E get(int index) {
        if (currentindex == 0 || currentindex < index)
            throw new NoSuchElementException("currentindex:" + currentindex + " , index:" + index);
        Node<E> temp;
        int count;
        if (index <= currentindex / 2) {
            temp = first;
            count = 0;
            while (temp != null) {
                if (count == index)
                    return temp.data;
                count++;
                temp = temp.next;
            }
        } else {
            temp = last;
            count = currentindex - 1;
            while (temp != null) {
                if (count == index)
                    return temp.data;
                count--;
                temp = temp.previous;
            }
        }
        return null;

    }

    @Override
    public E set(int index, E element) {
        if (currentindex == 0 || currentindex < index)
            throw new NoSuchElementException("currentindex:" + currentindex + " , index:" + index);
        Node<E> temp;
        int count;
        E pow;
        if (index <= currentindex / 2) {
            temp = first;
            count = 0;
            while (temp != null) {
                if (count == index) {
                    pow = temp.data;
                    temp.data = element;
                    return pow;
                }
                count++;
                temp = temp.next;
            }
        } else {
            temp = last;
            count = currentindex - 1;
            while (temp != null) {
                if (count == index) {
                    pow = temp.data;
                    temp.data = element;
                    return pow;
                }
                count--;
                temp = temp.previous;
            }
        }
        return null;
    }

    @Override
    public void add(int index, E element) {
        if (currentindex == 0 || currentindex < index)
            throw new NoSuchElementException("currentindex:" + currentindex + " , index:" + index);
        Node<E> temp;
        int count;
        Node<E> el = new Node<>(element, null, null);
        E pow;
        if (index == 0) {
            this.addFirst(element);
            return;
        }
        if (index <= currentindex / 2) {
            temp = first;
            count = 0;
            while (temp != null) {
                if (count == index) {
                    el.next = temp;
                    Node<E> pre = temp.previous;
                    temp.previous = el;
                    el.previous = pre;
                    pre.next = el;
                    return;
                }
                count++;
                temp = temp.next;
            }
        } else {
            temp = last;
            count = currentindex - 1;
            while (temp != null) {
                if (count == index) {
                    el.next = temp;
                    Node<E> pre = temp.previous;
                    temp.previous = el;
                    el.previous = pre;
                    pre.next = el;
                    return;
                }
                count--;
                temp = temp.previous;
            }
        }
    }

    @Override
    public E remove(int index) {
        if (currentindex == 0 || currentindex < index)
            throw new NoSuchElementException("currentindex:" + currentindex + " , index:" + index);
        E pow;
        if (index == 0)
            return removeFirst();
        if (index == currentindex - 1)
            return removeLast();
        Node<E> temp;
        Node<E> el;
        int count;
        if (index <= currentindex / 2) {
            temp = first;
            count = 0;
            while (temp != null) {
                if (count == index) {
                    pow = temp.data;
                    el = temp.previous;
                    el.next = temp.next;
                    temp.next.previous = el;
                    currentindex--;
                    return pow;
                }
                count++;
                temp = temp.next;
            }
        } else {
            temp = last;
            count = currentindex - 1;
            while (temp != null) {
                if (count == index) {
                    pow = temp.data;
                    el = temp.previous;
                    el.next = temp.next;
                    temp.next.previous = el;
                    currentindex--;
                    return pow;
                }
                count--;
                temp = temp.previous;
            }
        }
        return null;
    }

    @Override
    public int indexOf(Object o) {
        if (o == null)
            throw new NullPointerException("Is " + o);
        Node<E> temp;
        temp = first;
        int count = 0;
        while (temp != null) {
            if (temp.data.equals(o)) {
                return count;
            }
            count++;
            temp = temp.next;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        if (o == null)
            throw new NullPointerException("Is " + o);
        Node<E> temp;
        temp = last;
        int count = currentindex - 1;
        while (temp != null) {
            if (temp.data.equals(o)) {
                return count;
            }
            count--;
            temp = temp.previous;
        }
        return -1;
    }

    @Override
    public ListIterator<E> listIterator() {
        ListIterator<E> listIterator = new ListIterator<E>() {
            Node<E> temp = first;
            private int index = 0;

            @Override
            public boolean hasNext() {
                return temp != null;
            }

            @Override
            public E next() {
                E pow = temp.data;
                temp = temp.next;
                index++;
                return pow;
            }

            @Override
            public boolean hasPrevious() {
                return temp != null;
            }

            @Override
            public E previous() {
                E pow = temp.data;
                temp = temp.previous;
                if (index != 0)
                    index--;
                return pow;
            }

            @Override
            public int nextIndex() {
                return index;
            }

            @Override
            public int previousIndex() {
                return index - 1;
            }

            @Override
            public void remove() {
                ALinkedList.this.remove(index);
            }

            @Override
            public void set(E e) {
                ALinkedList.this.set(index, e);
            }

            @Override
            public void add(E e) {
                ALinkedList.this.add(index, e);
            }
        };
        return listIterator;
    }

    @Override
    public ListIterator<E> listIterator(int in) {
        Node<E> pow = first;
        int i = 0;
        while (i != in) {
            pow = pow.next;
            i++;
        }
        Node<E> finalPow = pow;
        ListIterator<E> listIterator = new ListIterator<E>() {
            Node<E> temp = finalPow;
            private int index = in;

            @Override
            public boolean hasNext() {
                return temp != null;
            }

            @Override
            public E next() {
                E pow = temp.data;
                temp = temp.next;
                index++;
                return pow;
            }

            @Override
            public boolean hasPrevious() {
                return temp != null;
            }

            @Override
            public E previous() {
                E pow = temp.data;
                temp = temp.previous;
                if (index != 0)
                    index--;
                return pow;
            }

            @Override
            public int nextIndex() {
                return index;
            }

            @Override
            public int previousIndex() {
                return index - 1;
            }

            @Override
            public void remove() {
                ALinkedList.this.remove(index);
            }

            @Override
            public void set(E e) {
                ALinkedList.this.set(index, e);
            }

            @Override
            public void add(E e) {
                ALinkedList.this.add(index, e);
            }
        };
        return listIterator;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public void addFirst(E e) {
        if (currentindex != 0) {
            ALinkedList.Node<E> temp = new Node<>(e, null, first);
            first.previous = temp;
            first = temp;
        } else {
            ALinkedList.Node<E> temp = new Node<>(e, null, null);
            first = last = temp;
        }
        currentindex++;
    }

    @Override
    public void addLast(E e) {
        if (currentindex != 0) {
            Node<E> temp = new Node<>(e, last, null);
            last.next = temp;
            last = temp;
        } else {
            Node<E> temp = new Node<>(e, null, null);
            first = last = temp;
        }
        currentindex++;
    }


    @Override
    public boolean offerFirst(E e) {
        if (currentindex != 0) {
            ALinkedList.Node<E> temp = new Node<>(e, null, first);
            first.previous = temp;
            first = temp;
        } else {
            ALinkedList.Node<E> temp = new Node<>(e, null, null);
            first = last = temp;
        }
        currentindex++;
        return true;
    }

    @Override
    public boolean offerLast(E e) {
        if (currentindex != 0) {
            Node<E> temp = new Node<>(e, last, null);
            last.next = temp;
            last = temp;
        } else {
            Node<E> temp = new Node<>(e, null, null);
            first = last = temp;
        }
        currentindex++;
        return true;
    }

    @Override
    public E removeFirst() {
        if (currentindex == 0)
            return null;
        Node<E> temp = first;
        first = first.next;
        first.previous = null;
        currentindex--;
        return temp.data;
    }

    @Override
    public String toString() {
        String ptr = "[";
        Node<E> temp = first;
        while (temp != null) {
            ptr += (temp.data + ", ");
            temp = temp.next;
        }
        ptr = ptr.substring(0, ptr.length() - 2);
        ptr = ptr.trim() + "]";
        return ptr;
    }

    @Override
    public E removeLast() {
        if (currentindex == 0)
            return null;
        Node<E> temp = last;
        last = last.previous;
        last.next = null;
        currentindex--;
        return temp.data;
    }

    @Override
    public E pollFirst() {
        if (currentindex == 0)
            return null;
        return this.removeFirst();
    }

    @Override
    public E pollLast() {
        if (currentindex == 0)
            return null;
        return this.removeLast();
    }

    @Override
    public E getFirst() {
        return first.data;
    }

    @Override
    public E getLast() {
        return last.data;
    }

    @Override
    public E peekFirst() {
        if (currentindex == 0)
            return null;
        return first.data;
    }

    @Override
    public E peekLast() {
        if (currentindex == 0)
            return null;
        return first.data;
    }

    @Override
    public boolean removeFirstOccurrence(Object o) {
        return remove(o);
    }

    @Override
    public boolean removeLastOccurrence(Object o) {
        if (currentindex == 0)
            return false;
        int i = currentindex - 1;
        Node<E> temp = last;
        while (temp != null) {
            if (temp.data.equals(o)) {
                this.remove(i);
                return true;
            }
            i--;
            temp = temp.previous;
        }
        return false;
    }

    @Override
    public boolean offer(E e) {
        return offerLast(e);
    }

    @Override
    public E remove() {
        return this.removeFirst();
    }

    @Override
    public E poll() {
        if (currentindex == 0)
            return null;
        return this.removeFirst();
    }

    @Override
    public E element() {
        return this.peek();
    }

    @Override
    public E peek() {
        if (currentindex == 0)
            return null;
        return first.data;
    }

    @Override
    public void push(E e) {
        this.addFirst(e);
    }

    @Override
    public E pop() {
        return this.removeFirst();
    }

    @Override
    public int size() {
        return currentindex;
    }

    @Override
    public boolean isEmpty() {
        return currentindex == 0;
    }

    @Override
    public boolean contains(Object o) {
        if (currentindex == 0)
            return false;
        Node<E> temp = first;
        while (temp != null) {
            if (temp.data.equals(o))
                return true;
            temp = temp.next;
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        Iterator<E> iterator = new Iterator<E>() {
            Node<E> temp = first;

            @Override
            public boolean hasNext() {
                return temp != null;
            }

            @Override
            public E next() {
                E pow = temp.data;
                temp = temp.next;
                return pow;
            }
        };
        return iterator;
    }

    @Override
    public Object[] toArray() {
        Object[] object = new Object[currentindex];
        int i = 0;
        Node<E> temp = first;
        while (temp != null) {
            object[i] = first.data;
            i++;
            temp = temp.next;
        }
        return object;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        if (a.length < currentindex)
            a = Arrays.copyOf(a, currentindex);
        int i = 0;
        Node<E> temp = first;
        while (temp != null) {
            a[i] = (T) first.data;
            i++;
            temp = temp.next;
        }
        return a;

    }

    @Override
    public boolean add(E e) {
        return offerLast(e);
    }

    @Override
    public boolean remove(Object o) {
        if (currentindex == 0)
            return false;
        int i = 0;
        Node<E> temp = first;
        while (temp != null) {
            if (temp.data.equals(o)) {
                this.remove(i);
                return true;
            }
            i++;
            temp = temp.next;
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> ptr) {
        Iterator<?> iterator1 = ptr.iterator();
        if (ptr.size() > this.size())
            return false;
        while (iterator1.hasNext()) {
            if (!contains(iterator1.next()))
                return false;
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends E> ptr) {
        Iterator<?> iterator = ptr.iterator();
        while (iterator.hasNext()) {
            this.addLast((E) iterator.next());
        }
        return true;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> ptr) {
        Iterator<?> iterator = ptr.iterator();
        int i = index;
        while (iterator.hasNext()) {
            this.add(i, (E) iterator.next());
            i++;
        }
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> ptr) {
        Iterator<?> iterator = ptr.iterator();
        while (iterator.hasNext())
            remove(iterator.next());
        return true;
    }

    @Override
    public boolean retainAll(Collection<?> ptr) {
        Node<E> temp = first;
        boolean t = false;
        while (temp != null) {
            if (!ptr.contains(temp.data)) {
                this.remove(temp.data);
                t = true;
            }
            temp = temp.next;
        }
        return t;
    }

    @Override
    public void clear() {
        currentindex = 0;
        first.next = null;
        last.previous = null;
        first = last = null;
    }

    @Override
    public Iterator<E> descendingIterator() {
        Iterator<E> iterator = new Iterator<E>() {
            Node<E> temp = last;

            @Override
            public boolean hasNext() {
                return temp != null;
            }

            @Override
            public E next() {
                E pow = temp.data;
                temp = temp.previous;
                return pow;
            }
        };
        return iterator;
    }


    public static class Node<E> {
        public E data;
        public Node previous;
        public Node next;

        Node(E data, Node previous, Node next) {
            this.data = data;
            this.next = next;
            this.previous = previous;
        }
    }
}


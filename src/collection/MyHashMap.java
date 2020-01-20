package collection;

import java.util.*;

class MyHashMap<K, V> implements Map<K, V> {

    private final float loadFactor;
    Node<K, V>[] table;
    private int initialCapacity;
    private int modCount = 0;
    private int size = 0;

    public MyHashMap() {
        this.initialCapacity = 1 << 4;
        this.loadFactor = 0.75f;
    }

    public MyHashMap(int initialCapacity) {
        if (initialCapacity < 0)
            throw new IllegalArgumentException();
        this.initialCapacity = initialCapacity;
        this.loadFactor = 0.75f;
    }

    public MyHashMap(int initialCapacity, float loadFactor) {
        if (initialCapacity < 0 || loadFactor <= 0)
            throw new IllegalArgumentException();
        this.initialCapacity = initialCapacity;
        this.loadFactor = loadFactor;
    }

    public MyHashMap(Map<? extends K, ? extends V> map) {

        this.initialCapacity = map.size();
        this.loadFactor = 0.75f;
        this.putAll(map);

    }

    public void rephrased() {
        Node<K, V>[] newtable = new Node[initialCapacity];
        initialCapacity = ((int) (initialCapacity + initialCapacity * loadFactor));
        int j;
        for (int i = 0; i < table.length; i++)
            newtable[i] = table[i];
        table = new Node[initialCapacity];
        for (int i = 0; i < newtable.length; i++) {
            if (newtable[i] != null) {
                for (Node<K, V> node = newtable[i]; node != null; node = node.next)
                    this.put(node.key, node.value);
            }

        }

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean containsKey(Object key) {
        int index;
        if (key != null)
            index = key.hashCode() % initialCapacity;
        else
            index = 0;
        if (table != null && size > 0 && table[index] != null) {
            for (Node<K, V> temp = table[index]; temp != null; temp = temp.next)
                if (key == null ? temp.key == null : (temp.hash == key.hashCode() && temp.key.equals(key)))
                    return true;
        }
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        Node<K, V>[] t;
        V temp;
        if (table != null && size > 0) {
            t = table;
            for (int i = 0; i < t.length; i++) {
                for (Node<K, V> element = t[i]; element != null; element = element.next) {
                    if (element != null) {
                        temp = element.value;
                        if (temp == value || (temp != null && temp.equals(value)))
                            return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public V get(Object key) {
        int index = (key == null ? 0 : key.hashCode() % initialCapacity);
        for (Node<K, V> temp = table[index]; temp != null; temp = temp.next)
            if (key == null ? temp.key == null : (temp.hash == key.hashCode() && temp.key.equals(key))) {
                return temp.value;
            }
        return null;
    }

    @Override
    public V put(K key, V value) {
        if (table == null)
            table = new Node[initialCapacity];
        if (initialCapacity * loadFactor == modCount)
            rephrased();
        int hash, j = (key != null) ? (key.hashCode() % initialCapacity) : 0;
        hash = (key != null) ? key.hashCode() : -1;
        V temp = null;
        Node<K, V> pm = null, ptr = new Node<>(hash, key, value, null);
        if (table[j] != null) {
            Node<K, V> node;
            for (node = table[j]; node != null; node = node.next) {
                if (key == null ? node.key == null : (node.hash == key.hashCode() && node.key.equals(key))) {
                    temp = node.value;
                    node.setValue(value);
                    return temp;
                }
                pm = node;
            }
            pm.next = ptr;
            size++;
        } else {
            table[j] = ptr;
            modCount++;
            size++;
        }
        return temp;
    }

    @Override
    public V remove(Object key) {
        if (!this.containsKey(key))
            return null;
        V temp;
        int index = (key == null) ? 0 : key.hashCode() % initialCapacity;
        boolean t = false;
        Node<K, V> pow = null, ptr = table[index];
        do {
            if (key == null ? ptr.key == null : (key.hashCode() == ptr.hash && key.equals(ptr.key))) {
                t = true;
                break;
            }
            pow = ptr;
            ptr = ptr.next;
        }
        while ((key == null) ? (ptr.key != null) : (!key.equals(ptr.key) || (key.hashCode() != ptr.hash)));
        if (t == true) {
            temp = table[index].value;
            table[index] = table[index].next;
        } else {
            Node<K, V> power = pow.next;
            temp = power.value;
            pow.next = power.next;
        }
        size--;
        if (table[index] == null)
            modCount--;
        return temp;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        ArrayList<V> arrayList = (ArrayList<V>) m.values();
        HashSet<K> set = (HashSet) m.keySet();
        Iterator<K> iterator = set.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            this.put(iterator.next(), arrayList.get(i));
            i++;
        }
    }

    @Override
    public void clear() {
        if (table != null && size > 0) {
            size = 0;
            for (int i = 0; i < table.length; ++i)
                table[i] = null;
        }
    }

    @Override
    public Set<K> keySet() {
        Set<K> set = new HashSet<>();
        for (int i = 0; i < table.length; i++) {
            for (Node<K, V> node = table[i]; node != null; node = node.next)
                set.add(node.key);
        }
        return set;
    }

    @Override
    public Collection<V> values() {
        Collection<V> collection = new ArrayList<>();
        for (int i = 0; i < table.length; i++) {
            for (Node<K, V> node = table[i]; node != null; node = node.next)
                collection.add(node.value);
        }
        return collection;
    }

    //????????????????????
    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }

    @Override
    public String toString() {
        String map = "{ ";
        for (int i = 0; i < table.length; i++) {
            if (table[i] != null) {
                for (Node<K, V> node = table[i]; node != null; node = node.next)
                    map += (node + ", ");
            }
        }
        map += "}";
        return map;
    }

    class Node<K, V> {
        final int hash;
        final K key;
        V value;
        Node<K, V> next;

        public Node(int hash, K key, V value, Node next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public V setValue(V value) {
            V temp = this.value;
            this.value = value;
            return temp;
        }

        @Override
        public final String toString() {
            return key + " = " + value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node<?, ?> node = null;
            if (o instanceof Node)
                node = (Node<?, ?>) o;
            return hash == node.hash &&
                    Objects.equals(key, node.key) &&
                    Objects.equals(value, node.value);
        }

    }
}

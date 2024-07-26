package Libraries;

public interface HashmapInterface<K, V> {
    void put(K key, V value);
    V get(K key);
    boolean remove(K key);
    void clear();
    boolean containsKey(K key);
    int size();
    void display();
}

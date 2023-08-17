package labs_examples.datastructures.hashmap.labs;

public class HashMapEx02<K, V> {

    //initial size of the array will have the size of 10
    private HashEntry<K, V>[] hashArray = new HashEntry[10];

    //to track current elements
    private int currentElements = 0;

    private int entryKey(K key){
        int position = Math.abs(key.hashCode() % hashArray.length);
        return position;
    }

    public void addKeyValue(K key, V value){
        int position = entryKey(key);

        HashEntry<K, V> hashEntry  = new HashEntry<>(key, value);

        if (hashArray[position] == null){
            hashArray[position] = hashEntry;
            currentElements++;

        } else {
            HashEntry<K, V> e = hashEntry;

            while (e.prev != null){
                e = e.prev;
            }

            e.prev = hashEntry;
            currentElements++;
        }

        if (currentElements > hashArray.length * 0.5){
            increaseSize();
        }
    }

    private void increaseSize(){

        HashEntry<K, V>[] old = hashArray;

        hashArray = new HashEntry[old.length * 3];

        for (int i = 0; i < old.length; i++) {
            try {
                HashEntry hashEntry = old[i];

                addKeyValue((K) hashEntry.getKey(), (V) hashEntry.getValue());

                while (hashEntry.next != null){
                    hashEntry = hashEntry.next;

                    addKeyValue((K) hashEntry.getKey(), (V) hashEntry.getValue());
                }
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public void deleteKey(K key){
        if (getKey(key) == null){
            System.out.println("Element Does not exist");
        }

        int position = entryKey(key);

        HashEntry<K, V> hashEntry = hashArray[position];

        if (hashEntry.getValue().equals(key)){
            hashArray[position] = null;
            currentElements--;
            return;
        }

        while (hashEntry.next != null){
            if (hashEntry.next.getKey() != key){
                hashEntry = hashEntry.next;
            }
        }

        if (hashEntry.next.next != null){
            hashEntry.next = hashEntry.next.next;
            currentElements--;
            return;
        } else {
            hashEntry.next = null;
            currentElements--;
            return;
        }
    }

    public V getKey (K key){
        int position = entryKey(key);

        if (hashArray[position] == null){
            System.out.println("Element Does not exist");
        }

        HashEntry<K, V> hashEntry = hashArray[position];

        while (hashEntry.getKey() != key){
            if (hashEntry.next == null){
                return null;
            }

            hashEntry = hashEntry.next;
        }

        return hashEntry.getValue();
    }

}

class HashEntry<K, V> {
    HashEntry prev;
    private K key;
    private V value;

    HashEntry next = null;

    public HashEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}

package labs_examples.datastructures.ADS_examples;

public class CustomHashMap<K, V> {
    //Create the underlying entry array with the initial size of 10
    private Entry<K, V>[] table = new Entry[10];

    //the first thing to do is call the hashing method which calls the hashMap
    private int hash(K key){
        int index = Math.abs(key.hashCode() % table.length);
        return index;
    }

    public void put(K key, V value){
        int index = hash(key);

        Entry<K, V> entry = new Entry<>(key, value);

        if (table[index] == null){
            table[index] = entry;
        } else {
            Entry<K, V> p = table[index];

            //traversing the linked List
            while (p.next != null){
                p = p.next;
            }

            p.next = entry;
        }

        if (keys().size() > table.length * 0.75){
            resize();
        }
    }

    private void resize(){
        //make a copy of the existing table call old
        Entry<K, V>[] old = table;

        table = new Entry[old.length * 2];

        for (int i = 0; i < old.length; i++) {
            try {
                Entry entry = old[i];
                put((K) entry.getKey(), (V) entry.getValue());
                while (entry.next != null){
                    entry = entry.next;
                    put((K) entry.getKey(),(V) entry.getValue());
                }
            } catch (Exception e){
                System.out.println("Exception");
            }
        }
    }

    public void remove(K key){
        //check first if the key is even there

        if (get(key) == null){
            //there nothing to delete
            return;
        }

        int index = hash(key);

        Entry<K, V> entry = table[index];

        if (entry.getKey().equals(key)){
            table[index] = null;
        }

        while (entry.next != null){
            if (entry.next.getKey() != key){
                entry = entry.next;
            }
        }

        if (entry.next.next != null){
            entry.next = entry.next.next;
        } else {
            entry.next = null;
        }
    }

    public V get(K key){
        int index = hash(key);

        if (table[index] == null){
            return null;
        }

        Entry<K, V> entry = table[index];

        while (entry.getKey() != key){
            if (entry.next == null){
                return null;
            }

            entry = entry.next;
        }

        return entry.getValue();
    }

    public CustomLinkedList<K> keys (){
        CustomLinkedList<K> keys = new CustomLinkedList<>();
        for (int i = 0; i < table.length; i++){
            if (table[i] != null){
                Entry<K, V> p = table[i];

                while (p != null){
                    keys.add(p.getKey());
                    p = p.next;
                }
            }
        }
        return keys;
    }

    public int getStorage(){
        return table.length;
    }
}

class Entry<K, V>{
    private K key;
    private V value;
    Entry next = null;

    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }
    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }
    public void setValue(V value) {
        this.value = value;
    }
}

class MyHashSet {

    private static final double LOAD_FACTOR = 0.75;

    private int capacity;
    private int size;
    private Node[] buckets;

    private static class Node {
        int key;
        Node next;

        Node(int key, Node next) {
            this.key = key;
            this.next = next;
        }
    }

    public MyHashSet() {
        capacity = 16;
        buckets = new Node[capacity];
    }

    private int hash(int key) {
        return Math.floorMod(key, capacity);
    }

    public void add(int key) {
        if (contains(key)) {
            return;
        }

        if ((double) (size + 1) / capacity > LOAD_FACTOR) {
            resize();
        }

        int index = hash(key);

        buckets[index] = new Node(key, buckets[index]);
        size++;
    }

    public void remove(int key) {
        int index = hash(key);

        Node current = buckets[index];
        Node previous = null;

        while (current != null) {
            if (current.key == key) {

                if (previous == null) {
                    buckets[index] = current.next;
                } else {
                    previous.next = current.next;
                }

                size--;
                return;
            }

            previous = current;
            current = current.next;
        }
    }

    public boolean contains(int key) {
        int index = hash(key);

        Node current = buckets[index];

        while (current != null) {
            if (current.key == key) {
                return true;
            }

            current = current.next;
        }

        return false;
    }

    private void resize() {
        Node[] oldBuckets = buckets;

        capacity *= 2;
        buckets = new Node[capacity];

        for (Node head : oldBuckets) {
            Node current = head;

            while (current != null) {
                Node next = current.next;

                int newIndex = hash(current.key);

                current.next = buckets[newIndex];
                buckets[newIndex] = current;

                current = next;
            }
        }
    }
}
class Node<E> {
    E e;
    Node<E> next;
    Node<E> prev;

    Node(E e) {
        this.e = e;
        this.next = null;
    }

    @Override
    public String toString() {
        return this.e + "";
    }
}

class LinkedList<E> {
    Node<E> head;
    Node<E> tail;
    int size;
    public void addLast(E e) {
        Node<E> node = new Node<>(e);
        if(this.head == null) {
            this.head = node;
            this.tail = node;
        } else {
            this.tail.next = node;
            this.tail = node;
        }
        this.size++;
    }

    void showAll() {
        Node<E> currentNode = this.head;
        while (currentNode != null) {


            System.out.println(currentNode);
            currentNode = currentNode.next;
        }
    }
}


class Test {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
    }
}


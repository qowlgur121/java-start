package collection.link;

public class Node {
    Object item;
    Node next;

    public Node(Object item) {
        this.item = item;
    }

/*
    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                ", next=" + next +
                '}';
    }
*/

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        Node x = this;
        while (x != null) {
            stringBuilder.append(x.item);
            if (x.next != null) {
                stringBuilder.append("->");
            }
            x = x.next;
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

package DoublePointLinkedList;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 15:21   2019/8/28
 * @ClassName SingleLinkedList.Node
 */
public class Node {
    private Object data;
    private Node next;
    public Node(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "SingleLinkedList.Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}

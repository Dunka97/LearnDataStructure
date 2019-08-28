package OrderLinkedList;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 15:21   2019/8/28
 * @ClassName SingleLinkedList.Node
 */
public class Node {
    private Integer data;
    private Node next;
    public Node(Integer data) {
        this.data = data;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
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

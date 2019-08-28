package TwoWayLinkedList;

import org.junit.Test;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 20:05   2019/8/28
 * @ClassName TwoWayLinkedList
 */
public class TwoWayLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public TwoWayLinkedList() {
        size = 0;
        head = null;
        tail = null;
    }
    //在链表头增加节点
    public void addHeadNode(Object data){
        Node node = new Node(data);
        if (isEmpty()){
            head = node;
            tail = node;
        }else{
            node.next = head;
            head.prev = node;
            head = node;
        }
        size++;
    }
    //在链表尾增加节点
    public void addTailNode(Object data){
        Node node = new Node(data);
        if (isEmpty()){
            head = node;
            tail = node;
        }else{
            node.prev = tail;
            tail.next = node;
            tail = node;
        }
        size++;
    }
    //删除链表头
    public void deleteHeadNode(){
        if (isEmpty()){
            return;
        }else if (getSize()==1){
            head = null;
            tail = null;
        }else{
            head = head.next;
            head.prev = null;
        }
        size--;
    }
    //删除链表尾
    public void deleteTailNode(){
        if (isEmpty()){
            return;
        }else if (getSize()==1){
            head = null;
            tail = null;
        }else{
            Node node = tail.prev;
            node.next = null;
            tail = node;
        }
        size--;
    }
    //获得链表节点个数
    public int getSize(){
        return size;
    }
    //判断链表是否为空
    public boolean isEmpty(){
        return (size==0);
    }
    //显示节点信息
    public void display(){
        //正向打印
        Node node = head;
        while (node!=null){
            System.out.print(node.data+" ");
            node = node.next;
        }
        System.out.println();
        //逆向打印
        Node node1 = tail;
        while (node1!=null){
            System.out.print(node1.data+" ");
            node1 = node1.prev;
        }
        System.out.println();
    }
    private class  Node{
        private Object data;
        private Node next;
        private Node prev;

        public Node(Object data) {
            this.data = data;
        }
    }
    @Test
    public void test(){
        TwoWayLinkedList linkedList = new TwoWayLinkedList();
        linkedList.addHeadNode(13);
        linkedList.addHeadNode(58);
        linkedList.addHeadNode(45);
        linkedList.addHeadNode(12);
        linkedList.display();
        linkedList.addTailNode(89);
        linkedList.addTailNode(56);
        linkedList.display();
        linkedList.deleteHeadNode();
        linkedList.display();
        linkedList.deleteTailNode();
        linkedList.display();
    }
}

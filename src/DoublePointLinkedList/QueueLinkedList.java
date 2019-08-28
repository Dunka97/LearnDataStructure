package DoublePointLinkedList;

/**
 * @Author Dunka
 * @Description 利用双端链表实现队列
 * @Date 17:12   2019/8/28
 * @ClassName QueueLinkedList
 */
public class QueueLinkedList {
    private DoublePointLinkedList linkedList;

    public QueueLinkedList() {
        linkedList = new DoublePointLinkedList();
    }
    public void pop(){
        //删除头部数据
        linkedList.deleteHeadNode();
    }
    public void push(Object data){
        linkedList.addTailNode(data);
    }
    public boolean isEmpty(){
        return  linkedList.isEmpty();
    }
    public int size(){
        return linkedList.getSize();
    }
    public void display(){
        linkedList.display();
    }
}

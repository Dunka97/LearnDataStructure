package SingleLinkedList;

/**
 * @Author Dunka
 * @Description 使用单向链表实现栈
 * @Date 16:27   2019/8/28
 * @ClassName StackSingleLink
 */
public class StackSingleLink {
    private SingleLinkedList linkedList;

    public StackSingleLink() {
        linkedList = new SingleLinkedList();
    }
    //添加元素
    public void push(Object data){
        linkedList.addNode(data);
    }
    //移除栈顶元素
    public void pop(){
        linkedList.deleteNode();
    }
    //判断是否为空
    public boolean isEmpty(){
        return linkedList.isEmpty();
    }
    //打印
    public void display(){
        linkedList.printNode();
    }
}

package SingleLinkedList;

import org.junit.Test;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 16:06   2019/8/28
 * @ClassName Run
 */
public class Run {
    public static void main(String[] args) {
        SingleLinkedList linkedList = new SingleLinkedList();
        linkedList.addNode(12);
        linkedList.addNode(19);
        linkedList.addNode(45);
        linkedList.addNode(56);
        linkedList.addNode(89);
        linkedList.printNode();
        linkedList.deleteNode();
        linkedList.printNode();
        linkedList.deleteData(19);
        linkedList.printNode();
        Node node = linkedList.findByObject(56);
        System.out.println(node);
        Node node1 = linkedList.findByObject(57);
        System.out.println(node1);
    }
    @Test
    public void stackTest(){
        StackSingleLink stackSingleLink = new StackSingleLink();
        stackSingleLink.push("A");
        stackSingleLink.push("B");
        stackSingleLink.push("C");
        stackSingleLink.push("D");
        stackSingleLink.push("E");
        stackSingleLink.push("F");
        stackSingleLink.display();
        stackSingleLink.pop();
        stackSingleLink.display();
        System.out.println(stackSingleLink.isEmpty());

    }
}

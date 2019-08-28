package DoublePointLinkedList;

import org.junit.Test;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 17:00   2019/8/28
 * @ClassName Run
 */
public class Run {
    @Test
    public void testDoublePointLinkedList(){
        DoublePointLinkedList linkedList = new DoublePointLinkedList();
        linkedList.addHeadNode(12);
        linkedList.addHeadNode(23);
        linkedList.addHeadNode(56);
        linkedList.display();
        linkedList.addTailNode(34);
        linkedList.addTailNode(67);
        linkedList.display();
        linkedList.deleteHeadNode();
        linkedList.display();
        System.out.println(linkedList.getSize());
        System.out.println(linkedList.isEmpty());
    }
    @Test
    public void testQueue(){
        QueueLinkedList linkedList = new QueueLinkedList();
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("E");
        linkedList.display();
        linkedList.pop();
        linkedList.display();

    }
}

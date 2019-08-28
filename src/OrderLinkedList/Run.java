package OrderLinkedList;

import org.junit.Test;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 19:49   2019/8/28
 * @ClassName Run
 */
public class Run {
    @Test
    public void test(){
        OrderLinkedList linkedList = new OrderLinkedList();
        linkedList.insert(18);
        linkedList.insert(26);
        linkedList.insert(9);
        linkedList.insert(18);
        linkedList.insert(34);
        linkedList.display();
    }
}

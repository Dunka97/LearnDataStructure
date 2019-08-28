package OrderLinkedList;

/**
 * @Author Dunka
 * @Description 有序链表
 * @Date 19:24   2019/8/28
 * @ClassName OrderLinkedList
 */
public class OrderLinkedList {
    private Node head;

    public OrderLinkedList() {
        head = null;
    }
    //插入节点，并按照从小到大的顺序排列
    public void  insert(Integer data){
        Node newNode = new Node(data);
        Node pre = null;
        Node curr = head;
        while (curr!=null && data>curr.getData()){
            pre = curr;
            curr = curr.getNext();
        }
        if (pre==null){
            //意味着在前端插入
            head = newNode;
            head.setNext(curr);
        }else{
            newNode.setNext(curr);
            pre.setNext(newNode);
        }
    }
    //删除头节点
    public void deleteHeadNode(){
        head = head.getNext();
    }
    //打印链表
    public void display(){
        if (head==null){
            System.out.println("无链表信息");
        }else{
            Node node = head;
            while (node!=null){
                if (node.getNext()!=null){
                    System.out.print(node.getData()+"->");
                }else{
                    System.out.print(node.getData());
                }
                node = node.getNext();
            }
        }
    }
}

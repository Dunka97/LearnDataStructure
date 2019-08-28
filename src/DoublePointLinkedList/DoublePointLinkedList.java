package DoublePointLinkedList;

/**
 * @Author Dunka
 * @Description 双端链表
 * @Date 16:41   2019/8/28
 * @ClassName DoublePointLinkedList
 */
public class DoublePointLinkedList {
    private int size;
    private Node head;
    private Node tail;

    public DoublePointLinkedList() {
        size = 0;
        head = null;
        tail = null;
    }
    //链表头新增节点
    public void addHeadNode(Object data){
        Node headNode = new Node(data);
        if (isEmpty()){
            head = headNode;
            tail = headNode;
        }else{
            headNode.setNext(head);
            head = headNode;
        }
        size++;
    }

    //链表尾新增节点
    public  void addTailNode(Object data){
        Node tailNode = new Node(data);
        if (isEmpty()){
            head = tailNode;
            tail = tailNode;
        }else{
            tail.setNext(tailNode);
            tail = tailNode;
        }
        size++;
    }
    //删除头部节点，成功返回true，失败返回false
    public boolean deleteHeadNode(){
        if (isEmpty()){
            return false;
        } else{
            if (getSize()==1){
                head = null;
                tail = null;
            }else{
                head = head.getNext();
            }
        }
        size--;
        return true;
    }
    //删除尾部节点，成功返回true，失败返回false

    //判断是否为空
    public boolean isEmpty(){
        return (size==0);
    }
    //获得链表的节点个数
    public int getSize(){
        return size;
    }
    //显示节点信息
    public void display(){
        if (size==0){
            System.out.println("无链表信息");
        }else{
            int len = size;
            Node newNode = head;
            while (len>0){
                if (newNode.getNext()!=null){
                    System.out.print(newNode.getData()+"->");
                }else{
                    System.out.println(newNode.getData());
                }
                newNode = newNode.getNext();
                len--;
            }
        }
    }
}

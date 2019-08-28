package SingleLinkedList;


/**
 * @Author Dunka
 * @Description 单向链表-定义、操作
 * @Date 15:16   2019/8/28
 * @ClassName SingleLinkedList
 */
public class SingleLinkedList {
    private int size;
    private Node node;

    public SingleLinkedList() {
        this.size = 0;
        this.node = null;
    }
    /**
     * 在链表头添加元素
     */
    public void addNode(Object data){
        Node newNode = new Node(data);
        if (this.size==0){
            node = newNode;
        }else{
            newNode.setNext(node);
            node = newNode;
//            this.size++;
        }
        this.size++;
    }
    /**
     * 在链表头删除元素
     */
    public void deleteNode(){
        if (size==0){
            return;
        }else{
            node = node.getNext();
            size--;
        }
    }
    /**
     * 查找指定元素，找到了返回节点Node,找不到返回null
     */
    public Node findByObject(Object data){
        if (size==0){
            return null;
        }else{
            int length = size;
            Node newNode = node;
            while (length>0){
                if (newNode.getData().equals(data)){
                    return newNode;
                }else{
                    newNode = newNode.getNext();
                    length--;
                }
            }
        }
        return null;
    }

    /**
     * 删除指定的元素，删除成功返回true
     */
    public boolean deleteData(Object data){
        Node deleteNode = findByObject(data);
        int length = size;
        if (length==0){
            return false;
        }else{
            Node newNode = node;
            while (length>0){
                if (newNode.getNext().equals(deleteNode)){
                    newNode.setNext(deleteNode.getNext());
                    size--;
                    return true;
                }else{
                    newNode = newNode.getNext();
                }
                length--;
            }
        }
        return false;
    }
    /**
     * 判断链表是否为空
     */
    public boolean isEmpty(){
        return (size==0);
    }
    /**
     * 显示节点信息
     */
    public void printNode(){
       if (size==0){
           System.out.println("无链表信息");
       }else{
           int len = size;
           Node newNode = node;
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

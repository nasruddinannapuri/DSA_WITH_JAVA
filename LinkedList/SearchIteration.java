package LinkedList;
import LinkedList.LinkedList;


public class SearchIteration {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        ll.print();
        int target = 4;
       LinkedList.Node temp = LinkedList.head;
       int i = 0;
       while(temp != null){
        if(temp.data == target){
            System.out.println(i);
            return;
        }
        temp = temp.next;
        i++;

       }
       System.out.println(-1);



    }
}

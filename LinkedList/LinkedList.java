package LinkedList;

public class LinkedList {
    // here multiple Node will link up by using Linked
    // list obj so Node class created inside Linkiedlist.
    public static class Node{
        int data;
        Node next; // It's point to the next node obj 
        // that obj also again belong to Node class so,
        // data type was Node  
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    // In linked list we are having only one head and tail.
    public static Node head;
    public static Node tail;

    public static int size;
    /*
     * Here we can create non static methods also because
     * we are creating a linked list class object and its a 
     * non static , they can call both but static method call 
     * static only and main method is static we are creating 
     * obj for main , instead of that linkedf list obj.
     */
    public void addFirst(int data){
        /*
         * Here we can perform 3 operations
         * step1 - create a new node
         *  case2- if head is null then head and tail will 
         * assign as null and no need perform step 2 and create
         * because its a same node;
         */
        Node newNode = new Node(data);
        size++;
        if(head == null){
           head = tail = newNode;
           return;
        }
        
        // step2 - newNode next = head
        newNode.next = head; // link
        // step3 - head = newNode
        head = newNode;

    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void add(int ind, int data){
        if(ind == 0){ // first node is imp for creation where
            // head and tail value change when add first.
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0; 
        while(i<ind-1){
            temp = temp.next;
            i++;
        }
        // i = ind-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;

    }    
    public void print(){
        if(head == null){
            System.out.println("Linked list is empty!");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int removeFirst(){
        if(size == 0){
            System.out.println("Linked List is empty!");
            return Integer.MIN_VALUE;
        } else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;

        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
     

    public int removeLast(){
        if(size == 0){
            System.out.println("LL is empty!");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // previous : i = size - 2
        Node prev = head;
        for(int i = 0; i<size-2;i++){
            prev = prev.next;
        }
        int val = prev.next.data; // tail data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int itrSearch(int key){
        Node temp = head;
        int i = 0;
        while(temp != null){
            if(temp.data == key){ // key found
                return i;
            }
            temp = temp.next;
            i++;
        }
        // key not found
        return -1;
    }

    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int ind = helper(head.next, key);
        if(ind == -1){
            return -1;
        }
        return ind+1;
    }
    public int recSearch(int key){
        return helper(head, key);
    }

    public void reverse(){ // O(n)
        Node prev = null; // initially prev of head is points to null
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        head = prev;
    }

    public void deleteNthfromEnd(int n){
        // Calculate size of ll
        int size = 0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            size++;
        }

        if(n == size){ // remove first 
            head = head.next;
            return;
        }

        // size - n
        int i = 1;
        int iToFind = size - n;
        Node prev = head;
        while(i < iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    // findMid by uisng - Slow Fast approach:
    public Node findMid(Node node){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next; // +1
            fast = fast.next.next; // +2

        }
        return slow; // slow is my midNode
    }


    public boolean checkPalindrome(){
        // base case
        if(head == null || head.next == null){
            return true;
        }
        // step1 - Find mid
        Node miNode = findMid(head);

        // Step2 - reverse 2nd half
        Node prev = null;
        Node curr = miNode;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }

        Node right = prev;// right half head
        Node left = head;
        // Step3 - check left half & right half
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        // creating obj of linked list
        LinkedList ll = new LinkedList(); // in this obj we create all nodes.
        /*
        ll.head = new Node(1);
        ll.head.next = new Node(2);
        here we are adding only not done remaining operations it makes
        headache for us like this. instead of this we can create methods
        for add, remove, etc remaining opereations.
        Methods:
        add() - O(1) constant time complexity
        remove()
        print() - O(n) linear time complexity
        search()

        Add in linked list:
        1) add first - O(1)
        2) add last - O(1)
        special case:
        3) add in the middle
        add(index, data)


        Remove in a Linked List:
        1) remove First
        */
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.addLast(5);
        ll.print();
        ll.add(2, 3);
        ll.print();
        System.out.println("Size of Linked list: "+ll.size);
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();
        System.out.println("Size of Linked list: "+ll.size);

        System.out.println(ll.itrSearch(4));
        System.out.println(ll.itrSearch(10));
        System.out.println(ll.recSearch(4));
        System.out.println(ll.recSearch(10));
        
        ll.reverse();
        ll.print();

        ll.deleteNthfromEnd(3);
        ll.print();
        ll.addFirst(3);
        ll.addFirst(2);
        ll.print();

        System.out.println(ll.checkPalindrome());



    }

    
}

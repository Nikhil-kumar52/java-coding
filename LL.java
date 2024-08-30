

class LL{
    Node head;
    class Node {
        String data;
        Node next ;

        public Node(String data) {
            this.data=data;
            this.next=null;
        }
    }
    public void addFirst( String data){
        Node newnode=new Node(data);
        newnode.next=head;
        head=newnode;
    }
    public void addLast(String data){
        Node newnode=new Node(data);
        if(head==null){
        newnode.next=head;
        head=newnode;
        return;
        }
        Node current=head;
        while(current.next!=null){
            current= current.next;
        }
        current.next=newnode;
    }
    public void printList(){
        Node current=head;
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("null");
    }
    public void removeFirst(){
        if(head==null){
            System.out.println("empty");
            return;
        }
            head=head.next;
    }
    public void removeLast(){
        if(head==null){
            System.out.println("empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node secondlast=head;
        Node last=head.next;
        while(last.next!=null){
            secondlast=secondlast.next;
            last=last.next;
        }
        secondlast.next=null;
    }
    public Node iteratereverse(){
        Node previous=null;
        Node current=head;
        while(current!=null){
            Node next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
            return current;
    }
    public Node recursiveReverse(Node head){
        if(head==null||head.next==null){
            return head;
        }
        Node newnode=recursiveReverse(head.next);
        head.next.next=head;
        head.next=null;
        return newnode;
    }
    public static void main(String[] args) {
        LL list=new LL();
        list.addFirst("is");
        list.addFirst("nikhil");
        list.addLast("king");
        list.printList();
        list.iteratereverse();
        list.printList();
    }
}
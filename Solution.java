class ListNode{
    int val;
    ListNode next;

    public ListNode(int val,ListNode next) {
        this.val=val;
        this.next=next;
    }
}
class Solution{
    public ListNode middlenode(ListNode head){
        ListNode turtle=head;
        ListNode hare=head;
        while(hare.next!=null &&hare.next.next!=null){
            turtle=head.next;
            hare=head.next.next;
        }
        return turtle;
    }
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode current=head;
        while(current!=null){
            ListNode next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }
public boolean isPalindrome(ListNode head){
    if(head==null||head.next==null){
        return true;
    }
    ListNode middle=middlenode(head);
    ListNode secondhalf=reverse(middle.next);
    ListNode firsthalf=head;
    while(secondhalf!=null){
        if(firsthalf.val!=secondhalf.val){
            return false;
        }
        firsthalf=firsthalf.next;
        secondhalf=secondhalf.next;
    }
    return true;
}
    public void  printList(ListNode head){
        ListNode current=head;
        while(current!=null){
            System.out.print(current.val+"->");
            current=current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Solution sol=new Solution();
        ListNode head= new ListNode(1,
                        new ListNode(2,
                        new ListNode(2,
                        new ListNode(1,null))));
                        sol.printList(head);
        boolean result=sol.isPalindrome(head);
        System.out.println(result);
    }
}

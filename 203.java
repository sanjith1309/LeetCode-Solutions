class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode a = new ListNode(0);
        a.next=head;
        ListNode temp = a;
        if(temp==null){
            return null;
        }
        while(temp.next!=null){
            if(temp.next.val==val){
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
            }
        }
        return a.next;
    }
}

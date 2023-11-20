public class Solution {
    public boolean hasCycle(ListNode head) {
            ListNode temp=head;
            while(temp!=null){
                if(temp.val==999999){
                    return true;
                }
                temp.val=999999;
                temp=temp.next;
            }
            return false;
    }
}

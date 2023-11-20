class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp = new ListNode(0,null);
        ListNode a = temp;
        if(list1==null && list2==null){
            return null;
        }else{
            while(list1!=null && list2!=null){
                if(list1.val<=list2.val){
                    temp.next=list1;
                    list1 = list1.next;
                }else{
                    temp.next=list2;
                    list2 = list2.next;
                }
                temp=temp.next;
            }
            if(list1!=null){
                temp.next=list1;
            }else{
                temp.next=list2;
            }
        }return a.next;
    }
}

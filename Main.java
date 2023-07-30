class Solution {
    public int getDecimalValue(ListNode head) {
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int arr[]=new int[count];
        for(int i=0;i<count;i++){
            arr[i]=head.val;
            head=head.next;
        }
        int sum=0;
        for(int i=0;i<count;i++){
            sum+=Math.pow(2,(count-i)-1)*arr[i];
           // System.out.println(count);
        }
        return sum;
    }
}
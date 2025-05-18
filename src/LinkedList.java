public class LinkedList {
}
/*
class Solution {
    public ListNode insertAtBeginning(ListNode head, int newValue) {
        ListNode newNode = new ListNode(newValue);
        newNode.next=head;
        return newNode;
    }
}

 */
/*
import java.util.*;
class Solution {
        public ListNode insertAtEnd(ListNode head, int newValue){
        ListNode newNode = new ListNode(newValue);
        ListNode temp=head;
            while(temp.next!=null){
                temp=temp.next;

            }
            temp.next=newNode;
        return head;
    }
}
 */
/*
import java.util.*;
class Solution {
        public ListNode insertAtEnd(ListNode head, int newValue){
        ListNode newNode = new ListNode(newValue);
        ListNode temp;
        if(head==null){
            head=newNode;
        }
        else{
            temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
        return head;
    }
}
 */
/*
import java.util.*;
class Solution {
    // Insert at specified position (1-based index)
    public ListNode insertAtPosition(ListNode head, int newValue, int position) {
        ListNode newNode=new ListNode(newValue);
        ListNode temp;
        if(head==null)
            head=newNode;
        else{
            temp=head;
            for(int i=1;i<position-1;i++){
                if(temp.next==null){
                    temp.next=newNode;
                    return head;
                }
                temp=temp.next;
            }
            newNode.next=temp.next;
            temp.next=newNode;
        }
        return head;
    }

}
 */
/*
class Solution {
    public ListNode removeFirst(ListNode head) {
       head=head.next;
       return head;
    }
}
 */
/*
class Solution {

    public ListNode removeLast(ListNode head) {
       ListNode temp=head;
       while(temp.next.next != null)
        temp=temp.next;
        temp.next=null;
        return head;
    }
}
 */
/*
class Solution {
    public ListNode removeMiddle(ListNode head) {
      ListNode temp=head;
      int count=1;
      while(temp.next !=null){
          temp=temp.next;
            count++;
      }
      temp=head;
      int m=0;
      while(temp.next!=null && m<(count/2)-1){
          temp=temp.next;
          m++;
      }
      temp.next=temp.next.next;
      return head;
    }
}

 */
/*
Cycle
 class Solution{
    public boolean hasCycle(ListNode head) {
        ListNode temp=head;  //slow
        ListNode temp1=head; //fast
        while(temp1.next != null && temp1 != null){
            temp=temp.next;
            temp1=temp1.next.next;
            if(temp==temp1)
                return true;
        }
    return false;
  }
}
/*
HashSet<ListNode> hs = new HashSet<>();
while(head!=null){
    if(hs.contains(head)){
    return true;
    }
    hs.add(head);
    head=head.next;
    return false;
}
*/
/*

 */
 /*
 class Solution{
  public ListNode detectCycle(ListNode head){
      ListNode slow=head;
      ListNode fast=head;
      while(fast != null && fast.next != null){
          slow=slow.next;
          fast=fast.next.next;
          if(fast==slow){
            slow=head;
          while(slow != fast){
              slow=slow.next;
              fast=fast.next;
          }
          return fast;
          }
        }
        return null;
    }
}
  */
/*
class Solution{
     public ListNode addTwoNumbers(ListNode l1, ListNode l2){
         ListNode l3 = new ListNode(0);
         ListNode list=l3;
         int carry=0;
         int x,y;
         while(l1 != null || l2 != null || carry != 0){
             if(l1 != null)
                x=l1.val;
            else
                x=0;
            if(l2 != null)
                y=l2.val;
            else
                y=0;
            int sum=x+y+carry;
            carry = sum/10;
            list.next=new ListNode(sum%10);
            list=list.next;

            if(l1 != null)
            l1=l1.next;
            if(l2 != null)
            l2=l2.next;

         }
         return l3.next;
    }
}
 */
/*

You're given the head of a singly linked list of even length. A twin in this list is defined as:
The i-th node from the start and the i-th node from the end (0-based indexing).
Your task is to find the maximum twin sum.
Each twin sum is calculated as:node[i].val + node[n-1-i].val

Sample Testcase:1
---------------------------------
input=4
1 2 3 4
output=4

Explanation:
------------------------------------
Maximum Twin Sum: 5  (1+4, 2+3)

import java.util.*;
class Solution
{
    public static int pairSum(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        Node prev = null;
        while(slow!=null)
        {
            Node nexttemp=slow.next;
            slow.next=prev;
            prev=slow;
            slow=nexttemp;
        }
        int maxsum=0;
        Node left=head;
        Node right=prev;
        while(right!=null)
        {
            int sum =left.val+right.val;
            maxsum=Math.max(maxsum,sum);
            left=left.next;
            right=right.next;
        }
        return maxsum;
    }
}
 */
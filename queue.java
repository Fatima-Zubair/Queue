package LL_Practice.Queue;
//FIFO principle in QUEUE 
public interface queue {

     public void add(Object obj);
     public Object remove();
     public Object first();
     public int size();
}

// dummy head
// first element -> head.next  // return head.next.data;
// last elment -> head.prev
// remove element -> head.next= head.next.next and change head.prev=head;
// add--> head.prev.next=new Node(data,head.prev,head) AND head.prev=heaad.prev.next


// 
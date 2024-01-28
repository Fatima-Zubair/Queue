package LL_Practice.Queue;
import java.util.Scanner;

public class LinkedQueue implements queue {
    private Node head=new Node(null);
    private int size;
    public void add(Object o){
        head.prev.next=new Node(o, head.prev, head);
        head.prev=head.prev.next;
        size++;
    }

    public Object first(){
        if(size==0) throw new IllegalStateException("Queue is empty");
        return head.next.data;
    } 
    public Object remove(){
        if(size==0) throw new IllegalStateException("Queue is empty");
        Object temp=head.next.data;
        head.next=head.next.next;
        head.next.prev=head;
        size--;
        return temp;
    }
    public int size(){
        return size;
    }
    public int sum(){
        int sum=0;
        for(Node p=head.next; p!=head; p=p.next){
            sum+=(int)p.data;
        }
        return sum;
    } 
    private static class Node{
        Object data;
        Node prev=this;
        Node next=this;
        Node(Object o){
            data=o;
        }
        Node(Object o, Node p, Node n){
            data=o;
            prev=p;
            next=n;
        }
    }
    public static void main(String[] args) {
        LinkedQueue pocketMoneyQueue=new LinkedQueue();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your pocketMoney for each week day");
        for(int i=1; i<=7; i++){
            System.out.print("Day "+i+" : ");
            pocketMoneyQueue.add(input.nextInt());
        }

        LinkedQueue kharchaQueue=new LinkedQueue();
        System.out.println("Enter your kharcha for each week day");
        for(int i=1; i<=7; i++){
            System.out.print("Day "+i+" : ");
            kharchaQueue.add(input.nextInt());
        }
        System.out.println("After kharcha: ");
        int remaining_money=(pocketMoneyQueue.sum()-kharchaQueue.sum());
        if(remaining_money<0){
            System.out.println("Loss: "+remaining_money);
        }
        else if(remaining_money>0){
            System.out.println("Saving: "+remaining_money);
        }
        else {
            System.out.println("Your pocket money has been completely utilized, neither have you saved nor incurred a loss.");
            System.out.println("Remaining Money: "+remaining_money);
        }

    }
}


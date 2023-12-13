package MyDatastructure.SinglyLinkedList;
public class SinglyLinkedList {
    private Node first;
    private Node last;
    public SinglyLinkedList(){

    }

    public boolean isEmpty(){
        return (first == null);
    }

    public void insertFirst(int data){
        //Initialize current to first:
        Node newNode = new Node();
        //Assigning Data to the New Node
        newNode.data = data;
        //Setting the Next Reference of the New Node
        newNode.next = first;
        //Updating the List's First Node to the New Node:
        first = newNode;
    }
    public Node deleteFirst() {
        //assign temp to first
        Node temp = first;
        //Updating first to the Next Node in the List
        first = first.next;
        //Returning the Removed Node
        return temp;
    }
    public void insertLast(int data){
        Node current = first;
        while(current.next != null){
            current = current.next; // we'll loop until current.next is null
        }
        Node newNode = new Node();
        newNode.data = data;
        current.next = newNode;
    }
    public void displayList(){
        System.out.println("List (first --> last)");
        Node current = first;
        while (current != null){
            current.displayNode();
            current = current.next;
        }
        System.out.println("");
    }
}

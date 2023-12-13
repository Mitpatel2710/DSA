package MyDatastructure.CircularLinkedList;
//Train example
public class CircularLinkedList {
    private Node first;
    private Node last;

    public CircularLinkedList(){
        first = null;
        last = null;
    }
    private boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int data){
        //Initialize current to first:
        Node newNode = new Node();
        //Assigning Data to the New Node
        newNode.data = data;
        //Check If List Is Empty
        if(isEmpty()){
            //If it is, this implies that the new node will be the only node in the list.
            // Therefore, last is set to point to this new node
            last = newNode;
        }
        //Linking the New Node
        newNode.next = first;
        //Updating the First Node
        first = newNode;
    }
    public void insertLast(int data){
        //Initialize current to first
        Node newNode = new Node();
        ////Assigning Data to the New Node
        newNode.data = data;
        //Check If List Is Empty
        if(isEmpty()){
            //If the list is empty, this implies that the new node will be the only node in the list.
            // Therefore, first is set to point to this new node
            first = newNode;

        }else {//Adding the Node to the End of the List
            //This sets the next field of the current last node to point to the new node.
            // This effectively links the new node to the end of the list
            last.next = newNode;
            //This updates the last pointer (or reference) of the list to the new node, making it the new last node in the list.
            last = newNode;
        }
    }
    public int deleteFirst(){
        //Store the Data of the First Node
        int temp = first.data;
        //Check if the List Has Only One Node If this condition is true, it sets last to null,
        // because after removing the first and only node, the list will be empty.
        if(first.next == null){
            last = null;
        }
        //Remove the First Node
        first = first.next;
        //Return the Stored Data
        return temp;
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
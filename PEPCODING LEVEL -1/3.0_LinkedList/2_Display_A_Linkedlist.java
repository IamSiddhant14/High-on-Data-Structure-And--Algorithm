import java.io.*;
import java.util.*;

class Display_A_Linkedlist {

  public static class Node {
    int data;
    Node next;
  }

  public static class LinkedList {
    Node head;
    Node tail;
    int size;

    void addLast(int val) {
      Node temp = new Node();
      temp.data = val;
      temp.next = null;

      if (size == 0) {
        head = tail = temp;
      } else {
        tail.next = temp;
        tail = temp;
      }

      size++;
    }

    public int size(){
      return size;
    }

    public void display(){
        
        if(size == 0)
           return;
        
        Node curr = head;//Reffrence variable storing address, as we havent used the new keyword over here , if we would had used the new keyword then it would result in an formation of an node object , but here it just an reffrence vatiable storing address
        while( curr != null){
            
            System.out.print(curr.data+" ");
            curr = curr.next;
            
        }
        System.out.println();
        
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    LinkedList list = new LinkedList();

    String str = br.readLine();
    while(str.equals("quit") == false){
      if(str.startsWith("addLast")){
        int val = Integer.parseInt(str.split(" ")[1]);
        list.addLast(val);
      } else if(str.startsWith("size")){
        System.out.println(list.size());
      } else if(str.startsWith("display")){
        list.display();
      }
      str = br.readLine();
    }
  }
}
    


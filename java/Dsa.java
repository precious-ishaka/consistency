class Dsa {

public static void main(String[] args){

   int[] nums = {1, 5, -7, 6, 11, 9, 23,0};
   int temp = 0;
   int size = nums.length;
   int minIndex = 0;

   for(int i = 0; i< size-1; i++){
      minIndex=i;
      for(int j =i; j< size; j++){
         if(nums[minIndex] > nums[j])
            minIndex = j;
      }
      temp =nums[minIndex];
      nums[minIndex] = nums[i];
      nums[i] = temp;
   }


   // for( int n : nums){
   //    System.out.print(n + " ");
   // }





LinkedL listt = new LinkedL();
listt.insert(14);
listt.insert(6);
listt.insert(17);
listt.insert(55);
listt.insertStart(4);
listt.insertStart(-5);
listt.insert(-7);
listt.insertAt(2, 8);
listt.show();


}


} 

class Node{
   int data;
   Node next;
}


  class LinkedL{

   Node head;
   public void show(){
     Node n = head;
     while(n.next != null){
      System.out.print(n.data + " ");
      n = n.next;
     }
     System.out.print(n.data);
   }


   public void insert(int x){
   Node node = new Node();
   node.data = x;
   if(head == null){
      head = node;
   }else{
      Node n = head;
      while(n.next != null){
         n = n.next;
      }

      n.next = node;
   }}

   public void insertStart(int x){
        Node node = new Node();
        node.data = x;
        node.next = null;
        node.next = head;
        head = node;

   }


public void insertAt(int index, int x){
   Node node = new Node();
   node.data = x;
   node.next = null;
   if(index == 0){ insertStart(x);}

   Node n = head;
   for(int i = 0; i < index -1; i++){
      n = n.next;
   }
   node.next = n.next;
   n.next = node;


}



  }
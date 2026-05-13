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


   for( int n : nums){
      System.out.print(n + " ");
   }





LinkedL listt = new LinkedL();
listt.insert(4);
listt.insert(6);
listt.insert(17);


}


} 

class Node{
   int data;
   Node next;
}

class LinkedL{
   Node head;
   public void insert(int d ){
      Node node = new Node();
        node.data = d;
      if(head == null){
       w
         head = node;
      }else{
          Node n  = head;
          while(n.next != null){
            n = n.next;
          }

          n.next = node;
      }
   }

   public void show(){
      Node node = head;
      while(node.next != null){
         System.out.print(node.data + " ");
          node = node.next;
      }
      System.out.print(node.data + " ");
   }

}
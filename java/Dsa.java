 
 
 
 class Dsa{
    public static int binarySearch(int[] arr, int target){
       int left = 0;
       int right = arr.length -1;
        while(left <= right){
            int mid = left +(right - left) /2;
            if(target == arr[mid]){
                return mid;
            }else if(arr[mid]< target){
                left = mid + 1;
            }else{
                right = mid -1;
            }
        }

        return -1;
    }


    public static void main(String[] args){
     int[] arrays = {-7, 3, 5, 9, 14, 16};
     int tar = 16;
     int result = binarySearch(arrays, tar);
     System.out.println(result);

  
    int[] nums ={9, -2, 5, 3, 7, 11, -5};
    int size = nums.length ;
    int temp = 0;
    int minIndex = 0;
    for(int i =0; i< size-1;i++){
        minIndex = i;
        for(int j = i; j < size; j++){
            if(nums[minIndex] > nums[j]) minIndex = j;
                
        }
    temp = nums[minIndex];
    nums[minIndex] = nums[i];
    nums[i] = temp;

    }

  for(int n : nums){
    System.out.print(n + " ");
  }


    }
}
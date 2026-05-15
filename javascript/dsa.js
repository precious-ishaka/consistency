
// Binary Search
function binarySearch(arr, tar){
   let left = 0;
   let right = arr.length - 1;

   while(left <= right){
    let mid = parseInt( left + (right - left) / 2)
   
    
    if(arr[mid] == tar){
        return mid
    }else if(arr[mid] < tar){
        left = mid + 1
    }else{
        right = mid - 1
    }

    
   }

   return -1;
}

let array = [-1, 3, 4, 6, 7,9, 11, 45];
const target = 9;

const result = binarySearch(array, target);

console.log(result)

//Selection Sort
const list =[9, -2, 5, 3, 7, 11, -5];
const size = list.length;
let minIndex = 0;
let temp;

for(let i = 0; i < size - 1; i++){
    minIndex = i;
    for(let j =i; j < size; j++){
     if(list[minIndex] > list[j]) minIndex =j
    }
    temp = list[minIndex];
    list[minIndex] = list[i];
    list[i] = temp;
}


// for(let i =0; i < size; i++){
//     console.log(list[i]);
    
// }

class MyArray{
    constructor(){
        this.length = 0;
        this.data = {};
    }

    push(x){
        this.data[this.length] = x
        console.log(this.data[this.length]);
        
    }
}

const listt = new MyArray()
console.log(listt.push(7));


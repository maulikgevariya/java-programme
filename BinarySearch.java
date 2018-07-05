public class BinarySearch{  
 public static void Search(int arr[], int first, int last, int key){  
   int mid = (first + last)/2;  
   while( first <= last ){  
      if ( arr[mid] < key ){  
        first = mid + 1;     
      }else if ( arr[mid] == key ){  
        System.out.println("The keyword you are entering is at index " + mid);  
        break;  
      }else{  
         last = mid - 1;  
      }  
      mid = (first + last)/2;  
   }  
   if ( first > last ){  
      System.out.println("the keyword you are trying to search is not available");;  
   }  
 }  
 public static void main(String args[]){  
        int sorted_arr[] = {11,12,13,14,15,16,17,18,19,20};  
        int key = 15;  
        int last=sorted_arr.length-1;  
        Search(sorted_arr,0,last,key);     
 }  
}  
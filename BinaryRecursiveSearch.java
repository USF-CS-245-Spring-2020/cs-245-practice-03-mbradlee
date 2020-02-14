import java.util.*;

public class BinaryRecursiveSearch implements Practice03Search{

    public int search(int [] arr, int target){
        int index = binaryRecursive(arr, target, 0, arr.length-1); //call binaryRecursive
        return index; //return the value derived from binaryRecursive
    }

    public int binaryRecursive(int [] arr, int target, int min, int max){

        if(min > max){ //if the min has surpassed the max, we know that the entire array has been searched and the target has not been found
            return -1;
        }

        int mid = (min + max) / 2; //update the mid to be the avg of the min and max (rounded down)

        if(arr[mid] == target){ //check to see if the target has been found
            return mid;
        }else if(arr[mid] > target){ //if the value of index mid is greater than the target, we will recursively call binaryRecursive so that the right half of the array is chopped off by making max one less than mid
            return binaryRecursive(arr, target, min, mid - 1);
        }else{
            return binaryRecursive(arr, target, mid + 1, max); //if the value of index mid is less than the target, we will recursively call binaryRecursive so that the left half of the array is chopped off by making min one greater than mid
        }
    }

}

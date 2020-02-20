public class LinearSearch implements Practice03Search{

    public int search(int [] arr, int target){
        for(int i = 0; i < arr.length; i++){ //loop from 0 to the array length minus 1 (every value in array)
            if(arr[i] == target){ //if the index contains the target, return the index
                return i;
            }
        }

        return -1; //if the target was not found, return -1
    }

}

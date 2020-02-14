public class BinaryIterativeSearch implements Practice03Search {

    public int search(int [] arr, int target){

        //set the starting min and max values
        int min = 0;
        int max = arr.length - 1;

        //loop while the min has not surpasses the max, because the min and max will eventually be the same or the min will surpass the max if the target does not exist
        while(min <= max){
            int mid = (max + min) / 2; //always update the mid to be the avg of the max + min (rounded down)
            if(arr[mid] == target) { //if the mid is equal to the target, we can return the mid here
                return mid;
            }else if(arr[mid] > target){ //if the value of index mid is greater than the value of the target, we cut off the right half of the array so that max becomes one index less than the mid
                max = mid - 1;
            }else {
                min = mid + 1; //if the value of index mid is less than the value of the target, we cut off the left half of the array so that min becomes one index greater than the mid
            }
        }

        return -1; //if the target value is never found, return -1 because -1 cannot be an index

    }

}

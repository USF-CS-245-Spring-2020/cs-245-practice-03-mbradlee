public class SelectionSort implements Practice03Sort{

    int findMin(int [] a, int start){
        int min = start;
        for(int i = 1; i < a.length; i++){
            if(min < a[i]){
                min = i;
            }
        }
        return min;
    }

    void swap(int [] a, int x, int y){
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    public void sort(int [] a){
        for(int i = 0; i < a.length; i++){
            swap(a, i, findMin(a, i));
        }
    }

}


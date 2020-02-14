public class InsertionSort implements Practice03Sort{

    public void sort(int [] a){

        for(int i = 1; i < a.length; i++) {
            int value = a[i];
            int j = i - 1;
            while (j >= 0 && value < a[j]) {
                a[j + 1] = a[j];
                --j;
            }
            a[j+1] = value;
        }
    }

}

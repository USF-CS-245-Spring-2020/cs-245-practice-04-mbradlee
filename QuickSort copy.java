public class QuickSort implements SortingAlgorithm  {

    public void sort(int [] a){
        quickSort(a, 0, a.length-1);
    }

    void quickSort(int [] a, int start, int end){
        if(start < end){
            //get the index of the pivot
            int pivot = partition(a, start, end);
            //sort the left
            quickSort(a, start, pivot-1);
            //sort the right
            quickSort(a, pivot+1, end);
        }
    }

    int partition(int [] a, int start, int end){
        int pivot = a[end];
        int pIndex = start;
        for(int i = start; i < end; i++){
            if(a[i] <= pivot){
                swap(a, i, pIndex);
                ++pIndex;
            }
        }
        swap(a, pIndex, end);
        return pIndex;
    }

    void swap(int [] a, int x, int y){
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

}

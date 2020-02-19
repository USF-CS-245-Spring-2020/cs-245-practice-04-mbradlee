import java.util.*;

public class MergeSort implements SortingAlgorithm {

    public void sort(int [] a) {
        mergeSort(a);
    }

    void mergeSort(int [] a) {
        if (a.length == 1){
            return;
        }

        int mid = a.length/2;
        int [] aLeft = Arrays.copyOfRange(a, 0, mid);
        int [] aRight = Arrays.copyOfRange(a, mid, a.length);

        mergeSort(aLeft);
        mergeSort(aRight);
        merge(a, aLeft, aRight);
    }


    void merge(int [] target, int [] left, int [] right){
        int indexL = 0;
        int indexR = 0;
        int indexT = 0;
        while(indexL < left.length && indexR < right.length){
            if(left[indexL] <= right[indexR]){
                target[indexT++] = left[indexL++];
            }else{
                target[indexT++] = right[indexR++];
            }
        }

        while(indexL < left.length){
            target[indexT++] = left[indexL++];
        }
        while(indexR < right.length){
            target[indexT++] = right[indexR++];
        }

    }

}

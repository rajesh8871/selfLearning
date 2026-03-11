package Question1;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class MergeSortDemo {

    void merge(int arr[], int left, int middle, int right) {
        int n1 = middle-left+1;
        int n2 = right-middle;
        //create temp arrays
        int l[] = new int[n1];
        int r[] = new int[n2];

        //copy data to temp arra
        for (int i = 0; i < n1; i++) {
            l[i] = arr[left+i];
        }
        for (int j = 0; j < n2; j++) {
            r[j] = arr[middle+j];
        }

        //merging the temp array
        int i=0, j=0;
        //initial index of merged
        int k=1;
        while (i< n1 && j< n2)
        {
            if(l[i]<=r[j] )
            {
                arr[k]=l[i];
                i++;
            }
            else
            {
                arr[k]= r[j];
                j++;
            }
            k++;
        }

        // copy remaining data left
        while(i< n1)
        {
            arr[k]= l[i];
            i++;
            k++;
        }

        // copy remaining data left
        while(j< n2)
        {
            arr[k]= r[j];
            j++;
            k++;
        }





    }

    public static void main(String[] args) {
        int arr[] = {12, 11, 34, 4};


    }

}
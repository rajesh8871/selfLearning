package recurssion;

public class IsSortedArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 1, 6, 7};
        int i = 0;
        System.out.println(isSorted(arr, i));

    }

    private static boolean isSorted(int[] arr, int i) {
        if (i >= arr.length - 1)
            return true;

        //check if current element is sorter the and next element and again call recursively;
        return arr[i] < arr[i + 1] && isSorted(arr, i + 1);

    }
}

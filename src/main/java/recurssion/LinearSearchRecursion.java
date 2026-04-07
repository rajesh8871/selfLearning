package recurssion;

public class LinearSearchRecursion {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 14, 2};
        int target = 2;
        int index = 0;
        System.out.println(searchUsingRecur(arr, target, index));
    }

    private static int searchUsingRecur(int[] arr, int target, int index) {
        if (index > arr.length - 1) {
            return -1;
        }

        //check for the existence return the index else again call the same function
        return arr[index] == target ? index : searchUsingRecur(arr, target, index + 1);
    }
}

package immutable;

import lombok.ToString;

@ToString
public class DeepShallow {
    private int arr[];

        //shallow copy example
        /*    public DeepShallow(int[] arr) {

            this.arr = arr;
        }*/


    //deep copy
    public DeepShallow(int arrTemp[]) {
        arr = new int[arrTemp.length];
        for (int i = 0; i < arrTemp.length; i++) {
            arr[i] = arrTemp[i];
        }

    }

    public static void main(String[] args) {
        int arr[] = {2, 3};
        DeepShallow deepShallow = new DeepShallow(arr);
        System.out.println(deepShallow);
        arr[1] = 7;
        System.out.println(deepShallow);
    }
}

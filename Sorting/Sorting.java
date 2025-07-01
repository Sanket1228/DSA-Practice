public class Sorting {

    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < n-1; i++){
                if (arr[i] > arr[i + 1]){
                    int temp = arr[i];
                    arr[i] = arr[arr.length - 1];
                    arr[arr.length - 1] = temp;
                    swapped = true;
                }
            }
        }while(!swapped);

        return arr;
    }

    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++){
            if (arr[i] > arr[arr.length - 1]) {
                int temp = arr[i];
                arr[i] = arr[arr.length - 1];
                arr[arr.length - 1] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {9, 18, 12, 15, 48, 7};
        for(Integer num: bubbleSort(arr)) {
            System.out.print(num + " ");
        }
    }
}

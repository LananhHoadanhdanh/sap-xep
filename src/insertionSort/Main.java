package insertionSort;

public class Main {
    public static void insertionSort(int[] array){
        for (int i = 1; i < array.length; i++) {
            int value = array[i];
            int j = i;
            while(j > 0 && value < array[j-1]){
                array[j] = array[j-1];
                j--;
            }
            array[j] = value;
        }
    }

    public static void main(String[] args) {
        int[] numbersArr = {5,4,1,9,8,7,6,3,2,10};
        insertionSort(numbersArr);
        for (int j : numbersArr) {
            System.out.print(j + "\t");
        }
    }
}

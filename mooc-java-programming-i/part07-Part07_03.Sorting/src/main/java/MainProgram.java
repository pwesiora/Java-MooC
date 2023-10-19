
public class MainProgram {
    
    public static int smallest(int[] array){
        int small = array[0];
        for (int val : array){
            if (small > val){
                small = val;
            }
        }
        return small;
    }
    public static int indexOfSmallest(int[] array){
        int smallest = smallest(array);
        int index = 0;
        for (int val : array){
            if (smallest == val){
                return index;
            }
            index++;
        }
        return -1;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int small = table[startIndex];
        //int i = 0;
        for (int i = startIndex; i <= table.length-1; i++){
            if (small > table[i]){
                small = table[i];
            }
        }
        for (int i = startIndex; i <= table.length-1; i++){
            if (small == table[i]){
                return i;
            }
        }
        return -1;

    }
    
    public static void swap(int[] array, int index1, int index2) {
        int helper = array[index1];
        array[index1] = array[index2];
        array[index2] = helper;
    }    
    public static void sort(int[] array) {
        for (int i = 0; i <= array.length-1; i++){
           swap(array, i, indexOfSmallestFrom(array, i));
           System.out.println(array.toString());
        }
    }
    public static void main(String[] args) {

        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

}

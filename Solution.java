package basic01;

public class Solution {
    public void sort(int[] array){
        if (array == null || array.length == 0){
            return;
        }
        int n = array.length;
        for (int i = 0; i < n-1; i++){
            int minIndex = i;
            for (int j = i+1; j < n; j++){
                if(array[j] < array[minIndex]){
                    minIndex = j;
                }
            }
            swap(array, i, minIndex);
        }
    }
    private void swap(int[] array, int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }


    public static void main(String[] args){
        int[] array = {1,-2,3,5};
        Solution sol = new Solution();
        sol.sort(array);
        for (int a : array){
            System.out.print(a + " ");
        }
    }
}

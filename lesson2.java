public class Lesson2 {

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0}; 
        printArr(changeArr1(arr1));
         
        int[] arr2 = new int[8];
        printArr(fillArr(arr2));
        
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        printArr(changeArr3(arr3));

        System.out.println("Max number in arr3: " + findMax(arr3));
        System.out.println("Min number in arr3: " + findMin(arr3));

        int[][] arr5 = new int[4][4];
        fillArr5(arr5);  
        for (int i = 0; i < arr5.length; i++) {
            for (int j = 0; j < arr5.length; j++) {
                System.out.print(arr5[i][j] + " ");
            }
            System.out.println();
        } 

        int[] arr6 = {1, 1, 1, 2, 1};
        System.out.println(checkBalance(arr6));

        int[] arr8 = {2, 3, 5, 8, 7};
        printArr(shiftElements(arr8, -3));
    }
    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    private static int[] changeArr1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            }
            else arr[i] = 0;
        }
        return arr;
    }
    private static int[] fillArr(int[] arr) {
        int j = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = j;
            j += 3;
        }
        return arr;
    }
    private static int[] changeArr3(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        return arr;
    }    
    private static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;    
    }    
     private static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;    
    } 
    private static int[][] fillArr5(int[][] arr) {
        int l = 0;
        int r = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j == l || j == r) {
                    arr[i][j] = 1;
                }
            }
            l++;
            r--;      
        } 
        return arr;
    }
    private static boolean checkBalance(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int left = 0;
            int right = 0;
            for (int k = 0; k <= i; k++) {
                left += arr[k];
            }     
            for (int j = i + 1; j < arr.length; j++) {
                right += arr[j];
            }
            if (right == left) {
                return true;
            }
        }
        return false;
    }
    private static int[] shiftElements(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if ((i + n >= 0) && (i + n < arr.length)) {
                arr[i + n] = arr[i];
            }
            else if (n > 0) {
                arr[i + n - arr.length] = arr[i];
            }
            else {
                arr[i + n + arr.length] = arr[i];
            }
        } 
        return arr;       
    }


}
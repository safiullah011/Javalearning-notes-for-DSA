// Bubble sort 
//time complexity O(n^2)
public class Sorting {
    public static void bubblesort(int arr[]){
        for(int turn = 0; turn<arr.length ; turn++) {
            for(int j=0; j<arr.length-1-turn ; j++) {
                if(arr[j] > arr[j+1] ){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void printArr(int arr []) {
        for(int i = 0;i<arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
    }
//Slection sort : O(n^2)
//Pick the smallest (from unsorted ),put it at the beginning

    public static void Selectionsort(Integer arr[]) {
        for(int i = 0; i<arr.length-1 ; i++) {
            int minpos = i;
            for (int j = i+1 ; j<arr.length ; j++) {
                if(arr[minpos] > arr[j] ){
                    minpos = j;
                }
            }
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    }
//Insertion sort : O(n^2)
//Pick the element from the unsorted part and place it at right position

    public static void Insertionsort(Integer arr [] ){
        for (int i = 0; i<arr.length ; i++ ){
            int curr = arr[i];
            int pre = i-1;
            while(pre >= 0 && arr[pre] < curr ){
                arr[pre + 1] = arr[pre] ;
                pre--;
            }
            arr[pre + 1]  = curr;
        }

    } 
    //Countsort
    public static void countingsort(int arr[] ){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length ; i++ ){
            largest = Math.max(largest, arr[i] ) ;
        }
        int count[] = new int[largest + 1] ;
        for (int i = 0; i<arr.length ; i++ ) {
            count[arr[i]]++;
        }
        //sorting
        int j = 0;
        for(int i = 0; i<count.length ; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
                
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {1,4,1,3,2,4,3,7};
        countingsort(arr);
        // Arrays.sort(arr,Collections.reverseOrder());
        printArr(arr);
    }
}


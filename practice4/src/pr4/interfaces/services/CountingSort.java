package pr4.interfaces.services;

public class CountingSort {

    public static void sortAndPrint(int[] arr) {
        int[] count = new int[11];

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        System.out.print("Sorted array: ");
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                System.out.print(i + " ");
                count[i]--;                                 //buursan erembeer bicne
            }
        }
        System.out.println();
    }
}









//public static void sortAndPrint(int[] arr) {
//	int[] count=new int[11];
//	for(int i=0; i<count.length;i++) {
//}
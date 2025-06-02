Blogs

User
Toggle Sidebar

DSA Sheet
Folder IconStrivers A2Z Sheet
Folder IconStrivers SDE Sheet
Folder IconStrivers 79 Sheet
Folder IconBlind 75 Sheet

DSA Playlist

Core Subjects

Others
TUF Dark
Unlock personalized learning and exclusive roadmaps.
Explore Plans
Premium Icon
Get Plus
Insertion Sort Algorithm

Mark as Completed

407


Problem Statement: Given an array of N integers, write a program to implement the Insertion sorting algorithm.

Examples:

Example 1:
Input: N = 6, array[] = {13,46,24,52,20,9}
Output: 9,13,20,24,46,52
Explanation: 
After sorting the array is: 9,13,20,24,46,52


Example 2:
Input: N=5, array[] = {5,4,3,2,1}
Output: 1,2,3,4,5
Explanation: After sorting the array is: 1,2,3,4,5
Solution
Disclaimer: Don't jump directly to the solution, try it out yourself first.

Practice:
Solve Problem
Approach: 

Select an element in each iteration from the unsorted array(using a loop).
Place it in its corresponding position in the sorted part and shift the remaining elements accordingly (using an inner loop and swapping).
The “inner while loop” basically shifts the elements using swapping.
Dry Run:

The purple color represents the unsorted array.
The yellow color represents the current element that needs to be placed in the appropriate position.
The green color represents the sorted array.
Outer loop iteration 1(selected index i = 0): The element at index i=0 is 13 and there is no other element on the left of 13. So, currently, the subarray up to the first index is sorted as it contains only element 13.


Outer loop iteration 2(selected index i = 1):

The selected element at index i=1 is 46. Now, we will try to move leftwards and put 46 in its correct position. Here, 46 > 13 and so 46 is already in its correct position. Now, the subarray up to the second index is sorted.


Outer loop iteration 3(selected index i = 2):

The selected element at index i=2 is 24. Now, we will try to move leftwards and put 24 in its correct position. Here, the correct position for 24 will be index 1. So, we will insert 24 in between 13 and 46. We will do it by swapping 24 and 46. Now, the subarray up to the third index is sorted.


Outer loop iteration 4(selected index i = 3):

The selected element at index i=3 is 52. Now, we will try to move leftwards and put 52 in its correct position. Here, the correct position for 52 will be index 3. So, we need not swap anything. Now, the subarray up to the fourth index is sorted.


Outer loop iteration 5(selected index i = 4):

The selected element at index i=4 is 20. Now, we will try to move leftwards and put 20 in its correct position. Here, the correct position for 20 will be index 1. So, we need to swap adjacent elements until 20 reaches index 1. Now, the subarray up to the fifth index is sorted.


Outer loop iteration 6(selected index i = 5):

The selected element at index i=5 is 9. Now, we will try to move leftwards and put 9 in its correct position. Here, the correct position for 9 will be index 0. So, we need to swap adjacent elements until 9 reaches index 0. Now, the whole array is sorted.


Code:

C++
Java
import java.util.*;

public class Main {
    static void insertion_sort(int[] arr, int n) {
        for (int i = 0; i <= n - 1; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

        System.out.println("After insertion sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int arr[] = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        System.out.println("Before Using insertion Sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        insertion_sort(arr, n);
    }

}  

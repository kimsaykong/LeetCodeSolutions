package Solutions;

import java.util.ArrayList;

public class MergeTwoSortedLists {
    /**
     * Definition for singly-linked list.
     *
     * */
    public static class ListNode {
        int val;
        ListNode next;
        public ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        list1.val = 1;
//        list1.next = new ListNode(2);
//        list1.next.next = new ListNode(4);
//        list2.val = 1;
//        list2.next = new ListNode(3);
//        list2.next.next = new ListNode(4);
        ArrayList<Integer> arr = new ArrayList<>();
        while (list1 != null) {
            arr.add(list1.val);
            list1 = list1.next;
        }
        while (list2 !=null) {
            arr.add(list2.val);
            list2 = list2.next;
        }
        int temp[] = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            temp[i] = arr.get(i);
        }
        sort(temp,0,temp.length-1);
        ListNode header = null;
        ListNode tempNode = null;
        for (int i = 0; i < temp.length; i++) {
           if (header==null) header = new ListNode(temp[i]);
           else {
               tempNode = header;
               while (tempNode.next != null){
                   tempNode = tempNode.next;
               }
               tempNode.next = new ListNode(temp[i]);
           }
        }
        return header;
    }
    public void merge(int arr[],int l,int m, int r){
        // Find sizes of two sub arrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    void sort(int arr[], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m =l+ (r-l)/2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
}
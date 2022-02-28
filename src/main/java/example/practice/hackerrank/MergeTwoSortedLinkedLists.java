package example.practice.hackerrank;

import java.util.Arrays;
import java.util.LinkedList;

/*
 * Given two sorted linked lists, merge them so that the resulting linked list is also sorted.
 * Consider two sorted linked lists and the merged list below them as an example.
 * head1->4,8,15,19<-NULL
 * head2->7,9,10,16<-NULL
 * head1->4,7,8,9,10,15,16,19<-NULL
 * */
public class MergeTwoSortedLinkedLists {
    public static void main(String[] args) {
        LinkedList<Integer> sortedLinkedList1 = new LinkedList<Integer>(Arrays.asList(4, 8, 15, 19));
        LinkedList<Integer> sortedLinkedList2 = new LinkedList<Integer>(Arrays.asList(7, 9, 10, 16));
        LinkedList<Integer> mergeSortedLinkedList = new LinkedList<>(sortedLinkedList2);

        for (int element1 : sortedLinkedList1) {
            for (int i = 0; i < sortedLinkedList2.size(); i++) {
                int element2 = sortedLinkedList2.get(i);
                if (element1 <= element2) {
                    mergeSortedLinkedList.add(element1, i);
                } else {
                    mergeSortedLinkedList.add(element2, i);
                }
            }
        }

        System.out.println(mergeSortedLinkedList);
    }
}

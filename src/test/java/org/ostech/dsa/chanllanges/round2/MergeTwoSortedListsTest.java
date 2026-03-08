package org.ostech.dsa.chanllanges.round2;

import org.junit.jupiter.api.Test;
import org.ostech.dsa.chanllanges.round1.MergeTwoSortedLists.ListNode;
import org.ostech.dsa.chanllanges.round1.MergeTwoSortedLists.MergeTwoSortedLists;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedListsTest {

    @Test
    void mergeTwoSortedLists_NormalCase() {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        ListNode result = MergeTwoSortedLists.MergeTwoSortedLists(list1, list2);

        int[] expected = {1,1,2,3,4,4};

        for (int value : expected) {
            assertEquals(value, result.val);
            result = result.next;
        }
    }

    @Test
    void mergeTwoSortedLists_OneListEmpty() {
        ListNode list1 = null;
        ListNode list2 = new ListNode(0);

        ListNode result = MergeTwoSortedLists.MergeTwoSortedLists(list1, list2);

        assertEquals(0, result.val);
        assertNull(result.next);
    }

    @Test
    void mergeTwoSortedLists_BothEmpty() {
        ListNode result = MergeTwoSortedLists.MergeTwoSortedLists(null, null);

        assertNull(result);
    }
}

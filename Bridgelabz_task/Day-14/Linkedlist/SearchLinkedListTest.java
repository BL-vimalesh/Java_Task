package linkedlist;

import static org.junit.Assert.*;
import org.junit.Test;

public class SearchLinkedListTest {

    @Test
    public void testSearchNode30() {

        SearchLinkedList n1 = new SearchLinkedList(56);
        SearchLinkedList n2 = new SearchLinkedList(30);
        SearchLinkedList n3 = new SearchLinkedList(70);

        n1.setNext(n2);
        n2.setNext(n3);

        SearchLinkedList result = SearchLinkedList.search(n1, 30);

        assertNotNull(result);
        assertEquals(30, result.getKey());
    }
}

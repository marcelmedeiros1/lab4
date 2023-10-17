package com.aor.numbers;
import org.mockito.Mockito;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

public class ListDeduplicatorTest extends ListAggregatorTest {
    @Test
    public void deduplicate() {
        List<Integer> list = Arrays.asList(1, 2, 4, 2, 5);
        List<Integer> expected = Arrays.asList(1, 2, 4, 5);
        GenericListSorter sorter = new ListSorter(); // Use a real sorter here
        ListDeduplicator deduplicator = new ListDeduplicator(sorter);
        List<Integer> distinct = deduplicator.deduplicate(list);

        Assertions.assertEquals(expected, distinct);
    }
}

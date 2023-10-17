package com.aor.numbers;
import org.mockito.Mockito;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sun.jvm.hotspot.utilities.Assert;

import java.util.Arrays;
import java.util.List;
public class ListFiltererTest{
    @Test
    public void PositiveFilter() {
        List<Integer> list = Arrays.asList(-1,-2,0,1,2,4);
        List<Integer> expected = Arrays.asList(0,1,2,4);

        GenericListFilter filter = new PositiveFilter();
        ListFilterer listfilterer = new ListFilterer(filter);
        List<Integer> filtered = listfilterer.filter(list);

        Assertions.assertEquals(expected, filtered);

    }
    @Test
    public void DivisibleByFilter() {
        Integer divisor = 2;
        List<Integer> list = Arrays.asList(0,1,2,4,6);
        List<Integer> expected = Arrays.asList(0, 2,4,6);

        GenericListFilter filter = new DivisibleByFilter(divisor);
        ListFilterer listfilterer = new ListFilterer(filter);
        List<Integer> filtered = listfilterer.filter(list);

        Assertions.assertEquals(expected, filtered);
    }
}

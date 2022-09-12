package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        List<String> list = new ArrayList<>();
        list.addAll(firstList);
        list.addAll(secondList);
        PriorityQueue<String> queue = new PriorityQueue<>(list);
        PriorityQueue<String> result = new PriorityQueue<>(Collections.reverseOrder());
        result.addAll(queue);
        return result;
    }
}

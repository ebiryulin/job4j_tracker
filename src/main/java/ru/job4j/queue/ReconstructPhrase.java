package ru.job4j.queue;

import java.util.Deque;

public class ReconstructPhrase {

    private final Deque<Character> descendingElements;

    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    private String getEvenElements() {
        StringBuilder evenString = new StringBuilder();
        int listSize = evenElements.size();
        for (int index = 2; index <= listSize; index++) {
            if (index % 2 == 0) {
                evenString.append(evenElements.element());
            }
            evenElements.removeFirst();
        }
        return evenString.toString();
    }

    private String getDescendingElements() {
        StringBuilder descendingString = new StringBuilder();
        int listSize = descendingElements.size();
        for (int index = 0; index < listSize; index++) {
            descendingString.append(descendingElements.pollLast());
            }
        return descendingString.toString();
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}


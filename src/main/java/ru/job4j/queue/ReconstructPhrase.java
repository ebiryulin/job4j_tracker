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
        String rsl = null;
        for (int index = 2; index <= evenElements.size(); index++) {
            StringBuilder evenString = new StringBuilder();
            if (index % 2 == 0) {
                evenString.append(evenElements.element());
                rsl = String.valueOf(evenString);
            }
            evenElements.remove();
        }
        return rsl;
    }

    private String getDescendingElements() {
        String rsl = null;
        for (int index = 0; index < descendingElements.size(); index++) {
                StringBuilder evenString = new StringBuilder();
                evenString.append(descendingElements.pollLast());
                rsl = String.valueOf(evenString);

            }
        return rsl;
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}


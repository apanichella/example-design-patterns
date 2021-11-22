package nl.tudelft.strategy;

import java.util.List;

public interface AnswerStrategy {
    public Email getNextEmail(List<Email> pList);
}

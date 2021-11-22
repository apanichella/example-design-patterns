package nl.tudelft.strategy;

import java.util.*;

public class ChronologicalStrategy implements  AnswerStrategy {

    public Email getNextEmail(List<Email> list) {
        if (list == null || list.isEmpty())
            return null;

        this.sort(list);
        return list.get(0);
    }

    private void sort(List<Email> list) {
        Collections.sort(list, new EmailComparator());
    }

    protected class EmailComparator implements Comparator {

        @Override
        public int compare(Object o1, Object o2) {
            Email email1 = (Email) o1;
            Email email2 = (Email) o2;

            if (email1.getDate().before(email2.getDate()))
                return -1;

            if (email1.getDate().after(email2.getDate()))
             return +1;

            return 0;
        }
    }
}

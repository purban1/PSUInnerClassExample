package innerclassexample;

import java.util.*;

/**
 *
 * @author production
 */
public class NumberHandler {

    private List<String> numberHolder;
    private List<String> evenNumbers = new ArrayList<String>();
    private List<String> oddNumbers = new ArrayList<String>();
    private int theSum;
    private analyzeTheNumbers analysis = new analyzeTheNumbers();

    public NumberHandler() {
        this.numberHolder = new ArrayList<String>();
    }

    public void addToTheList(String num) {
        this.numberHolder.add(num);
    }

    public void evaluateTheNumberList() {
        this.analysis.collectTheEvens();
        Collections.sort(evenNumbers);
        this.analysis.collectTheOdds();
        Collections.sort(oddNumbers);
        this.analysis.determineTheRunningTotal();
    }

    // Inner Class
    private class analyzeTheNumbers {

        public void collectTheEvens() {
            for (String numList : numberHolder) {
                if (Double.parseDouble(numList) % 2 == 0) {
                    evenNumbers.add(numList);
                }
            }
        }

        public void collectTheOdds() {
            for (String numList : numberHolder) {
                if (Double.parseDouble(numList) % 2 != 0) {
                    oddNumbers.add(numList);
                }
            }
        }

        public void determineTheRunningTotal() {
            for (String numList : numberHolder) {
                theSum += Integer.parseInt(numList);
            }
        }
    }

    @Override
    public String toString() {
        return "\nThe results are as follows:\n" + "Evens: " + evenNumbers
                + "\nOdds: " + oddNumbers + "\n\nThe total of the numbers: "
                + theSum + ".";
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.numberHolder);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final NumberHandler other = (NumberHandler) obj;
        if (!Objects.equals(this.numberHolder, other.numberHolder)) {
            return false;
        }
        return true;
    }
    
    
    
}

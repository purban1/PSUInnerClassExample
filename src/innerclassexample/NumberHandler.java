package innerclassexample;

import java.util.*;

/**
 *
 * @author production
 */
public class NumberHandler {

    private List<Double> numberHolder;
    private List<Double> evenNumbers = new ArrayList<Double>();
    private List<Double> oddNumbers = new ArrayList<Double>();
    private Double theSum=0.0;
    private analyzeTheNumbers analysis = new analyzeTheNumbers();

    public NumberHandler() {
        this.numberHolder = new ArrayList<Double>();
    }

    public void addToTheList(String num) {
        this.numberHolder.add(Double.parseDouble(num));
    }

    public void evaluateTheNumberList() {
        this.analysis.collectTheEvens();
        Collections.sort(evenNumbers);
        System.out.println(evenNumbers);
        this.analysis.collectTheOdds();
        Collections.sort(oddNumbers);
        this.analysis.determineTheRunningTotal();
    }

    // Inner Class
    private class analyzeTheNumbers {

        public void collectTheEvens() {
            for (Double numList : numberHolder) {
                if (numList % 2 == 0) {
                    evenNumbers.add(numList);
                }
            }
        }

        public void collectTheOdds() {
            for (Double numList : numberHolder) {
                if (numList % 2 != 0) {
                    oddNumbers.add(numList);
                }
            }
        }

        public void determineTheRunningTotal() {
            for (Double numList : numberHolder) {
                theSum += numList;
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

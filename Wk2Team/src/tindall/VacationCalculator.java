package tindall;

import java.util.List;

class VacationCalculator {

    public static void main(String[] args) {

        VacationCalculator vc = new VacationCalculator();

        // Calculate some vacation costs...
        float japanCost = vc.calculateVacationCost(Destination.Japan);

        // Print the cost...
        System.out.println("The cost of a trip to Japan is: ");
    }

    /**
     * Calculates the total cost for vacationing at a given location for
     * a specific number of nights.
     *
     * @param  dest the destination of the vacation
     * @return      the total cost of the vacation
     */
    public float calculateVacationCost(Destination dest)
    {

    }

    /**
     * An internal method used by VacationCalculator to loop through
     * a List of items that implement the Expense interface and
     * determine their cost
     *
     * @param  expenses A list of items that implement the Expense interface
     * @return          the total cost calculated by the items
     */
    float tallyExpenses(List<Expense> expenses) {
        float x = 0;
        for (int i; i < expenses.size(); i++) {
            x += expenses.[i];
        }
        return x;
    }
}
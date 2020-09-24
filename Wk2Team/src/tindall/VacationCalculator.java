package tindall;

import java.util.ArrayList;
import java.util.List;

import static tindall.Destination.Mexico;

class VacationCalculator {

    public static void main(String[] args) {

        VacationCalculator vc = new VacationCalculator();

        // Calculate some vacation costs...
        float japanCost = vc.calculateVacationCost(Destination.Japan, 5);
        float mexicoCost = vc.calculateVacationCost(Destination.Mexico, 5);
        float europeCost = vc.calculateVacationCost(Destination.Europe, 5);

        // Print the cost...
        System.out.format("The cost of a trip to Japan is: $%.2f\n", japanCost);
        System.out.format("The cost of a trip to Mexico is: $%.2f\n", mexicoCost);
        System.out.format("The cost of a trip to Europe is: $%.2f\n", europeCost);
    }

    /**
     * Calculates the total cost for vacationing at a given location for
     * a specific number of nights.
     *
     * @param  dest the destination of the vacation
     * @return      the total cost of the vacation
     */
    public float calculateVacationCost(Destination dest, int nights) {
        List<Expense> lineItems = new ArrayList<Expense>();
        lineItems.add(new Cruise(dest));
        lineItems.add(new Dining(dest, nights));
        lineItems.add(new Lodging(dest, nights));
        return tallyExpenses(lineItems);
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
        for (Expense d: expenses) {
            x += d.getCost();
        }
        return x;
    }
}
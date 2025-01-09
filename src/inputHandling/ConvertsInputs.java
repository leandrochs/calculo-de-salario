package inputHandling;

import java.sql.Array;

public class ConvertsInputs {
    public static double[] toArrayOfDoubles(String[] salaryInputs) {

        int quantityOfSalaries = salaryInputs.length;
        double[] salaries = new double[quantityOfSalaries];

        for (int i = 0; i < quantityOfSalaries; i++) {
            salaries[i] = Double.parseDouble(salaryInputs[i]);
        }

        return salaries;
    }
}

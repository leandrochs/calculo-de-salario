public class Main {
    public static void main(String[] args) {

        double[] wagesReported = ConvertsInputsTo.arrayOfDoubles(args);

        double[] inssDiscount = Calculates.inssDiscount(wagesReported);

        double[] incomeTaxDiscount = Calculates.incomeTaxDiscount(wagesReported);

        salaryInformation.printSalariesAndDeductions(wagesReported, inssDiscount, incomeTaxDiscount);

    }
}

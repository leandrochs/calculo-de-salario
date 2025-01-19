package incomeTax;

enum incomeTaxDiscountRanges {
    RANGE_1(0.0, 1903.98, 0.0),
    RANGE_2(1903.99, 2826.65, 7.5),
    RANGE_3(2826.66, 3751.05, 15.0),
    RANGE_4(3751.06, 4664.68, 22.5),
    RANGE_5(4664.69, Double.MAX_VALUE, 27.5);

    private final double lowerLimit;
    private final double upperLimit;
    private final double discountPercentage;

    incomeTaxDiscountRanges(double lowerLimit, double upperLimit, double discountPercentage) {
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
        this.discountPercentage = discountPercentage;
    }

    static double getDiscountPercentage(double salary) {
        for(incomeTaxDiscountRanges range : values()) {
            if (salary >= range.lowerLimit && salary <= range.upperLimit) {
                return range.discountPercentage;
            }
        }
        throw new IllegalArgumentException("Salário fora das faixas definidas.");
    }
}

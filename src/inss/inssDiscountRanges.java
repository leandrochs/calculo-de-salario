package inss;

enum inssDiscountRanges {
    RANGE_1(0.0, 1212.00, 7.5),
    RANGE_2(1212.01, 2427.35, 9.0),
    RANGE_3(2427.36, 3641.03, 12.0),
    RANGE_4(3641.04, 7087.22, 14.0);

    private final double lowerLimit;
    private final double upperLimit;
    private final double discountPercentage;

    inssDiscountRanges(double lowerLimit, double upperLimit, double discountPercentage) {
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
        this.discountPercentage = discountPercentage;
    }

    double getUpperLimit() {
        return upperLimit;
    }

    double getDiscountPercentage() {
        return discountPercentage;
    }

    static double getDiscountPercentage(double salary) {
        for(inssDiscountRanges range : values()) {
            if (salary >= range.lowerLimit && salary <= range.upperLimit) {
                return range.discountPercentage;
            }
        }
        throw new IllegalArgumentException("Salário fora das faixas definidas.");
    }
}

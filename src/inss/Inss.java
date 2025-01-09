package inss;

public class Inss {

    public static double calculateDiscount(double salary) {
        if (isAboveTheMaximumSalaryRange(salary))
            return maximumDiscount();
        SalaryRangeTable range = definesTheDiscountRange(salary);
        double percentage = defineThePercentageOfTheRange(range);
        return defineSalaryDiscount(salary, percentage);
    }

    private static boolean isAboveTheMaximumSalaryRange(double salary) {
        double maximumSalaryForDiscount = SalaryRangeTable.LIMIT_RANGE_4.getLimit();
        return salary > maximumSalaryForDiscount;
    }

    private static double maximumDiscount() {
        double maximumSalaryForDiscount = SalaryRangeTable.LIMIT_RANGE_4.getLimit();
        double maximumDiscountPercentage = PercentageTable.RANGE_4.getPercentage();

        return maximumSalaryForDiscount * (maximumDiscountPercentage/100);
    }

    private enum SalaryRangeTable {
        LIMIT_RANGE_1(1212.00),
        LIMIT_RANGE_2(2427.35),
        LIMIT_RANGE_3(3641.03),
        LIMIT_RANGE_4(7087.22);

        public final double limit;

        SalaryRangeTable(double limit) {
            this.limit = limit;
        }

        private double getLimit() {
            return limit;
        }
    }

    private static SalaryRangeTable definesTheDiscountRange(double salary) {
        for (SalaryRangeTable rangeLimit : SalaryRangeTable.values()) {
            if (salary <= rangeLimit.getLimit()) {
                return rangeLimit;
            }
        }
        throw new IllegalArgumentException("Salário fora das faixas definidas");
    }

    private enum PercentageTable {
        RANGE_1(7.5),
        RANGE_2(9),
        RANGE_3(12),
        RANGE_4(14);

        private final double percentage;

        PercentageTable(double percentage) {
            this.percentage = percentage;
        }

        public double getPercentage() {
            return percentage;
        }
    }

    private static double defineThePercentageOfTheRange(SalaryRangeTable rangeLimit) {
        return switch (rangeLimit) {
            case LIMIT_RANGE_1 -> PercentageTable.RANGE_1.getPercentage();
            case LIMIT_RANGE_2 -> PercentageTable.RANGE_2.getPercentage();
            case LIMIT_RANGE_3 -> PercentageTable.RANGE_3.getPercentage();
            case LIMIT_RANGE_4 -> PercentageTable.RANGE_4.getPercentage();
            default -> throw new IllegalArgumentException("Salário fora das faixas definidas");
        };
    }

    private static double defineSalaryDiscount(double salary, double percentage) {
        return salary * (percentage/100);
    }
}

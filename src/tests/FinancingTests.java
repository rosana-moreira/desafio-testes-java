package tests;

import entities.Financing;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FinancingTests {
    @Test
    public void constructorShouldCreatedObjectWhenValidData() {
        Double totalAmount = 100000.0;
        Double income = 2000.0;
        Integer months = 80;

        Financing financing = new Financing(totalAmount, income, months);
        Assertions.assertEquals(totalAmount, financing.getTotalAmount());
        Assertions.assertEquals(income, financing.getIncome());
        Assertions.assertEquals(months, financing.getMonths());
    }

    @Test
    public void constructorShouldIllegalArgumentExceptionWhenInvalidData() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing financing = new Financing(100000.0, 2000.0, 20);

        });
    }

    @Test
    public void setTotalAmountShouldUpdatedDataWhenValidData() {
        Financing financing = new Financing(100000.0, 2000.0, 80);
        financing.setTotalAmount(90000.0);
        Assertions.assertEquals(90000, financing.getTotalAmount());

    }

    @Test
    public void setTotalAmountShouldIllegalArgumentExceptionWhenInvalidData() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing financing = new Financing(100000.0, 2000.0, 80);
            financing.setTotalAmount(110000.0);

        });

    }

    @Test
    public void setIncomeShouldUpdatedDataWhenValidData() {
        Financing financing = new Financing(100000.0, 2000.0, 80);
        financing.setIncome(3000.0);
        Assertions.assertEquals(3000.0, financing.getIncome());

    }

    @Test
    public void setIncomeShouldUpdatedObjectWhenInvalidData() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing financing = new Financing(100000.0, 2000.0, 80);
            financing.setIncome(1000.0);

        });

    }

    @Test
    public void setMonthsShouldUpdatedDataWhenValidData() {
        Financing financing = new Financing(100000.0, 2000.0, 80);
        financing.setMonths(81);
        Assertions.assertEquals(81, financing.getMonths());

    }

    @Test
    public void setMonthsShouldUpdatedDataWhenInvalidData() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing financing = new Financing(100000.0, 2000.0, 80);
            financing.setMonths(70);

        });

    }

    @Test
    public void entryShouldCalculateData() {
        Financing financing = new Financing(100000.0, 2000.0, 80);
        financing.setTotalAmount(90000.0);
        Assertions.assertEquals(18000, financing.entry());

    }

    @Test
    public void quotaShouldCalculateData() {
        Financing financing = new Financing(100000.0, 2000.0, 80);
        financing.setTotalAmount(90000.0);
        Assertions.assertEquals(900, financing.quota());

    }
}

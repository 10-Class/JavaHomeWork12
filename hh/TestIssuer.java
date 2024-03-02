package lesson10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestIssuer {
    @Test
    public void testLoan() {
        LoanIssuer li1 = new LoanIssuer("Max", true, true);
        LoanTaker lt1 = new LoanTaker(21_000, 80, "Vasily");
        Assertions.assertTrue(
                li1.issue(lt1)
        );

        // Если не ленивый но добрый то оформит кредит если зп больше 25000 и возраст не больше 60
        LoanIssuer li2 = new LoanIssuer("Maria", false, true);
        LoanTaker lt2 = new LoanTaker(30_000, 50, "Dima");
        Assertions.assertTrue(
                li2.issue(lt2)
        );
        LoanTaker lt3 = new LoanTaker(24_000, 30, "Tim");
        Assertions.assertFalse(
                li2.issue(lt3)
        );
        LoanTaker lt4 = new LoanTaker(40_000, 75, "Zak");
        Assertions.assertFalse(
                li2.issue(lt4)
        );

        // Если не ленивый и злой, то оформит кредит если за больше 30000 и возрас меньше 50
        LoanIssuer li3 = new LoanIssuer("Sam", false, false);
        LoanTaker lt5 = new LoanTaker(35_000, 45, "Valery");

        Assertions.assertTrue(
                li3.issue(lt5)
        );
    }
}
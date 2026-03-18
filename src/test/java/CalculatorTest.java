import com.example.calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    calculator cal = new calculator();

    @Test
    public void addTest() {
        int result = cal.add(2, 4);
        System.out.println("Addition result : " + result);
        assertEquals(6, result);
    }

    @Test
    public void multiplyTest() {
        int result = cal.multiply(2, 3);
        System.out.println("Mul result : " + result);
        assertEquals(6, result);
    }

}
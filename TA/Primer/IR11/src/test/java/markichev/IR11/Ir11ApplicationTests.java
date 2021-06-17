package markichev.IR11;

import markichev.IR11.Exam.Calculator;
import markichev.IR11.Exam.FormulaResults;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Ir11ApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testFormula()
    {
        assertEquals(4, Calculator.Calculate(2));
    }
    
    @Test
    void testFormulaWithManyArgs()
    {
        FormulaResults fr = new FormulaResults();
        double[] args = new double[]{3d, 4d, 5d};
        fr.SetArgs(args);
        assertEquals("[9.0, 16.0, 25.0]", fr.Calculate());
    }
    
   
}

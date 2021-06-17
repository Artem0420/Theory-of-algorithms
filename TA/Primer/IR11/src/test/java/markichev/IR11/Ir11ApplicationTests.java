package markichev.IR11;

import markichev.IR11.Exam.funcOnExem;
import markichev.IR11.Exam.DoFunc;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Ir11ApplicationTests {

      
    @Test
    void testNumbers()
    {
        DoFunc cl = new DoFunc();
        double[] args = new double[]{1d, 2d};
        cl.SetArgs(args);
        assertEquals("[0.83, 0.43]", cl.DoCalculate());
    }
    
}

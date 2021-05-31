package TheoryOfAlgorithms.Markichev;

import TheoryOfAlgorithms.Markichev.Lab1.Lab1;
import TheoryOfAlgorithms.Markichev.Lab2.Lab2;
import TheoryOfAlgorithms.Markichev.Lab3.Lab3;
import TheoryOfAlgorithms.Markichev.Lab4.Lab4;
import TheoryOfAlgorithms.Markichev.Lab5.Lab5_2;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MarkichevApplicationTests {

    @Test
    void contextLoads() {
    }
    
    @Test
    void Laba1Test()
    {
        Lab1 lab1 = new Lab1();
        assertEquals(240, lab1.getNumber());
        
        lab1 = new Lab1(120);
        assertEquals(120, lab1.getNumber());
        assertEquals("Division by zero!", lab1.Divide(0));
    }
    @Test
    void Laba2Test()
    {
        Lab2 lab2 = new Lab2();
        
        assertEquals(Float.MAX_VALUE, lab2.CalculateFormula(0));
        assertEquals(0, lab2.CalculateFormula(0.5f));
        assertEquals(0.05f, lab2.CalculateFormula(2));
    }
    @Test
    void Laba3Test()
    {
        Lab3 lab3 = new Lab3(-5);
        assertEquals(20, lab3.GetArrayLength());
        lab3 = new Lab3(10);
        lab3.InitArray();
        assertEquals("[1, 4, 9, 16, 25, 36, 49, 64, 81, 100]", lab3.DisplayArray());
        assertEquals("1", lab3.GetNumber(4));
        assertEquals("Out of range!", lab3.GetNumber(-1));
    }
    
    @Test
    void Laba4Test()
    {
        Lab4 lab4 = new Lab4("lorem ipsum dolor sit amet consectetur adipiscing elit donec eget");
        
        assertEquals(10, lab4.GetWordsNumber());
        assertEquals(0, lab4.GetNumberOfWordsThatContainLetters(2));
        assertEquals(7, lab4.GetNumberOfWordsThatNotContain('l'));
        assertEquals(10, lab4.GetUniqueWordsNumber());
        assertEquals("[ip=2, on=2]", lab4.MostPopularSequences(2, 2));
    }
    
    @Test
    void Laba5Test()
    {
        Lab5_2 lab5 = new Lab5_2(20);
        lab5.InitList();
        
        assertEquals(-1, lab5.IndexOf("test"));
        lab5.SortByStringField();
        assertEquals(2, lab5.IndexOf("model #10"));
    }
}

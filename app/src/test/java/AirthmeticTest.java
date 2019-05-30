import com.e.airthmetic.model.Airtmetic;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AirthmeticTest {
    @Test
    public void testAddition() {
        Airtmetic airtmetic = new Airtmetic();
        float expectedResult = 10;
        float actualResult = airtmetic.add(4, 6);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSubtraction() {
        Airtmetic airtmetic = new Airtmetic();
        float expectedResult=10;
        float actualResult= airtmetic.subtract(4,6);
        assertEquals(expectedResult,actualResult);

    }
}


import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CalculatorTest {
    private lateinit var calculator: Calculator

    @BeforeEach
    fun setUp() {
        calculator = Calculator()
    }

    @Test
    fun testAdditionPositiveNumber() {
        val result = calculator.add(1.0, 1.0)
        assertEquals(result, 2.0)
    }
    @Test
    fun testAdditionNegativeNumber() {
        val result = calculator.add(-1.0, 0.0)
        assertEquals(result, -1.0)
    }
    @Test
    fun testSubtractionPositiveNumber() {
        val result = calculator.subtract(1.0, 1.0)
        assertEquals(result, 0.0)
    }
    @Test
    fun testSubtractionNegativeNumber() {
        val result = calculator.subtract(-1.0, -5.0)
        assertEquals(result, 4.0)
    }
    @Test
    fun testMultiplicationPositiveNumber() {
        val result = calculator.multiply(8.0, 5.0)
        assertEquals(result, 40.0)
    }
    @Test
    fun testMultiplicationNegativeNumber() {
        val result = calculator.multiply(-3.0, 6.0)
        assertEquals(result, -18.0)
    }
    @Test
    fun testMultiplicationByZero(){
        val result = calculator.multiply(105.0, 0.0)
        assertEquals(result, 0.0)
    }
    @Test
    fun testDivisionByZero(){
        try {
            val result = calculator.division(105.0, 0.0)
            assertTrue(false)
        }catch(e: Exception){
            e.printStackTrace()
        }
    }
    @Test
    fun testDivisionPositiveNumbers(){
        val result = calculator.division(8.0, 5.0)
        assertEquals(result, 1.6)
    }

    @Test
    fun testDivisionByNegative(){
        val result =calculator.division(-30.0,5.0)
        assertEquals(result, -6.0)
    }
}
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
}
import org.junit.Test
import kotlin.test.assertEquals

class TestExtensions {
    @Test
    fun whenNull() {
        val str: String? = null

        val result: String = str.computeIfNull { "test" }

        assertEquals("test", result)
    }

    @Test
    fun whenNotNull() {
        val str: String? = "test"

        val result: String = str.computeIfNull { "other test" }

        assertEquals("test", result)
    }
}
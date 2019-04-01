package guru.springframework;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GreetingTest {
	
	Greeting greeting;

	@BeforeAll
	static void beforeClass() {
		System.out.println(">>>> Antes de la clase, sólo se ejecuta una vez @BeforeAll");
	}

	@AfterAll
	static void afterClass() {
		System.out.println(">>>> Después de la clase, sólo se ejecuta una vez @AfterAll");
	}

	@BeforeEach
	void setUp() {
		System.out.println(" -- Antes del test @BeforeEach");
		greeting = new Greeting();
	}

	@AfterEach
	void tearDown() {
		System.out.println(" -- Después del test @AfterEach");
		greeting = new Greeting();
	}

	@Test
	final void testHelloWorld() {
		assertEquals("Hello World", greeting.helloWorld());
	}

	@Test
	final void testHelloWorldString() {
		assertEquals("Hello Zinedine", greeting.helloWorld("Zinedine"));
	}

}

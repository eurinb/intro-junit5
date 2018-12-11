package guru.springframework;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    private Greeting greeting;
    @BeforeAll
    public static void beforeClass() {
        System.out.println("Before All - Only called once");
    }

    @BeforeEach
    void setUp() {
        System.out.println("Init before each ...");
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        greeting = new Greeting();
        System.out.println(greeting.helloWorld());
    }

    @Test
    void helloWorld1() {
        greeting = new Greeting();
        System.out.println(greeting.helloWorld("Ingo"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("Tear down - After Each");
    }

    @AfterAll
    public static void afterAllClass() {
        System.out.println("After All - only called once");
    }
}
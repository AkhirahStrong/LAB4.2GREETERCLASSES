import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestGeeter {

	@Test
    public void testGreeters() {
        Greeter greeter = new Greeter("Hey");
        String expected = "Hey, Sean!";
        assertEquals(greeter.greet("Sean"), expected);

        greeter.setGreeter("Goodbye");
        expected = "Goodbye, Sean!";
        assertEquals(greeter.greet("Sean"), expected);

        SimonGreeter simon = new SimonGreeter("Hey");
        expected = "Simon says, Hey, Bob!";
        assertEquals(simon.greet("Sean"), expected);
        expected = "Simon says, Hey, Joe!";
        assertEquals(simon.greet("Seany"), expected);

        HtmlGreeter html = new HtmlGreeter("Hello");
        expected = "<h1>Hello, Sean!</h1>";
        assertEquals(html.greet("Sean"), expected);
        html.setTagName("h2");
        expected = "<h2>Hello, Sean!</h2>";
        assertEquals(html.greet("Bob"), expected);

        LoudGreeter loud = new LoudGreeter("HELLO");
        expected = "HELLO, Sean!!";
        assertEquals(loud.greet("Sean"), expected);
        loud.addVolume();
        expected = "HELLO, Sean!!!";
        assertEquals(loud.greet("Sean"), expected);


    }
}

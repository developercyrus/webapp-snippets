package springmvc.hello.world.controller;

import static org.junit.Assert.assertEquals;

import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;


public class HelloControllerIT {
	@Test
    public void test() throws Exception {
		Document doc = Jsoup.parse(new URL("http://localhost:8080/webapp-snippets/springmvc-hello-world.do"), 60000);
        Elements elements = doc.select("h1");
        Element e = elements.get(0);

        String expected = "Message : Spring 3 MVC Hello World!";
        String actual = e.text();
        System.out.println(e.text());
        assertEquals(actual, expected);
	}
	
}

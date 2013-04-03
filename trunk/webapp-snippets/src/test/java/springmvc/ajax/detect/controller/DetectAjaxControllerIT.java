package springmvc.ajax.detect.controller;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlButton;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlSpan;

public class DetectAjaxControllerIT {

	@Test
	public void test1() throws MalformedURLException, IOException {
		Document doc = Jsoup.parse(new URL("http://localhost:8080/webapp-snippets/springmvc-ajax-detect.do"), 60000);
        Elements elements = doc.select("b");
        Element e = elements.get(0);

        String expected = "false";
        String actual = e.text();
        assertEquals(actual, expected);
	}
	
	@Test
	public void test2() throws FailingHttpStatusCodeException, MalformedURLException, IOException, InterruptedException {
		String url = "http://localhost:8080/webapp-snippets/jquery/ajaxDetect.html";
        WebClient webClient = new WebClient(BrowserVersion.INTERNET_EXPLORER_9);
        HtmlPage page = (HtmlPage) webClient.getPage(url);
    
        HtmlButton button = (HtmlButton)page.getElementById("ajaxButton");
        button.click();
        
        Thread.sleep(1000);
        
        HtmlSpan result = (HtmlSpan)page.getElementById("result");
        String expected = "true";
        String actual = result.asText();
        System.out.println(actual);
        assertEquals(actual, expected);
	}
}

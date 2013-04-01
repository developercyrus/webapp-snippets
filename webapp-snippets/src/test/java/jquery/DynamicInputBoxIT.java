package jquery;

import java.io.IOException;
import java.net.MalformedURLException;
import java.security.GeneralSecurityException;

import org.junit.Test;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlButtonInput;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlTextInput;

public class DynamicInputBoxIT {

	@Test
	public void test() throws GeneralSecurityException, FailingHttpStatusCodeException, MalformedURLException, IOException {
		String url = "http://localhost:8080/webapp-snippets/jquery/dynamicInputBox.html";
        WebClient webClient = new WebClient(BrowserVersion.INTERNET_EXPLORER_9);
        HtmlPage page = (HtmlPage) webClient.getPage(url);
    
        HtmlTextInput textInput1 = (HtmlTextInput)page.getElementById("textbox1");
        if (textInput1 == null) {
        	System.out.println("textInput1 is null");
        }
        else {
        	System.out.println("textInput1 is not null");
        }
        
        HtmlButtonInput button = (HtmlButtonInput)page.getElementById("addButton");
        button.click();
        button.click();
        
        HtmlTextInput textInput2 = (HtmlTextInput)page.getElementById("textbox2");
        if (textInput2 == null) {
        	System.out.println("textInput2 is null");
        }
        else {
        	System.out.println("textInput2 is not null");
        }
        
        HtmlTextInput textInput3 = (HtmlTextInput)page.getElementById("textbox3");
        if (textInput3 == null) {
        	System.out.println("textInput3 is null");
        }
        else {
        	System.out.println("textInput3 is not null");
        }
	}
}

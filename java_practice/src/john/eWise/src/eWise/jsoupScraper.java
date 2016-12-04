package eWise;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class jsoupScraper 
{
	public static void main (String args[])
	{
		Document doc;
		try{
			doc = Jsoup.connect("https://www.google.com.ph/?gfe_rd=cr&ei=yaXVV4CAGION2AT9q5OICQ#q=Silence+of+the+lambs")
					.userAgent("Mozilla").ignoreHttpErrors(true).timeout(0).get();
			Elements links = doc.select("a");
			int count = 0;
			for (Element link : links) {
				/*(Elements titles = link.select("h3[class=r]");
				String title = titles.text();

				Elements bodies = link.select("a[href]");
				String body = bodies.text();

				//System.out.println("Title: "+title);*/
				if(count < 10) {
					System.out.println(link.attr("href"));
					count++;
				} else
					break;

			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
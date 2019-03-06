package scrapy;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
public class Crawl {
	public static void getCurrencyRate() throws IOException{
		String URL = "https://search.shopping.naver.com/search/all.nhn?query=%EC%82%AC%EA%B3%BC&frm=NVSCPRO" 
				     + "?p=";
		Document doc = Jsoup.connect(URL).get();
		Elements elem = doc.select("ul.snb_list");
		String str = elem.text();
		System.out.println(str);


	}
	public static void main(String[] args) {
		try {
			getCurrencyRate();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}



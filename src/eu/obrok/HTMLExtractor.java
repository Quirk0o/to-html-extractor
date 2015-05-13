package eu.obrok;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class HTMLExtractor {

    private String url;
    private ISelector selector;

    public HTMLExtractor(String url, ISelector selector) {
        this.url = url;
        this.selector = selector;
    }

    public Elements extract() throws IOException {

        Document doc = Jsoup.connect(url).get();

        return selector.filter(doc.getAllElements());
    }
}

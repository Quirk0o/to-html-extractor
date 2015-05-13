package eu.obrok;

import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        ISelector selector = new AndSelector(new TagSelector("img"), new ClassSelector("demot"));
        HTMLExtractor extractor = new HTMLExtractor("http://demotywatory.pl", selector);

        try {
            Elements elements = extractor.extract();

            System.out.println(elements);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package eu.obrok;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public interface ISelector {

    public Elements filter(Elements elements);
}
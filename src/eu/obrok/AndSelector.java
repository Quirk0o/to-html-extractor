package eu.obrok;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class AndSelector implements ISelector {

    private ISelector s1;
    private ISelector s2;

    public AndSelector(ISelector s1, ISelector s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    @Override
    public Elements filter(Elements elements) {

        return s1.filter(s2.filter(elements));
    }
}

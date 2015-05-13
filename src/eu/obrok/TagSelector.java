package eu.obrok;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class TagSelector implements ISelector
{
    private String tag;

    public TagSelector(String tag) {
        this.tag = tag;
    }

    @Override
    public Elements filter(Elements elements) {

        Elements filtered = new Elements();

        for (Element element: elements) {
            if (element.tagName().equals(tag))
                filtered.add(element);
        }

        return filtered;
    }
}

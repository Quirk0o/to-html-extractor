package eu.obrok;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ClassSelector implements ISelector {

    private String className;

    public ClassSelector(String className) {
        this.className = className;
    }

    @Override
    public Elements filter(Elements elements) {

        Elements filtered = new Elements();

        for (Element element : elements) {
            if (element.hasClass(className))
                filtered.add(element);
        }

        return filtered;
    }
}

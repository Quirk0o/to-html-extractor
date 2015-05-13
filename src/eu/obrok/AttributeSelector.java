package eu.obrok;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class AttributeSelector implements ISelector {

    private String attr;
    private String value;

    @Override
    public Elements filter(Elements elements) {

        Elements filtered = new Elements();

        for (Element element : elements) {

            if (element.hasAttr(attr)) {
                String value = element.attr(attr);

                if(value.contains(this.value))
                    filtered.add(element);
            }
        }

        return filtered;
    }
}

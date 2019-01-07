package lab7.json;

import lab7.Element;

import java.io.IOException;
import java.util.HashMap;

public interface Builder {

    Element getResult();
    void build() throws IOException;

    Element buildSection(HashMap<String, Object> map);
    Element buildParagraph(HashMap<String, Object> map);
    Element buildImage(HashMap<String, Object> map);
    Element buildImageProxy(HashMap<String, Object> map);
    Element buildTable(HashMap<String, Object> map);
}

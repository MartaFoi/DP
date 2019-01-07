package lab7.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import lab7.Element;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class JsonBuilder implements Builder {

    String filename;

    public JsonBuilder(String filename) {
        this.filename = filename;
    }

    @Override
    public Element getResult() {
        return null;
    }

    @Override
    public void build() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        HashMap<String, Object> map = mapper.readValue(new File(filename), HashMap.class);
    }

    @Override
    public Element buildSection(HashMap<String, Object> map) {
        return null;
    }

    @Override
    public Element buildParagraph(HashMap<String, Object> map) {
        return null;
    }

    @Override
    public Element buildImage(HashMap<String, Object> map) {
        return null;
    }

    @Override
    public Element buildImageProxy(HashMap<String, Object> map) {
        return null;
    }

    @Override
    public Element buildTable(HashMap<String, Object> map) {
        return null;
    }
}

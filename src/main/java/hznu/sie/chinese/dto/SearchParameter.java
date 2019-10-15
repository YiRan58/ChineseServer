package hznu.sie.chinese.dto;

public class SearchParameter {
    private Integer current;
    private Integer size;
    private String grammarPointId;
    private String value;
    private String example;

    public Integer getCurrent() {
        return current;
    }

    public void setCurrent(Integer current) {
        this.current = current;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getGrammarPointId() {
        return grammarPointId;
    }

    public void setGrammarPointId(String grammarPointId) {
        this.grammarPointId = grammarPointId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }
}

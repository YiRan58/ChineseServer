package hznu.sie.chinese.dto;

public class GrammarPoint {
    private String grammarPointId;
    private String grammarPointName;
    private String value;

    public String getGrammarPointId() {
        return grammarPointId;
    }

    public void setGrammarPointId(String grammarPointId) {
        this.grammarPointId = grammarPointId;
    }

    public String getGrammarPointName() {
        return grammarPointName;
    }

    public void setGrammarPointName(String grammarPointName) {
        this.grammarPointName = grammarPointName;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("GrammarPoint{");
        sb.append("grammarPointId='").append(grammarPointId).append('\'');
        sb.append(", grammarPointName='").append(grammarPointName).append('\'');
        sb.append(", value='").append(value).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

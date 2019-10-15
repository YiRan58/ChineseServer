package hznu.sie.chinese.module.sys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author yiran
 * @since 2019-10-14
 */
public class Grammar implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String grammarPointId;

    private String grammarPointName;

    private String type;

    private String dimension;

    private String value;

    private String content;

    private String revise;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getRevise() {
        return revise;
    }

    public void setRevise(String revise) {
        this.revise = revise;
    }

    @Override
    public String toString() {
        return "Grammar{" +
        "id=" + id +
        ", grammarPointId=" + grammarPointId +
        ", grammarPointName=" + grammarPointName +
        ", type=" + type +
        ", dimension=" + dimension +
        ", value=" + value +
        ", content=" + content +
        ", revise=" + revise +
        "}";
    }
}

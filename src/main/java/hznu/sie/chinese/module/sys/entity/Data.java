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
public class Data implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 序号
     */
    private String p;

    /**
     * 原生ID
     */
    private String idNum;

    /**
     * 语料
     */
    private String data;

    /**
     * 结构ID
     */
    private String structureId1;

    /**
     * 语义类别
     */
    private String value;

    /**
     * 结构ID
     */
    private String structureId2;

    /**
     * 典型形式
     */
    private String example;

    /**
     * 结构ID
     */
    private String structureId3;

    /**
     * 否定形式
     */
    private String negation;

    /**
     * 主语信息
     */
    private String subject;

    /**
     * 备注
     */
    private String comment;

    /**
     * 语义类别
     */
    private String source;


    public Integer getId() {
        return id;
    }

    public Data setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getP() {
        return p;
    }

    public Data setP(String p) {
        this.p = p;
        return this;
    }

    public String getIdNum() {
        return idNum;
    }

    public Data setIdNum(String idNum) {
        this.idNum = idNum;
        return this;
    }

    public String getData() {
        return data;
    }

    public Data setData(String data) {
        this.data = data;
        return this;
    }

    public String getStructureId1() {
        return structureId1;
    }

    public Data setStructureId1(String structureId1) {
        this.structureId1 = structureId1;
        return this;
    }

    public String getValue() {
        return value;
    }

    public Data setValue(String value) {
        this.value = value;
        return this;
    }

    public String getStructureId2() {
        return structureId2;
    }

    public Data setStructureId2(String structureId2) {
        this.structureId2 = structureId2;
        return this;
    }

    public String getExample() {
        return example;
    }

    public Data setExample(String example) {
        this.example = example;
        return this;
    }

    public String getStructureId3() {
        return structureId3;
    }

    public Data setStructureId3(String structureId3) {
        this.structureId3 = structureId3;
        return this;
    }

    public String getNegation() {
        return negation;
    }

    public Data setNegation(String negation) {
        this.negation = negation;
        return this;
    }

    public String getSubject() {
        return subject;
    }

    public Data setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public Data setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public String getSource() {
        return source;
    }

    public Data setSource(String source) {
        this.source = source;
        return this;
    }

    @Override
    public String toString() {
        return "Data{" +
        "id=" + id +
        ", p=" + p +
        ", idNum=" + idNum +
        ", data=" + data +
        ", structureId1=" + structureId1 +
        ", value=" + value +
        ", structureId2=" + structureId2 +
        ", example=" + example +
        ", structureId3=" + structureId3 +
        ", negation=" + negation +
        ", subject=" + subject +
        ", comment=" + comment +
        ", source=" + source +
        "}";
    }
}

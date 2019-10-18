package hznu.sie.chinese.module.sys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

public class Medium implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String data;
    private String level;
    private String author;
    private String title;

    public Integer getId() {
        return id;
    }

    public Medium setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getData() {
        return data;
    }

    public Medium setData(String data) {
        this.data = data;
        return this;
    }

    public String getLevel() {
        return level;
    }

    public Medium setLevel(String level) {
        this.level = level;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public Medium setAuthor(String author) {
        this.author = author;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Medium setTitle(String title) {
        this.title = title;
        return this;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Medium{");
        sb.append("id=").append(id);
        sb.append(", data='").append(data).append('\'');
        sb.append(", level='").append(level).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append('}');
        return sb.toString();
    }
}



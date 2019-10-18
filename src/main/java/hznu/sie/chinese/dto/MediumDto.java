package hznu.sie.chinese.dto;

public class MediumDto {
    private Integer current;
    private Integer size;
    private String title;
    private String level;

    public Integer getCurrent() {
        return current;
    }

    public MediumDto setCurrent(Integer current) {
        this.current = current;
        return this;
    }

    public Integer getSize() {
        return size;
    }

    public MediumDto setSize(Integer size) {
        this.size = size;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public MediumDto setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getLevel() {
        return level;
    }

    public MediumDto setLevel(String level) {
        this.level = level;
        return this;
    }
}

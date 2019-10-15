package hznu.sie.chinese.dto;

import hznu.sie.chinese.module.sys.entity.Grammar;

import java.util.List;

public class GramarInfoDto {
    private List<Grammar> s;
    private List<Grammar> t;

    public List<Grammar> getS() {
        return s;
    }

    public GramarInfoDto setS(List<Grammar> s) {
        this.s = s;
        return this;
    }

    public List<Grammar> getT() {
        return t;
    }

    public GramarInfoDto setT(List<Grammar> t) {
        this.t = t;
        return this;
    }
}

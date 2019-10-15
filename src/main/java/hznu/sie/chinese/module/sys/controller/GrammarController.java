package hznu.sie.chinese.module.sys.controller;


import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import hznu.sie.chinese.dto.GramarInfoDto;
import hznu.sie.chinese.dto.R;
import hznu.sie.chinese.module.sys.entity.Grammar;
import hznu.sie.chinese.module.sys.service.IGrammarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author yiran
 * @since 2019-10-14
 */
@CrossOrigin
@RestController
@RequestMapping("/grammar")
public class GrammarController {

    @Autowired
    IGrammarService grammarService;

    @GetMapping("/list")
    public R getList() {
        return R.ok(grammarService.getAll());
    }

    @GetMapping("/info/{id}")
    public R info(@PathVariable String id) {
        List<Grammar> infoByGrammar = grammarService.findInfoByGrammarId(id);
        List<Grammar> s = new ArrayList<>();
        List<Grammar> t = new ArrayList<>();
        for(Grammar grammar:infoByGrammar){
            if(StringUtils.isEmpty(grammar.getValue()))
                continue;
            if(grammar.getValue().toLowerCase().startsWith("s"))
                s.add(grammar);
            else if(grammar.getValue().toLowerCase().startsWith("t"))
                t.add(grammar);
        }

        GramarInfoDto gramarInfoDto = new GramarInfoDto();
        gramarInfoDto.setS(s).setT(t);
        return R.ok(gramarInfoDto);
    }

}


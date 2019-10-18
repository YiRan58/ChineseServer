package hznu.sie.chinese.module.sys.controller;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import hznu.sie.chinese.dto.MediumDto;
import hznu.sie.chinese.dto.R;
import hznu.sie.chinese.module.sys.entity.Medium;
import hznu.sie.chinese.module.sys.service.IMediumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Wrapper;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/medium")
public class MediumController {
    @Autowired
    IMediumService mediumService;

    @GetMapping("/title/{level}")
    public R getList(@PathVariable String level) {
        return R.ok(this.mediumService.getTitle(level));
    }

    @PostMapping("/data")
    public R getData(@RequestBody MediumDto mediumDto) {
       return R.ok(this.mediumService.page(new Page<>(mediumDto.getCurrent(), 1),
               Wrappers.<Medium>lambdaQuery()
                       .eq(StringUtils.isNotEmpty(mediumDto.getTitle()),Medium::getTitle, mediumDto.getTitle())
                       .eq(Medium::getLevel, mediumDto.getLevel())));
    }

}

package hznu.sie.chinese.module.sys.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import hznu.sie.chinese.dto.GrammarPoint;
import hznu.sie.chinese.dto.R;
import hznu.sie.chinese.dto.SearchParameter;
import hznu.sie.chinese.module.sys.entity.Data;
import hznu.sie.chinese.module.sys.service.IDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
@RequestMapping("/data")
public class DataController {

    @Autowired
    IDataService dataService;


    @PostMapping("/list")
    public R list(@RequestBody SearchParameter searchParameter) {

        Data data = new Data().setStructureId1(searchParameter.getGrammarPointId())
                .setValue(searchParameter.getValue())
                .setExample(searchParameter.getExample());

        return R.ok(dataService.findAll(new Page(searchParameter.getCurrent(), searchParameter.getSize())
                , data));
    }

}


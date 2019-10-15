package hznu.sie.chinese.module.sys.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import hznu.sie.chinese.dto.GrammarPoint;
import hznu.sie.chinese.module.sys.entity.Data;
import hznu.sie.chinese.module.sys.mapper.DataMapper;
import hznu.sie.chinese.module.sys.service.IDataService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author yiran
 * @since 2019-10-14
 */
@Service
public class DataServiceImpl extends ServiceImpl<DataMapper, Data> implements IDataService {

    @Override
    public IPage findAll(Page page, Data data) {
        return this.baseMapper.getAll(page, Wrappers.<Data>lambdaQuery()
                .eq(Data::getStructureId1, data.getStructureId1())
                .and(StringUtils.isNotEmpty(data.getValue())&&StringUtils.isNotEmpty(data.getExample()),obj1 -> obj1.eq(StringUtils.isNotEmpty(data.getValue()), Data::getValue, data.getValue())
                                .eq(StringUtils.isNotEmpty(data.getExample()), Data::getExample, data.getExample())
                        //.or(obj2->obj2.eq(Data::getNegation, data.getValue()))
                        //.or(obj2->obj2.eq(Data::getSubject, data.getValue())
                ));
    }
}

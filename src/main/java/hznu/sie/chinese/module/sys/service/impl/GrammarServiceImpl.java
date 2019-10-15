package hznu.sie.chinese.module.sys.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import hznu.sie.chinese.dto.GrammarPoint;
import hznu.sie.chinese.module.sys.entity.Grammar;
import hznu.sie.chinese.module.sys.mapper.GrammarMapper;
import hznu.sie.chinese.module.sys.service.IGrammarService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.sql.Wrapper;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yiran
 * @since 2019-10-14
 */
@Service
public class GrammarServiceImpl extends ServiceImpl<GrammarMapper, Grammar> implements IGrammarService {

    @Override
    public List getAll() {
        return this.baseMapper.getAll();
    }

    @Override
    public List findInfoByGrammarId(String id) {
        return this.list(Wrappers.<Grammar>lambdaQuery().eq(Grammar::getGrammarPointId,id));
    }
}

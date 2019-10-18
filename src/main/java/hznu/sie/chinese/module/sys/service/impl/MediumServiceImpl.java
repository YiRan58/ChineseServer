package hznu.sie.chinese.module.sys.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import hznu.sie.chinese.module.sys.entity.Medium;
import hznu.sie.chinese.module.sys.mapper.MediumMapper;
import hznu.sie.chinese.module.sys.service.IMediumService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MediumServiceImpl extends ServiceImpl<MediumMapper, Medium> implements IMediumService {
    @Override
    public List<String> getTitle(String level) {
        return this.baseMapper.getAllTitle(Wrappers.<Medium>lambdaQuery().eq(Medium::getLevel,level));
    }
}

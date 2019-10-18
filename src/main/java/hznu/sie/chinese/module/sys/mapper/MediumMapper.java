package hznu.sie.chinese.module.sys.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import hznu.sie.chinese.module.sys.entity.Medium;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MediumMapper extends BaseMapper<Medium> {
    @Select("select distinct title from medium ${ew.customSqlSegment}")
    List<String> getAllTitle(@Param(Constants.WRAPPER) Wrapper wrapper);
}

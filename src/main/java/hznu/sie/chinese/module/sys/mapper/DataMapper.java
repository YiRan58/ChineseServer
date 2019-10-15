package hznu.sie.chinese.module.sys.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import hznu.sie.chinese.module.sys.entity.Data;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author yiran
 * @since 2019-10-14
 */
public interface DataMapper extends BaseMapper<Data> {

    @Select("select * from data ${ew.customSqlSegment}")
    Page<Data> getAll(Page page, @Param(Constants.WRAPPER) Wrapper wrapper);
}

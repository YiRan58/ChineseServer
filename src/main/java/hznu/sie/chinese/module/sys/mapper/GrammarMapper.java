package hznu.sie.chinese.module.sys.mapper;

import hznu.sie.chinese.dto.GrammarPoint;
import hznu.sie.chinese.module.sys.entity.Grammar;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author yiran
 * @since 2019-10-14
 */
public interface GrammarMapper extends BaseMapper<Grammar> {
    @Select("select distinct grammar_point_id grammarPointId, grammar_point_name grammarPointName from grammar" )
    List<GrammarPoint> getAll();

}

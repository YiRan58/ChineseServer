package hznu.sie.chinese.module.sys.service;

import hznu.sie.chinese.module.sys.entity.Grammar;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yiran
 * @since 2019-10-14
 */
public interface IGrammarService extends IService<Grammar> {

    List getAll();

    List<Grammar> findInfoByGrammarId(String id);

}

package hznu.sie.chinese.module.sys.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import hznu.sie.chinese.dto.GrammarPoint;
import hznu.sie.chinese.module.sys.entity.Data;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yiran
 * @since 2019-10-14
 */
public interface IDataService extends IService<Data> {
    IPage findAll(Page page, Data data);
}

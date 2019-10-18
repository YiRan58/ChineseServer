package hznu.sie.chinese.module.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import hznu.sie.chinese.module.sys.entity.Medium;

import java.util.List;

public interface IMediumService extends IService<Medium> {

    List<String> getTitle(String level);
}

package hznu.sie.chinese;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@MapperScan("hznu.sie.chinese.module.sys.mapper")
@SpringBootApplication
public class ChineseApplication {

    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }


    public static void main(String[] args) {
        SpringApplication.run(ChineseApplication.class, args);
    }

}

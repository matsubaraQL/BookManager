package jp.team.study.book.manage.rdb;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * SpringBoot起動クラスです。
 *
 * @author uratamanabu
 * @version 1.0
 * @since 1.0
 */
@SpringBootApplication
@EnableAutoConfiguration
//@Import({SpringDataRestConfiguration.class})
@EnableSwagger2
public class RdbApp extends SpringBootServletInitializer {

    /**
     * SpringBoot起動methodです。
     *
     * @param args 起動引数
     * @author uratamanabu
     * @since 1.0
     */
    public static void main(final String[] args) {
        new SpringApplicationBuilder(RdbApp.class).run(args);
    }

    @Override
    protected SpringApplicationBuilder configure(final SpringApplicationBuilder builder) {
        return builder.sources(RdbApp.class);
    }
}

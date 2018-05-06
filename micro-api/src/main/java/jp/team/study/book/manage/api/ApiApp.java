package jp.team.study.book.manage.api;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
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
@EntityScan(basePackageClasses = {ApiApp.class})
@EnableSwagger2
public class ApiApp extends SpringBootServletInitializer {

    /**
     * SpringBoot起動methodです。
     *
     * @param args 起動引数
     * @author uratamanabu
     * @since 1.0
     */
    public static void main(final String[] args) {
        new SpringApplicationBuilder(ApiApp.class).run(args);
    }

    @Override
    protected SpringApplicationBuilder configure(final SpringApplicationBuilder builder) {
        return builder.sources(ApiApp.class);
    }

}

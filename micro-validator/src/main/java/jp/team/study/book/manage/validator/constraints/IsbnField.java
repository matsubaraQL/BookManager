package jp.team.study.book.manage.validator.constraints;

import org.hibernate.validator.constraints.Length;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;
import javax.validation.constraints.Pattern;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.PARAMETER, ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = {})
@ReportAsSingleViolation
@Length(min = 13, max = 13)
@Pattern(regexp = "[0-9\\-]{9,16}[0-9X]")
public @interface IsbnField {

    String message() default "Isbn is invalid";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}

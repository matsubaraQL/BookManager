package jp.team.study.book.manage.validator.domain;

import jp.team.study.book.manage.validator.constraints.IsbnField;
import org.seasar.doma.Domain;

@Domain(valueType = String.class)
public class Isbn {

    @IsbnField
    private final String value;

    public Isbn(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}

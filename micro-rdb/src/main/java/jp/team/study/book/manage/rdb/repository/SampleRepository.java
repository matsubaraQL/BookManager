package jp.team.study.book.manage.rdb.repository;


import io.swagger.annotations.Api;
import jp.team.study.book.manage.rdb.domain.Sample;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author uratamanabu
 * @version 1.0
 * @since 1.0
 */
@Api
@RepositoryRestResource(path = "samples")
public interface SampleRepository extends CrudRepository<Sample, Long> {
}

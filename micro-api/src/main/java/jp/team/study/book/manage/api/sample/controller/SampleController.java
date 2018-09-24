package jp.team.study.book.manage.api.sample.controller;

import io.swagger.annotations.Api;
import jp.team.study.book.manage.rdb.domain.Sample;
import jp.team.study.book.manage.rdb.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author uratamanabu
 * @version 1.0
 * @since 1.0
 */
@RestController
@RequestMapping(
        value = {"/sample/"},
        produces = MediaType.APPLICATION_JSON_UTF8_VALUE
)
@Api(tags = {"Sampleです。"})
public class SampleController {

    @Autowired
    private SampleService service;

    @GetMapping(value = {"/all"})
    public ResponseEntity<List<Sample>> getGoods() {


        Stream<Sample> stream = service.getAll();

        return new ResponseEntity(stream.collect(Collectors.toList()), HttpStatus.OK);
    }

    @PostMapping(value = {"/"})
    public void createGoods(
            @Valid
            @RequestBody final Sample request) {


        service.insert(request);

    }
}

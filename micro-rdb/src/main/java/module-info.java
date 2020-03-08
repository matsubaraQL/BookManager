module micro.rdb.main {
    requires jackson.annotations;
    requires java.persistence;
    requires lombok;
    requires spring.beans;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires spring.data.commons;
    requires spring.data.jpa;
    requires spring.data.rest.core;
    requires spring.tx;
    exports jp.team.study.book.manage.rdb;
    exports jp.team.study.book.manage.rdb.domain;
    exports jp.team.study.book.manage.rdb.repository;
    exports jp.team.study.book.manage.rdb.service;
}
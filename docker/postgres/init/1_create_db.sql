create role pgtest login password 'pgtest';
create database pgtest;
grant all privileges on database pgtest to pgtest;
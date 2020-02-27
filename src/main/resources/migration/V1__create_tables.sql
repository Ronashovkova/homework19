create database dev_profiles_db;

create table accounts
(
  id         serial primary key,
  first_name text,
  last_name  text,
  city       text,
  gender     text,
  username   text NOT NULL
);

create table profiles_table
(
  id         serial primary key,
  username   text NOT NULL,
  job_title  text,
  department text,
  company    text,
  skill      text
);
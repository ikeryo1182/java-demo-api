DROP TABLE IF EXISTS person cascade;
DROP SEQUENCE IF EXISTS person_id_seq;

CREATE SEQUENCE id_seq;

CREATE TABLE person (
  id SERIAL PRIMARY KEY,
  name VARCHAR(16),
  age INT
);


INSERT INTO person VALUES
  (1,'demoA',19),
  (2,'demoB',24),
  (3,'demoC',14)
;
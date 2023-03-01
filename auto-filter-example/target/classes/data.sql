INSERT INTO person (person_region) VALUES ('AMERICA');
INSERT INTO person (person_region) VALUES ('EUROPE');
INSERT INTO person (person_region) VALUES ('AMERICA');
INSERT INTO person (person_region) VALUES ('OTHER');

INSERT INTO user (username, active, strikes, real_person_id) VALUES ('admin', true, 0, 1);
INSERT INTO user (username, active, strikes, real_person_id) VALUES ('root', true, 0, 2);
INSERT INTO user (username, active, strikes, real_person_id) VALUES ('admin_test', true, 2, 3);
INSERT INTO user (username, active, strikes, real_person_id) VALUES ('admin_prod', false, 4, 4);
INSERT INTO user (username, active, strikes) VALUES ('simple_user', false, 3);
--liquibase formatted sql

--changeset anton:20190221092200
INSERT INTO chief(id, name, surname, patronymic, birthdate) VALUES (1, '1','2','3','01.01.1984');
INSERT INTO chief(id, name, surname, patronymic, birthdate) VALUES (2, '1','2','3','01.01.1984');
INSERT INTO chief(id, name, surname, patronymic, birthdate) VALUES (3, '1','2','3','01.01.1984');
INSERT INTO chief(id, name, surname, patronymic, birthdate) VALUES (4, '1','2','3','01.01.1984');
INSERT INTO chief(id, name, surname, patronymic, birthdate) VALUES (5, '1','2','3','01.01.1984');

INSERT INTO organization(id, fullname, shortname, inn, ogrn, postal_address, legal_address, general_id) VALUES (1, '1','2','3','4','5','6', 1);
INSERT INTO organization(id, fullname, shortname, inn, ogrn, postal_address, legal_address, general_id) VALUES (2, '1','2','3','4','5','6', 2);
INSERT INTO organization(id, fullname, shortname, inn, ogrn, postal_address, legal_address, general_id) VALUES (3, '1','2','3','4','5','6', 3);
INSERT INTO organization(id, fullname, shortname, inn, ogrn, postal_address, legal_address, general_id) VALUES (4, '3','2','3','4','5','6', 4);
INSERT INTO organization(id, fullname, shortname, inn, ogrn, postal_address, legal_address, general_id) VALUES (5, '4','2','3','4','5','6', 5);
INSERT INTO organization(id, fullname, shortname, inn, ogrn, postal_address, legal_address, general_id) VALUES (6, '1','2','3','4','5','6', 1);
INSERT INTO organization(id, fullname, shortname, inn, ogrn, postal_address, legal_address, general_id) VALUES (7, '12','2','3','4','5','6', 2);
INSERT INTO organization(id, fullname, shortname, inn, ogrn, postal_address, legal_address, general_id) VALUES (8, '1','2','3','4','5','6', 3);
INSERT INTO organization(id, fullname, shortname, inn, ogrn, postal_address, legal_address, general_id) VALUES (9, '12','2','3','4','5','6', 4);
INSERT INTO organization(id, fullname, shortname, inn, ogrn, postal_address, legal_address, general_id) VALUES (10, '123','2','3','4','5','6', 5);
INSERT INTO organization(id, fullname, shortname, inn, ogrn, postal_address, legal_address, general_id) VALUES (11, '123','2','3','4','5','6', 1);
INSERT INTO organization(id, fullname, shortname, inn, ogrn, postal_address, legal_address, general_id) VALUES (12, '1','2','3','4','5','6', 2);
INSERT INTO organization(id, fullname, shortname, inn, ogrn, postal_address, legal_address, general_id) VALUES (13, '1','2','3','4','5','6', 3);
INSERT INTO organization(id, fullname, shortname, inn, ogrn, postal_address, legal_address, general_id) VALUES (14, '1','2','3','4','5','6', 4);
INSERT INTO organization(id, fullname, shortname, inn, ogrn, postal_address, legal_address, general_id) VALUES (15, '1','2','3','4','5','6', 5);

INSERT INTO branch_office(id, name, postal_address, director_id, organization_id) VALUES(1, '1', '2', 1, 1);
INSERT INTO branch_office(id, name, postal_address, director_id, organization_id) VALUES(2, '1', '2', 1, 2);
INSERT INTO branch_office(id, name, postal_address, director_id, organization_id) VALUES(3, '1', '2', 1, 3);
INSERT INTO branch_office(id, name, postal_address, director_id, organization_id) VALUES(4, '1', '2', 1, 4);
INSERT INTO branch_office(id, name, postal_address, director_id, organization_id) VALUES(5, '1', '2', 1, 5);
INSERT INTO branch_office(id, name, postal_address, director_id, organization_id) VALUES(6, '1', '2', 1, 6);
INSERT INTO branch_office(id, name, postal_address, director_id, organization_id) VALUES(7, '1', '2', 1, 7);
INSERT INTO branch_office(id, name, postal_address, director_id, organization_id) VALUES(8, '1', '2', 1, 8);
INSERT INTO branch_office(id, name, postal_address, director_id, organization_id) VALUES(9, '1', '2', 1, 9);
INSERT INTO branch_office(id, name, postal_address, director_id, organization_id) VALUES(10, '1', '2', 1, 10);
INSERT INTO branch_office(id, name, postal_address, director_id, organization_id) VALUES(11, '1', '2', 1, 1);
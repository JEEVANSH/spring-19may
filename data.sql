/*
create table person
(
   id integer not null,
   name varchar(255) not null,
   location varchar(255),
   birth_date timestamp,
   primary key(id)
);
*/
 
INSERT INTO Person (ID, NAME, LOCATION, BIRTH_DATE ) 
VALUES(10001,  'Jeevan', 'Chikkamagalur',sysdate());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE ) 
VALUES(10002,  'Ganesh', 'Shivamogga',sysdate());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE ) 
VALUES(10003,  'Mallikarjun', 'Dvangere',sysdate());

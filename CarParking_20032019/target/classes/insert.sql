

insert into car_owner (id, name, surname, age) values (1,'Marek','Mankowski',34);
insert into car_owner (id, name, surname, age) values (2,'Darek','Bogusz',18);
insert into car_owner (id, name, surname, age) values (3,'Wojtek','Barankiewicz',67);
insert into car_owner (id, name, surname, age) values (4,'Andrzej','Grabowski',45);


insert into car (id, registration_number, car_owner_id) values (7,'WB47382', 1);
insert into car (id, registration_number, car_owner_id) values (2, 'WOT3543',3);
insert into car (id, registration_number, car_owner_id) values (3, 'WG56432',2);
insert into car (id, registration_number, car_owner_id) values (4, 'WB34215',4);
insert into car (id, registration_number, car_owner_id) values (5, 'WW43423',4);
insert into car (id, registration_number, car_owner_id) values (6, 'WWL73823',2);


insert into parking_space (id, car_owner_id) values (1,1);
insert into parking_space (id, car_owner_id) values  (2, 3);
insert into parking_space (id, car_owner_id) values  (3, 2);
insert into parking_space (id, car_owner_id) values  (4, 4);
insert into parking_space (id, car_owner_id) values  (5, 4);
insert into parking_space (id, car_owner_id) values  (6, 2);
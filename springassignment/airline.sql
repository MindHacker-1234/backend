use airlinedb;


create table passenger(passengerid int not null primary key, passengername varchar(30), location varchar(30), DOB date);

create table booking(ticketid int not null primary key, ticketamount int, ticketstatus varchar(30),passengerid int, foreign key(passengerid) references passenger(passengerid));

create table airplaneroute(routeid int not null primary key, startpt varchar(30), endpt varchar(30), ticketid int, foreign key(ticketid) references booking(ticketid));

insert into passenger values(1, "karna", "hyderabad", "2003-10-05");

insert into booking values(1, 5000, "completed", 1);

insert into airplaneroute values(1, "hyderabad", "UK", 1);
select * from passenger;

delete from passenger where passengerid = "0";

select * from AirplaneRoute;
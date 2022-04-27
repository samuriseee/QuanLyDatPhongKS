create database Manager_Hotel
go
use Manager_Hotel
go

create table _Role(
	idRole varchar(30) primary key not null ,
	RoleName varchar(30) 
)

create table _User(
	UserId int primary key identity not null,
	idRole varchar(30) FOREIGN KEY REFERENCES _Role(idRole) default 'DFUser',
	FirstName varchar(30),
	lastName varchar(30),
	PhoneNumber varchar(11),
	email varchar(30),
	passwordd varchar(30)
)

create table Rooms(
	RoomNumber int primary key not null,
	RoomType varchar(30),
	Rates money,
	NumberOfBed int,
	Avainable bit
)

create table Reservation(
	ReservationNumber int identity primary key not null,
	CustomerId int FOREIGN KEY REFERENCES _User(UserId),
	RoomsNumber int FOREIGN KEY REFERENCES Rooms(RoomNumber),
	CheckInDate date,
	CheckOutDate date,
	NumberOfGuests int,
	ReservationDate date
)

create table Billing(
	BillingId int identity primary key not null,
	CustomerId int FOREIGN KEY REFERENCES _User(UserId),
	RoomCharge money,
	CreditCardNo bit ,
	PaymentDate date
)

alter table _User
	add constraint CK_Email check(email like '[a-z]%[A-Z]%@__%.__%'),
		constraint CK_Phone check (PhoneNumber like 
		'[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]' or PhoneNumber like
		'[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]')

insert into _Role values ('AdminUser' ,'Admin'),
						 ('DFUser' , 'NormalUser')

insert into _User (FirstName , lastName ,PhoneNumber ,email ,passwordd)
			values	 ('Java','swing','0898159582','javahehe@gmail.com','123456')

insert into _User (idRole , FirstName , lastName ,PhoneNumber ,email ,passwordd)
			values	 ('AdminUser' ,'Ko','Be','0895242612','adminHehe@gmail.com','123456')
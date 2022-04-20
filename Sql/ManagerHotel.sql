create database Manager_Hotel
go
use Manager_Hotel
go

create table Customer(
	CustomerId int primary key identity not null,
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
	NumberOfBed int
)

create table Reservation(
	ReservationNumber int identity primary key not null,
	CustomerId int FOREIGN KEY REFERENCES Customer(CustomerId),
	RoomsNumber int FOREIGN KEY REFERENCES Rooms(RoomNumber),
	CheckInDate date,
	CheckOutDate date,
	NumberOfGuests int,
	ReservationDate date
)

create table Billing(
	BillingId int identity primary key not null,
	CustomerId int FOREIGN KEY REFERENCES Customer(CustomerId),
	RoomCharge money,
	CreditCardNo bit ,
	PaymentDate date
)

alter table Customer
	add constraint CK_Email check(email like '[a-z]%[A-Z]%@__%.__%'),
		constraint CK_Phone check (PhoneNumber like 
		'[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]' or PhoneNumber like
		'[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]')

insert into Customer (FirstName , lastName ,PhoneNumber ,email ,passwordd)
			values	 ('Java','swing','0898159582','javahehe@gmail.com','123456')
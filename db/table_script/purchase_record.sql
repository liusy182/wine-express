drop table test.purchase_record;

create table test.purchase_record
(PurchaseRecordId varchar(64) not null PRIMARY KEY,
Email varchar(100),
PurchaseDate timestamp,
PurchaseProductName varchar(100)
);


insert test.purchase_record
values('1', 'yiyuan1@hotmail.com', '2014-01-01', 'test1'),
('2','yiyuan1@hotmail.com', '2014-01-02', 'test2'),
('3','yiyuan1@hotmail.com', '2014-01-03', 'test3');


select * from test.purchase_record;
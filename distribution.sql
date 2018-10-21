
create table consumer
(
  id         nvarchar(10) primary key not null, -- 消费者的唯一标识	主键
  name       nvarchar(10), -- 姓名
  gender     int, -- 性别
  user_group nvarchar(10), -- 用户组ID	外键
  password   nvarchar(10), -- 密码
  phone      nvarchar(20), -- 		联系电话
  date       datetime, -- 出生日期
  site       nvarchar(50), -- 		地址
  notes      nvarchar(50)-- 		备注
); -- 消费者
insert into consumer values
('DB10001','张三',1,'A1','123456','13582394231','1998-02-12','XX省XX市XX区XXX号','埃弗拉的经历'),
('DB10002','李四',1,'A1','123456','13582394231','1998-02-25','XX省XX市XX区XXX号','埃弗拉的经历'),
('DB10003','王五',0,'B3','123456','13532594231','1997-03-02','XX省XX市XX区XXX号','埃弗拉的经历'),
('DB10004','赵六',0,'B1','123456','13123594231','1998-07-23','XX省XX市XX区XXX号','埃弗拉的经历'),
('DB10005','田七',1,'C1','123456','13235623231','1998-01-33','XX省XX市XX区XXX号','埃弗拉的经历'),
('DB10006','王八',0,'A1','123456','13557342331','1998-12-12','XX省XX市XX区XXX号','埃弗拉的经历');

create table order_form
(
  order_id          varchar(10) primary key not null, -- 订单ID	主键
  order_type        int, -- 订单类型
  order_number      varchar(10), -- 交接单编号
  commodity_name    varchar(20), -- 货物名称
  cargo_weight      int, -- 货物重量
  mail_people       varchar(20), -- 邮寄人
  mail_address      varchar(50), -- 邮寄地址
  place_receipt     varchar(50), -- 收货地址
  order_state       int, -- 订单状态
  mail_people_phone varchar(20), -- 邮寄人电话
  consignee         varchar(20), -- 收货人
  consignee_number  varchar(20), -- 收货人电话
  origin_city       varchar(10), -- 起始城市
  midpoint_city     varchar(10), -- 中点城市
  destination_city  varchar(10), -- 终点城市
  ship_price   decimal(18, 0), -- 运送价格
  dispatching_price decimal(18, 0), -- 配送价格
  transport_price   decimal(18, 0), -- 运输价格
  total_price       varchar(10), -- 总价格
  vehicle           varchar(10), -- 车辆
  notes             varchar(50)    -- 备注
); -- 订单
insert into order_form values ('1001',001,'dfo3235','显示器',5,'张三','XX省XX市XX区XXX号','XX省XX市XX区XXX号',0,'15234932332','沃德龙','13642625424','广东','深圳','江西',3210,1000,250,4710,1,'快送'),
                              ('1002',002,'dflj323','手机',3,'李四','XX省XX市XX区XXX号','XX省XX市XX区XXX号',0,'15234932332','士大夫','13642625424','XX','XX','XX',2210,1000,250,4710,1,'快送'),
                              ('1003',003,'jlafjoi','按摩椅',1,'王五','XX省XX市XX区XXX号','XX省XX市XX区XXX号',0,'15234932332','李开复','13642625424','XX','XX','XX',32410,1000,250,34710,1,'快送'),
                              ('1004',004,'3542lkj','手机',5,'赵六','XX省XX市XX区XXX号','XX省XX市XX区XXX号',0,'15234932332','刘松','13642345424','XX','XX','XX',2310,1000,250,4710,1,'快送'),
                              ('1005',005,'58293jd','衣服',20,'田七','XX省XX市XX区XXX号','XX省XX市XX区XXX号',0,'15234932332','书法家','13642625424','XX','XX','XX',320,1000,250,710,1,'快送');
create table vehicle
(
  vehicle_id    varchar(10) primary key  not null, -- 车辆编号	主键
  vehicle_model varchar(10),
  origin        varchar(20), -- 产地
  route_number  varchar(10), -- 路线编号	外键
  date          datetime, -- 生产日期
  purchase_date datetime, -- 购买日期
  notes         varchar(50)      -- 备注
); -- 车辆
insert into vehicle values ('粤c54688','','广东','XXX路XXX线','2018-01-05','2018-01-10','慢');
create table city
(
  city_id     varchar(10) primary key  not null, --	城市ID	主键
  city_name   varchar(10), -- 城市名称
  province_id varchar(10)      -- 省份ID	外键

); -- 城市
create table city_region
(
  region_id   varchar(10) primary key  not null, --	区域ID	主键
  region_name varchar(50), --	区域名称
  city_id     varchar(50)    --	城市ID	外键

); -- 城市区域
create table admin
(
  admin_id   varchar(10) primary key  not null, -- 管理员编号	主键
  name       varchar(10), -- 姓名
  gender     int, -- 性别
  user_group int, -- 用户组编号	外键
  state      int, -- 状态
  city       varchar(10), -- 所在城市
  address    varchar(10), -- 地址
  password   varchar(10), -- 密码
  phone      varchar(20), -- 联系电话
  notes      varchar(50)-- 备注
); -- 管理员
create table connect_from
(
  origin_city      varchar(10) primary key  not null, -- 起点城市 	主键
  destination_city varchar(10), -- 终点城市
  arrive_city      varchar(10), -- 已到城市
  state            int, -- 状态
  date             datetime, -- 生成时间
  notes            varchar(50) -- 备注

); -- 交接单
create table line
(
  line_id                     varchar(10) primary key  not null, -- 路线编号      	主键
  line_name                   varchar(10), --	路线名称
  begin_province_number       varchar(10), --	起始省份编号	外键
  begin_city_number           varchar(10), --	起始城市编号	外键
  midpoint_province_number    varchar(10), --	中点省份编号	外键
  midpoint_city_number        varchar(10), --	中点城市编号	外键
  destination_province_number varchar(10), --	终点省份编号	外键
  destination_city_number     varchar(10), --	终点城市编号	外键
  ransport_price              decimal(18, 0), --	运输价格
  notes                       varchar(10)  --		备注

); -- 路线
create table dispatching
(
  d_id        int primary key not null, --	配送点ID 	主键
  d_name      varchar(10), -- 配送点名称
  province_id varchar(10), -- 省份ID	外键
  city_id     varchar(10), -- 城市ID	外键
  admin_id    varchar(10), -- 管理员ID	外键
  phone       varchar(20), -- 联系电话
  address     varchar(50), -- 地址
  notes       varchar(50) -- 备注
); -- 配送点
create table delivery_area
(
  da_id    int primary key  not null, --	配送区域ID	主键
  da_name  varchar(10), --		配送区域名称
  da_price decimal(18, 0), --		配送价格
  city     varchar(10), --		所属城市ID	外键
  notes    varchar(50)  --		备注
); -- 配送区域
create table province
(
  p_id   varchar(10) primary key  not null, --	身份ID	主键
  p_name varchar(10) --	名称

); -- 省份
create table user_group (
  ug_number varchar(10) primary key  not null, --		用户组编号	主键
  ug_name   varchar(10)              not null, --	用户组名称
  notes     varchar(50)  -- 备注
); -- 用户组
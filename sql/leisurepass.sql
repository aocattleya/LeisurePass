set names utf8;
set foreign_key_checks=0;

drop database if exists leisurepass;
create database if not exists leisurepass;

use leisurepass;

-- ユーザー
create table user_info(
id int primary key not null auto_increment comment "ID",
user_id varchar(16) unique not null comment "ユーザーID",
password varchar(16) not null comment "パスワード",
family_name varchar(32) not null comment "姓",
first_name varchar(32) not null comment "名",
family_name_kana varchar(32) not null comment "姓かな",
first_name_kana varchar(32) not null comment "名かな",
sex tinyint not null default 0 comment "姓別",
email varchar(32) not null comment "メールアドレス",
status tinyint not null default 0 comment "ステータス",
logined tinyint not null default 0 comment "ログインフラグ",
regist_date datetime not null comment "登録日",
update_date datetime not null comment "更新日"
)
default charset=utf8
comment="会員情報テーブル"
;
insert into user_info values
(1,"admin","admin","管理者","管理者","かんりしゃ","かんりしゃ",0,"admin@gmail.com",0,0,now(),now()),
(2,"admin2","admin2","管理者","管理者","かんりしゃ","かんりしゃ",0,"admin@gmail.com",0,0,now(),now()),
(3,"admin3","admin3","管理者","管理者","かんりしゃ","かんりしゃ",0,"admin@gmail.com",0,0,now(),now()),
(4,"admin4","admin4","管理者","管理者","かんりしゃ","かんりしゃ",0,"admin@gmail.com",0,0,now(),now()),
(5,"admin5","admin5","管理者","管理者","かんりしゃ","かんりしゃ",0,"admin@gmail.com",0,0,now(),now()),
(6,"admin6","admin6","管理者","管理者","かんりしゃ","かんりしゃ",0,"admin@gmail.com",0,0,now(),now()),
(7,"admin7","admin7","管理者","管理者","かんりしゃ","かんりしゃ",0,"admin@gmail.com",0,0,now(),now()),
(8,"admin8","admin8","管理者","管理者","かんりしゃ","かんりしゃ",0,"admin@gmail.com",0,0,now(),now()),
(9,"admin9","admin9","管理者","管理者","かんりしゃ","かんりしゃ",0,"admin@gmail.com",0,0,now(),now()),
(10,"admin10","admin10","管理者","管理者","かんりしゃ","かんりしゃ",0,"admin@gmail.com",0,0,now(),now()),
(11,"admin11","admin11","管理者","管理者","かんりしゃ","かんりしゃ",0,"admin@gmail.com",0,0,now(),now()),
(12,"admin12","admin12","管理者","管理者","かんりしゃ","かんりしゃ",0,"admin@gmail.com",0,0,now(),now()),
(13,"guest","guest","インターノウス","ゲストユーザー","いんたーのうす","げすとゆーざー",0,"guest@gmail.com",0,0,now(),now());

-- 商品
create table product_info(
id int primary key not null auto_increment comment "ID",
product_id int unique not null comment "商品ID",
product_name varchar(100) unique not null comment "商品名",
product_name_kana varchar(100) not null comment "商品名かな",
product_description varchar(255) not null comment "商品詳細",
category_id int not null not null comment "カテゴリID",
place_id int not null not null comment "場所ID",
price int comment "価格",
image_file_path varchar(100) comment "画像ファイルパス",
image_file_name varchar(50) comment "画像ファイル名",
release_date datetime not null comment "発売年月",
release_company varchar(50) comment "発売会社",
status tinyint not null default 0 comment "ステータス",
regist_date datetime not null comment "登録日",
update_date datetime comment "更新日",
foreign key(category_id) references m_category(category_id)
)
default charset=utf8
comment="商品情報テーブル"
;
insert into product_info value
( 1, 1, "動物園1","どうぶつえん1","動物園1の商品詳細", 2, 2, 300,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 2, 2, "動物園2","どうぶつえん2","動物園2の商品詳細", 2, 2, 300,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 3, 3, "動物園3","どうぶつえん3","動物園3の商品詳細", 2, 2, 300,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 4, 4, "動物園4","どうぶつえん4","動物園4の商品詳細", 2, 2, 100,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 5, 5, "動物園5","どうぶつえん5","動物園5の商品詳細", 2, 2, 200,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 6, 6, "動物園6","どうぶつえん6","動物園6の商品詳細", 2, 2, 300,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 7, 7, "動物園7","どうぶつえん7","動物園7の商品詳細", 2, 2, 100,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 8, 8, "動物園8","どうぶつえん8","動物園8の商品詳細", 2, 2, 200,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 9, 9, "動物園9","どうぶつえん9","動物園9の商品詳細", 2, 2, 300,"./images","sample.jpg",now(),"発売会社",0,now(),now());

-- カート
create table cart_info(
id int primary key not null auto_increment comment "ID",
user_id varchar(16) not null comment "ユーザーID",
temp_user_id varchar(16) comment "仮ユーザーID",
product_id int not null comment "商品ID",
product_count int not null comment "個数",
price int not null comment "金額",
regist_date datetime not null comment "登録日",
update_date datetime comment "更新日"
)
default charset=utf8
comment="カート情報テーブル"
;

-- 購入履歴
create table purchase_history_info(
id int primary key not null auto_increment comment "ID",
user_id varchar(16) not null comment "ユーザーID",
product_id int not null comment "商品ID",
product_count int not null comment "個数",
price int not null comment "金額",
destination_id int not null comment "宛先情報ID",
regist_date datetime not null comment "登録日",
update_date datetime not null comment "更新日",
foreign key(user_id) references user_info(user_id),
foreign key(product_id) references product_info(product_id)
)
default charset=utf8
comment="購入履歴情報テーブル"
;

-- 宛先
create table destination_info(
id int primary key not null auto_increment comment "ID",
user_id varchar(16) not null comment "ユーザーID",
family_name varchar(32) not null comment "姓",
first_name varchar(32) not null comment "名",
family_name_kana varchar(32) not null comment "姓かな",
first_name_kana varchar(32) not null comment "名かな",
email varchar(32) not null comment "メールアドレス",
tel_number varchar(13) not null comment "電話番号",
user_address varchar(50) not null comment "住所",
regist_date datetime not null comment "登録日",
update_date datetime not null comment "更新日"
)
default charset=utf8
comment="宛先情報テーブル"
;
insert into destination_info values
(1,"guest","インターノウス","テストユーざー","いんたーのうす","てすとゆーざー","guest@internous.co.jp","080-1234-5678","東京都千代田区三番町１ー１　ＫＹ三番町ビル１Ｆ",now(),"0000-00-00 00:00:00");

-- カテゴリ
create table m_category(
id int primary key not null comment "ID",
category_id int not null unique comment "カテゴリID",
category_name varchar(20) not null unique comment "カテゴリ名",
category_description varchar(100) comment "カテゴリ詳細",
insert_date datetime not null comment "登録日",
update_date datetime comment "更新日"
)
default charset=utf8
comment="カテゴリマスタテーブル"
;
insert into m_category values
(1,1,"全てのカテゴリー","動物園、水族館、アスレチック、遊園地、美術館全てのカテゴリーが対象となります",now(), null),
(2,2,"動物園","動物園に関するカテゴリーが対象となります",now(),null),
(3,3,"水族館","水族館に関するカテゴリーが対象となります",now(),null),
(4,4,"アスレチック","アスレチックに関するカテゴリーが対象となります",now(),null),
(5,5,"遊園地","遊園地に関するカテゴリーが対象となります",now(),null),
(6,6,"美術館","美術館に関するカテゴリーが対象となります",now(),null);

-- 場所
create table m_place(
id int primary key not null comment "ID",
place_id int not null unique comment "場所ID",
place_name varchar(20) not null unique comment "場所名",
insert_date datetime not null comment "登録日",
update_date datetime comment "更新日"
)
default charset=utf8
comment="場所マスタテーブル"
;
insert into m_place values
(1,1,"全て", now(), null),
(2,2,"茨城県", now(),null),
(3,3,"栃木県", now(),null),
(4,4,"群馬県", now(),null),
(5,5,"千葉県", now(),null),
(6,6,"埼玉県", now(),null),
(7,7,"東京都", now(),null),
(8,8,"神奈川県", now(),null);
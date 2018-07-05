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
(1,"guest","guest","インターノウス","ゲストユーザー","いんたーのうす","げすとゆーざー",0,"guest@gmail.com",0,0,now(),now());

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
insert into product_info values
( 1, 1, "那須アルパカ牧場","なすあるぱかぼくじょう","動物園1の商品詳細", 2, 2, 100,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 2, 2, "那須どうぶつ王国","なすどうぶつおうこく","動物園2の商品詳細", 3, 2, 200,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 3, 3, "動物園3","どうぶつえん3","動物園3の商品詳細", 4, 2, 300,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 4, 4, "動物園4","どうぶつえん4","動物園4の商品詳細", 5, 2, 100,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 5, 5, "動物園5","どうぶつえん5","動物園5の商品詳細", 2, 2, 200,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 6, 6, "動物園6","どうぶつえん6","動物園6の商品詳細", 3, 2, 300,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 7, 7, "動物園7","どうぶつえん7","動物園7の商品詳細", 4, 2, 100,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 8, 8, "動物園8","どうぶつえん8","動物園8の商品詳細", 5, 2, 200,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 9, 9, "動物園9","どうぶつえん9","動物園9の商品詳細", 2, 2, 300,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 10, 10, "動物園10","どうぶつえん10","動物園10の商品詳細", 2, 2, 100,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 11, 11, "動物園11","どうぶつえん11","動物園11の商品詳細", 2, 2, 200,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 12, 12, "動物園12","どうぶつえん12","動物園12の商品詳細", 2, 2, 300,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 13, 13, "動物園13","どうぶつえん13","動物園13の商品詳細", 2, 2, 100,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 14, 14, "動物園14","どうぶつえん14","動物園14の商品詳細", 2, 2, 200,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 15, 15, "動物園15","どうぶつえん15","動物園15の商品詳細", 2, 2, 300,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 16, 16, "動物園16","どうぶつえん16","動物園16の商品詳細", 2, 2, 100,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 17, 17, "動物園17","どうぶつえん17","動物園17の商品詳細", 2, 2, 200,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 18, 18, "動物園18","どうぶつえん18","動物園18の商品詳細", 2, 2, 300,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 19, 19, "動物園19","どうぶつえん19","動物園19の商品詳細", 2, 2, 100,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 20, 20, "動物園20","どうぶつえん20","動物園20の商品詳細", 2, 2, 200,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 21, 21, "水族館1","すいぞくかん1","水族館1の商品詳細", 2, 2, 100,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 22, 22, "水族館2","すいぞくかん2","水族館2の商品詳細", 2, 2, 200,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 23, 23, "水族館3","すいぞくかん3","水族館3の商品詳細", 2, 2, 300,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 24, 24, "水族館4","すいぞくかん4","水族館4の商品詳細", 2, 2, 100,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 25, 25, "水族館5","すいぞくかん5","水族館5の商品詳細", 2, 2, 200,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 26, 26, "水族館6","すいぞくかん6","水族館6の商品詳細", 2, 2, 300,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 27, 27, "水族館7","すいぞくかん7","水族館7の商品詳細", 2, 2, 100,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 28, 28, "水族館8","すいぞくかん8","水族館8の商品詳細", 2, 2, 200,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 29, 29, "水族館9","すいぞくかん9","水族館9の商品詳細", 2, 2, 300,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 30, 30, "水族館10","すいぞくかん10","水族館10の商品詳細", 2, 2, 100,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 31, 31, "水族館11","すいぞくかん11","水族館11の商品詳細", 2, 2, 200,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 32, 32, "水族館12","すいぞくかん12","水族館12の商品詳細", 2, 2, 300,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 33, 33, "水族館13","すいぞくかん13","水族館13の商品詳細", 2, 2, 100,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 34, 34, "水族館14","すいぞくかん14","水族館14の商品詳細", 2, 2, 200,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 35, 35, "水族館15","すいぞくかん15","水族館15の商品詳細", 2, 2, 300,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 36, 36, "水族館16","すいぞくかん16","水族館16の商品詳細", 2, 2, 100,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 37, 37, "水族館17","すいぞくかん17","水族館17の商品詳細", 2, 2, 200,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 38, 38, "水族館18","すいぞくかん18","水族館18の商品詳細", 2, 2, 300,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 39, 39, "水族館19","すいぞくかん19","水族館19の商品詳細", 2, 2, 100,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 40, 40, "水族館20","すいぞくかん20","水族館20の商品詳細", 2, 2, 200,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 51, 51, "アスレチックパーク1","あすれちっくぱーく1","アスレチックパーク1の商品詳細", 2, 2, 100,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 52, 52, "アスレチックパーク2","あすれちっくぱーく2","アスレチックパーク2の商品詳細", 2, 2, 200,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 53, 53, "アスレチックパーク3","あすれちっくぱーく3","アスレチックパーク3の商品詳細", 2, 2, 300,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 54, 54, "アスレチックパーク4","あすれちっくぱーく4","アスレチックパーク4の商品詳細", 2, 2, 100,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 55, 55, "アスレチックパーク5","あすれちっくぱーく5","アスレチックパーク5の商品詳細", 2, 2, 200,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 56, 56, "アスレチックパーク6","あすれちっくぱーく6","アスレチックパーク6の商品詳細", 2, 2, 300,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 57, 57, "アスレチックパーク7","あすれちっくぱーく7","アスレチックパーク7の商品詳細", 2, 2, 100,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 58, 58, "アスレチックパーク8","あすれちっくぱーく8","アスレチックパーク8の商品詳細", 2, 2, 200,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 59, 59, "アスレチックパーク9","あすれちっくぱーく9","アスレチックパーク9の商品詳細", 2, 2, 300,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 60, 60, "アスレチックパーク10","あすれちっくぱーく10","アスレチックパーク10の商品詳細", 2, 2, 100,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 61, 61, "アスレチックパーク11","あすれちっくぱーく11","アスレチックパーク11の商品詳細", 2, 2, 200,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 62, 62, "アスレチックパーク12","あすれちっくぱーく12","アスレチックパーク12の商品詳細", 2, 2, 300,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 63, 63, "アスレチックパーク13","あすれちっくぱーく13","アスレチックパーク13の商品詳細", 2, 2, 100,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 64, 64, "アスレチックパーク14","あすれちっくぱーく14","アスレチックパーク14の商品詳細", 2, 2, 200,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 65, 65, "アスレチックパーク15","あすれちっくぱーく15","アスレチックパーク15の商品詳細", 2, 2, 300,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 66, 66, "アスレチックパーク16","あすれちっくぱーく16","アスレチックパーク16の商品詳細", 2, 2, 100,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 67, 67, "アスレチックパーク17","あすれちっくぱーく17","アスレチックパーク17の商品詳細", 2, 2, 200,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 68, 68, "アスレチックパーク18","あすれちっくぱーく18","アスレチックパーク18の商品詳細", 2, 2, 300,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 69, 69, "アスレチックパーク19","あすれちっくぱーく19","アスレチックパーク19の商品詳細", 2, 2, 100,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 70, 70, "アスレチックパーク20","あすれちっくぱーく20","アスレチックパーク20の商品詳細", 2, 2, 200,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 81, 81, "遊園地1","ゆうえんち1","遊園地1の商品詳細", 2, 2, 100,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 82, 82, "遊園地2","ゆうえんち2","遊園地2の商品詳細", 2, 2, 200,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 83, 83, "遊園地3","ゆうえんち3","遊園地3の商品詳細", 2, 2, 300,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 84, 84, "遊園地4","ゆうえんち4","遊園地4の商品詳細", 2, 2, 100,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 85, 85, "遊園地5","ゆうえんち5","遊園地5の商品詳細", 2, 2, 200,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 86, 86, "遊園地6","ゆうえんち6","遊園地6の商品詳細", 2, 2, 300,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 87, 87, "遊園地7","ゆうえんち7","遊園地7の商品詳細", 2, 2, 100,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 88, 88, "遊園地8","ゆうえんち8","遊園地8の商品詳細", 2, 2, 200,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 89, 89, "遊園地9","ゆうえんち9","遊園地9の商品詳細", 2, 2, 300,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 90, 90, "遊園地10","ゆうえんち10","遊園地10の商品詳細", 2, 2, 100,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 91, 91, "遊園地11","ゆうえんち11","遊園地11の商品詳細", 2, 2, 200,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 92, 92, "遊園地12","ゆうえんち12","遊園地12の商品詳細", 2, 2, 300,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 93, 93, "遊園地13","ゆうえんち13","遊園地13の商品詳細", 2, 2, 100,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 94, 94, "遊園地14","ゆうえんち14","遊園地14の商品詳細", 2, 2, 200,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 95, 95, "遊園地15","ゆうえんち15","遊園地15の商品詳細", 2, 2, 300,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 96, 96, "遊園地16","ゆうえんち16","遊園地16の商品詳細", 2, 2, 100,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 97, 97, "遊園地17","ゆうえんち17","遊園地17の商品詳細", 2, 2, 200,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 98, 98, "遊園地18","ゆうえんち18","遊園地18の商品詳細", 2, 2, 300,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 99, 99, "遊園地19","ゆうえんち19","遊園地19の商品詳細", 2, 2, 100,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 100, 100, "遊園地20","ゆうえんち20","遊園地20の商品詳細", 2, 2, 200,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 101, 101, "美術館・博物館1","びじゅつかん・はくぶつかん1","美術館・博物館1の商品詳細", 2, 2, 100,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 102, 102, "美術館・博物館2","びじゅつかん・はくぶつかん2","美術館・博物館2の商品詳細", 2, 2, 200,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 103, 103, "美術館・博物館3","びじゅつかん・はくぶつかん3","美術館・博物館3の商品詳細", 2, 2, 300,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 104, 104, "美術館・博物館4","びじゅつかん・はくぶつかん4","美術館・博物館4の商品詳細", 2, 2, 100,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 105, 105, "美術館・博物館5","びじゅつかん・はくぶつかん5","美術館・博物館5の商品詳細", 2, 2, 200,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 106, 106, "美術館・博物館6","びじゅつかん・はくぶつかん6","美術館・博物館6の商品詳細", 2, 2, 300,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 107, 107, "美術館・博物館7","びじゅつかん・はくぶつかん7","美術館・博物館7の商品詳細", 2, 2, 100,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 108, 108, "美術館・博物館8","びじゅつかん・はくぶつかん8","美術館・博物館8の商品詳細", 2, 2, 200,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 109, 109, "美術館・博物館9","びじゅつかん・はくぶつかん9","美術館・博物館9の商品詳細", 2, 2, 300,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 110, 110, "美術館・博物館10","びじゅつかん・はくぶつかん10","美術館・博物館10の商品詳細", 2, 2, 100,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 111, 111, "美術館・博物館11","びじゅつかん・はくぶつかん11","美術館・博物館11の商品詳細", 2, 2, 200,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 112, 112, "美術館・博物館12","びじゅつかん・はくぶつかん12","美術館・博物館12の商品詳細", 2, 2, 300,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 113, 113, "美術館・博物館13","びじゅつかん・はくぶつかん13","美術館・博物館13の商品詳細", 2, 2, 100,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 114, 114, "美術館・博物館14","びじゅつかん・はくぶつかん14","美術館・博物館14の商品詳細", 2, 2, 200,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 115, 115, "美術館・博物館15","びじゅつかん・はくぶつかん15","美術館・博物館15の商品詳細", 2, 2, 300,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 116, 116, "美術館・博物館16","びじゅつかん・はくぶつかん16","美術館・博物館16の商品詳細", 2, 2, 100,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 117, 117, "美術館・博物館17","びじゅつかん・はくぶつかん17","美術館・博物館17の商品詳細", 2, 2, 200,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 118, 118, "美術館・博物館18","びじゅつかん・はくぶつかん18","美術館・博物館18の商品詳細", 2, 2, 300,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 119, 119, "美術館・博物館19","びじゅつかん・はくぶつかん19","美術館・博物館19の商品詳細", 2, 2, 100,"./images","sample.jpg",now(),"発売会社",0,now(),now()),
( 120, 120, "美術館・博物館20","びじゅつかん・はくぶつかん20","美術館・博物館20の商品詳細", 2, 2, 200,"./images","sample.jpg",now(),"発売会社",0,now(),now());

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
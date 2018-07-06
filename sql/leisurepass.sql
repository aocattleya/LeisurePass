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

( 1, 1, "那須アルパカ牧場","なすあるぱかぼくじょう","動物園1の商品詳細", 2, 3, 800,"./images","sample.jpg",now(),"株式会社那須ビッグファーム",0,now(),now()),
( 2, 2, "那須どうぶつ王国","なすどうぶつおうこく","動物園2の商品詳細", 2, 3, 2400,"./images","sample.jpg",now(),"株式会 那須高原リゾート開発",0,now(),now()),
( 3, 3, "群馬サファリパーク","ぐんまさふぁりぱーく","動物園3の商品詳細", 2, 4, 2700,"./images","sample.jpg",now(),"株式会社群馬サファリ・ワールド",0,now(),now()),
( 4, 4, "ジャパンスネークセンター","じゃぱんすねーくせんたー","動物園4の商品詳細", 2, 4, 1000,"./images","sample.jpg",now(),"日本蛇族学術研究所",0,now(),now()),
( 5, 5, "東武動物公園","とうぶどうぶつこうえん","動物園5の商品詳細", 2, 6, 1700,"./images","sample.jpg",now(),"株式会社東武レジャー企画",0,now(),now()),
( 6, 6, "市原ぞうの国","いちはらぞうのくに","動物園6の商品詳細", 2, 5, 1800,"./images","sample.jpg",now(),"有限会社市原ぞうの国",0,now(),now()),
( 7, 7, "市川市動物園","いちかわしどうぶつえん","動物園7の商品詳細", 2, 5, 430,"./images","sample.jpg",now(),"市川市",0,now(),now()),
( 8, 8, "上野動物園","うえのどうぶつえん","動物園8の商品詳細", 2, 7, 600,"./images","sample.jpg",now(),"公益財団法人東京動物園協会",0,now(),now()),
( 9, 9, "よこはま動物園ズーラシア","よこはまどうぶつえんずーらしあ","動物園9の商品詳細", 2, 8, 800,"./images","sample.jpg",now(),"公益財団法人横浜市緑の協会",0,now(),now()),
( 10, 10, "金沢動物園","かなざわどうぶつえん","動物園9の商品詳細", 2, 8, 500,"./images","sample.jpg",now(),"公益財団法人横浜市緑の協会",0,now(),now()),


( 11, 11, "アクアワールド茨城県大洗水族館","あくあわーるどおおあらい","動物園1の商品詳細", 3, 2, 1850,"./images","sample.jpg",now(),"公益財団法人いばらき文化振興財団",0,now(),now()),
( 12, 12, "鴨川シーワールド","かもがわしーわーるど","動物園1の商品詳細", 3, 5,2800,"./images","sample.jpg",now(),"株式会社グランビスタ ホテル&リゾート",0,now(),now()),
( 13, 13, "サンシャイン水族館","さんしゃいんすいぞくかん","動物園1の商品詳細", 3, 7,2200,"./images","sample.jpg",now(),"株式会社サンシャインエンタプライズ",0,now(),now()),
( 14, 14, "３Dメルヘン水族館","3Dめるへんすいぞくかん","動物園1の商品詳細", 3, 2,1000,"./images","sample.jpg",now(),"有限会社相馬食品",0,now(),now()),
( 16, 16, "すみだ水族館","すみだすいぞくかん","動物園1の商品詳細", 3, 7,2050,"./images","sample.jpg",now(),"株式会社オリックス不動産",0,now(),now()),
( 17, 17, "しながわ水族館","しながわすいぞくかん","動物園1の商品詳細", 3, 7,1350,"./images","sample.jpg",now(),"株式会社サンシャインエンタプライズ",0,now(),now()),
( 18, 18, "八景島シーパラダイス","はっけいじましーぱらだいす","動物園1の商品詳細", 3, 8,3000,"./images","sample.jpg",now(),"株式会社横浜八景島",0,now(),now()),
( 19, 19, "京急油壺マリンパーク","けいきゅうあぶらつぼまりんぱーく","動物園1の商品詳細", 3, 8,1700,"./images","sample.jpg",now(),"株式会社京急油壺マリンパーク",0,now(),now()),
( 20, 20, "ヨコハマおもしろ水族館","よこはまおもしろすいぞくかん","動物園1の商品詳細", 3, 8,1400,"./images","sample.jpg",now(),"株式会社白龍館",0,now(),now()),
( 21, 21, "新江ノ島水族館","しんえのしますいぞくかん","動物園1の商品詳細", 3, 8,2100,"./images","sample.jpg",now(),"株式会社江の島ピーエフアイ",0,now(),now()),


( 22, 22, "ツインリンクもてぎ","ついんりんくもてぎ","動物園1の商品詳細", 4, 3, 3000,"./images","sample.jpg",now(),"株式会社モビリティランド",0,now(),now()),
( 23, 23, "スウィートグラスアドベンチャー","すうぃーとぐらすあどべんちゃー","動物園1の商品詳細", 4, 4,4600,"./images","sample.jpg",now(),"有限会社きたもっく",0,now(),now()),
( 24, 24, "フォレストアドベンチャー上野","ふぉれすとあどべんちゃーうえの","動物園1の商品詳細", 4, 4,2800,"./images","sample.jpg",now(),"株式会社フォレストアドベンチャー",0,now(),now()),
( 25, 25, "フォレストアドベンチャー秩父","ふぉれすとあどべんちゃーちちぶ","動物園1の商品詳細", 4, 6,3600,"./images","sample.jpg",now(),"株式会社フォレストアドベンチャー",0,now(),now()),
( 26, 26, "樹の上の冒険王国ターザニア","きのうえのぼうけんおうこくたーざにあ","動物園1の商品詳細", 4, 5,3800,"./images","sample.jpg",now(),"株式会社リソルホールディングス",0,now(),now()),
( 27, 27, "ふなばしアンデルセン公園","ふなばしあんでるせんこうえん","動物園1の商品詳細", 4, 5,900,"./images","sample.jpg",now(),"公益財団法人船橋市公園協会",0,now(),now()),
( 28, 28, "平和の森公園","へいわのもりこうえん","動物園1の商品詳細", 4, 7,360,"./images","sample.jpg",now(),"大田区役所",0,now(),now()),
( 29, 29, "相模湖プレジャーフォレスト","さがみこぷれじゃーふぉれすと","動物園1の商品詳細", 4, 8,1700,"./images","sample.jpg",now(),"株式会社相模湖リゾート",0,now(),now()),
( 30, 30, "森の空中あそび「パカブ」","もりのくうちゅうあそび「ぱかぶ」","動物園1の商品詳細", 4, 8,2500,"./images","sample.jpg",now(),"足柄グリーンサービス森林公園有限責任事業組合",0,now(),now()),


( 31, 31, "プレジャーガーデン","ぷれじゃーがーでん","動物園1の商品詳細", 5, 2, 3200,"./images","sample.jpg",now(),"株式会社常陸サンライズパーク",0,now(),now()),
( 32, 32, "那須ハイランドパーク","なすはいらんどぱーく","動物園1の商品詳細", 5, 3,5300,"./images","sample.jpg",now(),"株式会社藤和那須リゾート",0,now(),now()),
( 33, 33, "東京ディズニーランド","とうきょうでぃずにーらんど","動物園1の商品詳細", 5, 5,7400,"./images","sample.jpg",now(),"株式会社オリエンタルランド",0,now(),now()),
( 34, 34, "もりのゆうえんち","もりのゆうえんち","動物園1の商品詳細", 5, 5,2000,"./images","sample.jpg",now(),"株式会社泉陽興業",0,now(),now()),
( 35, 35, "東京ドームシティ","とうきょうどーむしてぃ","動物園1の商品詳細", 5, 7,3900,"./images","sample.jpg",now(),"株式会社東京ドーム",0,now(),now()),
( 36, 36, "サンリオピューロランド","さんりおぴゅーろらんど","動物園1の商品詳細", 5, 7,3800,"./images","sample.jpg",now(),"株式会社サンリオエンターテイメント",0,now(),now()),
( 37, 37, "東京ジョイポリス","とうきょうじょいぽりす","動物園1の商品詳細", 5, 7,4300,"./images","sample.jpg",now(),"株式会社CAセガジョイポリス",0,now(),now()),
( 38, 38, "としまえん","としまえん","動物園1の商品詳細", 5, 7,4200,"./images","sample.jpg",now(),"株式会社豊島園",0,now(),now()),
( 39, 39, "横浜コスモワールド","よこはまこすもわーるど","動物園1の商品詳細", 4, 8,2800,"./images","sample.jpg",now(),"株式会社泉陽興業",0,now(),now()),


( 40, 40, "藤城清治美術館","ふじしろせいじびじゅつかん","動物園1の商品詳細", 6, 3, 1600,"./images","sample.jpg",now(),"一般財団法人藤城清治美術館那須高原",0,now(),now()),
( 41, 41, "那須ステンドグラス美術館","なすはいらんどぱーく","動物園1の商品詳細", 6, 3,1300,"./images","sample.jpg",now(),"株式会社鈴屋",0,now(),now()),
( 42, 42, "所沢航空発祥記念館","ところざわこうくうはっしょうきねんかん","動物園1の商品詳細", 6, 6,820,"./images","sample.jpg",now(),"益財団法人埼玉県公園緑地協会",0,now(),now()),
( 43, 43, "松山庭園美術館","まつやまていえんびじゅつかん","動物園1の商品詳細", 6, 5,800,"./images","sample.jpg",now(),"公益財団法人花と緑の農芸財団",0,now(),now()),
( 44, 44, "デジタルアートミュージアム","でじたるあーとみゅーじあむ","動物園1の商品詳細", 6, 7,3200,"./images","sample.jpg",now(),"森ビル株式会社",0,now(),now()),
( 45, 45, "三鷹の森ジブリ美術館","みたかのもりじぶりみじゅつかん","動物園1の商品詳細", 6, 7,1000,"./images","sample.jpg",now(),"公益財団法人徳間記念アニメーション文化財団",0,now(),now()),
( 46, 46, "上野の森美術館","うえののもりびじゅつかん","動物園1の商品詳細", 6, 7,1600,"./images","sample.jpg",now(),"公益財団法人日本美術協会",0,now(),now()),
( 47, 47, "藤子・F・不二雄ミュージアム","ふじこ・えふ・ふじおみゅーじあむ","動物園1の商品詳細", 6, 8,1000,"./images","sample.jpg",now(),"株式会社藤子ミュージアム",0,now(),now()),
( 48, 48, "箱根彫刻の森美術館","はこねちょうこくのもりびじゅつかん","動物園1の商品詳細", 6, 8,1600,"./images","sample.jpg",now(),"公益財団法人彫刻の森芸術文化財団",0,now(),now());



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
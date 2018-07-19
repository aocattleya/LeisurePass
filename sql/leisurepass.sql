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
(1,"admin","admin","管理者","管理者","かんりしゃ","かんりしゃ",0,"admin@gmail.com",1,0,now(),now()),
(2,"admin2","admin2","管理者2","管理者2","かんりしゃ2","かんりしゃ2",0,"admin@gmail.com",1,0,now(),now()),
(3,"admin3","admin3","管理者3","管理者3","かんりしゃ3","かんりしゃ3",0,"admin@gmail.com",1,0,now(),now()),
(4,"admin4","admin4","管理者4","管理者4","かんりしゃ4","かんりしゃ4",0,"admin@gmail.com",1,0,now(),now()),
(5,"admin5","admin5","管理者5","管理者5","かんりしゃ5","かんりしゃ5",0,"admin@gmail.com",1,0,now(),now()),
(6,"admin6","admin6","管理者6","管理者6","かんりしゃ6","かんりしゃ6",0,"admin@gmail.com",1,0,now(),now()),
(7,"admin7","admin7","管理者7","管理者7","かんりしゃ7","かんりしゃ7",0,"admin@gmail.com",1,0,now(),now()),
(8,"admin8","admin8","管理者8","管理者8","かんりしゃ8","かんりしゃ8",0,"admin@gmail.com",1,0,now(),now()),
(9,"admin9","admin9","管理者9","管理者9","かんりしゃ9","かんりしゃ9",0,"admin@gmail.com",1,0,now(),now()),
(10,"admin10","admin10","管理者10","管理者10","かんりしゃ10","かんりしゃ10",0,"admin@gmail.om",1,0,now(),now()),
(11,"admin11","admin11","管理者11","管理者11","かんりしゃ11","かんりしゃ11",0,"admin@gmail.com",1,0,now(),now()),
(12,"admin12","admin12","管理者12","管理者12","かんりしゃ12","かんりしゃ12",0,"admin@gmail.com",1,0,now(),now()),
(13,"guest","guest","インターノウス","ゲストユーザー","いんたーのうす","げすとゆーざー",0,"guest@gmail.com",0,0,now(),now()),
(14,"guest2","guest2","インターノウス2","ゲストユーザー2","いんたーのうす2","げすとゆーざー2",0,"guest@gmail.com",0,0,now(),now()),
(15,"guest3","guest3","インターノウス3","ゲストユーザー3","いんたーのうす3","げすとゆーざー3",0,"guest@gmail.com",0,0,now(),now()),
(16,"guest4","guest4","インターノウス4","ゲストユーザー4","いんたーのうす4","げすとゆーざー4",0,"guest@gmail.com",0,0,now(),now()),
(17,"guest5","guest5","インターノウス5","ゲストユーザー5","いんたーのうす5","げすとゆーざー5",0,"guest@gmail.com",0,0,now(),now()),
(18,"guest6","guest6","インターノウス6","ゲストユーザー6","いんたーのうす6","げすとゆーざー6",0,"guest@gmail.com",0,0,now(),now()),
(19,"guest7","guest7","インターノウス7","ゲストユーザー7","いんたーのうす7","げすとゆーざー7",0,"guest@gmail.com",0,0,now(),now()),
(20,"guest8","guest8","インターノウス8","ゲストユーザー8","いんたーのうす8","げすとゆーざー8",0,"guest@gmail.com",0,0,now(),now()),
(21,"guest9","guest9","インターノウス9","ゲストユーザー9","いんたーのうす9","げすとゆーざー9",0,"guest@gmail.com",0,0,now(),now()),
(22,"guest10","guest10","インターノウス10","ゲストユーザー10","いんたーのうす10","げすとゆーざー10",0,"guest@gmail.com",0,0,now(),now()),
(23,"guest11","guest11","インターノウス11","ゲストユーザー11","いんたーのうす11","げすとゆーざー11",0,"guest@gmail.com",0,0,now(),now()),
(24,"guest12","guest12","インターノウス12","ゲストユーザー12","いんたーのうす12","げすとゆーざー12",0,"guest@gmail.com",0,0,now(),now());

-- 商品
create table product_info(
id int primary key not null auto_increment comment "ID",
product_id int unique not null comment "商品ID",
product_name varchar(100) unique not null comment "商品名",
product_name_kana varchar(100) not null comment "商品名かな",
product_description varchar(500) not null comment "商品詳細",
category_id int not null not null comment "カテゴリID",
place_id int not null not null comment "場所ID",
price int comment "価格",
image_file_path varchar(100) comment "画像ファイルパス",
image_file_name varchar(50) comment "画像ファイル名",
release_date datetime not null comment "発売年月",
release_company varchar(50) comment "発売会社",
location varchar(255) comment "所在地",
access varchar(255) comment "アクセス",
url varchar(255) comment "URL",
status tinyint not null default 0 comment "ステータス",
start_date datetime not null comment "開始日",
end_date datetime not null comment "終了日",
regist_date datetime not null comment "登録日",
update_date datetime comment "更新日",
foreign key(category_id) references m_category(category_id),
foreign key(place_id) references m_place(place_id)
)
default charset=utf8
comment="商品情報テーブル"
;
insert into product_info value

( 1, 1, "那須アルパカ牧場","なすあるぱかぼくじょう","日本100名山の那須岳（正式名称：茶臼岳）山麓の風光明媚な土地で、ゆったりと暮らすアルパカ達の牧歌的な情景を目にすることができます。", 2, 3, 800,"./images","nasu_alpaca_farm3.jpg",now(),"株式会社那須ビッグファーム","栃木県那須郡那須町大字大島1083","「黒磯駅」より 牧場まで約28km","http://www.nasubigfarm.com",0,cast('2019-01-01' as date),cast('2019-12-31' as date),now(),now()),
( 2, 2, "那須どうぶつ王国","なすどうぶつおうこく","驚きと感動を提供する那須どうぶつ王国では、動物たちによるショーやパフォーマンスを毎日開催、動物本来の能力や知能の高さを間近でご覧いただけます。", 2, 3, 2400,"./images","nasu_animal_kingdom3.jpg",now(),"株式会社那須高原リゾート開発","栃木県那須郡那須町大島1042-1","「那須高原SA」より15分","http://www.nasu-oukoku.com",0,cast('2018-03-01' as date),cast('2018-04-20' as date),now(),now()),
( 3, 3, "群馬サファリパーク","ぐんまさふぁりぱーく","「野生の王国」群馬サファリパークでは、ライオン、トラ、ゾウ、キリンといった、アフリカ動物放し飼いの中を車で探検できます。", 2, 4, 2700,"./images","gunma_safari_park.jpg",now(),"株式会社群馬サファリ・ワールド","群馬県富岡市岡本1番地","「高崎駅」よりタクシー40分","http://www.safari.co.jp",0,cast('2018-01-08' as date),cast('2018-03-31' as date),now(),now()),
( 4, 4, "ジャパンスネークセンター","じゃぱんすねーくせんたー","日本蛇族学術研究所が運営する、日本唯一のヘビのテーマパークです！携帯版、 飼育日記、ショップあります。", 2, 4, 1000,"./images","japan_snake_center.jpg",now(),"日本蛇族学術研究所","群馬県太田市藪塚3318","「藪塚駅」より徒歩10分","http://snake-center.com",0,cast('2018-05-01' as date),cast('2018-5-31' as date),now(),now()),
( 5, 5, "東武動物公園","とうぶどうぶつこうえん","遊園地、動物園、花と植物の広場が融合した埼玉県のハイブリッドレジャーランド東武 動物公園。夏はプール、冬にはイルミネーションも！ジェットコースターや親子で楽しめるアトラクション、動物園にはホワイトタイガーをはじめ約120種の動物たちが生息。", 2, 6, 1700,"./images","tobu_animal_park.jpg",now(),"株式会社東武レジャー企画","埼玉県白岡市爪田ヶ谷425番地","「東武動物公園西口」より徒歩5分","http://www.tobuzoo.com",0,cast('2018-06-01' as date),cast('2018-08-31' as date),now(),now()),
( 6, 6, "市原ぞうの国","いちはらぞうのくに","千葉県のほぼ中央に位置する市原ぞうの国は国内最多飼育数となるぞうさんたちとさまざまな動物たちが暮らしています。", 2, 5, 1800,"./images","ichihara_elephant_country.jpg",now(),"有限会社市原ぞうの国","千葉県市原市山小川937","「市原鶴舞バスターミナル」よりタクシー10分","http://www.zounokuni.com",0,cast('2018-08-01' as date),cast('2018-8-31' as date),now(),now()),
( 7, 7, "市川市動植物園","いちかわしどうしょくぶつえん","市川市動植物園は市川市の市立動物園。 1987年8月21日開園。 園内は、レッサーパンダなどを中心とした小動物を飼育している。", 2, 5, 430,"./images","ichikawa_city_zoo3.jpg",now(),"市川市","千葉県市川市大町284番１","「市川大野駅」より徒歩10分","http://www.city.ichikawa.lg.jp/zoo/",0,cast('2018-01-01' as date),cast('2018-06-30' as date),now(),now()),
( 8, 8, "上野動物園","うえのどうぶつえん","上野動物園は、東京の都心部にありながら自然とその景観を維持している都市型の動物園で、約350種2,500点の動物を飼育しています。", 2, 7, 600,"./images","ueno_zoo6.jpg",now(),"公益財団法人東京動物園協会","東京都台東区上野公園9-83","「上野駅」より徒歩5分","http://www.tokyo-zoo.net/zoo/ueno/",0,cast('2018-01-01' as date),cast('2018-12-31' as date),now(),now()),
( 9, 9, "よこはま動物園ズーラシア","よこはまどうぶつえんずーらしあ","「生命の共生・自然との調和」をメインテーマに掲げるよこはま動物園ズーラシア。 この「 ズーラシア(ZOORASIA)」という愛称は、動物園(ZOO)と広大な自然をイメージしたユーラシア(EURASIA)の合成語で、平成8年（1996年）秋に市民公募で選ばれました。", 2, 8, 800,"./images","yokohama_zoo.jpg",now(),"公益財団法人横浜市緑の協会","神奈川県横浜市旭区上白根町 横浜市旭区上白根町1175","「よこはま動物園行きバス」より15分","http://www.hama-midorinokyokai.or.jp/zoo/zoorasia/",0,cast('2018-01-01' as date),cast('2018-12-31' as date),now(),now()),
( 10, 10, "金沢動物園","かなざわどうぶつえん","金沢動物園は横浜市の南部に位置し、ハイキングコースで繋がる円海山・北鎌倉近郊緑地保全区域やいくつかの市民の森に囲まれた緑豊かな金沢自然公園内にあり、世界の希少草食動物を中心に飼育しています。", 2, 8, 500,"./images","kanazawa_zoo2.jpg",now(),"公益財団法人横浜市緑の協会","神奈川県横浜市金沢区釜利谷東5丁目15-1","「夏山坂上駅」より徒歩6分","http://www.hama-midorinokyokai.or.jp/zoo/kanazawa/",0,cast('2018-07-01' as date),cast('2018-12-31' as date),now(),now()),


( 11, 11, "アクアワールド茨城県大洗水族館","あくあわーるどおおあらい","日本一のサメの飼育数を誇り、マンボウやラッコなど約580種68000点の世界の海の生物に出会うことができる水族館です。", 3, 2, 1850,"./images","aqua_world_ibaraki.jpg",now(),"公益財団法人いばらき文化振興財団","茨城県東茨城郡大洗町磯浜町8252-3","「大洗駅」よりバス15分","http://www.aquaworld-oarai.com",0,cast('2018-09-01' as date),cast('2018-12-31' as date),now(),now()),
( 12, 12, "鴨川シーワールド","かもがわしーわーるど","東京・千葉の水族館テーマパーク「鴨川シーワールド」は、「海の世界との出会い」をコンセプトに1970年10月にオープンし、水生生物との出会いを通し、生命の大切さとふれあいのすばらしさを体感できます。", 3, 5,2800,"./images","kamogawa_sea_world.jpg",now(),"株式会社グランビスタ ホテル&リゾート"," 千葉県鴨川市東町1462-18","「東京駅 高速バス」より2時間","http://www.kamogawa-seaworld.jp",0,cast('2018-01-01' as date),cast('2018-12-31' as date),now(),now()),
( 13, 13, "サンシャイン水族館","さんしゃいんすいぞくかん","東京・池袋にあるサンシャイン水族館は、ビルの屋上に作られた都市型高層水族館です。館内は照明や空間の見せ方、各所に散りばめられた細やかな気配りにより、「癒し」「 安らぎ」「くつろぎ」「ココロ動かす、発見」を提供してくれる空間となっております。", 3, 7,2200,"./images","sunshine_aquarium.jpg",now(),"株式会社サンシャインエンタプライズ","東京都 豊島区東池袋3丁目1 ワールドインポートマートビル ","「東池袋駅」より徒歩3分","http://www.sunshinecity.co.jp/aquarium/",0,cast('2018-09-01' as date),cast('2018-12-31' as date),now(),now()),
( 14, 14, "さいたま水族館","さいたますいぞくかん","さいたま水族館では、86種類の魚が採捕されています。これらのうち、展示可能な約70種類を中心に展示し、その生態や特徴を解説しています。", 3, 6,310,"./images","saitama_aquarium3.jpg",now(),"羽生水郷公園管理事務所","埼玉県羽生市三田ケ谷751-1","「加須駅」よりタクシー15分","http://www.parks.or.jp/suizokukan/",0,cast('2018-03-01' as date),cast('2018-04-20' as date),now(),now()),
( 16, 16, "すみだ水族館","すみだすいぞくかん","いのちのゆりかご～水 そのはぐくみ～” をコンセプトに、都市にいながら「いきもののいのち」とそれをはぐくむ「水」を体感していただける水族館です。 ", 3, 7,2050,"./images","sumida_aquarium3.jpg",now(),"株式会社オリックス不動産","東京都墨田区押上1丁目1番2号 東京スカイツリータウン・ソラマチ5F・6F","「とうきょうスカイツリー駅」より徒歩5分","http://www.sumida-aquarium.com",0,cast('2018-01-01' as date),cast('2018-12-31' as date),now(),now()),
( 17, 17, "しながわ水族館","しながわすいぞくかん","水族館の飼育員が普段どのような仕事をしているのかを実際に体験できたり、飼育スタッフと一緒に魚のエサの準備をしてエサをあげることもできます。", 3, 7,1350,"./images","shinagawa_aquarium2.jpg",now(),"株式会社サンシャインエンタプライズ","東京都品川区勝島3-2-1","「大森海岸駅」より徒歩8分","http://www.aquarium.gr.jp",0,cast('2018-09-01' as date),cast('2018-09-30' as date),now(),now()),
( 18, 18, "八景島シーパラダイス","はっけいじましーぱらだいす","横浜・八景島シーパラダイスは、神奈川県横浜市金沢区八景島にある水族館・アトラクション・ショッピングモール・ホテル・マリーナなどで構成した複合型遊園地。", 3, 8,3000,"./images","shinagawa_aquarium3.jpg",now(),"株式会社横浜八景島","神奈川県 横浜市金沢区 八景島","「金沢八景駅」より徒歩10分","http://www.seaparadise.co.jp",0,cast('2018-04-01' as date),cast('2018-12-31' as date),now(),now()),
( 19, 19, "京急油壺マリンパーク","けいきゅうあぶらつぼまりんぱーく","京急油壺マリンパークは神奈川県三浦市にある水族館です。イルカ・アシカのパフォーマンス・ペンギン島・みうら自然館などの展示やイベント等見どころいっぱい！", 3, 8,1700,"./images","oil_marine_park.jpg",now(),"株式会社京急油壺マリンパーク","神奈川県三浦市三崎町小網代1082","「三崎口駅」よりバス15分","http://www.aburatsubo.co.jp",0,cast('2018-10-01' as date),cast('2018-12-31' as date),now(),now()),
( 20, 20, "ヨコハマおもしろ水族館","よこはまおもしろすいぞくかん","笑って学んで楽しめる！横浜中華街にある水族館。400種10000匹の面白く珍しい魚が集まっています。", 3, 8,1400,"./images","yokohama_funny_aquarium.JPG",now(),"株式会社白龍館","神奈川県 横浜市中区山下町144チャイナスクエアビル 3F","「石川町駅」より徒歩5分","http://www.omoshirosuizokukan.com",0,cast('2018-12-01' as date),cast('2018-12-31' as date),now(),now()),
( 21, 21, "新江ノ島水族館","しんえのしますいぞくかん","湘南・江の島にある新江ノ島水族館。関東では主な水族館の一つです。家族でのお出かけやデート、観光に。", 3, 8,2100,"./images","eno_island_aquarium.jpg",now(),"株式会社江の島ピーエフアイ"," 神奈川県藤沢市片瀬海岸2丁目19-1","「片瀬江ノ島駅」より徒歩3分","http://www.enosui.com",0,cast('2018-01-01' as date),cast('2018-12-31' as date),now(),now()),


( 22, 22, "ツインリンクもてぎ","ついんりんくもてぎ","森の中のモビリティテーマパーク ツインリンクもてぎは、大人も子供も、レースが好きな男性も山ガールも、たっぷり楽しめる！", 4, 3, 3000,"./images","twin_ring_motegi.jpg",now(),"株式会社モビリティランド","栃木県芳賀郡茂木町桧山120-1","「宇都宮駅」よりバス15分","http://www.twinring.jp",0,cast('2018-05-01' as date),cast('2018-12-31' as date),now(),now()),
( 23, 23, "スウィートグラスアドベンチャー","すうぃーとぐらすあどべんちゃー","ハーネスという命綱を装着し、自らの力で樹上世界を旅する冒険施設です。最高で、樹上10メートルの高さから飛び立つ緊張感と爽快感は、日常では味わえない感動・自信をもたらし、教育や企業研修のツールとしても利用されています。", 4, 4,4600,"./images","sweet_glass_adventure.jpg",now(),"有限会社きたもっく","群馬県吾妻郡長野原町 北軽井沢1990-4783","「草津温泉駅」よりバス1時間","http://ad.sweetgrass.jp",0,cast('2018-01-01' as date),cast('2018-12-31' as date),now(),now()),
( 24, 24, "フォレストアドベンチャー上野","ふぉれすとあどべんちゃーうえの","群馬県の最西南端の上野村（上信越自動車道下仁田ICより湯の沢トンネル経由で上野村まで35分）にある自然共生型アウトドアパーク。", 4, 4,2800,"./images","forest_adventure_ueno3.jpg",now(),"株式会社フォレストアドベンチャー","群馬県多野郡上野村勝山1169","「上信越自動車道下仁田IC」より車35分","http://fa-ueno.foret-aventure.jp",0,cast('2018-01-01' as date),cast('2018-12-31' as date),now(),now()),
( 25, 25, "フォレストアドベンチャー秩父","ふぉれすとあどべんちゃーちちぶ","秩父ミューズパーク内にあるフォレストアドベンチャー秩父は、国内最大級のアスレチック施設です。 秩父市街地からも近く、お子様(小学4年生以上もしくは身長140cm以上)の居る家族連れや、友達同士からカップルまで楽しめます。", 4, 6,3600,"./images","forest_adventure_chichibu3.jpg",now(),"株式会社フォレストアドベンチャー","埼玉県秩父市久那637-2","「スポーツの森」より徒歩1分","http://fa-chichibu.foret-aventure.jp",0,cast('2018-05-01' as date),cast('2018-05-31' as date),now(),now()),
( 26, 26, "樹の上の冒険王国ターザニア","きのうえのぼうけんおうこくたーざにあ","東京から60分、千葉県の「リソル生命の森」に誕生したレジャー施設。自然共生型アドベンチャースポーツ＆パーク。", 4, 5,3800,"./images","tarzania3.jpg",now(),"株式会社リソルホールディングス","千葉県長生郡長柄町味庄東台1067","「誉田駅」よりバス25分","http://www.tarzania.jp",0,cast('2018-01-01' as date),cast('2018-12-31' as date),now(),now()),
( 27, 27, "ふなばしアンデルセン公園","ふなばしあんでるせんこうえん","「ワンパク王国」・「メルヘンの丘」・「自然体験」・「子ども美術館」・「花の城」の5つのゾーンから成るふなばしアンデルセン公園。童話作家アンデルセンの育った風景をイメージした園内は、屋内外を問わず童話の世界に入り込んだような気持ちにさせてくれます。", 4, 5,900,"./images","funabashi_andersen_park.jpg",now(),"公益財団法人船橋市公園協会","千葉県 船橋市金堀町525","「船橋駅」よりバス30分","https://www.park-funabashi.or.jp/and/",0,cast('2018-01-01' as date),cast('2018-12-31' as date),now(),now()),
( 28, 28, "平和の森公園","へいわのもりこうえん","平和の森公園フィールドアスレチックは、環状七号線をはさんで広がる平和の森公園内の南側に位置します。 6500平方メートルの敷地には、区の歴史や史跡、地名にちなんだ40種類の遊具があり、楽しみながら区のことが学べます。", 4, 7,360,"./images","peace_forest_park3.jpg",now(),"大田区役所","東京都大田区平和の森公園2−2番1号","「平和島駅」より徒歩10分","https://www.city.ota.tokyo.jp/midokoro/spot/hot_news/top_athr.html",0,cast('2018-08-01' as date),cast('2018-08-31' as date),now(),now()),
( 29, 29, "相模湖プレジャーフォレスト","さがみこぷれじゃーふぉれすと","相模湖に隣接するアミューズメント施設「さがみ湖リゾート プレジャーフォレスト」。 45万坪の広大な敷地で、アウトドアや観覧車などのアトラクションを楽しむことができるスポットとして人気を集めている。", 4, 8,1700,"./images","sagamiko_pleasure_forest5.jpg",now(),"株式会社相模湖リゾート","神奈川県相模原市緑区若柳1634","「高尾山ＩＣ」より車20分","http://www.sagamiko-resort.jp",0,cast('2018-01-01' as date),cast('2018-12-31' as date),now(),now()),
( 30, 30, "森の空中あそび「パカブ」","もりのくうちゅうあそび「ぱかぶ」","広場で跳ねたり、空中サッカーをしたり、チューブを滑り降りたり、森に浮かぶ不思議な網。フランスの小さな島「グロワ島」生まれの空中アドベンチャーゾーン、パカブ。東名高速道路「大井松田IC」から、車でわずか約20分の「足柄森林公園 丸太の森」に誕生。", 4, 8,2500,"./images","parcabout.jpg",now(),"足柄グリーンサービス森林公園有限責任事業組合","神奈川県南足柄市広町1544","「大雄山駅」より車20分","http://parcabout.jp",0,cast('2018-01-01' as date),cast('2018-12-31' as date),now(),now()),


( 31, 31, "プレジャーガーデン","ぷれじゃーがーでん","お財布に優しい遊園地です。無料施設も完備しています。ネイチャーランドオムは国営ひたち海浜公園内にある遊園地です。園内には30種類近くの多彩なアトラクションや子供連れに嬉しい無料施設があります。アトラクションは絶叫系の乗り物をはじめ、幼児でも楽しめるようなものまで色々揃っています。メニュー豊富なレストランや子供に人気のクレープ屋さん、地元の名産を販売しているお土産屋さんもあります。他にもローズガーデン・中央フラワーガーデン・大草原フラワーガーデンといった綺麗なお花が楽しめるエリアや水遊び広場も完備しています。", 5, 2, 3200,"./images","pleasure_garden.jpg",now(),"株式会社常陸サンライズパーク","茨城県ひたちなか市阿字ヶ浦町552-18","「ひたち海浜公園IC」より車30分","http://pleasure.hitachikaihin.jp/",0,cast('2018-09-01' as date),cast('2018-12-31' as date),now(),now()),
( 32, 32, "那須ハイランドパーク","なすはいらんどぱーく","那須高原の大自然の中、絶叫系からお子様向けの10大コースターをはじめ、那須連山・関東平野を一望できるアトラクション等約40種が揃いその内の半数以上は小さなお子様でも楽しめる。また、園内を流れる自然の渓流では魚釣りや山野草も楽しめる他、源泉かけ流しの足湯などアウトドアエリアも充実しています。", 5, 3,5300,"./images","nasu_highland_park2.jpg",now(),"株式会社藤和那須リゾート","栃木県那須郡那須町高久乙3375","「東北自動車道 那須I.C」より20分","http://nasuhai.co.jp",0,cast('2018-01-01' as date),cast('2018-10-31' as date),now(),now()),
( 33, 33, "東京ディズニーランド","とうきょうでぃずにーらんど","1983年、日本で初めてのディズニーテーマパークとしてオープンした「東京ディズニーランド」は、冒険や童話、未来などをテーマに、7つのテーマランドから構成されています。ディズニー映画の世界を実際に体験できるように立体化されたパークでは、ゲストはアトラクションやエンターテイメントなどの体験を通して、ディズニーマジックによる非日常的な世界をお楽しみいただけます。", 5, 5,7400,"./images","disneyland3.jpg",now(),"株式会社オリエンタルランド","千葉県浦安市舞浜1-1","「舞浜駅」より徒歩3分","https://www.tokyodisneyresort.jp/tdl/",0,cast('2018-01-01' as date),cast('2018-12-31' as date),now(),now()),
( 34, 34, "もりのゆうえんち","もりのゆうえんち","西武園ゆうえんちでは夏休み期間を中心に、夕涼みイベントが開催されます。期間中は、11時に遊園地がオープンし、9時からプールが営業されるほか、びしょびしょ広場も予定されています。メリーゴーランド付近には、水遊び迷路やミストトンネルが設置され、無料で遊べるコーナーもあります。7月28日から8月12日の土日曜（計6日間）には、花火大会も行われる予定です。暑い夏の一日を涼みながら、たっぷりと満喫できます。", 5, 5,2000,"./images","forest_amusement_park.jpg",now(),"株式会社泉陽興業","埼玉県所沢市山口2964","「遊園地西駅」からすぐ","http://www.seibu-leisure.co.jp/",0,cast('2018-05-01' as date),cast('2018-05-31' as date),now(),now()),
( 35, 35, "東京ドームシティ","とうきょうどーむしてぃ","東京ドームシティ アトラクションズは、世界初のセンターレス観覧車ビッグ・オーが目印の「ラクーアゾーン」や「バイキングゾーン」、「パラシュートゾーン」、「ジオポリスゾーン」、「スプラッシュガーデンゾーン」、からなる都市型テーマパークです。後楽園ゆうえんちとしてオープンし、その後はリニューアルを繰り返しながら融合商業施設「ラクーア」のオープンに合わせて入場無料化、それと同時に現在の名称に変更。", 5, 7,3900,"./images","tokyo_dome_city2.jpeg",now(),"株式会社東京ドーム","東京都文京区後楽1-3-61","「水道橋駅」より徒歩5分","https://www.tokyo-dome.co.jp/",0,cast('2018-08-01' as date),cast('2018-12-31' as date),now(),now()),
( 36, 36, "サンリオピューロランド","さんりおぴゅーろらんど","ハローキティをはじめ、マイメロディやポムポムプリン、ぼんぼりぼんなど子供から大人まで大人気のサンリオキャラクターたちと触れ合える全天候型屋内テーマパーク。たくさんのキャラクターたちが登場するパレードやアトラクション、キャラクターと遊べるキャラゲーなどサンリオの世界観をたっぷり味わえます。", 5, 7,3800,"./images","sanrio_puroland3.jpg",now(),"株式会社サンリオエンターテイメント","東京都多摩市落合1丁目31","「多摩センター駅」より徒歩5分 ","https://www.puroland.jp/",0,cast('2018-04-01' as date),cast('2018-11-30' as date),now(),now()),
( 37, 37, "東京ジョイポリス","とうきょうじょいぽりす","CAセガジョイポリス株式会社が運営する東京お台場の屋内型遊園地・デックス東京ビーチ内の施設なので、雨の日も楽しめます。デートにも最適！・ジェットコースターなどのアトラクションも充実・楽しさいっぱいのテーマパーク、東京ジョイポリスで遊んじゃおう！", 5, 7,4300,"./images","tokyo_joy_police.jpg",now(),"株式会社CAセガジョイポリス","東京都港区台場1丁目6番1号 DECKS Tokyo Beach 3F～5F","「東京テレポート駅」より約6分","http://tokyo-joypolis.com/",0,cast('2018-01-01' as date),cast('2018-12-31' as date),now(),now()),
( 38, 38, "としまえん","としまえん","今日はとことん遊びたい…。そんなファミリーにおすすめなのが「としまえん」。絶叫マシーンだけでなく、小さなお子さんも楽しめるアトラクションがいっぱいなので、おもいっきり楽しく遊べます。夏にはプール、冬にはスケートなど、季節に応じていろいろな遊び方ができるのも魅力。1年を通してさまざまなイベントが開催されているので、何度行っても新鮮な気分で遊べますよ。", 5, 7,4200,"./images","toshimaen2.jpg",now(),"株式会社豊島園","東京都練馬区向山3丁目25","「豊島園駅」より徒歩1分","http://www.toshimaen.co.jp/",0,cast('2018-11-01' as date),cast('2018-12-31' as date),now(),now()),
( 39, 39, "横浜コスモワールド","よこはまこすもわーるど","「よこはまコスモワールド」は、「ワンダーアミューズ・ゾーン」、「ブラーノストリート・ゾーン」、「キッズカーニバル・ゾーン」の合計３ゾーンから成る、世界で初めての画期的な都市計画から生まれた、大型観覧車が目印の《都市型立体遊園地》です。国際集客都市横浜の新名所として、多くの人々に心の潤いと安らぎを与えると共に、観光振興と賑わいのある街づくりにも大きく貢献しています。", 4, 8,2800,"./images","yokohama_cosmo_world.jpg",now(),"株式会社泉陽興業","神奈川県横浜市中区新港2-8-1","「みなとみらい駅」より徒歩2分","http://cosmoworld.jp/",0,cast('2018-01-01' as date),cast('2018-11-30' as date),now(),now()),


( 40, 40, "藤城清治美術館","ふじしろせいじびじゅつかん","光の祈りの芸術作家・藤城清治の70年を越える制作活動の集大成として開館した「藤城清治美術館　那須高原」は、氏の原点である「生きて演じ動いていること、舞台と観客がひとつになり感動すること」を体感できる劇場型美術館です。", 6, 3, 1600,"./images","seiji_fujishiro_m3.jpg",now(),"一般財団法人藤城清治美術館那須高原","栃木県 那須郡那須町湯本203","「黒磯駅」より徒歩23分","http://fujishiro-seiji-museum.jp/",0,cast('2018-01-01' as date),cast('2018-01-31' as date),now(),now()),
( 41, 41, "那須ステンドグラス美術館","なすはいらんどぱーく","イギリスコッツウォルズのマナーハウスをモチーフに五感で楽しめる美術館として建てられました。パイプオルガンとオルゴールの演奏会が毎日行われている館内では、ミュージアムウエディングをご提案しています。希少価値の高いステンドグラスも多く、ステンドグラス美術館としては、日本最大級の規模を誇ります。", 6, 3,1300,"./images","nasu_stained_glass_3.jpg",now(),"株式会社鈴屋","栃木県那須郡那須町高久丙1790","「東北自動車道那須IC」より10分","http://stainedglass-museum.com/",0,cast('2018-09-01' as date),cast('2018-12-31' as date),now(),now()),
( 42, 42, "所沢航空発祥記念館","ところざわこうくうはっしょうきねんかん","明治44年に日本で初めてできた飛行場は埼玉県所沢市にありました。所沢航空発祥記念館は、この飛行場の跡地につくられた所沢航空記念公園にあります。館内には、たくさんの本物の飛行機やヘリコプター、エンジンなどが展示され、実際に乗ることができる機体もあります。", 6, 6,820,"./images","tokorozawa_m1.jpg",now(),"益財団法人埼玉県公園緑地協会","埼玉県所沢市並木1-13 県営所沢航空記念公園内","「航空公園駅」より徒歩8分","https://tam-web.jsf.or.jp/",0,cast('2018-10-01' as date),cast('2018-12-31' as date),now(),now()),
( 43, 43, "松山庭園美術館","まつやまていえんびじゅつかん","松山庭園美術館は、田園の中の小高い丘の上にある、瀟洒な美術館です。この美術館は芸術家・此木三紅大のアトリエを公開したもので、氏が参考資料とした数々の名画コレクション、茶道具などを中心に展示しております。", 6, 5,800,"./images","matsuyama_garden_m2.jpg",now(),"公益財団法人花と緑の農芸財団","千葉県匝瑳市松山630","「八日市場駅」より車10分","http://matuyamaartmuseum.web.fc2.com/",0,cast('2018-09-01' as date),cast('2018-09-30' as date),now(),now()),
( 44, 44, "デジタルアートミュージアム","でじたるあーとみゅーじあむ","東京・お台場に、約1万㎡の施設面積をもつ、体験型デジタルアートミュージアムが誕生！5つの世界で構成された巨大空間に、世界初公開作品を含む約50作品が展示されます。不思議な体験をもたらす、5つの世界とは…？", 6, 7,3200,"./images","digital_art_m3jpg.jpg",now(),"森ビル株式会社","東京都江東区青海1-3-8 お台場パレットタウン"," 「東京テレポート駅」より徒歩5分","https://borderless.teamlab.art/jp/",0,cast('2018-04-01' as date),cast('2018-09-30' as date),now(),now()),
( 45, 45, "三鷹の森ジブリ美術館","みたかのもりじぶりみじゅつかん","吉祥寺通り沿いに三鷹の森を歩いていると、やさしい風合いの建物が出現。そばには「三鷹の森ジブリ美術館」の看板が立っています。看板の前に到着すると、おっきなトトロが受付でお出迎え。穴を覗けば、マックロクロスケもいます。", 6, 7,1000,"./images","ghibli_ｍ1.jpg",now(),"公益財団法人徳間記念アニメーション文化財団","東京都三鷹市下連雀1丁目1-83","「三鷹駅」より徒歩15分","http://www.ghibli-museum.jp/",0,cast('2018-01-01' as date),cast('2018-03-31' as date),now(),now()),
( 46, 46, "上野の森美術館","うえののもりびじゅつかん","上野の森美術館は、日本美術協会美術展示館の設備を一新して1972年（昭和47）4月に開館しました。上野恩賜公園のなかに建つ当館は、開館以来重要文化財の公開をはじめ様々なジャンルの美術を紹介しています。常設展示は行っておりませんが、毎年開催している美術館主催の現代美術展（VOCA展）、公募展（上野の森美術館大賞展、日本の自然を描く展）のほか、定期的に独創的な企画展を開催し話題を提供しています。", 6, 7,1600,"./images","ueno_m1.jpg",now(),"公益財団法人日本美術協会","東京都台東区上野公園1-2","「上野駅」より徒歩3分","http://www.ueno-mori.org/",0,cast('2018-03-01' as date),cast('2018-12-31' as date),now(),now()),
( 47, 47, "藤子・F・不二雄ミュージアム","ふじこ・えふ・ふじおみゅーじあむ","当ミュージアムは、藤子・F・不二雄が描いた原画を中心に、発想の原点をさぐり、さらにはまんが作りの面白さを紹介し、藤子作品に込められた「やさしい思い」、「あたたかいまなざし」を感じてもらえる空間を創造していきます。原画を展示したしずかな空間から、実際にまんがが読めるコーナーや、ここでしか見ることのできない映像を流すシアター、そして、キャラクター達に出会える「はらっぱ」、作品にちなんだオリジナルメニューいっぱいのカフェ、魅力的なグッズ・お土産いっぱいのショップ。時間を忘れてどの空間でも幅広くお楽しみいただけます。", 6, 8,1000,"./images","fujiko_m1.jpg",now(),"株式会社藤子ミュージアム","神奈川県川崎市多摩区長尾2丁目8番1号","「向ヶ丘遊園駅」より徒歩16分","http://fujiko-museum.com/",0,cast('2018-08-01' as date),cast('2018-08-31' as date),now(),now()),
( 48, 48, "箱根彫刻の森美術館","はこねちょうこくのもりびじゅつかん","四季折々の雄大な自然が楽しめる箱根。彫刻の森美術館は、その大自然を生かして1969年に開館した、国内で はじめての野外美術館(オープンエアーミュージアム)です。箱根の山々が望める7万㎡の緑豊かな庭園に、 近・現代を代表する彫刻家の名作約120点が常設展示されています。お気に入りの作品をじっくり眺めたり散策気 分でのんびり歩いたり、思い思いに芸術とふれあうことができます。また、世界有数のコレクション300点余りを順 次公開しているピカソ館をはじめ、5つの室内展示場や天然温泉の足湯もあり、心豊かな憩いの ひとときを過ごすことができます。", 6, 8,1600,"./images","hakone_m3.jpg",now(),"公益財団法人彫刻の森芸術文化財団","神奈川県足柄下郡箱根町 二ノ平1121","「彫刻の森駅」より徒歩2分","http://www.hakone-oam.or.jp/",0,cast('2018-06-01' as date),cast('2018-12-31' as date),now(),now());



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
(1,1,"全ての場所", now(), null),
(2,2,"茨城県", now(),null),
(3,3,"栃木県", now(),null),
(4,4,"群馬県", now(),null),
(5,5,"千葉県", now(),null),
(6,6,"埼玉県", now(),null),
(7,7,"東京都", now(),null),
(8,8,"神奈川県", now(),null);
package com.example.yuanann.vegetable_app;

import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Created by Yuanann on 2020-11-7.
 */

public class Myfind extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.find);
        final UnScrollListView list2;
        list2= findViewById(R.id.list);
        Intent intent=getIntent();
        final int count=intent.getIntExtra("count",0);
        //构建SimpleAdapter

        Button bu1=findViewById(R.id.bu1);
        Button g=findViewById(R.id.g);
        ImageView img =findViewById(R.id.img);
        TextView head=findViewById(R.id.head);
        final TextView title=findViewById(R.id.title);
        TextView content=findViewById(R.id.content);

        //声明数据
        int[] image={R.drawable.hc5,R.drawable.hc3,R.drawable.hc6,R.drawable.hc7,R.drawable.hc5,R.drawable.hc3,R.drawable.hc6,R.drawable.hc7,R.drawable.hc5,R.drawable.hc3,R.drawable.hc6,R.drawable.hc7};
        String[] h={"成都.中国","丽江.中国","上海.中国","苏州.中国","南京.中国","北京.中国","新加坡","韩国.首尔","澳大利亚.墨尔本","日本.东京","新西兰.奥克兰"};
        String[] t={"店/食 | 荒石公园，一场关于“自然”的巡展",
                "所有的努力，皆因爱上丽江和你.",
                "与老上海同一屋檐下的Manner Coffee",
                "闻书香入睡，照暖光苏醒，这就是印象中的姑苏生活。",
                "金陵鸡鸣樱花开",
                "在北京，做个懂生活的朝阳群众",
                "梦想改造家| 殖民地老区里的清新民宿",
                "百年咖啡老屋，像个返璞归真的世外高人",
                "墨尔本：在涂鸦街遇见佛系街头艺人",
                "易醉樱时|最和风不过新仓富士浅间神社",
                "有一种生活，叫“像当地人一样生活”",
        };
        String[] c={"把咖啡厅搬进自然中会是什么样子？荒石公园给出了自己的答案。\n" +
                "位于成都西北边“无里”文创区的荒石公园，与其说是一家咖啡厅，却更像是一个关于自然的展厅。与许多种上几株植物就标榜“自然”的咖啡厅相比，荒石公园包含了自然中更多也更广阔的元素：绿植与岩石、花草与昆虫、金属与矿物、繁茂与凋零。店面超过280平米，其中咖啡厅只占80平米，剩余的大量空间则被用作盆栽培养、标本制作和艺术展览。\n" +
                "为了更专注于植物和标本，荒石公园提供的饮品与甜品种类很有限，但是都十分用心。月亮蛋糕是含有菠萝果肉的芝士蛋糕，黄色的月牙形蛋糕放在蓝色的星空盘中，无论味觉还是视觉都非常棒。黄桃气泡水很清爽，可能因为配比的原因，没有一般气泡水的碱味。",
                "（二小姐的精品客栈）。咱家到古城最繁华的四方街逛街大概走路需要十分钟。咱们家有八个客房。其中一楼有三个房间，一个大床，一个双床，一个家庭双床。二楼有五个房间，其中三个房间在左侧，都是大床。另外两个房间比较大，套房浴缸大床以及一个圆床。咱们家房间内有电视，独立卫生间，24h热水，坐便器，五星级床品和洗漱用品，免费wifi等等。我们愿意把我们最好的给你们。\n" +
                        "我们希望,我们的家,对您而言,不是一个旅馆,也不是一个酒店。而是如同您在丽江的家。我们欢迎您回家。我们在丽江等你回家。\n"+
                        "我们喜欢每一个来家里的客人,愿意给每位客人提供方便。可能是一瓶充满欢迎的水,可能是一碗暖暖的粥,也可能是一杯热热的普洱茶，或者是我们做的一顿家常菜。只希望让您在这里有家的感觉。\n" +
                        "如果说丽江还有一抹安静时光，远离叫卖声的恬静时光，那就是我们最爱的家。我们等你回家！",
                "远远望见了老上海馄饨店的招牌，没想到Manner Coffee就在同一屋檐下。\n" +
                        "所以下次你在上海街头，偶遇排队买馄饨汤圆的队伍可要看仔细了，很有可能大家是在买咖啡呢！\n" +
                        "在上海无数的咖啡馆里Manner是特殊的存在，它勇敢地将咖啡变成了平价的饮料带入到了人们的生活。不仅是附近的年轻人，许多从外地赶来的咖啡爱好者，也会加入这家蓝色小店买咖啡的队伍中。\n" +
                        "和Manner其他门店一样，这家也只有外卖窗口，没有堂食区域，咖啡均是外带杯出品。除了意式咖啡和手冲单品咖啡，Manner还有自家烘焙的整包咖啡豆出售。\n" +
                        "牛奶咖啡都在20元以下，自带杯子（一次性杯子除外）减五元。不但有友好的咖啡，友好的价格，还有友好的环保理念。\n" +
                        "2017年二月的上海，我和两位好朋友一起去了Manner。在我画画的时候，朋友们在门口的长凳上聊天等我，也进入了我的画里。\n" +
                        "这家咖啡师见我在画画，热情地推荐我去Manner的菜场店，说那边也很入画。可惜那天比较晚了，下次会再去。",
                "来苏州旅行的人想必都是有江南情怀在的，都想要住一个小桥流水、推门就见篷船划过的苏式院落。\n" +
                        "“坐忘斋”就满足了我的念想：教书法、爱茶道的先生和文艺修花的太太琴瑟和鸣，气质温婉的江南民居在平江路沿岸闹中取静，就是印象里的姑苏生活。\n" +
                        "拿门环敲门的瞬间，就已经觉得自己不再是生活在都市。走进院子，声音更不自觉降低，自然而然转换成“舒适慢生活”模式，日常疲于奔命的身心也变得平静。下楼之后是先生的书法教室，摆放先生的书法作品。活动区域设了茶座，出去就有一座大阳台，上头搭着小院子的黑瓦片，坐在茶座聊聊天，手机都不记得刷，乱七八糟的琐事都抛到脑后。\n" +
                        "这才是生活本来的样子啊。",
                "鸡鸣寺位于南京市玄武区鸡笼山东麓山阜上，又称古鸡鸣寺，始建于西晋，是南京最古老的梵刹之一。其寺庙依山势而建，山顶有佛塔一座，连着寺前的和平门，可直达玄武湖。城墙斑驳、参天古木、日光透过树荫，古都历史韵意尽显。\n" +
                        "樱花盛开的这条街，恰好是从入鸡鸣寺通玄武湖必经地。路两边种满了大大小小樱花树。三月末的时候花苞尽开，粉色、白色铺满整条街，偶有风吹过、像是在下樱花雨、花瓣落满地，有瞬间恍惚。\n" +
                        "虽然来看美景的游人“如织”，但却依旧不会让你对眼前的景色失望。带一二分闲适心情、闲庭漫步、感受生活就好。\n" +
                        "路线：乘坐地铁一号线到鼓楼站，2号口出。然后可询问路人或者跟着导航就可以轻松找到。\n" +
                        "附近也有玄武湖、亦可呆坐一天。",
                "四月份的北京，乍暖还寒。白天阳光甚好，但温差大。\n" +
                        "很惊喜在出行前刷到了小啾家的房子，小啾是我在微博上粉了好几年的设计师，她的生活态度和生活方式就是我向往的样子。\n" +
                        "住在这里，真的就像住在家里一样。\n" +
                        "厨房里有着常用的餐厨用品和电器，无论是想留一手厨艺还是简单地烧壶水泡杯茶，半开放式的小厨房都能满足你。\n" +
                        "入门处的玻璃收纳柜和隔板上有很多小家伙，似乎像老朋友一样欢迎我到北京来做客。\n" +
                        "书架上的书估计够读好些天的，不小心还发现了好几本与自己的收藏相同的书籍。\n" +
                        "窄窄的洗手间被分成了三大功能分区，洗漱区、浴室、马桶区，真的很窄，但是这设计又真的太巧妙，太有智慧。\n" +
                        "设计风格和装饰超喜欢的一处民宿，地理位置也很好，推荐给去北京旅行的小伙伴们。",
                "作为一名《梦想改造家》的粉丝，我在旅行途中也特别喜欢挑选经专业建筑师之手改造过的民宿。一来觉得有设计感，住起来除了舒适以外，还能感受空间本身的美好。二来是作为一个立志走遍全世界的建筑师，对不同地方建筑的地域性和它所呈现的文化有深深的好奇心。\n" +
                        "这次来到新加坡，我就一眼选中了这个由1920年代英国殖民时期改造而来的现代民宿。整条街都是三层小洋楼，一层有的是店铺，有的是自家门厅。建筑师将其改成前后两边作为客房，中间打造成中空的天井，阳光从屋顶照下，温暖而明亮地穿过整个三层空间，几簇藤曼从屋顶垂落，绿意盎然。我们租下的是顶层，日日由这天井经过上楼下楼，仿佛穿过一小片热带丛林。即使旧屋深长，较为狭窄，也绝没有逼仄幽暗之感，反而是开敞明亮，充满与自然交融的情趣，颇有几分日本郊外民宿的样子。整栋洋楼有八间民宿出租，分别出自7位当地建筑师之手，各有不同风格，我们住的顶层是极简白色style，空间宽敞简洁，容下两张queen-size双人床之外，还有铺着地毯的起居室和超大的洗漱间，四个人住非常合适。",
                "三清洞的KIEHL'S附近有一家很复古的小咖啡馆，我赶时间，只来得及在窗口买一杯咖啡外带，不过探头往院子里看了几眼，觉得很酷。到处都是韩国传统的质朴感，纸上的手绘感觉特别可爱。这一切巧妙的和咖啡店这种形式融合在一起，有种举重若轻的世外高人的感觉，觉得老板一定是个牛人。后来才知道这里就是大名鼎鼎的百年老屋“咖啡磨坊”。\n" +
                        "如果你认真的探访，一定能发现各种综艺节目纷至沓来的取景角落！另外咖啡厅旁边还有一家文具店”ICONIC“，在2楼出售各种手账和文具，很小清新的，文具控们喝过咖啡可以来逛逛。",
                "位于墨尔本市中心的Hosier Ln是一条长度不过200米的街道。街道周边高楼林立，车水马龙，转进这条街却像是进入到另一个世界。这条狭窄到不允许车辆通过的街道内挤满了人，大家都对着墙壁猛凹造型——这里就是墨尔本著名的涂鸦街。\n" +
                        "一位盘着脏辫、穿着破背心、赤着脚的街头艺人捧着吉他，一边和周围的朋友聊天，一边漫不经心地拨弄着琴弦。吉他套随意地摆在面前，里面零零星星几枚硬币。见我对他举起了相机，他从地上举起了盛满水的玻璃杯，向我做了个干杯的动作，表情依然沉稳冷酷。\n" +
                        "与美国涂鸦街道脏乱差、内容少儿不宜不同，这条街道干净整洁，地上见不到垃圾，在街上走路的人处了艺人、游客，还有在附近办公楼工作的人在此抽烟谈天。而涂鸦的内容大多是色彩鲜艳的画像，本身的美学价值也很高。",
                "新仓富士浅间神社，是拍摄富士山的绝佳地点之一。樱花烂漫时，登上神社所在的山坡，在晴朗的天气下，可以拍摄到“富士山+樱花+五重塔”这种最和风不过的经典画面。\n" +
                        "河口湖一带的温度偏低，樱花也开的晚一些，要比东京晚上半个月左右。我去的时候已经快到4月下旬，这里的樱花却正是时候。到新仓富士浅间神社的时候的这天也赶上了一个好天气，蓝天白云下的富士山非常美丽而优雅，山顶上的积雪还未化。而樱花也开的正好，在微风中轻轻摇曳，繁花胜雪，正应了野野口立圃那句「天も花にええるか雲の乱れ足」——天也醉樱花,云脚乱蹒跚。\n" +
                        "神社建于庆云三年（公元705年），是过去甲斐国八乡的祭祀场所。在环抱富士山的山梨和静冈两县一共有大大小小八所浅间神社，所以千万别弄混。不过来这里的大部分人都是冲着富士山来的，至少我来的时候几排举着单反的“摄友”们各种拍拍拍。而且对着富士山的方向有一大片可以走“之”字形缓坡慢慢下行的草坪，是非常适合休闲赏景的地方。\n" +
                        "从欣赏富士山绝佳的圣地河口湖站坐电车到下吉田（Shimoyoshita），徒步走到神社。神社在一个山坡上，视野非常好，一眼望去，近前是开的正好的樱花，不远处是红色的日式五重塔，再远就是蓝天和富士山，非常有层次的画面，集齐了日本最有代表性的元素，美丽而不张扬。",
                "奥克兰的五月，夏秋的交际处，雨水和阳光的比例几乎是一比一。出了机场，搭上印度人的出租车半小时左右就到了我们的房子，房东Helen还在亲自做清洁，她说当天是周日又恰逢母亲节所以很难找到清洁工所以只好她亲自上阵了。放了行李在附近溜达起来，Helen的家是一栋很大的白房子，房子上爬满了木香花，春天房子肯定很香很香。而院子的篱笆是茶花树，洁白得让人感叹的茶花虽然落了一地花瓣但树上还有满满的花朵。街区叫Phonsoby，是奥克兰氛围很好的当地人的住宅区，路两旁的每一栋房子都是独特的设计，每一家庭院的绿植和花果都各具特色。步行五分钟就是海岸线，海边的cox nature reserve是当地人天然的休闲场所，每天傍晚大草坪上坐满了喝着红酒等日落的人们。\n" +
                        "Helen的大房子两层有五间卧室，一楼的套房做Airbnb，其它房间都做了长租，Helen住在阁楼上，她说实在没有时间管理太多的Airbnb，律师的职业退休后，她还做一些设计的工作，看上去每天都很忙。下个月她要去阿根廷看女儿和外孙，一直和我说外孙只会西班牙语不会英语，很无奈的样子。\n" +
                        "在奥克兰的一周，几乎每天都在阳光里醒来，在明亮的厨房里给自己做一份简单的早餐，然后在小院子里享用，夜里的雨把小院打得湿漉漉，阳光透过树叶在木桌子上洒下斑驳的影子，天蓝得有点不像话，常常一顿早饭要吃很久。傍晚会走路五分钟去附近的countdown超市买一块牛排回来做晚饭。我对自己说，等我哪天辞职了，第一件事就是找个像奥克兰这样的城市，过来住上一两个月，每天睡到自然醒，去市场买食材自己煮饭，白天进城溜达一圈，傍晚去海边坐着，安静地等日落，拍很多很多照片，根本不需要担心时间不够用，就像当地人一样。",



        };

        img.setBackgroundResource(image[count]);
        head.setText(h[count]);
        title.setText(t[count]);
        content.setText(c[count]);

        DatabaseHelper helper=new DatabaseHelper(Myfind.this);
        Cursor cursor=helper.query();
        //定义SimpleCursorAdapter
        SimpleCursorAdapter simpleCursorAdapter=new SimpleCursorAdapter(Myfind.this,R.layout.layout2,cursor,new String[]{"_id","info"},new int[]{R.id.t1,R.id.t2},0);
        list2.setAdapter(simpleCursorAdapter);
        list2.postInvalidate();


//        DatabaseHelper helper=new DatabaseHelper(this);
//        Cursor cursor=helper.query();
        //定义SimpleCursorAdapter
        // Collections.reverse();
        bu1.setOnClickListener(new View.OnClickListener() {
            EditText ed1=findViewById(R.id.ed1);
            public void onClick(View view) {
                //获取数据
                String info=ed1.getText().toString();
                //转换数据包装
                ContentValues values=new ContentValues();
                values.put("info",info);
                //实例化数据库操作类
                DatabaseHelper dbHelper=new DatabaseHelper(getApplicationContext());
                //存储数据
                dbHelper.insert(values);
                Toast.makeText(Myfind.this,"评论成功",Toast.LENGTH_LONG).show();
//                Intent intent=new Intent(DescriptionActivity.this,DescriptionActivity.class);
//                startActivity(intent);
                DatabaseHelper helper=new DatabaseHelper(Myfind.this);
                Cursor cursor=helper.query();
                //定义SimpleCursorAdapter
                SimpleCursorAdapter simpleCursorAdapter=new SimpleCursorAdapter(Myfind.this,R.layout.layout2,cursor,new String[]{"_id","info"},new int[]{R.id.t1,R.id.t2},0);
                list2.setAdapter(simpleCursorAdapter);
                list2.postInvalidate();



            }
        });
        g.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String info =title.getText().toString();
                Toast.makeText(Myfind.this,"关注成功",Toast.LENGTH_LONG).show();
                SharedPreferences sp=getSharedPreferences("fouce", MODE_PRIVATE);
                SharedPreferences.Editor editor=sp.edit();
                editor.putString("myfouce", info);
                editor.commit();
            }
        });
    }
}

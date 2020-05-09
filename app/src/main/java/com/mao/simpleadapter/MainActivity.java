package com.mao.simpleadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv=(ListView)findViewById(R.id.lv);
//        指定适配器
        /*
        * 1、context:上下文
        *
        * 2、List<? extends Map<String,?>> data  列表 放的都是Map对象 data要显示的数据
        *
        * 3、每个条目要显示布局
        *
        * 4、显示key
        *
        * 5、映射关系
        *
        * */

        List<Map<String,Object>> data=new ArrayList<Map<String, Object>>();

        HashMap<String, Object> map1 = new HashMap<String, Object>();

        map1.put("icon", android.R.drawable.btn_star);
        map1.put("name", "条目1");

        HashMap<String, Object> map2 = new HashMap<String, Object>();

        map2.put("icon", android.R.drawable.btn_default);
        map2.put("name", "条目2");

        HashMap<String, Object> map3 = new HashMap<String, Object>();

        map3.put("icon", android.R.drawable.btn_plus);
        map3.put("name", "条目3");

        data.add(map1);
        data.add(map2);
        data.add(map3);

        lv.setAdapter(new SimpleAdapter(this,data,R.layout.my_item,new String[]{"icon","name"},
                new int[]{R.id.imageView,R.id.tv}));
    }
}

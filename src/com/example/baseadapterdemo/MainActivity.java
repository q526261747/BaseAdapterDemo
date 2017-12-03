package com.example.baseadapterdemo;

import java.util.*;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends Activity {
	ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);  
        setContentView(R.layout.activity_main);  
        listView=(ListView) findViewById(R.id.lv_main);  
        List<ItemBean> itemBeanList=new ArrayList<ItemBean>();  
        for(int i=0;i<20;i++){  
            itemBeanList.add(new ItemBean(R.drawable.ic_launcher,"我的标题"+i,"我是内容"+i));  
        }  
        //通过这个函数，我们可以将一个MyAdpter对象传递给我们的ListView  
        //从而达到将数据源中多种多样的数据格式转化为ListView可以展示的格式  
        //因为在MyAdpter中，已经将数据进行处理，赋值给View并返回过来  
        listView.setAdapter(new MyAdapter(this,itemBeanList));  
    }


}

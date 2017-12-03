package com.example.baseadapterdemo;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

public class MyAdapter extends BaseAdapter {
	private List<ItemBean> mList;
	private LayoutInflater mInflater;

	public MyAdapter(Context context,List<ItemBean> list) {
		
		mInflater = LayoutInflater.from(context);
		mList = list;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mList.size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return mList.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		ViewHolder viewHolder;
		if(convertView==null){
			viewHolder = new ViewHolder();
			convertView = mInflater.inflate(R.layout.item,null);
			viewHolder.imageView = (ImageView) convertView.findViewById(R.id.iv_image);
			viewHolder.title = (TextView) convertView.findViewById(R.id.tv_title);
			viewHolder.content = (TextView) convertView.findViewById(R.id.tv_content);
			convertView.setTag(viewHolder);
		}else{
			viewHolder = (ViewHolder) convertView.getTag();
		}
		
		ItemBean bean = mList.get(position);
        viewHolder.imageView.setImageResource(bean.ItemImageResid);  
        viewHolder.title.setText(bean.ItemTitle);  
        viewHolder.content.setText(bean.ItemContent); 
        
		return convertView;
	}
	class ViewHolder{
		public ImageView imageView;
		public TextView title;
		public TextView content; 
	}

}

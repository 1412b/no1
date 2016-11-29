package com.example.day01_sliding;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		SlidingMenu slidingMenu=new SlidingMenu(this);
		
		
		//滑出模式
		slidingMenu.setMode(SlidingMenu.LEFT);
		 // 设置触摸屏幕的模式  
		slidingMenu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN); 
		//阴影(侧滑菜单与展示页面接缝处)宽度
//		slidingMenu.setShadowWidthRes(R.dimen.shadow_width);  
		//阴影(侧滑菜单与展示页面接缝处)资源文件
//		slidingMenu.setShadowDrawable(R.drawable.shadow);  
  
        // 设置滑动菜单视图的宽度  
//		slidingMenu.setBehindOffsetRes(R.dimen.slidingmenu_offset);  
		slidingMenu.setBehindOffset(100);
        // 设置渐入渐出效果的值  
		slidingMenu.setFadeDegree(1);  
		//添加菜单到Activity
		slidingMenu.attachToActivity(this, SlidingMenu.SLIDING_CONTENT);  
		   //为侧滑菜单设置布局  
//		slidingMenu.setMenu(R.layout.sliding);  
		
		View view = View.inflate(this, R.layout.sliding,null);
		
		slidingMenu.setMenu(view);
		
		
		TextView textView = (TextView) view.findViewById(R.id.textView);
		
		
		textView.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {

				Toast.makeText(MainActivity.this, "点击了菜单里的控件   ", 0).show();
			}
		});
		
	}
}

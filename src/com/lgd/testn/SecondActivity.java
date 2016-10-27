package com.lgd.testn;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
//import android.view.Menu;
//import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;


public class SecondActivity extends Activity 
{
	private Button bt = null;
	protected static final String toastView = null;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);
		bt=(Button)findViewById(R.id.bt);
		bt.setOnClickListener(listener3);
		
       
        
	}
	public OnClickListener listener3= new OnClickListener()
	{
		public void onClick(View v)
		{ 
			Intent intent2 = new Intent();
			intent2.setClass(SecondActivity.this, Third.class);
			startActivity(intent2);
			 Toast toast=Toast.makeText(getApplicationContext(), "生日快乐\n笑脸每天\n开心快乐", Toast.LENGTH_LONG); 
	    	   toast.setGravity(Gravity.CENTER, 0, 0); 
	    	   
	    	   ImageView imageView= new ImageView(getApplicationContext()); 
	    	 
	    	    imageView.setImageResource(R.drawable.hap5); 
	    	    //获得toast的布局 
	    	    LinearLayout toastView = (LinearLayout) toast.getView(); 
	    	    //设置此布局为横向的 
	    	   toastView.setOrientation(LinearLayout.HORIZONTAL); 
	    	   //将ImageView在加入到此布局中的第一个位置 
	    	   toastView.addView(imageView, 0); 
	    	   toast.show(); 
			
			
		}
		
	};
	
}

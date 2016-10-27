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
			 Toast toast=Toast.makeText(getApplicationContext(), "���տ���\nЦ��ÿ��\n���Ŀ���", Toast.LENGTH_LONG); 
	    	   toast.setGravity(Gravity.CENTER, 0, 0); 
	    	   
	    	   ImageView imageView= new ImageView(getApplicationContext()); 
	    	 
	    	    imageView.setImageResource(R.drawable.hap5); 
	    	    //���toast�Ĳ��� 
	    	    LinearLayout toastView = (LinearLayout) toast.getView(); 
	    	    //���ô˲���Ϊ����� 
	    	   toastView.setOrientation(LinearLayout.HORIZONTAL); 
	    	   //��ImageView�ڼ��뵽�˲����еĵ�һ��λ�� 
	    	   toastView.addView(imageView, 0); 
	    	   toast.show(); 
			
			
		}
		
	};
	
}

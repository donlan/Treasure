package com.lgd.testn;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;


public class Third extends Activity 
{
	private Button bt4 = null;
	private Button bto = null;
	private Button bt3 =null;
	protected static final String toastView = null;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.third);
		bt4=(Button)findViewById(R.id.bt4);
		bt4.setOnClickListener(listener4);
		bt3=(Button)findViewById(R.id.bt3);
		bt3.setOnClickListener(lis3);
		bto=(Button)findViewById(R.id.bto);
		bto.setOnClickListener(liso);
        
	}
	public OnClickListener liso = new OnClickListener()
	{
		public void onClick(View v)
		{
			Intent i = new Intent();
			i.setClass(Third.this, Forth.class);
			startActivity(i);
			Toast toast=Toast.makeText(getApplicationContext(), "", Toast.LENGTH_LONG); 
	    	   toast.setGravity(Gravity.CENTER, 1, 1); 
	    	   
	    	   ImageView imageView= new ImageView(getApplicationContext()); 
	    	 
	    	    imageView.setImageResource(R.drawable.xu2); 
	    	    //���toast�Ĳ��� 
	    	    LinearLayout toastView = (LinearLayout) toast.getView(); 
	    	    //���ô˲���Ϊ����� 
	    	   toastView.setOrientation(LinearLayout.HORIZONTAL); 
	    	   //��ImageView�ڼ��뵽�˲����еĵ�һ��λ�� 
	    	   toastView.addView(imageView, 0); 
	    	   toast.show(); 
	    }
   };
	public OnClickListener lis3 = new OnClickListener()
	{
		public void onClick(View v)
		{
			Intent i = new Intent();
			i.setClass(Third.this, Forth.class);
			startActivity(i);
			Toast toast=Toast.makeText(getApplicationContext(), "Je t'aime", Toast.LENGTH_LONG); 
	    	   toast.setGravity(Gravity.CENTER, 1, 1); 
	    	   
	    	   ImageView imageView= new ImageView(getApplicationContext()); 
	    	 
	    	    imageView.setImageResource(R.drawable.hap8); 
	    	    //���toast�Ĳ��� 
	    	    LinearLayout toastView = (LinearLayout) toast.getView(); 
	    	    //���ô˲���Ϊ����� 
	    	   toastView.setOrientation(LinearLayout.HORIZONTAL); 
	    	   //��ImageView�ڼ��뵽�˲����еĵ�һ��λ�� 
	    	   toastView.addView(imageView, 0); 
	    	   toast.show(); 
	    }
   };
	public OnClickListener listener4 = new OnClickListener()
	{
		public void onClick(View v)
		{
			Intent i = new Intent();
			i.setClass(Third.this, Forth.class);
			startActivity(i);
			Toast toast=Toast.makeText(getApplicationContext(), "", Toast.LENGTH_LONG); 
	    	   toast.setGravity(Gravity.CENTER, 1, 1); 
	    	   
	    	   ImageView imageView= new ImageView(getApplicationContext()); 
	    	 
	    	    imageView.setImageResource(R.drawable.xin2); 
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

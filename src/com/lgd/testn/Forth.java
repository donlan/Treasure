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


public class Forth extends Activity 
{
	private Button red1 = null;
	protected static final String toastView = null;
    //private Button red1=null;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.forth);
		red1=(Button)findViewById(R.id.red1);
		red1.setOnClickListener(l);
	
}
	public OnClickListener l = new OnClickListener()
	{
		public void onClick(View v)
		{
			Intent intent4 = new Intent();
			intent4.setAction(Intent.ACTION_MAIN);
			intent4.addCategory(Intent.CATEGORY_HOME);           
			startActivity(intent4);
			Toast toast=Toast.makeText(getApplicationContext(), "ֽ������\n���Ը������Զ��\n����ʵ��", Toast.LENGTH_LONG); 
	    	   toast.setGravity(Gravity.CENTER, 1, 1); 
	    	   
	    	   ImageView imageView= new ImageView(getApplicationContext()); 
	    	 
	    	    imageView.setImageResource(R.drawable.yuan); 
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
	
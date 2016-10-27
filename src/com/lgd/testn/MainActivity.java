package com.lgd.testn;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
//import android.app.*;
import android.content.*;
//import android.content.*;
import android.view.*;
import android.view.View.OnClickListener;
//import android.view.Menu;
//import android.view.MenuItem;
//import android.view.Menu;
//import android.view.MenuItem;

public class MainActivity extends Activity 
{
	private Intent intent = new Intent("com.angel.Android.MUSIC");
    protected static final String toastView = null;
	private Button btn2  = null;
	private Button btn1 = null;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
    	startService(intent);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       btn2=(Button)findViewById(R.id.btn2);
      btn2.setOnClickListener(listener);
      btn1=(Button)findViewById(R.id.btn1);
      btn1.setOnClickListener(listener1);
        //Intent myInt=new Intent("android.intent.action.CALL",Uri.parse("tel:"+10086));
       //startActivity(myInt);
     
    }
   

   
    public OnClickListener listener1 = new OnClickListener()
    {

		
		@Override
		public void onClick(View p)
		{
			
			// TODO Auto-generated method stub
			//Intent intent1 = new Intent();
			//intent1.setClass(MainActivity.this,Forth.class);
			//startActivity(intent1);
			 Toast toast=Toast.makeText(getApplicationContext(), "", Toast.LENGTH_LONG); 
	    	   toast.setGravity(Gravity.CENTER, 1, 1); 
	    	   
	    	   ImageView imageView= new ImageView(getApplicationContext()); 
	    	 
	    	    imageView.setImageResource(R.drawable.xu2); 
	    	    //获得toast的布局 
	    	    LinearLayout toastView = (LinearLayout) toast.getView(); 
	    	    //设置此布局为横向的 
	    	   toastView.setOrientation(LinearLayout.HORIZONTAL); 
	    	   //将ImageView在加入到此布局中的第一个位置 
	    	   toastView.addView(imageView, 0); 
	    	   toast.show(); 
	    	   
	    	  
			/*
			Dialog d = new Dialog(MainActivity.this);
			Window window = d.getWindow();
			window.setFlags(WindowManager.LayoutParams.FLAG_BLUR_BEHIND,WindowManager.LayoutParams.FLAG_BLUR_BEHIND );
			d.setTitle("Congratulation");
			d.setContentView(R.layout.second_activity);
			TextView text = (TextView)d.findViewById(R.id.bt);
			text.setText("There something on  the dialog");
			*/
              
		}
    	
    };
    
    
    public OnClickListener listener = new OnClickListener()
    {
    	
    	public void onClick(View v)
    	{
    		Intent intent = new Intent();
    		intent.setClass(MainActivity.this, SecondActivity.class);
    	    //intent.setAction(Intent.ACTION_SENDTO);
    	    //intent.setData(Uri.parse("smsto:120"));
    	   
    	   startActivity(intent);
    	   
    	   Toast toast=Toast.makeText(getApplicationContext(), "永远\n快乐美丽", Toast.LENGTH_LONG); 
    	   toast.setGravity(Gravity.CENTER, 0, 0); 
    	   
    	   ImageView imageView= new ImageView(getApplicationContext()); 
    	 
    	    imageView.setImageResource(R.drawable.hap1); 
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

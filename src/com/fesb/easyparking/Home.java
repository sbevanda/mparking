package com.fesb.easyparking;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Home extends Activity {
	
	private TextView auto;
	private Button button; 

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        
        TextView auto = (TextView)findViewById(R.id.auto);
        auto.setText("hard coded");
        button = (Button)findViewById(R.id.botun);
        button.setOnClickListener(new OnClickListener(){
			
			public void onClick(View v)
			{
				doSomething();
			}
		});
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_home, menu);
        return true;
    }
    
    public void sendSms(View view)
    {
    	doSomething();
    }
    
    private void doSomething()
    {
    	Toast.makeText(this, "saljem sms", Toast.LENGTH_LONG);
    }
}

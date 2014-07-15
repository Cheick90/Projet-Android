package com.projetandroid.newsandroid;

import android.app.Activity;
import android.os.Bundle;
import  android.view.Menu;
import  android.widget.TextView;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.view.View;

		public class MainActivity extends Activity{
			private TextView texte = null;
			
			public void onCreate(Bundle savedInstanceState) {
				super.onCreate(savedInstanceState);
				        setContentView(R.layout.main);
				        texte = new  TextView(this);
				        texte.setText("maliweb.net");
				        setContentView(texte);
				        
				        TextView textView = new  TextView(this);
				        textView.setText(R.string.maliweb);
				        textView.setTextSize(8);
				        textView.setTextColor(0x112233);
				        
				        texte = (TextView)findViewById(R.id.text);
				        texte.setOnClickListener(new OnClickListener(){
		    public void onClick (View view){
		       Intent intent=new Intent(MainActivity.this, SecondActivity.class);
				       startActivity(intent);
				 }
			 });	        
		}
}
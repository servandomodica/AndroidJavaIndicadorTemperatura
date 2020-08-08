package com.example.parcial2;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.app.Activity;

public class MainActivity extends Activity {
	Temperatura tempe1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tempe1=(Temperatura)findViewById(R.id.temperatura1);
    }

    
    public void mostrar (View v) {
    	String tempe=String.valueOf(tempe1.retornarValor());
    	
    	Toast.makeText(this, tempe, Toast.LENGTH_LONG).show();
    }
    
    
    
}

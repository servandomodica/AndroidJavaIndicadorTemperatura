package com.example.parcial2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

public class Temperatura extends View implements OnTouchListener {
	private int temperatura;

	public Temperatura(Context context, AttributeSet attrs) {
		super(context, attrs);
		
		setOnTouchListener(this);
	}
	
	
	public boolean onTouch(View arg0, MotionEvent arg1) {
		temperatura++;

		this.invalidate();
		return false;
	}


	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		
		int ancho = getWidth();
		int alto = getHeight();
		
		Paint p = new Paint();
		
		if (temperatura>=0 && temperatura<=10) {
			p.setARGB(255, 0, 0, 255);		
		}
		
		if (temperatura>10 && temperatura<20) {
			p.setARGB(255, 255, 255, 0);		
		}
		
		if (temperatura>=20) {
			p.setARGB(255, 255, 0, 0);		
		}
		
		canvas.drawCircle(ancho * 0.50f, alto * 0.50f, ancho * 0.50f, p);
		
		String texto=String.valueOf(temperatura);
		
		Paint p2 = new Paint();
		p2.setARGB(255, 0, 0, 0);
		p2.setTextSize(ancho * 0.50f);
		canvas.drawText(texto, ancho * 0.25f, alto * 0.65f, p2);		
	}

	
	public int retornarValor() {
		return temperatura;
	}
}

package com.cafe24.paint.main;

import com.cafe24.paint.i.Drawable;
import com.cafe24.paint.point.ColorPoint;
import com.cafe24.paint.point.Point;
import com.cafe24.paint.shape.Rect;
import com.cafe24.paint.text.GraphicString;

public class MainApp {

	public static void main(String[] args) {
		
		Point p1 = new Point(10, 20);
		draw(p1);
		
		Point p2 = new ColorPoint(50, 100, "red");
		draw(p2);
		
		p1.show(false);
		p2.show(false);
		

		Rect rect = new Rect();
		draw(rect);

		
		draw(new GraphicString("hello"));
	}

	public static void draw(Drawable drawable) {
		drawable.draw();
	}
	

}

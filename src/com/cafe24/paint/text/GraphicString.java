package com.cafe24.paint.text;

import com.cafe24.paint.i.Drawable;

public class GraphicString implements Drawable {
	private String str;
	public GraphicString(String str) {
		this.str = str;
	}
	@Override
	public void draw() {
		System.out.println(str + " 을 그렸습니다.");
		
	}
}

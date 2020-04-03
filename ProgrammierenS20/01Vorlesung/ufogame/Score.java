package ufogame;

import java.awt.Color;
import java.awt.Font;


import view.IGameObject;

public class Score implements IGameObject {
	
	
	private int x;
	private int y;
	private Font font;
	private float textSize;
	private Color color;
	private int score;
	
	
	public Score(int x, int y, Font font, float textSize, Color color, int score) {
		super();
		this.x = x;
		this.y = y;
		this.font = font;
		this.textSize = textSize;
		this.color = color;
		this.score = score;
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public Font getFont() {
		return font;
	}


	public void setFont(Font font) {
		this.font = font;
	}


	public float getTextSize() {
		return textSize;
	}


	public void setTextSize(float textSize) {
		this.textSize = textSize;
	}


	public Color getColor() {
		return color;
	}


	public void setColor(Color color) {
		this.color = color;
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}


	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public String getImagePath() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
}
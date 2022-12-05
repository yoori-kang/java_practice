package com.mc.h_abstract;

public class Rectangle extends Figure {
	
	private double width;
	private double height;
	public double getWidth() {
		return width;
	}
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public double calArea() {
		return height * width;
	}
}

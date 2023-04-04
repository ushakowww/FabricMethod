package com.example.fabricmethod.model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public abstract class MyShape{
    public int getNumBold() {
        return numBold;
    }

    public void setNumBold(int numBold) {
        this.numBold = numBold;
    }

    protected int numBold;

    abstract public void draw(GraphicsContext gr);

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    protected Color color;
    protected Color color2;

    public Color getColor2() {
        return color2;
    }
    public void setColor2(Color color2) {
        this.color2 = color2;
    }
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    protected double x;
    protected double y;

}

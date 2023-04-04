package com.example.fabricmethod.model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Circle extends MyShape {
    @Override
    public String toString() {
        return "Круг";
    }

    @Override
    public void draw(GraphicsContext gr) {
        gr.setLineWidth(this.numBold);
        gr.setFill(this.color);
        gr.setStroke(this.color2);
        gr.fillOval(this.x, this.y, 70, 70);
        gr.strokeOval(this.x, this.y, 70, 70);
    }

}
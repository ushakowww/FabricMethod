package com.example.fabricmethod.model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Lines extends MyShape {
    @Override
    public String toString() {
        return "Линия";
    }

    @Override
    public void draw(GraphicsContext gr) {
        gr.setStroke(this.color);
        gr.setLineWidth(this.numBold);
        gr.strokeLine(this.x, this.y, 500, 0);
    }
}
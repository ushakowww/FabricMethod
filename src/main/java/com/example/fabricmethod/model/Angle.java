package com.example.fabricmethod.model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Angle extends MyShape {
    @Override
    public String toString() {
        return "Угол";
    }

    @Override
    public void draw(GraphicsContext gr) {
        gr.setStroke(this.color);
        gr.setLineWidth(10);
        gr.strokePolygon(new double[]{25, 250},
                new double[]{25,25},2
        );
        gr.strokePolygon(new double[]{30, 30},
                new double[]{25,250},2
        );
    }
}

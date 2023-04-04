package com.example.fabricmethod.model;

import javafx.scene.paint.Color;

public class ShapeFactory implements IFactory{
    public MyShape createPolygon(int numberOfSides) {
        if (numberOfSides == 2) {
            return new Angle();
        }
        else if (numberOfSides == 1) {
            return new Lines();
        }
        else if (numberOfSides == 0) {
            return new Circle();
        }
        else
            return new Angle();
    }
}





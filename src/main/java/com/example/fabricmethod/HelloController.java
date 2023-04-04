package com.example.fabricmethod;

import com.example.fabricmethod.model.MyShape;
import com.example.fabricmethod.model.ShapeFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class HelloController {
    public Canvas canv;
    public TextField addPicker;
    public Button clear;
    public Label labelFigure;
    public ColorPicker colors;
    public ColorPicker colors2;
    public TextField addBoldLine;
    public Button butLineBold;
    private double x = 0;
    private double y = 0;


    @FXML
    public void onHelloButtonClick(MouseEvent mouseEvent) {
        TextField textField1 = new TextField();
        int number = Integer.parseInt(addPicker.getText());
        int numBold = Integer.parseInt(addBoldLine.getText());
        ShapeFactory shapeFactory = new ShapeFactory(); //get an object  and call its draw method.
        MyShape shape = shapeFactory.createPolygon(number);
        GraphicsContext gc = canv.getGraphicsContext2D(); //получить контекст(холст) для рисования
        this.x = mouseEvent.getX();
        this.y = mouseEvent.getY();
        shape.setColor(colors.getValue());
        shape.setColor2(colors2.getValue());
        shape.setX(this.x);
        shape.setY(this.y);
        shape.setNumBold(numBold);
        shape.draw(gc); //вызов метода рисования по холсту
        labelFigure.setText(shape.toString());
    }
    @FXML
    public void clearCanvas() {
        GraphicsContext gc = canv.getGraphicsContext2D();
        gc.clearRect(0, 0, canv.getWidth(), canv.getHeight());
        labelFigure.setText("не отображена");
    }
}


package uz.bakhromjon.javafxeventhandling;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;

public class Controller {

    @FXML
    private Circle myCircle;
    public void up(ActionEvent event) {
//        System.out.println("UP");
        myCircle.setCenterY(myCircle.getCenterY() - 10);
    }

    public void down(ActionEvent event) {
//        System.out.println("DOWN");
        myCircle.setCenterY(myCircle.getCenterY() + 10);
    }

    public void right(ActionEvent event) {
//        System.out.println("RIGHT");
        myCircle.setCenterX(myCircle.getCenterX() + 10);
    }

    public void left(ActionEvent event) {
//        System.out.println("LEFT");
        myCircle.setCenterX(myCircle.getCenterX() - 10);
    }

}
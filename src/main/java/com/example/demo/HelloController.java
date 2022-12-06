package com.example.demo;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Paint;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Button btnSave;

    @FXML
    private Button btnStart;

    @FXML
    private Button btnreset;

    @FXML
    private Group cells;

    @FXML
    private Slider sliderSpeed;

    @FXML
    private TextField txtfldDim;

    @FXML
    private TextField txtfldX;

    @FXML
    private TextField txtfldY;

    private Grid grid;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        btnStart.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                cells.getChildren().removeAll();
                int dimension = Integer.parseInt(txtfldDim.getText());
                int x = Integer.parseInt(txtfldX.getText());
                int y = Integer.parseInt(txtfldY.getText());
                grid = new Grid(cells, dimension);
                grid.getGrid()[x][y].setFill(Paint.valueOf("Black"));
            }
        });
    }
}
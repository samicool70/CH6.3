import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.text.DecimalFormat;

import java.awt.*;
import java.text.DecimalFormat;

public class MathCalculatorDriver1 extends Application {
    TextField textField1 = new TextField();
    TextField textField2 = new TextField();
    Label label = new Label("0.0");
    Button buttonSum = new Button("SUM");
    Button buttonProduct = new Button("Product");
    Button buttonFactorial = new Button("Factorial");
    Button buttonAverage = new Button("Average");


    @Override
    public void start(Stage primaryStage) throws Exception {
        FlowPane flow = new FlowPane();
        flow.getChildren().addAll(label, textField1, textField2, buttonSum,buttonAverage,buttonProduct,buttonFactorial);
        buttonSum.setOnAction(e -> {
            double result = Double.parseDouble(textField1.getText()) + Double.parseDouble(textField2.getText());
            DecimalFormat format = new DecimalFormat("####.00");
            label.setText(format.format(result));
        });

        buttonAverage.setOnAction(event -> {
            double [] x = {Double.parseDouble(textField1.getText()),Double.parseDouble(textField2.getText())};
            DecimalFormat format = new DecimalFormat("###.00");
            label.setText(format.format(MathCalculator1.findAverage(x)));

        });
        buttonProduct.setOnAction(e -> {
            double result = Double.parseDouble(textField1.getText())* Double.parseDouble(textField2.getText());
            DecimalFormat format = new DecimalFormat("####.00");
            label.setText(format.format(result));
        });
        buttonFactorial.setOnAction(event -> {
            double [] x = {Double.parseDouble(textField1.getText())* Double.parseDouble(textField2.getText())};
            String result = "";
            result += MathCalculator1.factorial((int)x[0])+"\t";
            result +=MathCalculator1.factorial((int)x[0])+"\t";
            label.setText(result);
        });
        Scene scene = new Scene(flow);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String [] args) {launch(args);}

}

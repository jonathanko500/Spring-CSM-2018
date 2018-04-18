import javafx.application.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.*;

public class M11Prac extends Application
{
	private CheckBox description;
	private Text write;
	private RadioButton dog1,dog2;
	private Image first,second;
	private ImageView picView;
	public void start(Stage primaryStage)
	{
		//pane
		VBox box = new VBox();
		box.setAlignment(Pos.CENTER);
		//picture
		first = new Image("dog2.jpg",300,300,true,true);
		picView = new ImageView(first);
		box.getChildren().add(picView);
		//text
		write = new Text("My lazy and happy dog.");
		write.setFont(Font.font(30));
		box.getChildren().add(write);
		//scene
		Scene scene = new Scene(box, 350,350);
		//checkbox
		description=new CheckBox("Display Description");
		description.setSelected(true);
		description.setOnAction(this::handleDescription);
		box.getChildren().add(description);
		//radio button
		ToggleGroup picGroup= new ToggleGroup();
		dog1 = new RadioButton("Pic 1");
		dog1.setToggleGroup(picGroup);
		dog1.setSelected(true);
		dog1.setOnAction(this::handleRadio);
		
		dog2 = new RadioButton("Pic 2");
		dog2.setToggleGroup(picGroup);
		dog2.setOnAction(this::handleRadio);
		
		HBox radioButton= new HBox(dog1,dog2);
		radioButton.setAlignment(Pos.CENTER);
		box.getChildren().add(radioButton);
		//display
		primaryStage.setScene(scene);
		primaryStage.setTitle("M11 Prac");
		primaryStage.show();
		
	}
	private void handleDescription(ActionEvent event)
	{
		if(description.isSelected())
		{
			write.setVisible(true);
		}
		else if(!description.isSelected())
		{
			write.setVisible(false);
		}
	}
	private void handleRadio(ActionEvent event)
	{
		if(dog1.isSelected())
		{
			picView.setImage(first);
		}
		else if(dog2.isSelected())
		{
			second = new Image("dog.jpg",300,300,true,true);
			picView.setImage(second);
		}
	}
	public static void main(String[] args) {
		launch(args);

	}
}

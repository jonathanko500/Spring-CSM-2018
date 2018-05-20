import java.util.*;
/*
import javafx.application.*;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.text.*;
import javafx.stage.*;
*/
public class Final  //extends Application
{//start class
	/*
	private TextField numberInputField; 
	private Text resultOutputText; 
	
	public void start(Stage primStage)
	{//start
		Pane pane = new FlowPane();
		
		Scene scene = new Scene(pane, 500,500,Color.WHITE);
		//text
		resultOutputText=new Text("There is no number");
		pane.getChildren().add(resultOutputText);
		//textfield
		numberInputField=new TextField();
		numberInputField.setOnAction(this::respondToTextField);
		pane.getChildren().add(numberInputField);
		//display
		primStage.setTitle("Title");
		primStage.setScene(scene);
		primStage.show();
	}//end
	private void respondToTextField(ActionEvent e)
	{//start
		String ans=numberInputField.getText();
		int numb = Integer.parseInt(ans);
		if((numb%2)==0)
		{
			ans="even";
		}
		else
		{
			ans="odd";
		}
		resultOutputText.setText("Number is "+ans);
	}//end
	*/
	public static void main(String[] args) 
	{//start
		ArrayList<House> list = new ArrayList<House>(4);
		House numb1 = new House(5,true);
		list.add(numb1);
		HouseBoat numb2 = new HouseBoat(2,true,"Nemo");
		list.add(numb2);
		House numb3 = new House(4,false);
		list.add(numb3);
		HouseBoat numb4 = new HouseBoat(-9,true,"Dory");
		list.add(numb4);
		int count=0;
		Object x;
		for(int i=0;i<list.size();i++)
		{//start loo[
			System.out.println(list.get(i).toString());
			x=list.get(i);
			if(x instanceof HouseBoat)
			{
				if(((HouseBoat) x).getName().contains("Z"))
				{
					count++;
				}
			}
		}//end loop
		System.out.println("There are "+count+" houseboats that has a name with the letter \"Z\"");
	}//end
	
}//end class

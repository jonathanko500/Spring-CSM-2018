import javafx.application.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.text.*;
import javafx.stage.*;

public class RockPaperScissorsFXGUI extends Application
{//start class
	private ImageView computerMoveImageView, userMoveImageView;
	private Image rockImage, paperImage, scissorsImage,compPicture;
	private Text matchOutcomeText, cWinsText, uWinsText, tieText;
	private Button rockButton, paperButton, scissorsButton;
	private HBox labelBox;
	private RPS.Moves CompPick,UserPick;
	private RPS.Outcome end;

	private RPS game= new RPS();
	
	public void start(Stage primaryStage)
	{//start
		/* the image and labels for the computer and user move */
		rockImage = new Image("rock.jpg");
		paperImage = new Image("paper.jpg");
		scissorsImage = new Image("scissors.jpg");

		computerMoveImageView = new ImageView(rockImage);
		computerMoveImageView.setVisible(false); // used to make the initial screen layout appear the same as when the game starts
		userMoveImageView = new ImageView(rockImage);
		userMoveImageView.setVisible(false); 
		HBox imageBox = new HBox(computerMoveImageView, userMoveImageView);
		imageBox.setAlignment(Pos.CENTER);
		imageBox.setSpacing(20);

		Text computerLabel = new Text("Computer's Move");
		computerLabel.setFont(Font.font("Helvetica", 14));
		Text yourLabel = new Text("Your Move");
		yourLabel.setFont(Font.font("Helvetica", 14));
		labelBox = new HBox(computerLabel, yourLabel);
		labelBox.setAlignment(Pos.CENTER);
		labelBox.setSpacing(30);
		labelBox.setVisible(false);
		
		/* the results of each match */
		matchOutcomeText = new Text();
		matchOutcomeText.setFill(Color.GREEN);
		matchOutcomeText.setFont(Font.font("Helvetica", 20));
		
		/* the buttons for the user's play */
		rockButton = new Button("Play Rock");
		rockButton.setOnAction(this::handleUserPlay);
		paperButton = new Button("Play Paper");
		paperButton.setOnAction(this::handleUserPlay);
		scissorsButton = new Button("Play Scissors");
		scissorsButton.setOnAction(this::handleUserPlay);
		HBox buttonBox = new HBox(rockButton, paperButton, scissorsButton);
		buttonBox.setSpacing(10);
		buttonBox.setAlignment(Pos.CENTER);
		
		
		
		/* the game statistics */
		cWinsText = new Text("Computer Wins: " +game.getCWin());
		cWinsText.setFont(Font.font("Helvetica", 16));
		cWinsText.setFill(Color.BLUE);
		uWinsText = new Text("User Wins: " + game.getUWin());
		uWinsText.setFont(Font.font("Helvetica", 16));
		uWinsText.setFill(Color.BLUE);
		tieText = new Text("Ties: " + game.getTie());
		tieText.setFont(Font.font("Helvetica", 16));
		tieText.setFill(Color.BLUE);
		HBox statsBox = new HBox(cWinsText, uWinsText, tieText);
		statsBox.setSpacing(10);
		statsBox.setAlignment(Pos.CENTER);
		
		VBox pane = new VBox(imageBox, labelBox, matchOutcomeText, buttonBox,statsBox);//statsBox
		pane.setAlignment(Pos.CENTER);
		pane.setSpacing(20);
		pane.setStyle("-fx-background-color: white");
		
		Scene scene = new Scene(pane, 400, 400, Color.TRANSPARENT);
		primaryStage.setTitle("Rock, Paper, Scissors, Go!");
		primaryStage.setResizable(false);
		primaryStage.setScene(scene);
		primaryStage.show();
	}//end
	
	private void handleUserPlay(ActionEvent event)
	{//START
		// to make all aspects of the display visible
		if(event.getSource()==paperButton)
		{
			userMoveImageView.setImage(paperImage);
			UserPick=RPS.Moves.PAPER;
			
		}
		else if(event.getSource()==scissorsButton)
		{
			userMoveImageView.setImage(scissorsImage);
			UserPick=RPS.Moves.SCISSORS;
		}
		else
		{
			userMoveImageView.setImage(rockImage);
			UserPick=RPS.Moves.ROCK;
		}
		
		//make comp picture
		CompPick = game.generateCompuetrPlay();
		if(CompPick==RPS.Moves.ROCK)
		{
			compPicture=rockImage;
		}
		else if(CompPick==RPS.Moves.PAPER)
		{
			compPicture=paperImage;
		}
		else if(CompPick==RPS.Moves.SCISSORS)
		{
			compPicture=scissorsImage;
		}
		
		//determine winner
		end=game.findWinner(UserPick, CompPick);
		if(end==RPS.Outcome.COMP_WIN)
		{
			matchOutcomeText.setText("Computer Wins!");
		}
		else if(end==RPS.Outcome.USER_WIN)
		{
			matchOutcomeText.setText("You Wins!");
		}
		else if(end==RPS.Outcome.TIE)
		{
			matchOutcomeText.setText("It is a tie!");
		}
		
		//update score
		cWinsText.setText("Computer score: "+game.getCWin());
		uWinsText.setText("Your score: "+game.getUWin());
		tieText.setText("Number of ties: "+game.getTie());
		
		//display everything
		computerMoveImageView.setImage(compPicture);
		userMoveImageView.setVisible(true);
		computerMoveImageView.setVisible(true);
		labelBox.setVisible(true);
	}//END
	public static void main(String[] args) {
		launch(args);
	}
}//end class

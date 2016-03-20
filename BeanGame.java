import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class BeanGame extends Application
{
	public void start (Stage primaryStage) {
		
		//Creates a Scene for a specific root Node with a specific size.
		Scene scene = new Scene(new LinePane(),300,300);		
		//Defines whether the Stage is do not to resizable by the user
		primaryStage.setResizable(false);
		//Set title from the window 
		primaryStage.setTitle("Exercise14_29");
		//Add Scene from the window
		primaryStage.setScene(scene);
		//Show the window
		primaryStage.show();
	}
	
	class LinePane extends Pane {
		public LinePane(){
			
			//Creates a new instance of Lines.
			Line line1 = new Line(170,40,170,80);
			Line line2 = new Line(130,40,130,80);
			Line line3 = new Line(130,80,60,220);
			Line line4 = new Line(60,220,60,270);
			Line line5 = new Line(60,270,240,270);
			Line line6 = new Line(170,80,240,220);
			Line line7 = new Line(240,270,240,220);
			Line line8 = new Line(82.5,270,82.5,220);
			Line line9 = new Line(105,270,105,220);
			Line line10 = new Line(127.5,270,127.5,220);
			Line line11 = new Line(150,270,150,220);
			Line line12 = new Line(172.5,270,172.5,220);
			Line line13 = new Line(195,270,195,220);
			Line line14 = new Line(217.5,270,217.5,220);
			
			//Set lines Width
			line1.setStrokeWidth(3);
			line2.setStrokeWidth(3);
			line3.setStrokeWidth(3);
			line4.setStrokeWidth(3);
			line5.setStrokeWidth(3);
			line6.setStrokeWidth(3);
			line7.setStrokeWidth(3);
			line8.setStrokeWidth(3);
			line9.setStrokeWidth(3);
			line10.setStrokeWidth(3);
			line11.setStrokeWidth(3);
			line12.setStrokeWidth(3);
			line13.setStrokeWidth(3);
			line14.setStrokeWidth(3);
			
			//Set lines Color for green
			line1.setStroke(Color.GREEN);
			line2.setStroke(Color.GREEN);
			line3.setStroke(Color.GREEN);
			line4.setStroke(Color.GREEN);
			line5.setStroke(Color.GREEN);
			line6.setStroke(Color.GREEN);
			line7.setStroke(Color.GREEN);
			line8.setStroke(Color.GREEN);
			line9.setStroke(Color.GREEN);
			line10.setStroke(Color.GREEN);
			line11.setStroke(Color.GREEN);				
			line12.setStroke(Color.GREEN);			
			line13.setStroke(Color.GREEN);					
			line14.setStroke(Color.GREEN);
			
			//Add lines from the pane
			getChildren().addAll(line1,line2,line3,line4,line5,line6,line7,line8,line9,line10,line11,line12,line13,line14);
					
			//Creates a new instance of Circles with a specified position and radius.
			Circle circle1 = new Circle(217.5,215,4);
			Circle circle2 = new Circle(195,215,4);
			Circle circle3 = new Circle(172.5,215,4);
			Circle circle4 = new Circle(150,215,4);
			Circle circle5 = new Circle(127.5,215,4);
			Circle circle6 = new Circle(105,215,4);
			Circle circle7 = new Circle(82.5,215,4);
			
			//Add seven circles from the first line
			getChildren().addAll(circle7,circle6,circle5,circle4,circle3,circle2,circle1);
			
			Circle circle8 = new Circle(93.75,195,4);
			Circle circle9 = new Circle(115.75,195,4);
			Circle circle10 = new Circle(138.25,195,4);
			Circle circle11 = new Circle(160.75,195,4);
			Circle circle12 = new Circle(183.25,195,4);
			Circle circle13 = new Circle(205.75,195,4);
			
			//Add six circles from the second line
			getChildren().addAll(circle8,circle9,circle10,circle11,circle12,circle13);
			
			Circle circle14 = new Circle(194.5,175,4);
			Circle circle15 = new Circle(172,175,4);
			Circle circle16 = new Circle(149.5,175,4);
			Circle circle17 = new Circle(127,175,4);
			Circle circle18 = new Circle(104.5,175,4);
			
			//Add five circles from the third line
			getChildren().addAll(circle14,circle15,circle16,circle17,circle18);
			
			Circle circle19 = new Circle(115.75,155,4);
			Circle circle20 = new Circle(138.25,155,4);
			Circle circle21 = new Circle(160.75,155,4);
			Circle circle22 = new Circle(183.25,155,4);
			
			//Add four circles from the fourth line
			getChildren().addAll(circle19,circle20,circle21,circle22);
			
			Circle circle23 = new Circle(172,135,4);
			Circle circle24 = new Circle(149.5,135,4);
			Circle circle25 = new Circle(127,135,4);
			
			//Add three circles from the fifth line
			getChildren().addAll(circle23,circle24,circle25);
			
			Circle circle26 = new Circle(138.25,115,4);
			Circle circle27 = new Circle(160.75,115,4);
			
			//Add two circles from the sixth line
			getChildren().addAll(circle26,circle27);
			
			Circle circle28 = new Circle(149.5,95,4);
			
			//Add one circles from the seventh line
			getChildren().add(circle28);
			
			//Set circles Color
			circle1.setStroke(Color.GREEN);
			circle2.setStroke(Color.GREEN);
			circle3.setStroke(Color.GREEN);
			circle4.setStroke(Color.GREEN);
			circle5.setStroke(Color.GREEN);
			circle6.setStroke(Color.GREEN);
			circle7.setStroke(Color.GREEN);
			circle8.setStroke(Color.GREEN);
			circle9.setStroke(Color.GREEN);
			circle10.setStroke(Color.GREEN);
			circle11.setStroke(Color.GREEN);
			circle12.setStroke(Color.GREEN);
			circle13.setStroke(Color.GREEN);
			circle14.setStroke(Color.GREEN);
			circle15.setStroke(Color.GREEN);
			circle16.setStroke(Color.GREEN);
			circle17.setStroke(Color.GREEN);
			circle18.setStroke(Color.GREEN);
			circle19.setStroke(Color.GREEN);
			circle20.setStroke(Color.GREEN);
			circle21.setStroke(Color.GREEN);
			circle22.setStroke(Color.GREEN);
			circle23.setStroke(Color.GREEN);
			circle24.setStroke(Color.GREEN);
			circle25.setStroke(Color.GREEN);
			circle26.setStroke(Color.GREEN);
			circle27.setStroke(Color.GREEN);
			
			//Set circles Width
			circle1.setStrokeWidth(3);
			circle2.setStrokeWidth(3);			
			circle3.setStrokeWidth(3);			
			circle4.setStrokeWidth(3);			
			circle5.setStrokeWidth(3);			
			circle6.setStrokeWidth(3);
			circle7.setStrokeWidth(3);				
			circle8.setStrokeWidth(3);			
			circle9.setStrokeWidth(3);			
			circle10.setStrokeWidth(3);			
			circle11.setStrokeWidth(3);			
			circle12.setStrokeWidth(3);			
			circle13.setStrokeWidth(3);						
			circle14.setStrokeWidth(3);						
			circle15.setStrokeWidth(3);			
			circle16.setStrokeWidth(3);			
			circle17.setStrokeWidth(3);			
			circle18.setStrokeWidth(3);									
			circle19.setStrokeWidth(3);			
			circle20.setStrokeWidth(3);			
			circle21.setStrokeWidth(3);					
			circle22.setStrokeWidth(3);						
			circle23.setStrokeWidth(3);				
			circle24.setStrokeWidth(3);			
			circle25.setStrokeWidth(3);									
			circle26.setStrokeWidth(3);			
			circle27.setStrokeWidth(3);			
			circle28.setStrokeWidth(3);									
		}
	}
}

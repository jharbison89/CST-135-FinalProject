import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group; 
import javafx.scene.Scene;
import javafx.stage.Stage; 
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;


public class Main extends Application {
	/* 
	 * Created by James Harbison and Chase Hausman
	 * This class tests the purchase order class by creating a random array of dispensers and creating a purchase 
	 * order off of those randomly filled dispensers 
	 */

	@Override
	public void start(Stage stage) throws Exception { 
		stage.setTitle("Dispensers");
		
		// initialize an array of Dispensers 
		Dispenser[] dispensers = new Dispenser[4];
		
		dispensers[0] = new Dispenser(8, "Drinks", "DRINK");
		dispensers[1] = new Dispenser(8, "Gum", "GUM");
		dispensers[2] = new Dispenser(8, "Chips", "CHIP");
		dispensers[3] = new Dispenser(8, "Candy", "CANDY");
				
		// initialize new restock
		Restock restock = new Restock();
				
		Button[] dispenser0Buttons = new Button[dispensers[0].getSize()];
		
		for(int i = 0; i < dispensers[0].getSize(); i ++) {
			if(dispensers[0].getProductCurrentInventory(i) > 0) {
				dispenser0Buttons[i] = new Button(dispensers[0].getProductName(i) + " $" + String.format("%.2f", dispensers[0].getProductPrice(i)));
			}
			else {
				dispenser0Buttons[i] = new Button("Sold Out");
			}
			
			dispenser0Buttons[i].setPrefSize(200, 50);
		}
		
		dispenser0Buttons[0].setOnAction(Value ->{
			if(dispensers[0].getProductCurrentInventory(0) > 0) {
				dispensers[0].setProductCurrentInventory(0, dispensers[0].getProductCurrentInventory(0) - 1);
			}
			
			if(dispensers[0].getProductCurrentInventory(0) <= 0) {
				dispenser0Buttons[0].setText("Sold Out");
				}
			});
		
		dispenser0Buttons[1].setOnAction(Value ->{
			if(dispensers[0].getProductCurrentInventory(1) > 0) {
				dispensers[0].setProductCurrentInventory(1, dispensers[0].getProductCurrentInventory(1) - 1);
			}
			
			if(dispensers[0].getProductCurrentInventory(1) <= 0) {
				dispenser0Buttons[1].setText("Sold Out");
				}
			});
		
		dispenser0Buttons[2].setOnAction(Value ->{
			if(dispensers[0].getProductCurrentInventory(2) > 0) {
				dispensers[0].setProductCurrentInventory(2, dispensers[0].getProductCurrentInventory(1) - 1);
			}
			
			if(dispensers[0].getProductCurrentInventory(2) <= 0) {
				dispenser0Buttons[2].setText("Sold Out");
				}
			});
		
		dispenser0Buttons[3].setOnAction(Value ->{
			if(dispensers[0].getProductCurrentInventory(3) > 0) {
				dispensers[0].setProductCurrentInventory(3, dispensers[0].getProductCurrentInventory(3) - 1);
			}
			
			if(dispensers[0].getProductCurrentInventory(3) <= 0) {
				dispenser0Buttons[3].setText("Sold Out");
				}
			});
		
		dispenser0Buttons[4].setOnAction(Value ->{
			if(dispensers[0].getProductCurrentInventory(4) > 0) {
				dispensers[0].setProductCurrentInventory(4, dispensers[0].getProductCurrentInventory(4) - 1);
			}
			
			if(dispensers[0].getProductCurrentInventory(4) <= 0) {
				dispenser0Buttons[4].setText("Sold Out");
				}
			});
		
		dispenser0Buttons[5].setOnAction(Value ->{
			if(dispensers[0].getProductCurrentInventory(5) > 0) {
				dispensers[0].setProductCurrentInventory(5, dispensers[0].getProductCurrentInventory(5) - 1);
			}
			
			if(dispensers[0].getProductCurrentInventory(5) <= 0) {
				dispenser0Buttons[5].setText("Sold Out");
				}
			});
		
		dispenser0Buttons[6].setOnAction(Value ->{
			if(dispensers[0].getProductCurrentInventory(6) > 0) {
				dispensers[0].setProductCurrentInventory(6, dispensers[0].getProductCurrentInventory(6) - 1);
			}
			
			if(dispensers[0].getProductCurrentInventory(6) <= 0) {
				dispenser0Buttons[6].setText("Sold Out");
				}
			});
		
		dispenser0Buttons[7].setOnAction(Value ->{
			if(dispensers[0].getProductCurrentInventory(7) > 0) {
				dispensers[0].setProductCurrentInventory(7, dispensers[0].getProductCurrentInventory(7) - 1);
			}
			
			if(dispensers[0].getProductCurrentInventory(7) <= 0) {
				dispenser0Buttons[7].setText("Sold Out");
				}
			});
		
		VBox dispenser0 = new VBox();
		
		dispenser0.getChildren().add(new Text(dispensers[0].getName()));
		
		for(int i = 0; i < dispenser0Buttons.length; i ++) {
			dispenser0.getChildren().add(dispenser0Buttons[i]);
		}
		
		Button[] dispenser1Buttons = new Button[dispensers[1].getSize()];
		
		for(int i = 0; i < dispensers[1].getSize(); i ++) {
			if(dispensers[1].getProductCurrentInventory(i) > 0) {
				dispenser1Buttons[i] = new Button(dispensers[1].getProductName(i) + " $" + String.format("%.2f", dispensers[1].getProductPrice(i)));
			}
			else {
				dispenser1Buttons[i] = new Button("Sold Out");
			}
			
			dispenser1Buttons[i].setPrefSize(200, 50);
		}
		
		dispenser1Buttons[0].setOnAction(Value ->{
			if(dispensers[1].getProductCurrentInventory(0) > 0) {
				dispensers[1].setProductCurrentInventory(0, dispensers[0].getProductCurrentInventory(0) - 1);
			}
			
			if(dispensers[1].getProductCurrentInventory(0) <= 0) {
				dispenser1Buttons[0].setText("Sold Out");
				}
			});
		
		dispenser1Buttons[1].setOnAction(Value ->{
			if(dispensers[1].getProductCurrentInventory(1) > 0) {
				dispensers[1].setProductCurrentInventory(1, dispensers[1].getProductCurrentInventory(1) - 1);
			}
			
			if(dispensers[1].getProductCurrentInventory(1) <= 0) {
				dispenser1Buttons[1].setText("Sold Out");
				}
			});
		
		dispenser1Buttons[2].setOnAction(Value ->{
			if(dispensers[1].getProductCurrentInventory(2) > 0) {
				dispensers[1].setProductCurrentInventory(2, dispensers[1].getProductCurrentInventory(1) - 1);
			}
			
			if(dispensers[1].getProductCurrentInventory(2) <= 0) {
				dispenser1Buttons[2].setText("Sold Out");
				}
			});
		
		dispenser1Buttons[3].setOnAction(Value ->{
			if(dispensers[1].getProductCurrentInventory(3) > 0) {
				dispensers[1].setProductCurrentInventory(3, dispensers[1].getProductCurrentInventory(3) - 1);
			}
			
			if(dispensers[1].getProductCurrentInventory(3) <= 0) {
				dispenser1Buttons[3].setText("Sold Out");
				}
			});
		
		dispenser1Buttons[4].setOnAction(Value ->{
			if(dispensers[1].getProductCurrentInventory(4) > 0) {
				dispensers[1].setProductCurrentInventory(4, dispensers[1].getProductCurrentInventory(4) - 1);
			}
			
			if(dispensers[1].getProductCurrentInventory(4) <= 0) {
				dispenser1Buttons[4].setText("Sold Out");
				}
			});
		
		dispenser1Buttons[5].setOnAction(Value ->{
			if(dispensers[1].getProductCurrentInventory(5) > 0) {
				dispensers[1].setProductCurrentInventory(5, dispensers[1].getProductCurrentInventory(5) - 1);
			}
			
			if(dispensers[1].getProductCurrentInventory(5) <= 0) {
				dispenser1Buttons[5].setText("Sold Out");
				}
			});
		
		dispenser1Buttons[6].setOnAction(Value ->{
			if(dispensers[1].getProductCurrentInventory(6) > 0) {
				dispensers[1].setProductCurrentInventory(6, dispensers[1].getProductCurrentInventory(6) - 1);
			}
			
			if(dispensers[1].getProductCurrentInventory(6) <= 0) {
				dispenser1Buttons[6].setText("Sold Out");
				}
			});
		
		dispenser1Buttons[7].setOnAction(Value ->{
			if(dispensers[1].getProductCurrentInventory(7) > 0) {
				dispensers[1].setProductCurrentInventory(7, dispensers[1].getProductCurrentInventory(7) - 1);
			}
			
			if(dispensers[1].getProductCurrentInventory(7) <= 0) {
				dispenser1Buttons[7].setText("Sold Out");
				}
			});
		
		
		VBox dispenser1 = new VBox();
		
		dispenser1.getChildren().add(new Text(dispensers[1].getName()));
		
		for(int i = 0; i < dispenser1Buttons.length; i ++) {
			dispenser1.getChildren().add(dispenser1Buttons[i]);
		}
		
		Button[] dispenser2Buttons = new Button[dispensers[2].getSize()];
		
		for(int i = 0; i < dispensers[2].getSize(); i ++) {
			if(dispensers[2].getProductCurrentInventory(i) > 0) {
				dispenser2Buttons[i] = new Button(dispensers[2].getProductName(i) + " $" + String.format("%.2f", dispensers[2].getProductPrice(i)));
			}
			else {
				dispenser2Buttons[i] = new Button("Sold Out");
			}
			
			dispenser2Buttons[i].setPrefSize(200, 50);
		}
		
		dispenser2Buttons[0].setOnAction(Value ->{
			if(dispensers[2].getProductCurrentInventory(0) > 0) {
				dispensers[2].setProductCurrentInventory(0, dispensers[2].getProductCurrentInventory(0) - 1);
			}
			
			if(dispensers[2].getProductCurrentInventory(0) <= 0) {
				dispenser2Buttons[0].setText("Sold Out");
				}
			});
		
		dispenser2Buttons[1].setOnAction(Value ->{
			if(dispensers[2].getProductCurrentInventory(1) > 0) {
				dispensers[2].setProductCurrentInventory(1, dispensers[2].getProductCurrentInventory(1) - 1);
			}
			
			if(dispensers[2].getProductCurrentInventory(1) <= 0) {
				dispenser2Buttons[1].setText("Sold Out");
				}
			});
		
		dispenser2Buttons[2].setOnAction(Value ->{
			if(dispensers[2].getProductCurrentInventory(2) > 0) {
				dispensers[2].setProductCurrentInventory(2, dispensers[2].getProductCurrentInventory(1) - 1);
			}
			
			if(dispensers[2].getProductCurrentInventory(2) <= 0) {
				dispenser2Buttons[2].setText("Sold Out");
				}
			});
		
		dispenser2Buttons[3].setOnAction(Value ->{
			if(dispensers[2].getProductCurrentInventory(3) > 0) {
				dispensers[2].setProductCurrentInventory(3, dispensers[2].getProductCurrentInventory(3) - 1);
			}
			
			if(dispensers[2].getProductCurrentInventory(3) <= 0) {
				dispenser2Buttons[3].setText("Sold Out");
				}
			});
		
		dispenser2Buttons[4].setOnAction(Value ->{
			if(dispensers[2].getProductCurrentInventory(4) > 0) {
				dispensers[2].setProductCurrentInventory(4, dispensers[2].getProductCurrentInventory(4) - 1);
			}
			
			if(dispensers[2].getProductCurrentInventory(4) <= 0) {
				dispenser2Buttons[4].setText("Sold Out");
				}
			});
		
		dispenser2Buttons[5].setOnAction(Value ->{
			if(dispensers[2].getProductCurrentInventory(5) > 0) {
				dispensers[2].setProductCurrentInventory(5, dispensers[2].getProductCurrentInventory(5) - 1);
			}
			
			if(dispensers[2].getProductCurrentInventory(5) <= 0) {
				dispenser2Buttons[5].setText("Sold Out");
				}
			});
		
		dispenser2Buttons[6].setOnAction(Value ->{
			if(dispensers[2].getProductCurrentInventory(6) > 0) {
				dispensers[2].setProductCurrentInventory(6, dispensers[2].getProductCurrentInventory(6) - 1);
			}
			
			if(dispensers[2].getProductCurrentInventory(6) <= 0) {
				dispenser2Buttons[6].setText("Sold Out");
				}
			});
		
		dispenser2Buttons[7].setOnAction(Value ->{
			if(dispensers[2].getProductCurrentInventory(7) > 0) {
				dispensers[2].setProductCurrentInventory(7, dispensers[2].getProductCurrentInventory(7) - 1);
			}
			
			if(dispensers[2].getProductCurrentInventory(7) <= 0) {
				dispenser2Buttons[7].setText("Sold Out");
				}
			});
		
		
		VBox dispenser2 = new VBox();
		
		dispenser2.getChildren().add(new Text(dispensers[2].getName()));
		
		for(int i = 0; i < dispenser2Buttons.length; i ++) {
			dispenser2.getChildren().add(dispenser2Buttons[i]);
		}
		
		Button[] dispenser3Buttons = new Button[dispensers[3].getSize()];
		
		for(int i = 0; i < dispensers[3].getSize(); i ++) {
			if(dispensers[3].getProductCurrentInventory(i) > 0) {
				dispenser3Buttons[i] = new Button(dispensers[3].getProductName(i) + " $" + String.format("%.2f", dispensers[3].getProductPrice(i)));
			}
			else {
				dispenser3Buttons[i] = new Button("Sold Out");
			}
			
			dispenser3Buttons[i].setPrefSize(200, 50);
		}
		
		dispenser3Buttons[0].setOnAction(Value ->{
			if(dispensers[3].getProductCurrentInventory(0) > 0) {
				dispensers[3].setProductCurrentInventory(0, dispensers[3].getProductCurrentInventory(0) - 1);
			}
			
			if(dispensers[3].getProductCurrentInventory(0) <= 0) {
				dispenser3Buttons[0].setText("Sold Out");
				}
			});
		
		dispenser3Buttons[1].setOnAction(Value ->{
			if(dispensers[3].getProductCurrentInventory(1) > 0) {
				dispensers[3].setProductCurrentInventory(1, dispensers[3].getProductCurrentInventory(1) - 1);
			}
			
			if(dispensers[3].getProductCurrentInventory(1) <= 0) {
				dispenser3Buttons[1].setText("Sold Out");
				}
			});
		
		dispenser3Buttons[2].setOnAction(Value ->{
			if(dispensers[3].getProductCurrentInventory(2) > 0) {
				dispensers[3].setProductCurrentInventory(2, dispensers[3].getProductCurrentInventory(1) - 1);
			}
			
			if(dispensers[3].getProductCurrentInventory(2) <= 0) {
				dispenser3Buttons[2].setText("Sold Out");
				}
			});
		
		dispenser3Buttons[3].setOnAction(Value ->{
			if(dispensers[3].getProductCurrentInventory(3) > 0) {
				dispensers[3].setProductCurrentInventory(3, dispensers[3].getProductCurrentInventory(3) - 1);
			}
			
			if(dispensers[3].getProductCurrentInventory(3) <= 0) {
				dispenser3Buttons[3].setText("Sold Out");
				}
			});
		
		dispenser3Buttons[4].setOnAction(Value ->{
			if(dispensers[3].getProductCurrentInventory(4) > 0) {
				dispensers[3].setProductCurrentInventory(4, dispensers[3].getProductCurrentInventory(4) - 1);
			}
			
			if(dispensers[3].getProductCurrentInventory(4) <= 0) {
				dispenser3Buttons[4].setText("Sold Out");
				}
			});
		
		dispenser3Buttons[5].setOnAction(Value ->{
			if(dispensers[3].getProductCurrentInventory(5) > 0) {
				dispensers[3].setProductCurrentInventory(5, dispensers[3].getProductCurrentInventory(5) - 1);
			}
			
			if(dispensers[3].getProductCurrentInventory(5) <= 0) {
				dispenser3Buttons[5].setText("Sold Out");
				}
			});
		
		dispenser3Buttons[6].setOnAction(Value ->{
			if(dispensers[3].getProductCurrentInventory(6) > 0) {
				dispensers[3].setProductCurrentInventory(6, dispensers[3].getProductCurrentInventory(6) - 1);
			}
			
			if(dispensers[3].getProductCurrentInventory(6) <= 0) {
				dispenser3Buttons[6].setText("Sold Out");
				}
			});
		
		dispenser3Buttons[7].setOnAction(Value ->{
			if(dispensers[3].getProductCurrentInventory(7) > 0) {
				dispensers[3].setProductCurrentInventory(7, dispensers[3].getProductCurrentInventory(7) - 1);
			}
			
			if(dispensers[3].getProductCurrentInventory(7) <= 0) {
				dispenser3Buttons[7].setText("Sold Out");
				}
			});
		
		
		VBox dispenser3 = new VBox();
		
		dispenser3.getChildren().add(new Text(dispensers[3].getName()));
		
		for(int i = 0; i < dispenser1Buttons.length; i ++) {
			dispenser3.getChildren().add(dispenser3Buttons[i]);
		}
		
		
		Button restockButton = new Button("Purchase Order");
		
		restockButton.setLayoutX(50);
		restockButton.setLayoutY(550);
		
		restockButton.setOnAction(Value -> {
			
			//Creating a Text object 
		    Text text = new Text();      
		    
		    //Setting the text to be added. 
		    text.setText(restock.purchaseOrder(dispensers)); 
		     
		    //setting the position of the text 
		    text.setX(50); 
		    text.setY(50); 
		       
		    //Creating a Group object  
		    Group root = new Group(text);
		             
		    //Creating a scene object 
		    Scene scene = new Scene(root, 400, 800);  
		    
		    //Setting title to the Stage 
		    stage.setTitle("Purchase Order"); 
		       
		    //Adding scene to the stage 
		    stage.setScene(scene); 
		       
		    //Displaying the contents of the stage 
		    stage.show(); 
  
			
		});
		
		HBox hbox = new HBox(40, dispenser0, dispenser1, dispenser2, dispenser3);
		
		Pane pane = new Pane();
		
		pane.getChildren().add(hbox);
		pane.getChildren().add(restockButton);
		
		
		Scene scene = new Scene(pane, 1000, 600);
		
		stage.setScene(scene);
		stage.show();		
	    
	 }      
	
	

	public static void main(String[] args) {
			
		Application.launch(args);
		
	}
}

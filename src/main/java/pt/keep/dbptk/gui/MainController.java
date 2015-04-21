package pt.keep.dbptk.gui;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class MainController {

	@FXML
	private Button btnMainImport;
	@FXML
	private Button btnMainExport;
	@FXML
	private Button btnExit;
	@FXML
	private Button btnAbout;
	
	@FXML private void btnMainImportAction(ActionEvent event) throws Exception{
		Node node= (Node) event.getSource();
		Stage stage=(Stage) node.getScene().getWindow();
		Parent root = FXMLLoader.load(getClass().getResource("/pt/keep/dbptk/gui/Import.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		stage.setScene(scene);
		stage.show();
		System.out.println("Import Action");
	}

	@FXML private void btnMainExportAction(ActionEvent event){

		System.out.println("Export Action");
	}
	
	@FXML private void btnAboutAction(ActionEvent event){

		System.out.println("About");
	}
	
	@FXML private void btnExitAction(ActionEvent event){
		Node node= (Node) event.getSource();
		Stage stage = (Stage) node.getScene().getWindow();
	    // do what you have to do
	    stage.close();
		System.out.println("Exit");
	}

	
		
	

}
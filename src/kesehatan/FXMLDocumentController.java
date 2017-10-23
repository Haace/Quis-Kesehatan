/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kesehatan;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 *
 * @author AdityaHarisCandra
 */
public class FXMLDocumentController implements Initializable {
    
   
     @FXML
    private JFXTextField nama;

    @FXML
    private JFXTextField tinggi;

    @FXML
    private JFXTextField beratbadan;

    @FXML
    private JFXRadioButton laki;

    @FXML
    private JFXRadioButton perempuan;

    @FXML
    private JFXButton prosses;

    @FXML
    private JFXButton reset;

    @FXML
    private JFXTextField tf1;

    @FXML
    private TextField tf2;

    @FXML
    private TextField tf3;
    
      @FXML
    private ToggleGroup klmn;
    
     @FXML
    void proses(ActionEvent event) {
           String Nama = nama.getText();
           int Tinggi = Integer.parseInt(tinggi.getText());
           int Berat = Integer.parseInt(beratbadan.getText());
           int Ideal = 0;
           String status = null;
           String srn = null;
           if(laki.isSelected()){
               Ideal = Tinggi - 105;
            if(Ideal < Berat){
                status = "OverWeight";
                srn = "Jaga Makanan Anda :)";
                
            }
            if(Ideal == Berat){
                status = "Ideal";
                srn = "Mantab Sam :)";
                
            }
            if(Ideal > Berat){
                status = "UnderWeight";
                srn = "Makan yang Banyak ya :)";
                
            }
           }
           if(perempuan.isSelected()){
               Ideal = Tinggi - 110;
            if(Ideal < Berat){
                status = "OverWeight";
                srn = "Jaga Makanan Anda :)";
                
            }
            if(Ideal == Berat){
                status = "Ideal";
                srn = "Mantab Sis :)";
                
            }
            if(Ideal > Berat){
                status = "UnderWeight";
                srn = "Makan yang Banyak ya :)";
                
            }
           }
           tf1.setText(""+Ideal);
           tf2.setText("nama "+Nama+" ,Anda "+status);
           tf3.setText(""+srn);
           
           
    }
    

    @FXML
    void reset(ActionEvent event) {
        laki.setSelected(false);
        perempuan.setSelected(false);
        nama.setText("");
        tinggi.setText("");
        beratbadan.setText("");
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

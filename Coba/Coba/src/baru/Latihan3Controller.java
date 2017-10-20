/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baru;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Konia Septia
 */
public class Latihan3Controller implements Initializable {

    @FXML
    private TextField Nama;
    @FXML
    private TextField Absen;
    @FXML
    private TextField Alamat;
    @FXML
    private TextField Telpon;
    @FXML
    private Button Proses;
    @FXML
    private Button Hapus;
    @FXML
    private TextArea Hasil;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void buttonProses(ActionEvent event) {
        String nama = Nama.getText();
        String absen = Absen.getText();
        String alamat = Alamat.getText();
        String telpon = Telpon.getText();
        
        Hasil.setText("Nama : "+nama+"\n"+"Absen : "+absen+"\n"+"Alamat : "+alamat+"\n"+"Telpon : "+telpon+"\n");
    }
    
    @FXML
    private void buttonHapus(ActionEvent event) {
        Hasil.setText("");
        Nama.setText("");
        Absen.setText("");
        Alamat.setText("");
        Telpon.setText("");
        
       
    }
    
}

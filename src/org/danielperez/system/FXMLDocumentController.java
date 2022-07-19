/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.danielperez.system;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author Alexander Ramos
 */
public class FXMLDocumentController implements Initializable {
    
    double dato1 = 0, dato2 = 0, result = 0;
    int opt;
    
    @FXML private Button btnCero;
    @FXML private Button btnUno;
    @FXML private Button btnDos;
    @FXML private Button btnTres;
    @FXML private Button btnCuatro;
    @FXML private Button btnCinco;
    @FXML private Button btnSeis;
    @FXML private Button btnSiete;
    @FXML private Button btnOcho;
    @FXML private Button btnNueve;
    @FXML private Button btnMas;
    @FXML private Button btnMenos;
    @FXML private Button btnMultiplicacion;
    @FXML private Button btnDivision;
    @FXML private Button btnPorcentaje;
    @FXML private Button btnXY;
    @FXML private Button btnABS;
    @FXML private Button btnRaizCuadrada;
    @FXML private Button btnPunto;
    @FXML private Button btnMasMenos;
    @FXML private Button btnIgual;
    @FXML private Button btnC;
    @FXML private Button btnCE;
    @FXML private TextField txtPantalla;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        if(event.getSource() == btnCero)
            txtPantalla.setText(txtPantalla.getText() + "0");
        
        else if(event.getSource() == btnUno)
            txtPantalla.setText(txtPantalla.getText() + "1");
        
        else if (event.getSource() == btnDos)
            txtPantalla.setText(txtPantalla.getText() + "2");
        
        else if(event.getSource() == btnTres)
            txtPantalla.setText(txtPantalla.getText() + "3");
        
        else if(event.getSource() == btnCuatro)
            txtPantalla.setText(txtPantalla.getText() + "4");
        
        else if(event.getSource() == btnCinco)
            txtPantalla.setText(txtPantalla.getText() + "5");
        
        else if(event.getSource() == btnSeis)
            txtPantalla.setText(txtPantalla.getText() + "6");
        
        else if(event.getSource() == btnSiete)
            txtPantalla.setText(txtPantalla.getText() + "7");
        
        else if(event.getSource() == btnOcho)
            txtPantalla.setText(txtPantalla.getText() + "8");
        
        else if(event.getSource() == btnNueve)
            txtPantalla.setText(txtPantalla.getText() + "9");
        
        else if(event.getSource() == btnPunto){
           
            if (txtPantalla.getText().length() == 0)
                txtPantalla.setText("0.");
            else if(!(txtPantalla.getText() .contains(".")))
                txtPantalla.setText(txtPantalla.getText() + ".");
        
        }else if(event.getSource() == btnMas){
            dato1 =  Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            opt = 1;
           
            
        }else if(event.getSource() == btnMenos){
            dato1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            opt = 2;
          
            
        }else if(event.getSource() == btnMultiplicacion){
            dato1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            opt = 3;
           
            
        }else if(event.getSource() == btnDivision){
            dato1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            opt = 4;
           
            
        }else if(event.getSource() == btnRaizCuadrada){
            dato1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            txtPantalla.setText(String.valueOf(Math.sqrt(dato1)));
            
            
        }else if(event.getSource() == btnMasMenos){
            if(Double.parseDouble(txtPantalla.getText()) > 0)
                txtPantalla.setText(String.valueOf(Double.parseDouble(txtPantalla.getText())* -1));
            else
                txtPantalla.setText(String.valueOf(Double.parseDouble(txtPantalla.getText())* -1));
           
            
        }else if(event.getSource() == btnABS){
            if(Double.parseDouble(txtPantalla.getText()) > 0)
                txtPantalla.setText(String.valueOf(Double.parseDouble(txtPantalla.getText()) * 1));
            else
                txtPantalla.setText(String.valueOf(Double.parseDouble(txtPantalla.getText()) * -1));
            
            
        }else if(event.getSource() == btnXY){
            dato1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            opt = 5;
           
        }else if(event.getSource()== btnPorcentaje){
                dato2 = Double.parseDouble(txtPantalla.getText());
                txtPantalla.clear();
                result = (dato1*dato2/100);
                txtPantalla.setText(String.valueOf(result));
        
        }else if(event.getSource() == btnC){
            dato1 = 0;
            dato2 = 0;
            result = 0;
            opt = 0;
            txtPantalla.clear();
            
        }else if(event.getSource() == btnCE)
            txtPantalla.clear();
        
         else if(event.getSource() == btnIgual){
            dato2 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
         
            switch(opt){
                case 1: 
                    result = dato1 + dato2;
                    txtPantalla.setText(String.valueOf(result));
                    break;
                    
                case 2: 
                    result = dato1 - dato2;
                    txtPantalla.setText(String.valueOf(result));
                    break;
                    
                case 3:
                    result = dato1 * dato2;
                    txtPantalla.setText(String.valueOf(result));
                    break;
                    
                case 4:
                    result = dato1 / dato2;
                    txtPantalla.setText(String.valueOf(result));
                    break;
                    
                case 5:
                   result = Math.pow(dato1, dato2);
                   txtPantalla.setText(String.valueOf(result));
                   break;
                    
            
            }
                //btnPunto.setDisable(false);
        }
            
          
            
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    
     
}
 
/* 

Programador: Daniel Alexander Pérez Ramos
Carnet: 2017145

Creacion de los paquetes y las clases:
    org.danielperez.system: 14/04/2021
    org.danielperez.ressource: 15/04/2021
    org.danielperez.image: 22/04/2021
    clase Principal: 14/04/2021
    clase FXMLController: 14/04/2021
    clase FXMLDocument: 14/04/2021.
    clase CSSCalculadora: 15/04/2021

    Modificaciones:
    
    Creacion de los botones: 14/04/2021
    Creacion del TextField: 14/04/2021
    Funcionamiento de la Calculadora: 21/04/2021
    Cambios en la interfaz de la calculadora (colores de los botones y del anchor pane): 22/04/2021
    Modificacion en el icono del programa: 22/04/2021

*/
package org.danielperez.system;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author Alexander Ramos
 */
public class Principal extends Application {
    
    @Override
    public void start(Stage escenarioPrincipal) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        escenarioPrincipal.setScene(scene);
        escenarioPrincipal.setTitle("Calculadora Cientifica Daniel Pérez ");
        escenarioPrincipal.getIcons().add(new Image("/org/danielperez/image/calcuimagen.png"));
        escenarioPrincipal.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
     
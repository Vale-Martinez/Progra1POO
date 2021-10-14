package Controlador;

import Vistas.Menu;

/**
 *
 * @author valem
 */
public class ConRegistroPlanEstudio {

   static Vistas.Menu menu = new Menu();
    
    //llama a la ventana anterior 
    public static void Regresar() {
        menu.setVisible(true);
        Controlador.ConMenu.registroPlanEstudio.setVisible(false);
    }
}

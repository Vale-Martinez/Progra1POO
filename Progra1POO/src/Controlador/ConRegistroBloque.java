package Controlador;

import Vistas.Menu;

/**
 *
 * @author valem
 */
public class ConRegistroBloque {

   static Vistas.Menu menu = new Menu();
    
    //llama a la ventana anterior 
    public static void Regresar() {
        menu.setVisible(true);
        Controlador.ConMenu.registroBloque.setVisible(false);
    }
}

package Controlador;

import Vistas.Menu;

/**
 *
 * @author valem
 */
public class ConRegistroCurso {

   static Vistas.Menu menu = new Menu();
    
    //llama a la ventana anterior 
    public static void Regresar() {
        menu.setVisible(true);
        Controlador.ConMenu.registroCurso.setVisible(false);
    }
}

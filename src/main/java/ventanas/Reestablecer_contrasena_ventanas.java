package ventanas;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.declarative.Design;

/** 
 * !! DO NOT EDIT THIS FILE !!
 * 
 * This class is generated by Vaadin Designer and will be overwritten.
 * 
 * Please make a subclass with logic and additional interfaces as needed,
 * e.g class LoginView extends LoginDesign implements View { }
 */
@DesignRoot
@AutoGenerated
@SuppressWarnings("serial")
public class Reestablecer_contrasena_ventanas extends VerticalLayout {
	protected Label reestablecerContraseña;
	protected PasswordField codigo_enviado;
	protected PasswordField contrasena1;
	protected PasswordField contrasena2;
	protected Button atras;
	protected Button cambiarContrasena;

	public Reestablecer_contrasena_ventanas() {
		Design.read(this);
	}
}

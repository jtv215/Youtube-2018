package ventanas;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Label;
import com.vaadin.ui.NativeSelect;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.TextField;
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
public class Anadir_datos_video_ventanas extends VerticalLayout {
	protected TextField titulo;
	protected NativeSelect<java.lang.String> categoria;
	protected TextField Etiqueta;
	protected TextField rutaVideo;
	protected TextField rutaMiniatura;
	protected Label descripcion_video;
	protected TextArea area_descripcion;

	public Anadir_datos_video_ventanas() {
		Design.read(this);
	}
}
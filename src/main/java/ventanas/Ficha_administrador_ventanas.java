package ventanas;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.declarative.Design;
import ventanas.Ficha_video_ventanas;
import ventanas.Lista_comentarios_anadibles_ventanas;
import ventanas.Zona_cabecera_video_administrador_ventanas;
import ventanas.Zona_opciones_video_administrador_ventanas;

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
public class Ficha_administrador_ventanas extends VerticalLayout {
	protected VerticalLayout vertical;
	protected Zona_cabecera_video_administrador_ventanas zonaCabecera;
	protected FormLayout form;
	protected HorizontalLayout horizontal;
	protected Ficha_video_ventanas fichaVideo;
	protected Zona_opciones_video_administrador_ventanas zonaOpciones;
	protected VerticalLayout verti2;
	protected Lista_comentarios_anadibles_ventanas listaComentarios;

	public Ficha_administrador_ventanas() {
		Design.read(this);
	}
}

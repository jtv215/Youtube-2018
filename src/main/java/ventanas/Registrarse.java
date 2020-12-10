package ventanas;

import org.orm.PersistentException;

import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.navigator.View;
import com.vaadin.server.Page;
import com.vaadin.shared.ui.notification.*;

public class Registrarse extends Registrarse_ventanas implements View {
	/*
	 * private JLabel _registrar_usuarioLB; public Iniciar_sesion
	 * _unnamed_Iniciar_sesion_;
	 */
	Usuario_Registrado_BD user = new Usuario_Registrado_BD();
	IUsuario_no_registrado noRegistrado = new BD_Principal();

	public Registrarse() {
		anadirDatos.fechaNacimiento.setRangeEnd(java.time.LocalDate.now());
		
		registrar.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				
				registrarUsuario();
				
			}
		});
		
		atras.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("logIn");
			}
		});
	}

	void registrarUsuario() {
		
		if(anadirDatos.contrasena.getValue().equals(anadirDatos.repContrasena.getValue())){
			if(anadirDatos.fechaNacimiento.getValue()==null){
				Notification notification = new Notification("¡Introduce una Fecha!", "", Notification.Type.ERROR_MESSAGE);
				notification.setDelayMsec(2000);
				notification.show(Page.getCurrent());
			}else{
			user.setNombre(anadirDatos.nombre.getValue());
			user.setApellidos(anadirDatos.apellidos.getValue());
			user.setApodo(anadirDatos.apodo.getValue());
			user.setContraseña(anadirDatos.contrasena.getValue());
			user.setEmail(anadirDatos.correo.getValue());
			user.setTipoUsuario("Registrado");
			user.setN_visitas(0);
			user.setMiniatura(anadirDatos.urlPhoto.getValue());
			
			if(anadirDatos.urlPhoto.getValue().equals("")){
				String url= "http://i48.tinypic.com/okoi2b.jpg";
				user.setMiniatura(url);
			}
			user.setFecha_nacimiento(java.sql.Date.valueOf(anadirDatos.fechaNacimiento.getValue()));
	
			noRegistrado.registrarUsuario(user);
			
			Notification notification = new Notification("¡ENHORABUENA!", "Usuario registrado con éxito", Notification.Type.HUMANIZED_MESSAGE);
			notification.setDelayMsec(2000);
			notification.show(Page.getCurrent());
			UI.getCurrent().getNavigator().navigateTo("logIn");
			}
		}else {
			Notification notification = new Notification("¡La contraseñas no Coincide!", "", Notification.Type.ERROR_MESSAGE);
			notification.setDelayMsec(2000);
			notification.show(Page.getCurrent());
		}
	}
}
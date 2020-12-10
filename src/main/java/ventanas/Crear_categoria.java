package ventanas;

import java.util.List;

import com.vaadin.navigator.View;
import com.vaadin.server.Page;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;

public class Crear_categoria extends Crear_categoria_ventanas implements View{
	/*private Label _nombre_nueva_categoriaLB;
	private TextFiel _nombre_nueva_categoriaTF;
	private Label _edad_permitidadLb;
	private JCombox _edad_permitidaCB;
	private Button _crear_categoriaB;
	private Button _atr�sB;
	public Zona_opciones_administrador _unnamed_Zona_opciones_administrador_;
	public Lista_categorias _unnamed_Lista_categorias_;

	public void crear_categoria() {
		throw new UnsupportedOperationException();
	}*/
	
	IAdministrador admin= new BD_Principal();
	
	public Crear_categoria(){
		
		
		
		atras.addClickListener(new ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI.getCurrent().getNavigator().navigateTo("perfil_administrador");
				
			}
		});
		
		crear_categoria_button.addClickListener(new ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				
				crearCategorias();
				
			}

			 
		});
	}
	
	
	


		void crearCategorias() {
		String nombre=	nombre_categoria.getValue();
		String edad= edad_permitida.getValue();
		if(nombre.isEmpty() || edad.isEmpty()){
			Notification notification = new Notification("Incorrecto", "Los campos no pueden estar Vacios", Notification.Type.ERROR_MESSAGE);
			notification.setDelayMsec(2000);
			notification.show(Page.getCurrent());
			
		}else{
			nombre=	nombre_categoria.getValue();
			String nombreGuion= nombre.replace(" ", "_");
			edad= edad_permitida.getValue();
			boolean corrrecto= admin.crearCategorias(nombreGuion, edad);	
			
				if(Boolean.TRUE.equals(corrrecto)){
					Notification notification = new Notification("Correcto", "Se ha creado la categoria correctamente", Notification.Type.HUMANIZED_MESSAGE);
					notification.setDelayMsec(2000);
					notification.show(Page.getCurrent());	
					UI.getCurrent().getNavigator().navigateTo("perfil_administrador");	
				}
			}
		}
		
	
	
	
}
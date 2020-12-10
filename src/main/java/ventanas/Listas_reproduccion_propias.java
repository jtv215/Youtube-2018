package ventanas;

import java.util.List;

import com.vaadin.server.Page;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

public class Listas_reproduccion_propias  extends Listas_reproduccion_propias_ventanas{
	/*
	private Button _eliminarB;
	private Button _modificarB;
	public Zona_cuerpo_perfil_registrado _unnamed_Zona_cuerpo_perfil_registrado_;
	public Lista_reproduccion_propia _unnamed_Lista_reproduccion_propia_;
	public Modificar_lista_reproduccion _unnamed_Modificar_lista_reproduccion_;

	public void eliminar() {
		throw new UnsupportedOperationException();
	}
	*/
	
	
	IUsuario_registrado usuarioR= new BD_Principal();
	
	
	public Listas_reproduccion_propias(){
		
		
			cargarListasReproduccionPropias();
	
		
		buscar.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				String texto= buscarLista.getValue();
				
				if(texto.length()==0){
					
					cargarListasReproduccionPropias();
				}
				else{
					
					buscarListasReproducionPropias();	
				}
				
			}
		});
	}


	
		
	
		void cargarListasReproduccionPropias() {
			List<Lista_reproduccion_BD> listaRepro= usuarioR.cargarListasReproduccionPropias(Datos_Navegante.getIdUsuario());
			listaLayout.removeAllComponents();
			for(int i=0;i<listaRepro.size();i++) {
				
				VerticalLayout v1= new VerticalLayout();
				HorizontalLayout h2= new HorizontalLayout();
				FormLayout f3= new FormLayout();
				Label id= new Label();
				int idLista= listaRepro.get(i).getId();
				id.setValue(String.valueOf(idLista));
				//Label titulo= new Label();
				id.setVisible(false);
				VerticalLayout v2 = new  VerticalLayout();
				Button modificarB= new Button();
				modificarB.setCaption("Modificar");
		//TODO MODIFICAR		
				modificarB.addClickListener(new Button.ClickListener() {
					@Override
					public void buttonClick(ClickEvent event) {
						String n=id.getValue();
						int numero=Integer.parseInt(n);
						Datos_Navegante.setIdListaReproducion(numero);
						UI.getCurrent().getNavigator().navigateTo("Modificar_lista_reproduccion");
					}
				});
				
				Button eliminarB= new  Button();
				eliminarB.setCaption("Eliminar");
				v2.addComponent(modificarB);
				v2.addComponent(eliminarB);
		//TODO Eliminar	
				eliminarB.addClickListener(new Button.ClickListener() {
					@Override
					public void buttonClick(ClickEvent event) {
						String n=id.getValue();
						int numero=Integer.parseInt(n);
						Datos_Navegante.setIdListaReproducion(numero);
						
						eliminarListaReproduccionPropia();
						
						UI.getCurrent().getNavigator().navigateTo("perfil_registrado");
					}
				});
				
				
				Button bp= new  Button();
				bp.setHeight("100");
				bp.setWidth("150");
				bp.setStyleName("huge primary");
				int nlista= i+1;
				bp.setCaption("Lista "+nlista);
		//TODO Lista Reproduccion	
				bp.addClickListener(new Button.ClickListener() {
					@Override
					public void buttonClick(ClickEvent event) {
						String n=id.getValue();
						int numero=Integer.parseInt(n);
						Datos_Navegante.setIdListaReproducion(numero);
						UI.getCurrent().getNavigator().navigateTo("Lista_reproduccion_propia");
					}
				});
				f3.addComponent(bp);
				Label nombre = new Label();
				nombre.setValue(listaRepro.get(i).getNombre());
			
				f3.addComponent(id);
			
				f3.addComponent(nombre);
				h2.addComponent(f3);
				h2.addComponent(v2);
				v1.addComponent(h2);
				listaLayout.addComponent(v1);
				
			}
		}
		
		void buscarListasReproducionPropias() {
			String aNombre= this.buscarLista.getValue();
			
			List<Lista_reproduccion_BD> listaRepro= usuarioR.buscarListasReproducionPropias(aNombre);
			
			this.listaLayout.removeAllComponents();
				for (int i = 0; i < listaRepro.size(); i++) {
						
						VerticalLayout v1= new VerticalLayout();
						HorizontalLayout h2= new HorizontalLayout();
						FormLayout f3= new FormLayout();
						Label id= new Label();
						int idLista= listaRepro.get(i).getId();
						id.setValue(String.valueOf(idLista));
						id.setVisible(false);
						VerticalLayout v2 = new  VerticalLayout();
						Button modificarB= new Button();
						modificarB.setCaption("Modificar");
			//TODO MODIFICAR	
						modificarB.addClickListener(new Button.ClickListener() {
							@Override
							public void buttonClick(ClickEvent event) {
								String n=id.getValue();
								int numero=Integer.parseInt(n);
								Datos_Navegante.setIdListaReproducion(numero);
							
								UI.getCurrent().getNavigator().navigateTo("Modificar_lista_reproduccion");
							}
						});
						
						Button eliminarB= new  Button();
						eliminarB.setCaption("Eliminar");
						v2.addComponent(modificarB);
						v2.addComponent(eliminarB);
				//TODO Eliminar	
						eliminarB.addClickListener(new Button.ClickListener() {
							@Override
							public void buttonClick(ClickEvent event) {
								String n=id.getValue();
								int numero=Integer.parseInt(n);
								Datos_Navegante.setIdListaReproducion(numero);
								eliminarListaReproduccionPropia();
								
								UI.getCurrent().getNavigator().navigateTo("perfil_registrado");
							}
						});
						
						
						Button bp= new  Button();
						bp.setHeight("100");
						bp.setWidth("150");
						bp.setStyleName("huge primary");
						int nlista= i+1;
						bp.setCaption("Lista "+nlista);
				//TODO LISTA REPRODUCCION		
						bp.addClickListener(new Button.ClickListener() {
							@Override
							public void buttonClick(ClickEvent event) {
								/*String n=id.getValue();
								int numero=Integer.parseInt(n);
								Datos_Navegante.setIdListaReproducion(numero);
								eliminarListaReproduccionPropia();*/
								
								UI.getCurrent().getNavigator().navigateTo("Lista_reproduccion_propia");
							}

							
						});
						f3.addComponent(bp);
						Label nombre = new Label();
						nombre.setValue(listaRepro.get(i).getNombre());
					
						f3.addComponent(id);
					
						f3.addComponent(nombre);
						h2.addComponent(f3);
						h2.addComponent(v2);
						v1.addComponent(h2);
						listaLayout.addComponent(v1);
						
				}
			
			
			
		}
		
		void eliminarListaReproduccionPropia() {
			boolean correcto= usuarioR.eliminarListaReproduccionPropia(Datos_Navegante.getIdListaReproducion());
			
			if(Boolean.TRUE.equals(correcto)){
				Notification notification = new Notification("¡La Lista se ha eliminado correctamente!", "", Notification.Type.HUMANIZED_MESSAGE);
				notification.setDelayMsec(2000);
				notification.show(Page.getCurrent());
			}
			
			
		
		}	
		
}
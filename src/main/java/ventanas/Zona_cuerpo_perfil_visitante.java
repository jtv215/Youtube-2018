package ventanas;

import java.util.Vector;


public class Zona_cuerpo_perfil_visitante extends Zona_cuerpo_perfil_visitante_ventanas {
	/*
	public Perfil_visitante _unnamed_Perfil_visitante_;
	public Vector<Lista_videos_agenos> _unnamed_Lista_videos_agenos_ = new Vector<Lista_videos_agenos>();
	public Vector<Listas_de_reproduccion> _unnamed_Listas_de_reproduccion_ = new Vector<Listas_de_reproduccion>();
	*/
	
	Lista_videos_agenos lv= new Lista_videos_agenos();
	Listas_de_reproduccion lr= new Listas_de_reproduccion();
	public  Zona_cuerpo_perfil_visitante(){
		vertical.removeAllComponents();
		vertical.addComponent(new Lista_videos_agenos());
		vertical.addComponent(new Listas_de_reproduccion());
		
		
	}
	
	
	
	
}
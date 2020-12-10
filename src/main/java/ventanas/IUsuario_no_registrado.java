package ventanas;

import java.util.List;

public interface IUsuario_no_registrado {

	public boolean registrarUsuario(Usuario_Registrado_BD aUsuario);

	public List<Video_BD> cargarVideosTendencia();

	public List<Video_BD> cargarVideosUsuarioRegistrado(int aId);

	public Usuario_BD iniciarSesion(String aEmail, String aContrasena);

	public List<Video_BD> cargarListaUltimosVideosSubidos(int aId);
		
	public Video_BD cargarFichaVideoNoRegistrado(int aId);
	
	public List<Video_BD> buscarVideos(String aNombre);
	
	public List<Usuario_Registrado_BD> buscarUsuarios(String aNombre);
	
	public List<Video_BD> cargarVideosListaReproduccionVisitante(int aId);
	
	public boolean cambiarContasena(String aEnviada, String aCont1);
	
	public boolean recuperarContrasena(String aCorreo);

}
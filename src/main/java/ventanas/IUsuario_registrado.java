package ventanas;

import java.util.List;

public interface IUsuario_registrado {

	public boolean subirVideo(Video_BD aVideo);

	public boolean modificarVideo(Video_BD aVideo);

	public List<Video_BD> cargarHistorial(int aId);

	public boolean eliminarVideoSubido(int aId);

	public boolean modificarListaReproducion(Lista_reproduccion_BD aLista);

	public boolean modificarDatos(Usuario_Registrado_BD aUsuario);

	public boolean crearLista(Lista_reproduccion_BD aLista);

	public boolean quitarVideo(int aId);

	public boolean dejarSeguir(int aId);

	public List<Usuario_Registrado_BD> cargarListadoSuscripciones(int aId);

	public List<Categoria_BD> cargarCategorias();
	
	public List<Categoria_BD> cargarCategoriasModificar();

	public List<Video_BD> cargarVideosSuscripciones(int aId);

	public List<Video_BD> cargarVideosRelacionados(int aId);

	public List<Lista_reproduccion_BD> cargarListasReproduccionPropias(int aId);

	public List<Video_BD> cargarVideosPropios(int aId);

	public boolean meGusta(int aIdUsuario, int aIdVideo);

	public Video_BD descargarVideoUR(int aId);

	public boolean eliminarVideoUR(int aId);

	public List<Lista_reproduccion_BD> cargarListasReproducionCaja(int aId);

	public boolean cambiarcontrasena(String aContNueva, String aContActual, String aContRepetir);

	public boolean anadirComentario(int aId, String aComentario);

	public List<Comentario_BD> cargarListaComentariosRegistrado(int aId);
	
	public Usuario_Registrado_BD cargarModificarDatos(int aId);
	
	public Video_BD cargarModificarVideo(int aId);
	
	public List<Video_BD> buscarVideosPropios(String aNombre);
	
	public Usuario_Registrado_BD cargarDatosPerfilRegistrado(int aId);
	
	public Video_BD cargarFichaVideoRegistrado(int aId);
	
	public Lista_reproduccion_BD cargarNombreModificarListaReproduccion(int aId);
	
	public Usuario_Registrado_BD cargarNombrePerfilRegistrado(int aId);
	
	public List<Lista_reproduccion_BD> buscarListasReproducionPropias(String aNombre);
	
	public Usuario_Registrado_BD cargarMeGusta(int aId);
	
	public List<Lista_reproduccion_BD> cargarListasReproduccionPerfilVisitante(int aId);
	
	public Usuario_Registrado_BD cargarDatosPerfilVisitante(int aId);
	
	public boolean seguirUsuario(int aIdNavegante, int aIdPerfilVisitante);
	
	public List<Usuario_Registrado_BD> cargarListadoSuscriptores(int aId);
	
	public List<Video_BD> cargarListaUltimosVideos(int aId);
	
	public boolean anadirVideoLista(int aId, String aNombre);
	
	public List<Video_BD> cargarVideosListaReproduccionPropia(int aId);
	
	public List<Usuario_Registrado_BD> cargarListadoSuscripcionesVisitante(int aId);
	
	public boolean eliminarListaReproduccionPropia(int aId);
	
	public Usuario_Registrado_BD cargarMeGustaRegistrado(int aId);
	
	public boolean meGustaRegistrado(int aIdUsuario, int aIdVideo);

	public boolean anadirVideoListaRegistrado(int aId, String aNombre);

	public List<Lista_reproduccion_BD> cargarListaReproduccionCajaRegistrado(int aId);
	
	public boolean eliminarComentario(int aId);
	
	public List<Comentario_BD> cargarListaComentariosVideosPropios(int aId);
	
	public boolean deshabilitarComentariosVideosPropios(int aId);
	
	public Video_BD cargarBotonDeshabilitar(int aId);
	
	public Video_BD ocultaComentariosDeshabilitadoVideoRegistrado(int aId);

	
}
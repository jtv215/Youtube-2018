package ventanas;

public class Datos_Navegante {
	private static int idUsuario = -1;
	private static String apodo = "Señor";
	private static int idVideo = -1;
	private static int idListaReproducion = -1;
	private static String tipoUsuario = "Invitado";
	private static String ficha = "Invitado";
	private static int idPerfilvistante = -1;
	private static int estado = 0;
	private static String perfilVisitante = "";
	private static String tipoBusqueda = "";
	private static String busqueda = "";
	private static Boolean aux = false;
	private static int idPropietario = -1;
	private static int idCategoria = -1;
	private static String recuperarContraseña = "";

	public static String getRecuperarContraseña() {
		return recuperarContraseña;
	}

	public static void setRecuperarContraseña(String contraseña) {
		Datos_Navegante.recuperarContraseña = contraseña;
	}

	public static int getIdPropietario() {
		return idPropietario;
	}

	public static void setIdPropietario(int idPropietario) {
		Datos_Navegante.idPropietario = idPropietario;
	}

	public static int getIdUsuario() {
		return idUsuario;
	}

	public static void setIdUsuario(int idUsuario) {
		Datos_Navegante.idUsuario = idUsuario;
	}

	public static String getApodo() {
		return apodo;
	}

	public static void setApodo(String apodo) {
		Datos_Navegante.apodo = apodo;
	}

	public static int getIdVideo() {
		return idVideo;
	}

	public static void setIdVideo(int idVideo) {
		Datos_Navegante.idVideo = idVideo;
	}

	public static int getIdListaReproducion() {
		return idListaReproducion;
	}

	public static void setIdListaReproducion(int idListaReproducion) {
		Datos_Navegante.idListaReproducion = idListaReproducion;
	}

	public static String getTipoUsuario() {
		return tipoUsuario;
	}

	public static void setTipoUsuario(String tipoUsuario) {
		Datos_Navegante.tipoUsuario = tipoUsuario;
	}

	public static String getFicha() {
		return ficha;
	}

	public static void setFicha(String ficha) {
		Datos_Navegante.ficha = ficha;
	}

	public static int getIdPerfilvistante() {
		return idPerfilvistante;
	}

	public static void setIdPerfilvistante(int idPerfilvistante) {
		Datos_Navegante.idPerfilvistante = idPerfilvistante;
	}

	public static int getEstado() {
		return estado;
	}

	public static void setEstado(int estado) {
		Datos_Navegante.estado = estado;
	}

	public static String getPerfilVisitante() {
		return perfilVisitante;
	}

	public static void setPerfilVisitante(String perfilVisitante) {
		Datos_Navegante.perfilVisitante = perfilVisitante;
	}

	public static String getTipoBusqueda() {
		return tipoBusqueda;
	}

	public static void setTipoBusqueda(String tipoBusqueda) {
		Datos_Navegante.tipoBusqueda = tipoBusqueda;
	}

	public static String getBusqueda() {
		return busqueda;
	}

	public static void setBusqueda(String busqueda) {
		Datos_Navegante.busqueda = busqueda;
	}

	public static Boolean getAux() {
		return aux;
	}

	public static void setAux(Boolean aux) {
		Datos_Navegante.aux = aux;
	}

	public static int getIdCategoria() {
		return idCategoria;
	}

	public static void setIdCategoria(int idCategoria) {
		Datos_Navegante.idCategoria = idCategoria;
	}
}

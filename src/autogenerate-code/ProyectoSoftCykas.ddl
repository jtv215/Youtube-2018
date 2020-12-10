CREATE TABLE Administrador_BD (Usuario_BDId int(10) NOT NULL, PRIMARY KEY (Usuario_BDId)) ENGINE=InnoDB;
CREATE TABLE Usuario_Registrado_BD (Nombre varchar(255), Apellidos varchar(255), Fecha_nacimiento date, N_visitas int(10), Usuario_BDId int(10) NOT NULL, Historial_BDId int(10) NOT NULL, PRIMARY KEY (Usuario_BDId)) ENGINE=InnoDB;
CREATE TABLE Categoria_BD (Id int(10) NOT NULL AUTO_INCREMENT, Nombre varchar(255), Edad int(10), PRIMARY KEY (Id)) ENGINE=InnoDB;
CREATE TABLE Video_BD (Id int(10) NOT NULL AUTO_INCREMENT, Usuario_Registrado_BDUsuario_BDId int(10) NOT NULL, Categoria_BDId int(10) NOT NULL, Titulo varchar(255), Etiqueta varchar(255), Miniatura varchar(255), Descripcion varchar(255), Fecha_subida date, Visualizaciones int(10), PRIMARY KEY (Id)) ENGINE=InnoDB;
CREATE TABLE Comentario_BD (Id int(10) NOT NULL AUTO_INCREMENT, Video_BDId int(10) NOT NULL, Usuario_Registrado_BDUsuario_BDId int(10) NOT NULL, Mensaje varchar(255), PRIMARY KEY (Id)) ENGINE=InnoDB;
CREATE TABLE Lista_reproduccion_BD (Id int(10) NOT NULL AUTO_INCREMENT, Usuario_Registrado_BDUsuario_BDId int(10) NOT NULL, Nombre varchar(255), PRIMARY KEY (Id)) ENGINE=InnoDB;
CREATE TABLE Usuario_BD (Id int(10) NOT NULL AUTO_INCREMENT, Apodo varchar(255), Contraseña varchar(255), Miniatura varchar(255), Email varchar(255), PRIMARY KEY (Id)) ENGINE=InnoDB;
CREATE TABLE Historial_BD (Id int(10) NOT NULL AUTO_INCREMENT, Nombre varchar(255), PRIMARY KEY (Id)) ENGINE=InnoDB;
CREATE TABLE Usuario_Registrado_BD_Usuario_Registrado_BD (Usuario_Registrado_BDUsuario_BDId int(10) NOT NULL, Usuario_Registrado_BDUsuario_BDId2 int(10) NOT NULL, PRIMARY KEY (Usuario_Registrado_BDUsuario_BDId, Usuario_Registrado_BDUsuario_BDId2)) ENGINE=InnoDB;
CREATE TABLE Usuario_Registrado_BD_Video_BD (Usuario_Registrado_BDUsuario_BDId int(10) NOT NULL, Video_BDId int(10) NOT NULL, PRIMARY KEY (Usuario_Registrado_BDUsuario_BDId, Video_BDId)) ENGINE=InnoDB;
CREATE TABLE Lista_reproduccion_BD_Video_BD (Lista_reproduccion_BDId int(10) NOT NULL, Video_BDId int(10) NOT NULL, PRIMARY KEY (Lista_reproduccion_BDId, Video_BDId)) ENGINE=InnoDB;
CREATE TABLE Historial_BD_Video_BD (Historial_BDId int(10) NOT NULL, Video_BDId int(10) NOT NULL, PRIMARY KEY (Historial_BDId, Video_BDId)) ENGINE=InnoDB;
ALTER TABLE Administrador_BD ADD INDEX FKAdministra863266 (Usuario_BDId), ADD CONSTRAINT FKAdministra863266 FOREIGN KEY (Usuario_BDId) REFERENCES Usuario_BD (Id);
ALTER TABLE Usuario_Registrado_BD ADD INDEX FKUsuario_Re553649 (Usuario_BDId), ADD CONSTRAINT FKUsuario_Re553649 FOREIGN KEY (Usuario_BDId) REFERENCES Usuario_BD (Id);
ALTER TABLE Usuario_Registrado_BD_Usuario_Registrado_BD ADD INDEX FKUsuario_Re676401 (Usuario_Registrado_BDUsuario_BDId), ADD CONSTRAINT FKUsuario_Re676401 FOREIGN KEY (Usuario_Registrado_BDUsuario_BDId) REFERENCES Usuario_Registrado_BD (Usuario_BDId);
ALTER TABLE Usuario_Registrado_BD_Usuario_Registrado_BD ADD INDEX FKUsuario_Re853247 (Usuario_Registrado_BDUsuario_BDId2), ADD CONSTRAINT FKUsuario_Re853247 FOREIGN KEY (Usuario_Registrado_BDUsuario_BDId2) REFERENCES Usuario_Registrado_BD (Usuario_BDId);
ALTER TABLE Usuario_Registrado_BD_Video_BD ADD INDEX FKUsuario_Re920840 (Usuario_Registrado_BDUsuario_BDId), ADD CONSTRAINT FKUsuario_Re920840 FOREIGN KEY (Usuario_Registrado_BDUsuario_BDId) REFERENCES Usuario_Registrado_BD (Usuario_BDId);
ALTER TABLE Usuario_Registrado_BD_Video_BD ADD INDEX FKUsuario_Re379191 (Video_BDId), ADD CONSTRAINT FKUsuario_Re379191 FOREIGN KEY (Video_BDId) REFERENCES Video_BD (Id);
ALTER TABLE Lista_reproduccion_BD ADD INDEX FKLista_repr355691 (Usuario_Registrado_BDUsuario_BDId), ADD CONSTRAINT FKLista_repr355691 FOREIGN KEY (Usuario_Registrado_BDUsuario_BDId) REFERENCES Usuario_Registrado_BD (Usuario_BDId);
ALTER TABLE Comentario_BD ADD INDEX FKComentario795846 (Usuario_Registrado_BDUsuario_BDId), ADD CONSTRAINT FKComentario795846 FOREIGN KEY (Usuario_Registrado_BDUsuario_BDId) REFERENCES Usuario_Registrado_BD (Usuario_BDId);
ALTER TABLE Comentario_BD ADD INDEX FKComentario254197 (Video_BDId), ADD CONSTRAINT FKComentario254197 FOREIGN KEY (Video_BDId) REFERENCES Video_BD (Id);
ALTER TABLE Video_BD ADD INDEX FKVideo_BD725130 (Categoria_BDId), ADD CONSTRAINT FKVideo_BD725130 FOREIGN KEY (Categoria_BDId) REFERENCES Categoria_BD (Id);
ALTER TABLE Lista_reproduccion_BD_Video_BD ADD INDEX FKLista_repr772023 (Lista_reproduccion_BDId), ADD CONSTRAINT FKLista_repr772023 FOREIGN KEY (Lista_reproduccion_BDId) REFERENCES Lista_reproduccion_BD (Id);
ALTER TABLE Lista_reproduccion_BD_Video_BD ADD INDEX FKLista_repr908308 (Video_BDId), ADD CONSTRAINT FKLista_repr908308 FOREIGN KEY (Video_BDId) REFERENCES Video_BD (Id);
ALTER TABLE Historial_BD_Video_BD ADD INDEX FKHistorial_598255 (Historial_BDId), ADD CONSTRAINT FKHistorial_598255 FOREIGN KEY (Historial_BDId) REFERENCES Historial_BD (Id);
ALTER TABLE Historial_BD_Video_BD ADD INDEX FKHistorial_153552 (Video_BDId), ADD CONSTRAINT FKHistorial_153552 FOREIGN KEY (Video_BDId) REFERENCES Video_BD (Id);
ALTER TABLE Usuario_Registrado_BD ADD INDEX FKUsuario_Re167589 (Historial_BDId), ADD CONSTRAINT FKUsuario_Re167589 FOREIGN KEY (Historial_BDId) REFERENCES Historial_BD (Id);
ALTER TABLE Video_BD ADD INDEX FKVideo_BD360058 (Usuario_Registrado_BDUsuario_BDId), ADD CONSTRAINT FKVideo_BD360058 FOREIGN KEY (Usuario_Registrado_BDUsuario_BDId) REFERENCES Usuario_Registrado_BD (Usuario_BDId);
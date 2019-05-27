package dk.service;

import java.util.List;

import dk.models.Usuario;

public interface UsuarioService {
	
	List<Usuario> getAllUsers();
	
	void deleteUser(String usuarioId);
	
	void addUser(Usuario usuario);
	
	Usuario getUserById(String usuarioId);

}

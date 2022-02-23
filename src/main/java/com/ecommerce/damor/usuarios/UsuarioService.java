package com.ecommerce.damor.usuarios;
import java.util.ArrayList;


import org.springframework.stereotype.Service;


@Service
public class UsuarioService {
	public final ArrayList<Usuario> registro_usuarios = new ArrayList<Usuario>();

	public UsuarioService() {
		registro_usuarios.add(new Usuario("Luis Guillermo Cruz Vargas","5625855523","lgtacos@gmail.com" ,"KIngom15"));
		registro_usuarios.add(new Usuario("Arturo Cuellar","5577354364","arturocuellar@gmail.com","progratacos512"));
		registro_usuarios.add(new Usuario("Ulises Portuguez","5543126574","xtuguez@gmail.com","LoqueJueg0"));
	}
	public ArrayList<Usuario> getUsuarios(){
		return registro_usuarios;
	}
	public Usuario getUsuario(int id) {
		Usuario usuario = null;
		for (Usuario user : registro_usuarios) {
			if(user.getId()== id) {
				usuario = user;
			}
		}
		return usuario;
	}
	public void deleteUsuario(int id) {
		for (Usuario delete : registro_usuarios) {
			if (delete.getId() == id) {
				registro_usuarios.remove(delete);
				break;
			}//if
		}//foreach
		}//deleteProducto
	
	
	}
	
	
	


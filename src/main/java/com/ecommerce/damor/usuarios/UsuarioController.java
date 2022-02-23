package com.ecommerce.damor.usuarios;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(path="/api/usuarios/")
public class UsuarioController {
	
	private final UsuarioService userService;

	@Autowired
	public UsuarioController(UsuarioService userService) {
		this.userService = userService;
	}//constructor
	public UsuarioService getUserService() {
		return userService;
	}
	@GetMapping
	public List<Usuario> getUsuarios(){
		return userService.getUsuarios();
	}//getProductos
	
	@GetMapping(path="{id}")
	public Usuario getUsuario(@PathVariable("id") int id){
		return userService.getUsuario(id);
	}//getProducto
	
	@DeleteMapping(path="{id}")
	public void deleteUsuario(@PathVariable("id") int id) {
		userService.deleteUsuario(id);
	}//deleteProducto
	
	@PostMapping
	public void addUsuario(@RequestBody Usuario usuario) {
        userService.addUsuario(usuario);		
		
	}
	
	
}

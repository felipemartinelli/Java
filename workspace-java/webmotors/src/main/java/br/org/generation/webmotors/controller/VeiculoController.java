package br.org.generation.webmotors.controller;
import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import br.org.generation.webmotors.bd.BDVeiculo;
import br.org.generation.webmotors.model.Veiculo;

@RestController
public class VeiculoController {
	
	private BDVeiculo bd = new BDVeiculo(); 
	
	
	@PostMapping("/veiculo/novo")
	public ResponseEntity<Veiculo> novoVeiculo(@RequestBody Veiculo v) {
		bd.gravar(v);
		return ResponseEntity.ok(v);
	}
	
	@GetMapping("/veiculo/{id}")
	public ResponseEntity<Veiculo> getVeiculo(@PathVariable int id){
		Veiculo cli = bd.buscar(id);
		if(cli != null) {
			return ResponseEntity.ok(cli);
		}
		else {
			return ResponseEntity.notFound().build();	
		}
		
	}
	
	@GetMapping("/veiculo/todos")
	public ResponseEntity<ArrayList<Veiculo>> getTodos(){
		return ResponseEntity.ok(bd.buscarTodos());		
	}
	
	@PutMapping("/veiculo/alterar")
	public ResponseEntity<String> alteraVeiculo(@RequestBody Veiculo v){
		bd.alterar(v);
		return ResponseEntity.ok("Success");
	}
	
	@DeleteMapping("/veiculo/{id}")
	public ResponseEntity<String> removeVeiculo(@PathVariable int id){
		if (bd.apagar(id)) {
			return ResponseEntity.ok("DELETED");
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
	

}

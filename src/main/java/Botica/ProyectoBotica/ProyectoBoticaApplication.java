package Botica.ProyectoBotica;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
@RequestMapping("/farmacia")
public class ProyectoBoticaApplication {

	@Autowired	
	ServiceCategorias categorias;

	@Autowired 
	ServiceMedicamentos pastillas;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoBoticaApplication.class, args);
    
	}
	
	//Metodos de la clase ServiceCategorias
    
	@PostMapping("/categorias")
	public String crearCategorias(@RequestBody Categoria categoria){

		return categorias.crearCategorias(categoria);
	}

	@GetMapping("/categorias")
	public List<Categoria> getcategorias(){

		return categorias.getCategorias();
	}

	@GetMapping("/categorias/{id}")
	public Categoria buscarPorId(@PathVariable int id){

		return categorias.buscarPorId(id);

	}

	@PutMapping("/categorias/{id}")
    public String actualizarCategorias(@PathVariable("id") Integer id, @RequestBody Categoria categoria ){

		return categorias.setCategorias(id, categoria);
	}

	@DeleteMapping("/categorias/{id}")
	public String eliminarCategorias(@PathVariable("id") Integer id,@RequestBody Categoria categoria){

		return categorias.eliminarCategorias(id, categoria);

	}

	//Metodos para pastillas

	@PostMapping("/pastillas")
	public String crearPastillas(@RequestBody Medicamento medicamento){

		return pastillas.CrearMedicamentos(medicamento);
	}

	@GetMapping("/pastillas")
	public List<Medicamento> getPastillas(){

		return pastillas.getMedicamentos();
	}

	@GetMapping("/pastillas/{id}")
	public Medicamento pastillaId(@PathVariable int id ){

		return pastillas.busquedaId(id);
	}

	@PutMapping("/pastillas/{id}")
	public String actualizarPastillas(@PathVariable("id") Integer id, @RequestBody Medicamento medicamento){

		return pastillas.setMedicamentos(id, medicamento);

	}

	@DeleteMapping("/pastillas/{id}")
	public String eliminarPastillas(@PathVariable("id") Integer id, Medicamento medicamento){

		return pastillas.eliminarMedicamentos(id, medicamento);

	}


}

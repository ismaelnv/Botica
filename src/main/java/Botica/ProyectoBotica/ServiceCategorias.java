package Botica.ProyectoBotica;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ServiceCategorias {

    private List<Categoria> categorias = new ArrayList<>(); 
    
    public String crearCategorias(Categoria categoria ){

        categorias.add(categoria);

        return "successfully added";
    }

    public List<Categoria> getCategorias(){

        return categorias;
    }

    public Categoria buscarPorId(int id ){

  
        for (Categoria task : categorias) {

            if(task.id == (id) ){
              
                return task;

            }
        }
        return null;

    }
    
    public String setCategorias( Integer id,Categoria categoria){

        for (int i = 0; i < categorias.size() ; i++) {

            if( id == categorias.get(i).getId()){ 

                categorias.set(i, categoria);

            }
            
        }
        return "Was updated correctly";
    }

    public String eliminarCategorias(Integer id,Categoria categoria){

        for (int i = 0; i < categorias.size(); i++) {

            if( id == categorias.get(i).getId() ){

                categorias.remove(i);

            }
            
        }
        return "was deleted correctly";
    }




    

    



   

    

    


    
}

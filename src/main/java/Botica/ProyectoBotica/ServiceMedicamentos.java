package Botica.ProyectoBotica;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class ServiceMedicamentos {

    private List<Medicamento> medicamentos= new ArrayList<>();
    

    public String CrearMedicamentos (Medicamento medicamento){

        medicamentos.add(medicamento);
        return "Agregado correctamente";

    }

    public List<Medicamento> getMedicamentos(){

        return medicamentos;

    }

    public Medicamento busquedaId(Integer id){

        for (Medicamento medicamento : medicamentos) {

            if (medicamento.getId() == id ) {

                return medicamento;
            }
            
        }
        return null;
    }
    
    public String setMedicamentos(Integer id, Medicamento medicamento){

        for (int i = 0; i < medicamentos.size() ; i++) {

            if(id == medicamentos.get(i).getId()){

                medicamentos.set(i,medicamento);

            }
        }
        return "Was updated correctly";
    }

    public String eliminarMedicamentos( Integer id,Medicamento medicamento){

        for (int i = 0; i < medicamentos.size() ; i++){

            if( id == medicamentos.get(i).getId()){

                medicamentos.remove(i);
            }
        }
        return "Is deleted correctly";
    }


}

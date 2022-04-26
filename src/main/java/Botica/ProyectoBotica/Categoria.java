package Botica.ProyectoBotica;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Categoria {

    @JsonProperty("id")
    private int id;

    @JsonProperty("name")
    private String name;

    public Categoria(int id,String name){
        this.id = id;
        this.name = name;
    }

    public void setid(int id){

        this.id =  id ;

    }

    public void setName(String name){

        this.name =  name;
    }

    public int getId(){

        return id;
    }    

    public String getName(){

        return name;
    }
}

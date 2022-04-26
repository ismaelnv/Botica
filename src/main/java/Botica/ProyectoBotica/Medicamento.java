package Botica.ProyectoBotica;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Medicamento {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("price")
    private Double price;

    public Medicamento(Integer id,String name,Double price){

        this.id = id;
        this.name = name;
        this.price = price; 
    }

    public Integer getId(){

        return  id;
    }

    public String  getName(){

        return name;
    }

    public Double  getPrice(){

        return price;
    }

    public void setId(Integer id){

        this.id = id;

    }

    public void setName(String name){

        this.name = name;

    }

    public void setPrice(Double price){

        this.price = price;
    }


    
}

package com.example.demo.dao;
import jakarta.persistence.*;

@Entity(name = "state")
public class State {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @OneToOne
    @JoinColumn(name = "capital",referencedColumnName = "id")
    private City city;


    public State(Integer id, String name, City capital) {
        this.id = id;
        this.name = name;
        this.city = capital;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}

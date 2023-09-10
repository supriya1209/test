package com.example.demo.dao;
import jakarta.persistence.*;

@Entity(name = "city")
@Table(name = "city")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    public City(Integer id, String name, State state) {
        this.id = id;
        this.name = name;
        this.state = state;
    }
    @OneToOne(cascade = CascadeType.ALL, mappedBy ="city" )
    private State state;

    public City(Integer id, String name) {
        this.id = id;
        this.name = name;
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
}

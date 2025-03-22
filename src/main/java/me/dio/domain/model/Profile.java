package me.dio.domain.model;

import jakarta.persistence.*;
import java.util.List;

@Entity(name = "tb_profile")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String city;

    @Column(name = "user_type")
    private String user_type;

    @ElementCollection(fetch = FetchType.EAGER)
    private List <String> interests;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<String> getInterests() {
        return interests;
    }

    public void setInterests(List<String> interests) {
        this.interests = interests;
    }

  

}

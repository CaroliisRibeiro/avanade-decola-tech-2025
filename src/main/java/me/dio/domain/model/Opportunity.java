package me.dio.domain.model;

import jakarta.persistence.Entity;

@Entity(name = "tb_opportunity")
public class Opportunity extends BaseItem {
    
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

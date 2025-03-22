package me.dio.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity(name = "tb_highlight")
public class Highlight extends BaseItem {
    @ManyToOne
private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}

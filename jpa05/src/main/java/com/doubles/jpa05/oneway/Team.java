package com.doubles.jpa05.oneway;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

// 다대일 단방향 매핑
//@Entity
public class Team {

    @Id
    @Column(name = "TEAM_ID")
    private String id;

    private String name;

    public Team() {
    }

    public Team(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

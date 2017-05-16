package ru.redandspring.springdemo.model;

import javax.persistence.*;

@NamedQueries({
        @NamedQuery(name = Greeting.ALL_SORTED, query = "SELECT m FROM Greeting m ORDER BY m.name"),
})
@Entity
@Table(name = "greeting")
public class Greeting extends BaseEntity
{
    public static final String ALL_SORTED = "Greeting.getAll";

    @Column(name = "name")
    private String name;

    public Greeting()
    {
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}

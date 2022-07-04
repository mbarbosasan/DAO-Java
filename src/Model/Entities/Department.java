package Model.Entities;

import java.io.Serializable;
import java.util.Objects;

public class Department implements Serializable  {
    private String name;
    private Integer id;
    private static final long serialVersionUID = 1L;

    public Department() {

    }

    public Department(Integer id, String name) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(name, that.name) && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}

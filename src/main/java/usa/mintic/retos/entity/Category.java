
package usa.mintic.retos.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String description;

    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy ="category" )
    @JsonIgnoreProperties("category")
    private List<Audience> libs;


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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Audience> getLibs() {
        return libs;
    }

    public void setLibs(List<Audience> libs) {
        this.libs = libs;
    }
}

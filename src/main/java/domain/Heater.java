package domain;

import org.codehaus.jackson.annotate.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Heater extends IntelligentPeripheral{

    private Long Id;
    private Double cons;
    private Home home;

    public Heater(Double cons){
        this.cons = cons;
    }

    public Heater(){}

    @Id
    @GeneratedValue
    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Double getCons() {
        return cons;
    }

    public void setCons(Double cons) {
        this.cons = cons;
    }

    @ManyToOne
    @JsonIgnore
    public Home getHome() {
        return home;
    }

    public void setHome(Home home) {
        this.home = home;
    }
}

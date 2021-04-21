package jon.martinez.sfgpetclinic.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class Person extends BaseEntity {

    public Person(Long id, String firstname, String lastName) {
        super(id);
        this.firstname = firstname;
        this.lastName = lastName;
    }

    @Column(name = "first_name")
    private String firstname;

    @Column(name = "last_name")
    private String lastName;

}

import javax.persistence.*;

@Entity
@Table(name = "actual_registration")
public class ActualRegistrationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "country", nullable = false)
    private String country;

    @Column(name = "region")
    private String region;

    @Column(name = "city")
    private String city;

    @Column(name = "district")
    private String district;

    @Column(name = "locality")
    private String locality;

    @Column(name = "street")
    private String street;

    @Column(name = "house_number")
    private String houseNumber;

    @Column(name = "house_block")
    private String houseBlock;

    @Column(name = "flat_number")
    private String flatNumber;

    @Column(name = "index", nullable = false)
    private Long index;

    // constructors, getters and setters
}
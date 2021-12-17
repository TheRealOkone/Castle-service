package serv.models;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "castles")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Castle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "brand")
    private String brand;

    @Column(name = "model")
    private String model;


    @Column(name = "year")
    private String year;

    @Column(name = "info")
    private String info;

    @Override
    public String toString() {
        return "марка=" + brand  +
                ", модель=" + model +

                ", год выпуска=" + year +
                ", информация=" + info ;
    }
}

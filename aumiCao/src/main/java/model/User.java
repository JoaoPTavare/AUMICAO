package model;


import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

@Table(name = "usuario", indexes = {
        @Index(columnList = "id, email", name = "index_user_email", unique = true)
})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name",
    length = 255,
    nullable = false)
    private String name;
    @Column(name = "email",
    length = 100,
    nullable = false
    )
    private String email;
    @Column(name = "senha",
    length = 20,
    nullable = false
    )
    private String passWord;
    @Column(name = "numeroCelular",
            length = 20,
            nullable = false)
    private String numberPhont;

    @OneToOne
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private Adress adress;


    public User() {
    }


    public User(Long id, String name, String email, String passWord,  String numberPhont, Adress adress ) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.passWord = passWord;
        this.numberPhont = numberPhont;
        this.adress = adress;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmai() {
        return email;
    }

    public void setEmai(String emai) {
        this.email = emai;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    public String getNumberPhont() {
        return numberPhont;
    }

    public void setNumberPhont(String numberPhont) {
        this.numberPhont = numberPhont;
    }
}

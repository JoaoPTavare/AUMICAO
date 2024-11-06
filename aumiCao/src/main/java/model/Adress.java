package model;

import jakarta.persistence.*;

@Table(name = "endereco")
public class Adress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "nomeRua", length = 255, nullable = false)
    private String nomeRua;
    @Column(name = "numeroRua", length = 255, nullable = false)
    private Long numHouse;
    @Column(name = "cep", length = 255, nullable = false)
    private String cep;
    @Column(name = "pais", length = 255, nullable = false)
    private String pais;
    @Column(name = "complemnto", length = 255, nullable = true)
    private String complemnto;


    public Adress() {
    }

    public Adress(Long id, String nomeRua, Long numHouse, String cep, String pais, String complemnto) {
        this.id = id;
        this.nomeRua = nomeRua;
        this.numHouse = numHouse;
        this.cep = cep;
        this.pais = pais;
        this.complemnto = complemnto;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeRua() {
        return nomeRua;
    }

    public void setNomeRua(String nomeRua) {
        this.nomeRua = nomeRua;
    }

    public Long getNumHouse() {
        return numHouse;
    }

    public void setNumHouse(Long numHouse) {
        this.numHouse = numHouse;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getComplemnto() {
        return complemnto;
    }

    public void setComplemnto(String complemnto) {
        this.complemnto = complemnto;
    }
}

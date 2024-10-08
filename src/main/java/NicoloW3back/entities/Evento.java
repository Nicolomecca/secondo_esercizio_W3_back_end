package NicoloW3back.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "eventi")
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "titolo", nullable = false)
    private String titolo;
    @Column(name = "data", nullable = true)
    private LocalDate data;
    @Column(name = "descrizione", nullable = true)
    private String descrizione;
    @Column(name = "tipo_di_evento", nullable = true)
    @Enumerated(EnumType.STRING)
    private TipoEvento tipoEvento;
    @Column(name = "numero_massimo_partecipanti", nullable = true)
    private Integer numeroMassimoPartecipanti;

    public Evento() {

    }

    public Evento(String titolo, LocalDate data, String descrizione, TipoEvento tipoEvento, int numeroMassimoPartecipanti) {
        this.titolo = titolo;
        this.data = data;
        this.descrizione = descrizione;
        this.tipoEvento = tipoEvento;
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
    }

    public long getId() {
        return id;
    }


    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public TipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(TipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public int getNumeroMassimoPartecipanti() {
        return numeroMassimoPartecipanti;
    }

    public void setNumeroMassimoPartecipanti(int numeroMassimoPartecipanti) {
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", titolo='" + titolo + '\'' +
                ", data=" + data +
                ", descrizione='" + descrizione + '\'' +
                ", tipoEvento=" + tipoEvento +
                ", numeroMassimoPartecipanti=" + numeroMassimoPartecipanti +
                '}';
    }
}

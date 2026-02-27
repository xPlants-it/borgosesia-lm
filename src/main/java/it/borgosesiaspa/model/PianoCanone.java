package it.borgosesiaspa.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonBackReference;

import it.borgosesiaspa.model.enums.Periodicita;
import it.borgosesiaspa.model.enums.TipoCanone;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Index;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import it.borgosesiaspa.shared.util.BaseEntity;

@Entity
@Table(indexes = {
        @Index(name = "idx_idContratto", columnList = "idContrattoLocazione")
})
public class PianoCanone extends BaseEntity {

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "id_contratto_locazione", nullable = false)
    private ContrattoLocazione contrattoLocazione;
    @Column
    private LocalDate dataInizioValidita;
    @Column
    private LocalDate dataFineValidita;
    @Column
    private LocalDate dataAnnullamento;
    @Column(precision = 10, scale = 2)
    private BigDecimal importo;
    @Column
    private Periodicita periodicita;
    @Column
    private Integer giornoScadenza;
    @Column
    private TipoCanone tipo;
    @Column(columnDefinition = "TEXT")
    private String note;

    public ContrattoLocazione getContrattoLocazione() {
        return contrattoLocazione;
    }

    public void setContrattoLocazione(ContrattoLocazione contrattoLocazione) {
        this.contrattoLocazione = contrattoLocazione;
    }

    public LocalDate getDataAnnullamento() {
        return dataAnnullamento;
    }

    public void setDataAnnullamento(LocalDate dataAnnullamento) {
        this.dataAnnullamento = dataAnnullamento;
    }

    public LocalDate getDataInizioValidita() {
        return dataInizioValidita;
    }

    public void setDataInizioValidita(LocalDate dataInizioValidita) {
        this.dataInizioValidita = dataInizioValidita;
    }

    public LocalDate getDataFineValidita() {
        return dataFineValidita;
    }

    public void setDataFineValidita(LocalDate dataFineValidita) {
        this.dataFineValidita = dataFineValidita;
    }

    public BigDecimal getImporto() {
        return importo;
    }

    public void setImporto(BigDecimal importo) {
        this.importo = importo;
    }

    public Periodicita getPeriodicita() {
        return periodicita;
    }

    public void setPeriodicita(Periodicita periodicita) {
        this.periodicita = periodicita;
    }

    public Integer getGiornoScadenza() {
        return giornoScadenza;
    }

    public void setGiornoScadenza(Integer giornoScadenza) {
        this.giornoScadenza = giornoScadenza;
    }

    public TipoCanone getTipo() {
        return tipo;
    }

    public void setTipo(TipoCanone tipo) {
        this.tipo = tipo;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}

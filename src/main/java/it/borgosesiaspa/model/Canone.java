package it.borgosesiaspa.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonBackReference;

import it.borgosesiaspa.shared.util.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Index;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(indexes = {
        @Index(name = "idx_idPianoCanone", columnList = "idPianoCanone"),
        @Index(name = "idx_idContratto", columnList = "idContrattoLocazione")
})
public class Canone extends BaseEntity {
    /*- idContratto
    - idPianoCanone
    - periodoDa
    - periodoA
    - dataScadenza
    - importo
    - importoIncassato
    tipo (NORMALE, RIDOTTO, AGEVOLATO)
    - stato (EMESSO, PARZIALMENTE_INCASSATO, INCASSATO, INSOLUTO) */

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "id_contratto_locazione", nullable = false)
    private ContrattoLocazione contrattoLocazione;

    public ContrattoLocazione getContrattoLocazione() {
        return contrattoLocazione;
    }
    public void setContrattoLocazione(ContrattoLocazione contrattoLocazione) {
        this.contrattoLocazione = contrattoLocazione;
    }
    public PianoCanone getPianoCanone() {
        return pianoCanone;
    }
    public void setPianoCanone(PianoCanone pianoCanone) {
        this.pianoCanone = pianoCanone;
    }
    public LocalDate getPeriodoDa() {
        return periodoDa;
    }
    public void setPeriodoDa(LocalDate periodoDa) {
        this.periodoDa = periodoDa;
    }
    public LocalDate getPeriodoA() {
        return periodoA;
    }
    public void setPeriodoA(LocalDate periodoA) {
        this.periodoA = periodoA;
    }
    public LocalDate getDataScadenza() {
        return dataScadenza;
    }
    public void setDataScadenza(LocalDate dataScadenza) {
        this.dataScadenza = dataScadenza;
    }
    public BigDecimal getImporto() {
        return importo;
    }
    public void setImporto(BigDecimal importo) {
        this.importo = importo;
    }
    public BigDecimal getImportoIncassato() {
        return importoIncassato;
    }
    public void setImportoIncassato(BigDecimal importoIncassato) {
        this.importoIncassato = importoIncassato;
    }
    public it.borgosesiaspa.model.enums.TipoCanone getTipo() {
        return tipo;
    }
    public void setTipo(it.borgosesiaspa.model.enums.TipoCanone tipo) {
        this.tipo = tipo;
    }
    public it.borgosesiaspa.model.enums.StatoCanone getStato() {
        return stato;
    }
    public void setStato(it.borgosesiaspa.model.enums.StatoCanone stato) {
        this.stato = stato;
    }
    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "id_piano_canone", nullable = true)
    private PianoCanone pianoCanone;
    @Column
    private LocalDate periodoDa;
    @Column
    private LocalDate periodoA;
    @Column
    private LocalDate dataScadenza;
    @Column(precision = 10, scale = 2)
    private BigDecimal importo;
    @Column(precision = 10, scale = 2)
    private BigDecimal importoIncassato;
    @Column
    private it.borgosesiaspa.model.enums.TipoCanone tipo;
    @Column
    private it.borgosesiaspa.model.enums.StatoCanone stato;
}

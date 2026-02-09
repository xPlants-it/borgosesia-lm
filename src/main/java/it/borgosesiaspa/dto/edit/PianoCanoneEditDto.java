package it.borgosesiaspa.dto.edit;

import java.math.BigDecimal;

import it.borgosesiaspa.model.enums.Periodicita;
import it.borgosesiaspa.model.enums.TipoCanone;

public class PianoCanoneEditDto {
    private Long id;
    private Long contrattoLocazioneId;
    private String dataInizioValidita;
    private String dataFineValidita;
    private BigDecimal importo;
    private Periodicita periodicita;
    private Integer giornoScadenza;
    private TipoCanone tipo;
    private String note;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getContrattoLocazioneId() {
        return contrattoLocazioneId;
    }

    public void setContrattoLocazioneId(Long contrattoLocazioneId) {
        this.contrattoLocazioneId = contrattoLocazioneId;
    }

    public String getDataInizioValidita() {
        return dataInizioValidita;
    }

    public void setDataInizioValidita(String dataInizioValidita) {
        this.dataInizioValidita = dataInizioValidita;
    }

    public String getDataFineValidita() {
        return dataFineValidita;
    }

    public void setDataFineValidita(String dataFineValidita) {
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

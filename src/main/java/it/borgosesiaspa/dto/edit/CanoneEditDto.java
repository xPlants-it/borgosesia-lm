package it.borgosesiaspa.dto.edit;

import java.math.BigDecimal;

import it.borgosesiaspa.model.enums.CanoneStato;
import it.borgosesiaspa.model.enums.TipoCanone;

public class CanoneEditDto {
    private Long id;
    private Long contrattoLocazioneId;
    private Long pianoCanoneId;
    private String periodoDa;
    private String periodoA;
    private String dataScadenza;
    private BigDecimal importo;
    private BigDecimal importoIncassato;
    private TipoCanone tipo;
    private CanoneStato stato;

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

    public Long getPianoCanoneId() {
        return pianoCanoneId;
    }

    public void setPianoCanoneId(Long pianoCanoneId) {
        this.pianoCanoneId = pianoCanoneId;
    }

    public String getPeriodoDa() {
        return periodoDa;
    }

    public void setPeriodoDa(String periodoDa) {
        this.periodoDa = periodoDa;
    }

    public String getPeriodoA() {
        return periodoA;
    }

    public void setPeriodoA(String periodoA) {
        this.periodoA = periodoA;
    }

    public String getDataScadenza() {
        return dataScadenza;
    }

    public void setDataScadenza(String dataScadenza) {
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

    public TipoCanone getTipo() {
        return tipo;
    }

    public void setTipo(TipoCanone tipo) {
        this.tipo = tipo;
    }

    public CanoneStato getStato() {
        return stato;
    }

    public void setStato(CanoneStato stato) {
        this.stato = stato;
    }
}

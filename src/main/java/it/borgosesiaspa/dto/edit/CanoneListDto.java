package it.borgosesiaspa.dto.edit;

import java.math.BigDecimal;
import java.time.LocalDate;

import it.borgosesiaspa.model.enums.StatoCanone;
import it.borgosesiaspa.model.enums.TipoCanone;

public class CanoneListDto {
    private Long id;
    private Integer idUnita;
    private Integer idConduttore;
    private Long contrattoLocazioneId;
    private Long pianoCanoneId;
    private LocalDate periodoDa;
    private LocalDate periodoA;
    private LocalDate dataScadenza;
    private BigDecimal importo;

    public void setIdUnita(Integer idUnita) {
        this.idUnita = idUnita;
    }

    public void setIdConduttore(Integer idConduttore) {
        this.idConduttore = idConduttore;
    }

    public void setCodiceContrattoLocazione(String codiceContrattoLocazione) {
        this.codiceContrattoLocazione = codiceContrattoLocazione;
    }

    private BigDecimal importoIncassato;
    private TipoCanone tipo;
    private StatoCanone stato;

    private String descrizioneContrattoLocazione;

    public Integer getIdUnita() {
        return idUnita;
    }

    public Integer getIdConduttore() {
        return idConduttore;
    }

    public String getCodiceContrattoLocazione() {
        return codiceContrattoLocazione;
    }

    private String codiceContrattoLocazione;

    public String getDescrizioneContrattoLocazione() {
        return descrizioneContrattoLocazione;
    }

    public void setDescrizioneContrattoLocazione(String descrizioneContrattoLocazione) {
        this.descrizioneContrattoLocazione = descrizioneContrattoLocazione;
    }

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

    public TipoCanone getTipo() {
        return tipo;
    }

    public void setTipo(TipoCanone tipo) {
        this.tipo = tipo;
    }

    public StatoCanone getStato() {
        return stato;
    }

    public void setStato(StatoCanone stato) {
        this.stato = stato;
    }
}

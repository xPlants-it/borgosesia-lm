package it.borgosesiaspa.dto.edit;

import java.math.BigDecimal;
import java.time.LocalDate;

import it.borgosesiaspa.model.enums.ContrattoStato;
import it.borgosesiaspa.model.enums.Periodicita;
import it.borgosesiaspa.model.enums.TipologiaRinnovo;

public class ContrattoLocazioneEditDto {
    private Long id;
    private String descrizione;
    private Integer idImmobile;
    private Integer idUnita;
    private Integer idConduttore;
    private String codiceContratto;
    private LocalDate dataInizio;
    private LocalDate dataFine;
    private LocalDate dataPrimaScadenza;
    private Integer durataMesi;
    private BigDecimal canoneBase;
    private Periodicita periodicita;
    private Boolean rivalutazioneIstat;
    private BigDecimal percentualeIstat;
    private BigDecimal depositoCauzionale;
    private ContrattoStato stato;
    private LocalDate dataCessazione;
    private String note;
    private String tipologia;
    private TipologiaRinnovo tipologiaRinnovo;
    private Integer mesiPreavviso;

    public String getTipologia() {
        return tipologia;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }

    public TipologiaRinnovo getTipologiaRinnovo() {
        return tipologiaRinnovo;
    }

    public void setTipologiaRinnovo(TipologiaRinnovo tipologiaRinnovo) {
        this.tipologiaRinnovo = tipologiaRinnovo;
    }

    public Integer getMesiPreavviso() {
        return mesiPreavviso;
    }

    public void setMesiPreavviso(Integer mesiPreavviso) {
        this.mesiPreavviso = mesiPreavviso;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public Integer getIdImmobile() {
        return idImmobile;
    }

    public void setIdImmobile(Integer idImmobile) {
        this.idImmobile = idImmobile;
    }

    public Integer getIdUnita() {
        return idUnita;
    }

    public void setIdUnita(Integer idUnita) {
        this.idUnita = idUnita;
    }

    public Integer getIdConduttore() {
        return idConduttore;
    }

    public void setIdConduttore(Integer idConduttore) {
        this.idConduttore = idConduttore;
    }

    public String getCodiceContratto() {
        return codiceContratto;
    }

    public void setCodiceContratto(String codiceContratto) {
        this.codiceContratto = codiceContratto;
    }

    public LocalDate getDataInizio() {
        return dataInizio;
    }

    public void setDataInizio(LocalDate dataInizio) {
        this.dataInizio = dataInizio;
    }

    public LocalDate getDataFine() {
        return dataFine;
    }

    public void setDataFine(LocalDate dataFine) {
        this.dataFine = dataFine;
    }

    public LocalDate getDataPrimaScadenza() {
        return dataPrimaScadenza;
    }

    public void setDataPrimaScadenza(LocalDate dataPrimaScadenza) {
        this.dataPrimaScadenza = dataPrimaScadenza;
    }

    public Integer getDurataMesi() {
        return durataMesi;
    }

    public void setDurataMesi(Integer durataMesi) {
        this.durataMesi = durataMesi;
    }

    public BigDecimal getCanoneBase() {
        return canoneBase;
    }

    public void setCanoneBase(BigDecimal canoneBase) {
        this.canoneBase = canoneBase;
    }

    public Periodicita getPeriodicita() {
        return periodicita;
    }

    public void setPeriodicita(Periodicita periodicita) {
        this.periodicita = periodicita;
    }

    public Boolean getRivalutazioneIstat() {
        return rivalutazioneIstat;
    }

    public void setRivalutazioneIstat(Boolean rivalutazioneIstat) {
        this.rivalutazioneIstat = rivalutazioneIstat;
    }

    public BigDecimal getPercentualeIstat() {
        return percentualeIstat;
    }

    public void setPercentualeIstat(BigDecimal percentualeIstat) {
        this.percentualeIstat = percentualeIstat;
    }

    public BigDecimal getDepositoCauzionale() {
        return depositoCauzionale;
    }

    public void setDepositoCauzionale(BigDecimal depositoCauzionale) {
        this.depositoCauzionale = depositoCauzionale;
    }

    public ContrattoStato getStato() {
        return stato;
    }

    public void setStato(ContrattoStato stato) {
        this.stato = stato;
    }

    public LocalDate getDataCessazione() {
        return dataCessazione;
    }

    public void setDataCessazione(LocalDate dataCessazione) {
        this.dataCessazione = dataCessazione;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}

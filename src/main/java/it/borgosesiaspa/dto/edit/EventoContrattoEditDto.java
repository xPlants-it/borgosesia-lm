package it.borgosesiaspa.dto.edit;

import java.time.LocalDate;

import it.borgosesiaspa.model.enums.EventoRiferimento;
import it.borgosesiaspa.model.enums.EventoTipo;

public class EventoContrattoEditDto {
    private Long id;
    private Long contrattoLocazioneId;
    private EventoTipo tipoEvento;
    private LocalDate dataEvento;
    private EventoRiferimento riferimentoTipo;
    private Long riferimentoId;
    private String payloadJson;
    private String note;
    private String createdBy;

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

    public EventoTipo getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(EventoTipo tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public LocalDate getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(LocalDate dataEvento) {
        this.dataEvento = dataEvento;
    }

    public EventoRiferimento getRiferimentoTipo() {
        return riferimentoTipo;
    }

    public void setRiferimentoTipo(EventoRiferimento riferimentoTipo) {
        this.riferimentoTipo = riferimentoTipo;
    }

    public Long getRiferimentoId() {
        return riferimentoId;
    }

    public void setRiferimentoId(Long riferimentoId) {
        this.riferimentoId = riferimentoId;
    }

    public String getPayloadJson() {
        return payloadJson;
    }

    public void setPayloadJson(String payloadJson) {
        this.payloadJson = payloadJson;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
}

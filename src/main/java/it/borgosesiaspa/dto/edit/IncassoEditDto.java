package it.borgosesiaspa.dto.edit;

import java.math.BigDecimal;
import java.time.LocalDate;

import it.borgosesiaspa.model.enums.MetodoIncasso;

public class IncassoEditDto {
    private Long id;
    private Long contrattoLocazioneId;
    private Long canoneId;
    private LocalDate dataIncasso;
    private BigDecimal importo;
    private MetodoIncasso metodo;
    private String riferimento;
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

    public Long getCanoneId() {
        return canoneId;
    }

    public void setCanoneId(Long canoneId) {
        this.canoneId = canoneId;
    }

    public LocalDate getDataIncasso() {
        return dataIncasso;
    }

    public void setDataIncasso(LocalDate dataIncasso) {
        this.dataIncasso = dataIncasso;
    }

    public BigDecimal getImporto() {
        return importo;
    }

    public void setImporto(BigDecimal importo) {
        this.importo = importo;
    }

    public MetodoIncasso getMetodo() {
        return metodo;
    }

    public void setMetodo(MetodoIncasso metodo) {
        this.metodo = metodo;
    }

    public String getRiferimento() {
        return riferimento;
    }

    public void setRiferimento(String riferimento) {
        this.riferimento = riferimento;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}

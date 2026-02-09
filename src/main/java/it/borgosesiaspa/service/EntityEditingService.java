package it.borgosesiaspa.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import it.borgosesiaspa.dto.edit.CanoneEditDto;
import it.borgosesiaspa.dto.edit.ContrattoLocazioneEditDto;
import it.borgosesiaspa.dto.edit.EventoContrattoEditDto;
import it.borgosesiaspa.dto.edit.IncassoEditDto;
import it.borgosesiaspa.dto.edit.MorositaEditDto;
import it.borgosesiaspa.dto.edit.PianoCanoneEditDto;
import it.borgosesiaspa.model.Canone;
import it.borgosesiaspa.model.ContrattoLocazione;
import it.borgosesiaspa.model.EventoContratto;
import it.borgosesiaspa.model.Incasso;
import it.borgosesiaspa.model.Morosita;
import it.borgosesiaspa.model.PianoCanone;
import it.borgosesiaspa.repository.CanoneRepository;
import it.borgosesiaspa.repository.ContrattoLocazioneRepository;
import it.borgosesiaspa.repository.EventoContrattoRepository;
import it.borgosesiaspa.repository.IncassoRepository;
import it.borgosesiaspa.repository.MorositaRepository;
import it.borgosesiaspa.repository.PianoCanoneRepository;

@Service
@Transactional
public class EntityEditingService {

    private final ContrattoLocazioneRepository contrattoLocazioneRepository;
    private final CanoneRepository canoneRepository;
    private final IncassoRepository incassoRepository;
    private final MorositaRepository morositaRepository;
    private final PianoCanoneRepository pianoCanoneRepository;
    private final EventoContrattoRepository eventoContrattoRepository;

    public EntityEditingService(
            ContrattoLocazioneRepository contrattoLocazioneRepository,
            CanoneRepository canoneRepository,
            IncassoRepository incassoRepository,
            MorositaRepository morositaRepository,
            PianoCanoneRepository pianoCanoneRepository,
            EventoContrattoRepository eventoContrattoRepository) {
        this.contrattoLocazioneRepository = contrattoLocazioneRepository;
        this.canoneRepository = canoneRepository;
        this.incassoRepository = incassoRepository;
        this.morositaRepository = morositaRepository;
        this.pianoCanoneRepository = pianoCanoneRepository;
        this.eventoContrattoRepository = eventoContrattoRepository;
    }

    @Transactional(readOnly = true)
    public Page<ContrattoLocazioneEditDto> listContrattiLocazione(Pageable pageable) {
        return contrattoLocazioneRepository.findAll(pageable).map(this::toDto);
    }

    public ContrattoLocazioneEditDto createContrattoLocazione(ContrattoLocazioneEditDto dto) {
        ContrattoLocazione entity = new ContrattoLocazione();
        applyContrattoLocazione(entity, dto);
        return toDto(contrattoLocazioneRepository.save(entity));
    }

    public void deleteContrattoLocazione(Long id) {
        ContrattoLocazione entity = findContrattoLocazione(id);
        contrattoLocazioneRepository.delete(entity);
    }

    @Transactional(readOnly = true)
    public ContrattoLocazioneEditDto getContrattoLocazione(Long id) {
        ContrattoLocazione entity = findContrattoLocazione(id);
        return toDto(entity);
    }

    public ContrattoLocazioneEditDto updateContrattoLocazione(Long id, ContrattoLocazioneEditDto dto) {
        ContrattoLocazione entity = findContrattoLocazione(id);
        applyContrattoLocazione(entity, dto);
        return toDto(contrattoLocazioneRepository.save(entity));
    }

    @Transactional(readOnly = true)
    public Page<CanoneEditDto> listCanoni(Pageable pageable) {
        return canoneRepository.findAll(pageable).map(this::toDto);
    }

    public CanoneEditDto createCanone(CanoneEditDto dto) {
        Canone entity = new Canone();
        applyCanone(entity, dto);
        return toDto(canoneRepository.save(entity));
    }

    public void deleteCanone(Long id) {
        Canone entity = findCanone(id);
        canoneRepository.delete(entity);
    }

    @Transactional(readOnly = true)
    public CanoneEditDto getCanone(Long id) {
        return toDto(findCanone(id));
    }

    public CanoneEditDto updateCanone(Long id, CanoneEditDto dto) {
        Canone entity = findCanone(id);
        applyCanone(entity, dto);
        return toDto(canoneRepository.save(entity));
    }

    @Transactional(readOnly = true)
    public Page<IncassoEditDto> listIncassi(Pageable pageable) {
        return incassoRepository.findAll(pageable).map(this::toDto);
    }

    public IncassoEditDto createIncasso(IncassoEditDto dto) {
        Incasso entity = new Incasso();
        applyIncasso(entity, dto);
        return toDto(incassoRepository.save(entity));
    }

    public void deleteIncasso(Long id) {
        Incasso entity = findIncasso(id);
        incassoRepository.delete(entity);
    }

    @Transactional(readOnly = true)
    public IncassoEditDto getIncasso(Long id) {
        return toDto(findIncasso(id));
    }

    public IncassoEditDto updateIncasso(Long id, IncassoEditDto dto) {
        Incasso entity = findIncasso(id);
        applyIncasso(entity, dto);
        return toDto(incassoRepository.save(entity));
    }

    @Transactional(readOnly = true)
    public Page<MorositaEditDto> listMorosita(Pageable pageable) {
        return morositaRepository.findAll(pageable).map(this::toDto);
    }

    public MorositaEditDto createMorosita(MorositaEditDto dto) {
        Morosita entity = new Morosita();
        applyMorosita(entity, dto);
        return toDto(morositaRepository.save(entity));
    }

    public void deleteMorosita(Long id) {
        Morosita entity = findMorosita(id);
        morositaRepository.delete(entity);
    }

    @Transactional(readOnly = true)
    public MorositaEditDto getMorosita(Long id) {
        return toDto(findMorosita(id));
    }

    public MorositaEditDto updateMorosita(Long id, MorositaEditDto dto) {
        Morosita entity = findMorosita(id);
        applyMorosita(entity, dto);
        return toDto(morositaRepository.save(entity));
    }

    @Transactional(readOnly = true)
    public Page<PianoCanoneEditDto> listPianiCanone(Pageable pageable) {
        return pianoCanoneRepository.findAll(pageable).map(this::toDto);
    }

    public PianoCanoneEditDto createPianoCanone(PianoCanoneEditDto dto) {
        PianoCanone entity = new PianoCanone();
        applyPianoCanone(entity, dto);
        return toDto(pianoCanoneRepository.save(entity));
    }

    public void deletePianoCanone(Long id) {
        PianoCanone entity = findPianoCanone(id);
        pianoCanoneRepository.delete(entity);
    }

    @Transactional(readOnly = true)
    public PianoCanoneEditDto getPianoCanone(Long id) {
        return toDto(findPianoCanone(id));
    }

    public PianoCanoneEditDto updatePianoCanone(Long id, PianoCanoneEditDto dto) {
        PianoCanone entity = findPianoCanone(id);
        applyPianoCanone(entity, dto);
        return toDto(pianoCanoneRepository.save(entity));
    }

    @Transactional(readOnly = true)
    public Page<EventoContrattoEditDto> listEventiContratto(Pageable pageable) {
        return eventoContrattoRepository.findAll(pageable).map(this::toDto);
    }

    public EventoContrattoEditDto createEventoContratto(EventoContrattoEditDto dto) {
        EventoContratto entity = new EventoContratto();
        applyEventoContratto(entity, dto);
        return toDto(eventoContrattoRepository.save(entity));
    }

    public void deleteEventoContratto(Long id) {
        EventoContratto entity = findEventoContratto(id);
        eventoContrattoRepository.delete(entity);
    }

    @Transactional(readOnly = true)
    public EventoContrattoEditDto getEventoContratto(Long id) {
        return toDto(findEventoContratto(id));
    }

    public EventoContrattoEditDto updateEventoContratto(Long id, EventoContrattoEditDto dto) {
        EventoContratto entity = findEventoContratto(id);
        applyEventoContratto(entity, dto);
        return toDto(eventoContrattoRepository.save(entity));
    }

    private void applyContrattoLocazione(ContrattoLocazione entity, ContrattoLocazioneEditDto dto) {
        entity.setDescrizione(dto.getDescrizione());
        entity.setIdImmobile(dto.getIdImmobile());
        entity.setIdUnita(dto.getIdUnita());
        entity.setIdConduttore(dto.getIdConduttore());
        entity.setCodiceContratto(dto.getCodiceContratto());
        entity.setDataInizio(dto.getDataInizio());
        entity.setDataFine(dto.getDataFine());
        entity.setDataPrimaScadenza(dto.getDataPrimaScadenza());
        entity.setDurataMesi(dto.getDurataMesi());
        entity.setCanoneBase(dto.getCanoneBase());
        entity.setPeriodicita(dto.getPeriodicita());
        entity.setRivalutazioneIstat(dto.getRivalutazioneIstat());
        entity.setPercentualeIstat(dto.getPercentualeIstat());
        entity.setDepositoCauzionale(dto.getDepositoCauzionale());
        entity.setStato(dto.getStato());
        entity.setDataCessazione(dto.getDataCessazione());
        entity.setNote(dto.getNote());
    }

    private void applyCanone(Canone entity, CanoneEditDto dto) {
        if (dto.getContrattoLocazioneId() == null) {
            throw badRequest("contrattoLocazioneId e' obbligatorio");
        }
        entity.setContrattoLocazione(findContrattoLocazione(dto.getContrattoLocazioneId()));
        entity.setPianoCanone(dto.getPianoCanoneId() != null ? findPianoCanone(dto.getPianoCanoneId()) : null);
        entity.setPeriodoDa(dto.getPeriodoDa());
        entity.setPeriodoA(dto.getPeriodoA());
        entity.setDataScadenza(dto.getDataScadenza());
        entity.setImporto(dto.getImporto());
        entity.setImportoIncassato(dto.getImportoIncassato());
        entity.setTipo(dto.getTipo());
        entity.setStato(dto.getStato());
    }

    private void applyIncasso(Incasso entity, IncassoEditDto dto) {
        entity.setContrattoLocazione(dto.getContrattoLocazioneId() != null ? findContrattoLocazione(dto.getContrattoLocazioneId()) : null);
        entity.setCanone(dto.getCanoneId() != null ? findCanone(dto.getCanoneId()) : null);
        entity.setDataIncasso(dto.getDataIncasso());
        entity.setImporto(dto.getImporto());
        entity.setMetodo(dto.getMetodo());
        entity.setRiferimento(dto.getRiferimento());
        entity.setNote(dto.getNote());
    }

    private void applyMorosita(Morosita entity, MorositaEditDto dto) {
        if (dto.getContrattoLocazioneId() == null) {
            throw badRequest("contrattoLocazioneId e' obbligatorio");
        }
        entity.setContrattoLocazione(findContrattoLocazione(dto.getContrattoLocazioneId()));
        entity.setCanone(dto.getCanoneId() != null ? findCanone(dto.getCanoneId()) : null);
        entity.setDataInizio(dto.getDataInizio());
        entity.setGiorniRitardo(dto.getGiorniRitardo());
        entity.setImportoResiduo(dto.getImportoResiduo());
        entity.setStato(dto.getStato());
        entity.setLivello(dto.getLivello());
        entity.setRiferimento(dto.getRiferimento());
        entity.setNote(dto.getNote());
    }

    private void applyPianoCanone(PianoCanone entity, PianoCanoneEditDto dto) {
        if (dto.getContrattoLocazioneId() == null) {
            throw badRequest("contrattoLocazioneId e' obbligatorio");
        }
        entity.setContrattoLocazione(findContrattoLocazione(dto.getContrattoLocazioneId()));
        entity.setDataInizioValidita(dto.getDataInizioValidita());
        entity.setDataFineValidita(dto.getDataFineValidita());
        entity.setImporto(dto.getImporto());
        entity.setPeriodicita(dto.getPeriodicita());
        entity.setGiornoScadenza(dto.getGiornoScadenza());
        entity.setTipo(dto.getTipo());
        entity.setNote(dto.getNote());
    }

    private void applyEventoContratto(EventoContratto entity, EventoContrattoEditDto dto) {
        entity.setContrattoLocazione(dto.getContrattoLocazioneId() != null
                ? findContrattoLocazione(dto.getContrattoLocazioneId())
                : null);
        entity.setTipoEvento(dto.getTipoEvento());
        entity.setDataEvento(dto.getDataEvento());
        entity.setRiferimentoTipo(dto.getRiferimentoTipo());
        entity.setRiferimentoId(dto.getRiferimentoId());
        entity.setPayloadJson(dto.getPayloadJson());
        entity.setNote(dto.getNote());
        entity.setCreatedBy(dto.getCreatedBy());
    }

    private ContrattoLocazione findContrattoLocazione(Long id) {
        return contrattoLocazioneRepository.findById(id)
                .orElseThrow(() -> notFound("ContrattoLocazione", id));
    }

    private Canone findCanone(Long id) {
        return canoneRepository.findById(id)
                .orElseThrow(() -> notFound("Canone", id));
    }

    private Incasso findIncasso(Long id) {
        return incassoRepository.findById(id)
                .orElseThrow(() -> notFound("Incasso", id));
    }

    private Morosita findMorosita(Long id) {
        return morositaRepository.findById(id)
                .orElseThrow(() -> notFound("Morosita", id));
    }

    private PianoCanone findPianoCanone(Long id) {
        return pianoCanoneRepository.findById(id)
                .orElseThrow(() -> notFound("PianoCanone", id));
    }

    private EventoContratto findEventoContratto(Long id) {
        return eventoContrattoRepository.findById(id)
                .orElseThrow(() -> notFound("EventoContratto", id));
    }

    private ResponseStatusException notFound(String entityName, Long id) {
        return new ResponseStatusException(HttpStatus.NOT_FOUND, entityName + " non trovato con id=" + id);
    }

    private ResponseStatusException badRequest(String message) {
        return new ResponseStatusException(HttpStatus.BAD_REQUEST, message);
    }

    private ContrattoLocazioneEditDto toDto(ContrattoLocazione entity) {
        ContrattoLocazioneEditDto dto = new ContrattoLocazioneEditDto();
        dto.setId(entity.getId());
        dto.setDescrizione(entity.getDescrizione());
        dto.setIdImmobile(entity.getIdImmobile());
        dto.setIdUnita(entity.getIdUnita());
        dto.setIdConduttore(entity.getIdConduttore());
        dto.setCodiceContratto(entity.getCodiceContratto());
        dto.setDataInizio(entity.getDataInizio());
        dto.setDataFine(entity.getDataFine());
        dto.setDataPrimaScadenza(entity.getDataPrimaScadenza());
        dto.setDurataMesi(entity.getDurataMesi());
        dto.setCanoneBase(entity.getCanoneBase());
        dto.setPeriodicita(entity.getPeriodicita());
        dto.setRivalutazioneIstat(entity.getRivalutazioneIstat());
        dto.setPercentualeIstat(entity.getPercentualeIstat());
        dto.setDepositoCauzionale(entity.getDepositoCauzionale());
        dto.setStato(entity.getStato());
        dto.setDataCessazione(entity.getDataCessazione());
        dto.setNote(entity.getNote());
        return dto;
    }

    private CanoneEditDto toDto(Canone entity) {
        CanoneEditDto dto = new CanoneEditDto();
        dto.setId(entity.getId());
        dto.setContrattoLocazioneId(entity.getContrattoLocazione() != null ? entity.getContrattoLocazione().getId() : null);
        dto.setPianoCanoneId(entity.getPianoCanone() != null ? entity.getPianoCanone().getId() : null);
        dto.setPeriodoDa(entity.getPeriodoDa());
        dto.setPeriodoA(entity.getPeriodoA());
        dto.setDataScadenza(entity.getDataScadenza());
        dto.setImporto(entity.getImporto());
        dto.setImportoIncassato(entity.getImportoIncassato());
        dto.setTipo(entity.getTipo());
        dto.setStato(entity.getStato());
        return dto;
    }

    private IncassoEditDto toDto(Incasso entity) {
        IncassoEditDto dto = new IncassoEditDto();
        dto.setId(entity.getId());
        dto.setContrattoLocazioneId(entity.getContrattoLocazione() != null ? entity.getContrattoLocazione().getId() : null);
        dto.setCanoneId(entity.getCanone() != null ? entity.getCanone().getId() : null);
        dto.setDataIncasso(entity.getDataIncasso());
        dto.setImporto(entity.getImporto());
        dto.setMetodo(entity.getMetodo());
        dto.setRiferimento(entity.getRiferimento());
        dto.setNote(entity.getNote());
        return dto;
    }

    private MorositaEditDto toDto(Morosita entity) {
        MorositaEditDto dto = new MorositaEditDto();
        dto.setId(entity.getId());
        dto.setContrattoLocazioneId(entity.getContrattoLocazione() != null ? entity.getContrattoLocazione().getId() : null);
        dto.setCanoneId(entity.getCanone() != null ? entity.getCanone().getId() : null);
        dto.setDataInizio(entity.getDataInizio());
        dto.setGiorniRitardo(entity.getGiorniRitardo());
        dto.setImportoResiduo(entity.getImportoResiduo());
        dto.setStato(entity.getStato());
        dto.setLivello(entity.getLivello());
        dto.setRiferimento(entity.getRiferimento());
        dto.setNote(entity.getNote());
        return dto;
    }

    private PianoCanoneEditDto toDto(PianoCanone entity) {
        PianoCanoneEditDto dto = new PianoCanoneEditDto();
        dto.setId(entity.getId());
        dto.setContrattoLocazioneId(entity.getContrattoLocazione() != null ? entity.getContrattoLocazione().getId() : null);
        dto.setDataInizioValidita(entity.getDataInizioValidita());
        dto.setDataFineValidita(entity.getDataFineValidita());
        dto.setImporto(entity.getImporto());
        dto.setPeriodicita(entity.getPeriodicita());
        dto.setGiornoScadenza(entity.getGiornoScadenza());
        dto.setTipo(entity.getTipo());
        dto.setNote(entity.getNote());
        return dto;
    }

    private EventoContrattoEditDto toDto(EventoContratto entity) {
        EventoContrattoEditDto dto = new EventoContrattoEditDto();
        dto.setId(entity.getId());
        dto.setContrattoLocazioneId(entity.getContrattoLocazione() != null ? entity.getContrattoLocazione().getId() : null);
        dto.setTipoEvento(entity.getTipoEvento());
        dto.setDataEvento(entity.getDataEvento());
        dto.setRiferimentoTipo(entity.getRiferimentoTipo());
        dto.setRiferimentoId(entity.getRiferimentoId());
        dto.setPayloadJson(entity.getPayloadJson());
        dto.setNote(entity.getNote());
        dto.setCreatedBy(entity.getCreatedBy());
        return dto;
    }
}

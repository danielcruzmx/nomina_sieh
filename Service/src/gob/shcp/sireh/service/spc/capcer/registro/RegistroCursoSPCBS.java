package gob.shcp.sireh.service.spc.capcer.registro;

import gob.shcp.fsn.service.AbstractService;
import gob.shcp.fsn.service.ServiceException;
import gob.shcp.fsn.service.mail.MailParams;

import gob.shcp.sireh.data.jdbc.QueryTdPlazaDAO;
import gob.shcp.sireh.data.jdbc.TdEmpleadoDAO;
import gob.shcp.sireh.data.jdbc.TdPlazaDAO;
import gob.shcp.sireh.data.jdbc.spc.TnCapContratoCurDAO;
import gob.shcp.sireh.data.jdbc.spc.QueryTnCapCalCursoDAO;
import gob.shcp.sireh.data.jdbc.spc.CustomParticipantesCandidatos;
import gob.shcp.sireh.data.jdbc.spc.CustomParticipantesInscritos;
import gob.shcp.sireh.data.jdbc.spc.QueryTnCapBitacoraInstDAO;
import gob.shcp.sireh.data.jdbc.spc.QueryTnCapContratoCurDAO;
import gob.shcp.sireh.data.jdbc.spc.QueryTnCapCursoDAO;
import gob.shcp.sireh.data.jdbc.spc.TcCapAulaDAO;
import gob.shcp.sireh.data.jdbc.spc.TcCapCursoPrincpDAO;
import gob.shcp.sireh.data.jdbc.spc.TcCapNotifCursoDAO;
import gob.shcp.sireh.data.jdbc.spc.TcCapProveedorDAO;
import gob.shcp.sireh.data.jdbc.spc.TnCapCalCursoDAO;
import gob.shcp.sireh.data.jdbc.spc.TnCapBitacoraContDAO;
import gob.shcp.sireh.data.jdbc.spc.TnCapBitacoraCurDAO;
import gob.shcp.sireh.data.jdbc.spc.TnCapBitacoraInstDAO;

import gob.shcp.sireh.data.jdbc.spc.TnCapCursoDAO;
import gob.shcp.sireh.data.jdbc.spc.TnCapFacturaCursoDAO;
import gob.shcp.sireh.data.jdbc.spc.TnCapParticipanteDAO;
import gob.shcp.sireh.data.jdbc.support.CustomConceptoPagoCapturaDAO;
import gob.shcp.sireh.data.jdbc.support.CustomConnectionDAO;

import gob.shcp.sireh.domain.jdbc.Item;
import gob.shcp.sireh.domain.jdbc.TcAtributoPuesto;
import gob.shcp.sireh.domain.jdbc.TdEmpleado;
import gob.shcp.sireh.domain.jdbc.TdPlaza;

import gob.shcp.sireh.domain.jdbc.spc.AsignarInstructor;
import gob.shcp.sireh.domain.jdbc.spc.CustomAltaContrato;
import gob.shcp.sireh.domain.jdbc.spc.CustomAsignarContrato;
import gob.shcp.sireh.domain.jdbc.spc.CustomCursosFacturas;
import gob.shcp.sireh.domain.jdbc.spc.CustomRegistroCalendario;
import gob.shcp.sireh.domain.jdbc.spc.CustomRegistroCurso;
import gob.shcp.sireh.domain.jdbc.spc.CustomRegistroParticipante;
import gob.shcp.sireh.domain.jdbc.spc.CustomTnCapCalendarioCurso;
import gob.shcp.sireh.domain.jdbc.spc.TcCapAula;
import gob.shcp.sireh.domain.jdbc.spc.TcCapCursoPrincp;
import gob.shcp.sireh.domain.jdbc.spc.TcCapCursoPrincplPK;
import gob.shcp.sireh.domain.jdbc.spc.TcCapNotifCurso;
import gob.shcp.sireh.domain.jdbc.spc.TcCapNotifCursoPK;

import gob.shcp.sireh.domain.jdbc.spc.TcCapProveedor;
import gob.shcp.sireh.domain.jdbc.spc.TnCapCalCurso;
import gob.shcp.sireh.domain.jdbc.spc.TnCapBitacoraCont;
import gob.shcp.sireh.domain.jdbc.spc.TnCapBitacoraCur;
import gob.shcp.sireh.domain.jdbc.spc.TnCapBitacoraInst;
import gob.shcp.sireh.domain.jdbc.spc.TnCapContratoCur;
import gob.shcp.sireh.domain.jdbc.spc.TnCapCurso;
import gob.shcp.sireh.domain.jdbc.spc.TnCapFacturaCurso;
import gob.shcp.sireh.domain.jdbc.spc.TnCapFacturaCursoPK;
import gob.shcp.sireh.domain.jdbc.spc.TnCapParticipante;
import gob.shcp.sireh.domain.jdbc.spc.TnCapParticipantePK;

import gob.shcp.sireh.model.ItemDTO;
import gob.shcp.sireh.model.TcAtributoPuestoDTO;
import gob.shcp.sireh.model.TnNotificacionDTO;
import gob.shcp.sireh.model.nomina.TdEmpleadoDTO;
import gob.shcp.sireh.model.plaza.TdPlazaDTO;
import gob.shcp.sireh.model.spc.TcCapAulaDTO;
import gob.shcp.sireh.model.spc.TcCapCursoPrincpDTO;
import gob.shcp.sireh.model.spc.TcCapNotifCursoDTO;

import gob.shcp.sireh.model.spc.TcCapProveedorDTO;
import gob.shcp.sireh.model.spc.TnCapBitacoraInstDTO;
import gob.shcp.sireh.model.spc.TnCapContratoCurDTO;
import gob.shcp.sireh.model.spc.TnCapCursoDTO;
import gob.shcp.sireh.model.spc.TnCapFacturaCursoDTO;
import gob.shcp.sireh.model.spc.TnCapParticipanteDTO;
import gob.shcp.sireh.model.spc.TnCapCalCursoDTO;
import gob.shcp.sireh.model.spc.registro.AsignarInstructorDTO;
import gob.shcp.sireh.model.spc.registro.AsignarParticipanteDTO;
import gob.shcp.sireh.model.spc.registro.CustomAltaContratoDTO;
import gob.shcp.sireh.model.spc.registro.CustomAsignarContratoDTO;
import gob.shcp.sireh.model.spc.registro.CustomCursosFacturasDTO;
import gob.shcp.sireh.model.spc.registro.CustomParticipantesCandidatosDTO;
import gob.shcp.sireh.model.spc.registro.CustomParticipantesInscritosDTO;
import gob.shcp.sireh.model.spc.registro.CustomRegistroCursoDTO;
import gob.shcp.sireh.model.spc.registro.CustomTnCapCalendarioCursoDTO;
import gob.shcp.sireh.model.spc.registro.RegistroCalendarioDTO;

import gob.shcp.sireh.service.SirehUtils;
import gob.shcp.sireh.service.oficinaVirtual.NotificacionesService;

import java.io.File;
import java.io.IOException;

import java.text.SimpleDateFormat;

import java.util.ArrayList;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.io.FileUtils;

/**
 * Business Service encargado de atender solicitudes del Módulo de Registro
 */
public class RegistroCursoSPCBS extends AbstractService implements RegistroCursoSPCService {

    private TnCapCurso getCurso(Integer idCurso) {
        return super.persistence().get(TnCapCursoDAO.class).getById(idCurso);
    }

    /**
     * Metodo encargado de obtener datos del curso con base en su clave de curso.
     * @author Oscar S.
     * @param cicloEjeTematico Integer
     * @param cursoClave String
     * @return tnCapCursoDTO TnCapCursoDTO
     */
    public TnCapCursoDTO getCursoByClave(Integer cicloEjeTematico, String cursoClave) {
        TnCapCursoDTO tnCapCursoDTO = null;
        List<TnCapCurso> tnCapCursoList = super.persistence().get(QueryTnCapCursoDAO.class).getCursoByClave(cursoClave);

        if (tnCapCursoList.size() == 0) {
            tnCapCursoDTO = null;
        } else {
            TnCapCurso tnCapCurso = tnCapCursoList.get(0);
            tnCapCursoDTO = super.transformation().map(tnCapCurso, TnCapCursoDTO.class);
        }
        return tnCapCursoDTO;
    }

    /**
     * Metodo encargado de obtener los datos del Curso con base en su id.
     * @author Oscar S.
     * @param idCurso Integer
     * @return customRegistroCursoDTO CustomRegistroCursoDTO
     */
    public CustomRegistroCursoDTO getCursoRegistro(Integer idCurso) {
        // Obtener curso        
        List<CustomRegistroCurso> listaRegistroCurso = super.persistence().get(QueryTnCapCursoDAO.class).getDatosRegistroCurso(idCurso);
        CustomRegistroCursoDTO customRegistroCursoDTO = null;
        
        if (listaRegistroCurso != null && !listaRegistroCurso.isEmpty()) {
            CustomRegistroCurso customRegistroCurso = listaRegistroCurso.get(0);
            customRegistroCursoDTO = super.transformation().map(customRegistroCurso, CustomRegistroCursoDTO.class);
        }
        return customRegistroCursoDTO;
    }

    /**
     * Metodo que Registra el curso con base en el objeto tnCapCursoDTO
     * @author Oscar S.
     * @param tnCapCursoDTO TnCapCursoDTO
     */
    public void saveRegistroCurso(TnCapCursoDTO tnCapCursoDTO) {
        // Paso 1) Obtener la secuencia
        List<TnCapCurso> tnCapCursoList = super.persistence().get(QueryTnCapCursoDAO.class).getSequenceTnCapCurso();
        TnCapCurso sequence = tnCapCursoList.get(0);
        tnCapCursoDTO.setIdCurso(sequence.getIdCurso());

        // Paso 2) Transformar objeto
        TnCapCurso tnCapCurso = super.transformation().map(tnCapCursoDTO, TnCapCurso.class);
        
        // Preparar objeto
        TnCapBitacoraCur tnCapBitacora = SirehUtils.transformToTnCapBitacora(tnCapCurso, new TnCapParticipante(), super.security().getUserName(), new Date());
        // Obtener movimiento
        int idMovimiento = super.configuration().getNumber("movCapCode", "REGISTRAR_CURSO").intValue();
        tnCapBitacora.setIdCapMovto(idMovimiento);
        // Guardar bitacora
        super.persistence().get(TnCapBitacoraCurDAO.class).save(tnCapBitacora);
        
        // Paso 3) Guardar registro
        super.persistence().get(TnCapCursoDAO.class).save(tnCapCurso);
    }

    /**
     * Metodo que Elimina el curso con base en el objeto idCursos
     * @author Oscar S.
     * @param idCursos Integer[]
     */
    public void deleteRegistroCurso(Integer[] idCursos) {
        for (Integer idCurso: idCursos) {
            // Datos del Curso
            TnCapCurso tnCapCurso = getCurso(idCurso);

            // Validacion
            if (tnCapCurso.getIdControlCurso().equals("REG")) {
                // Eliminacion fisica
                super.persistence().get(TnCapCursoDAO.class).delete(tnCapCurso);
                
                // Preparar objeto
                TnCapBitacoraCur tnCapBitacora = SirehUtils.transformToTnCapBitacora(tnCapCurso, new TnCapParticipante(), super.security().getUserName(), new Date());
                // Obtener movimiento
                int idMovimiento = super.configuration().getNumber("movCapCode", "ELIMINACION_DE_CURSO").intValue();
                tnCapBitacora.setIdCapMovto(idMovimiento);
                // Guardar bitacora
                super.persistence().get(TnCapBitacoraCurDAO.class).save(tnCapBitacora);
            } else {
                // Eliminacion logica
                tnCapCurso.setIdControlCurso("CAN");
                tnCapCurso.setUsuario(super.security().getUserName());
                tnCapCurso.setFecModifico(new Date());
                super.persistence().get(TnCapCursoDAO.class).save(tnCapCurso);
                
                // Preparar objeto
                TnCapBitacoraCur tnCapBitacora = SirehUtils.transformToTnCapBitacora(tnCapCurso, new TnCapParticipante(), super.security().getUserName(), new Date());
                // Obtener movimiento
                int idMovimiento = super.configuration().getNumber("movCapCode", "CANCELACION_DE_CURSO").intValue();
                tnCapBitacora.setIdCapMovto(idMovimiento);
                // Guardar bitacora
                super.persistence().get(TnCapBitacoraCurDAO.class).save(tnCapBitacora);
            }
            //Eliminar registros del calendario
            List<TnCapCalCurso> listaTnCapCalCurso = super.persistence().get(TnCapCalCursoDAO.class).getByIdCurso(idCurso);
            for (TnCapCalCurso tnCapCalCurso: listaTnCapCalCurso) {
                super.persistence().get(TnCapCalCursoDAO.class).delete(tnCapCalCurso);
            }
        }
    }

    /**
     * Metodo que Actualiza el curso con base en el objeto tnCapCursoDTO
     * @author Oscar S.
     * @param tnCapCursoDTO TnCapCursoDTO
     * @param idMovimiento int
     */
    public void updateRegistroCurso(TnCapCursoDTO tnCapCursoDTO, int idMovimiento) {
        // Paso 1) Transformar objeto
        TnCapCurso tnCapCurso = super.transformation().map(tnCapCursoDTO, TnCapCurso.class);

        // Paso 2) Actualizar registro
        super.persistence().get(TnCapCursoDAO.class).save(tnCapCurso);
        
        // Preparar objeto
        TnCapBitacoraCur tnCapBitacora = SirehUtils.transformToTnCapBitacora(tnCapCurso, new TnCapParticipante(), super.security().getUserName(), new Date());
        tnCapBitacora.setIdCapMovto(idMovimiento);
        // Guardar bitacora
        super.persistence().get(TnCapBitacoraCurDAO.class).save(tnCapBitacora);
    }
    
    /**
     * Metodo que Actualiza el curso y reinicia el calendario con base en el objeto tnCapCursoDTO
     * @author Oscar S.
     * @param tnCapCursoDTO TnCapCursoDTO
     * @param idMovimiento int
     */
    public void reiniciarCalendario(TnCapCursoDTO tnCapCursoDTO, int idMovimiento) {
        // Paso 1) Transformar objeto
        TnCapCurso tnCapCurso = super.transformation().map(tnCapCursoDTO, TnCapCurso.class);

        // Paso 2) Actualizar curso
        super.persistence().get(TnCapCursoDAO.class).save(tnCapCurso);
        
        // Paso 3) Eliminar datos del calendario por curso
        List<TnCapCalCurso> listaTnCapCalendarioCursoExistentes = super.persistence().get(QueryTnCapCalCursoDAO.class).findByIdCurso(tnCapCursoDTO.getIdCurso());
        if (listaTnCapCalendarioCursoExistentes != null && !listaTnCapCalendarioCursoExistentes.isEmpty()) {
            for (TnCapCalCurso tnCapCalendarioCurso: listaTnCapCalendarioCursoExistentes) {
                super.persistence().get(TnCapCalCursoDAO.class).delete(tnCapCalendarioCurso);
            }
        }
        
        // Paso 4) Guardar bitacora
        TnCapBitacoraCur tnCapBitacora = SirehUtils.transformToTnCapBitacora(tnCapCurso, new TnCapParticipante(), super.security().getUserName(), new Date());
        tnCapBitacora.setIdCapMovto(idMovimiento);
        super.persistence().get(TnCapBitacoraCurDAO.class).save(tnCapBitacora);
    }
    
    /**
     * Metodo encargado de obtener los datos de la Curso principal con base en su id.
     * @author Oscar S.
     * @param cicloEjeTematico Integer
     * @param idCursoPrincipal String
     * @param idEjeTematico String
     * @return tnCapCursoDTO TnCapCursoDTO
     */
    public TcCapCursoPrincpDTO getCursoPrincipalRegistro(Integer cicloEjeTematico, String idCursoPrincipal, String idEjeTematico) {
        // Obtener curso principal
        TcCapCursoPrincplPK pk = new TcCapCursoPrincplPK();
        pk.setCicloEjeTematico(cicloEjeTematico);
        pk.setIdCursoPrincipal(idCursoPrincipal);
        pk.setIdEjeTematico(idEjeTematico);
        TcCapCursoPrincp tcCapCursoPrincipal = super.persistence().get(TcCapCursoPrincpDAO.class).getById(pk);

        return super.transformation().map(tcCapCursoPrincipal, TcCapCursoPrincpDTO.class);
    }
    
    /**
     * Metodo encargado de obtener el consecutivo actual
     * @author Oscar S.
     * @param idCursoPrincipal String
     * @param idEjeTematico String
     * @param cicloEjeTematico Integer
     * @param idTipoCurso String
     * @param idSubprograma String
     * @return tnCapCursoDTO TnCapCursoDTO
     */
    public List<TnCapCursoDTO> getConsecutivoClaveCursoCallback(String idCursoPrincipal, String idEjeTematico, Integer cicloEjeTematico, String idTipoCurso, String idSubprograma) {
        // Paso 1) Obtener la lista de consecutivos
        List<TnCapCurso> tnCapCursoList = super.persistence().get(QueryTnCapCursoDAO.class).getConsecutivoClaveCursoCallback(idCursoPrincipal, idEjeTematico, cicloEjeTematico, idTipoCurso, idSubprograma);
        return super.transformation().map(tnCapCursoList, TnCapCursoDTO.class);
    }
    
    /**
     * Solicitud asincrona para obtener el catalogo de ejes tematicos
     * @author Gualberto G./Oscar S.
     * @param idTipoCurso String
     * @return listaItemDTO List&lt;ItemDTO&gt;
     */
    public List<ItemDTO> getEjeTematicoCallback(String idTipoCurso) {
        List<Item> listaItem = new ArrayList<Item>();
        listaItem = super.persistence().get(QueryTnCapCursoDAO.class).getEjeTematicoCallback(Integer.valueOf(super.security().getOperationYear()), idTipoCurso);
        List<ItemDTO> listaItemDTO = new ArrayList<ItemDTO>();

        if (listaItem != null && !listaItem.isEmpty()) {
            for (int i = 0; i < listaItem.size(); i++) {
                ItemDTO itemDTO = new ItemDTO(listaItem.get(i).getClave(), listaItem.get(i).getValor());
                listaItemDTO.add(itemDTO);
            }
        }
        return listaItemDTO;
    }
    
    /**
     * Solicitud asincrona para obtener el catalogo de modalidades
     * @author Gualberto G./Oscar S.
     * @param idEjeTematico String
     * @param idCursoPrincipal String 
     * @return listaItemDTO List&lt;ItemDTO&gt;
     */
    public List<ItemDTO> getModalidadCallback(String idEjeTematico, String idCursoPrincipal) {
        // Obtener curso principal
        TcCapCursoPrincplPK pk =  new TcCapCursoPrincplPK();
        pk.setCicloEjeTematico(Integer.valueOf(super.security().getOperationYear()));
        pk.setIdCursoPrincipal(idCursoPrincipal);
        pk.setIdEjeTematico(idEjeTematico);
        TcCapCursoPrincp tcCapCursoPrincipal = super.persistence().get(TcCapCursoPrincpDAO.class).getById(pk);
        
        List<gob.shcp.sireh.domain.jdbc.Item> listaItem = super.persistence().get(QueryTnCapCursoDAO.class).getModalidadCallback(Integer.valueOf(super.security().getOperationYear()), idEjeTematico, tcCapCursoPrincipal.getIdModalidad());
        List<ItemDTO> listaItemDTO = new ArrayList<ItemDTO>();

        if (listaItem != null && !listaItem.isEmpty()) {
            for (int i = 0; i < listaItem.size(); i++) {
                ItemDTO itemDTO = new ItemDTO(listaItem.get(i).getClave(), listaItem.get(i).getValor());
                listaItemDTO.add(itemDTO);
            }
        }
        return listaItemDTO;
    }
    
    /**
     * Solicitud asincrona para obtener el catalogo de finalidades
     * @author Gualberto G./Oscar S.
     * @param idEjeTematico String
     * @param idCursoPrincipal String
     * @return listaItemDTO List&lt;ItemDTO&gt;
     */
    public List<ItemDTO> getFinalidadCallback(String idEjeTematico, String idCursoPrincipal) {
        // Obtener curso principal
        TcCapCursoPrincplPK pk =  new TcCapCursoPrincplPK();
        pk.setCicloEjeTematico(Integer.valueOf(super.security().getOperationYear()));
        pk.setIdCursoPrincipal(idCursoPrincipal);
        pk.setIdEjeTematico(idEjeTematico);
        TcCapCursoPrincp tcCapCursoPrincipal = super.persistence().get(TcCapCursoPrincpDAO.class).getById(pk);
        
        List<gob.shcp.sireh.domain.jdbc.Item> listaItem = super.persistence().get(QueryTnCapCursoDAO.class).getFinalidadCallback(Integer.valueOf(super.security().getOperationYear()), idEjeTematico, tcCapCursoPrincipal.getIdFinalidad());
        List<ItemDTO> listaItemDTO = new ArrayList<ItemDTO>();

        if (listaItem != null && !listaItem.isEmpty()) {
            for (int i = 0; i < listaItem.size(); i++) {
                ItemDTO itemDTO = new ItemDTO(listaItem.get(i).getClave(), listaItem.get(i).getValor());
                listaItemDTO.add(itemDTO);
            }
        }
        return listaItemDTO;
    }
    
    /**
     * Solicitud asincrona para obtener el catalogo de capacidades de certificacion.
     * @author Oscar S.
     * @param idEjeTematico String
     * @param idCursoPrincipal String
     * @return listaItemDTO List&lt;ItemDTO&gt;
     */
    public List<ItemDTO> getCapacidadCertCallback(String idEjeTematico, String idCursoPrincipal) {
        // Obtener curso principal
        TcCapCursoPrincplPK pk =  new TcCapCursoPrincplPK();
        pk.setCicloEjeTematico(Integer.valueOf(super.security().getOperationYear()));
        pk.setIdCursoPrincipal(idCursoPrincipal);
        pk.setIdEjeTematico(idEjeTematico);
        TcCapCursoPrincp tcCapCursoPrincipal = super.persistence().get(TcCapCursoPrincpDAO.class).getById(pk);
        
        List<ItemDTO> listaItemDTO = new ArrayList<ItemDTO>();
        
        if (tcCapCursoPrincipal.getIdFinalidad() == 5) { // CERTIFICAR
            List<gob.shcp.sireh.domain.jdbc.Item> listaItem = super.persistence().get(QueryTnCapCursoDAO.class).getCapacidadCertCallback(Integer.valueOf(super.security().getOperationYear()), idEjeTematico, tcCapCursoPrincipal.getIdCapacidadCert());
            listaItemDTO = new ArrayList<ItemDTO>();

            if (listaItem != null && !listaItem.isEmpty()) {
                for (int i = 0; i < listaItem.size(); i++) {
                    ItemDTO itemDTO = new ItemDTO(listaItem.get(i).getClave(), listaItem.get(i).getValor());
                    listaItemDTO.add(itemDTO);
                }
            }
        } else {
            listaItemDTO = new ArrayList<ItemDTO>();
        }
        return listaItemDTO;
    }
    
    /**
     * Solicitud asincrona para obtener el catalogo de caracteres
     * @author Gualberto G./Oscar S.
     * @param idEjeTematico String
     * @param idCursoPrincipal String
     * @return listaItemDTO List&lt;ItemDTO&gt;
     */
    public List<ItemDTO> getCaracterCallback(String idEjeTematico, String idCursoPrincipal) {
        // Obtener curso principal
        TcCapCursoPrincplPK pk =  new TcCapCursoPrincplPK();
        pk.setCicloEjeTematico(Integer.valueOf(super.security().getOperationYear()));
        pk.setIdCursoPrincipal(idCursoPrincipal);
        pk.setIdEjeTematico(idEjeTematico);
        TcCapCursoPrincp tcCapCursoPrincipal = super.persistence().get(TcCapCursoPrincpDAO.class).getById(pk);
        
        List<gob.shcp.sireh.domain.jdbc.Item> listaItem = super.persistence().get(QueryTnCapCursoDAO.class).getCaracterCallback(Integer.valueOf(super.security().getOperationYear()), idEjeTematico, tcCapCursoPrincipal.getIdCaracter());
        List<ItemDTO> listaItemDTO = new ArrayList<ItemDTO>();

        if (listaItem != null && !listaItem.isEmpty()) {
            for (int i = 0; i < listaItem.size(); i++) {
                ItemDTO itemDTO = new ItemDTO(listaItem.get(i).getClave(), listaItem.get(i).getValor());
                listaItemDTO.add(itemDTO);
            }
        }
        return listaItemDTO;
    }
    
    /**
     * Solicitud asincrona para obtener el catalogo de cursos
     * @author Gualberto G.
     * @param idEjeTematico String
     * @return listaItemDTO List&lt;ItemDTO&gt;
     */
    public List<ItemDTO> getCursoPrincipalCallback(String idEjeTematico) {
        List<gob.shcp.sireh.domain.jdbc.Item> listaItem = super.persistence().get(QueryTnCapCursoDAO.class).getCursoPrincipalCallback(Integer.valueOf(super.security().getOperationYear()), idEjeTematico);
        List<ItemDTO> listaItemDTO = new ArrayList<ItemDTO>();

        if (listaItem != null && !listaItem.isEmpty()) {
            for (int i = 0; i < listaItem.size(); i++) {
                ItemDTO itemDTO = new ItemDTO(listaItem.get(i).getClave(), listaItem.get(i).getValor());
                listaItemDTO.add(itemDTO);
            }
        }
        return listaItemDTO;
    }
    
    /**
     * Metodo encargado de obtener los datos del Proveedor con base en su id.
     * @author Oscar S.
     * @param idProveedor String
     * @return tcCapProveedorDTO TcCapProveedorDTO
     * @deprecated
     */
    public TcCapProveedorDTO getProveedorCurso(String idProveedor) {
        // Obtener proveedor
        TcCapProveedor tcCapProveedor = super.persistence().get(TcCapProveedorDAO.class).getById(idProveedor);
        logger.debug("RegistroCursoSPCBS -> getProveedorCurso ->" + tcCapProveedor.getIdProveedor());
        return super.transformation().map(tcCapProveedor, TcCapProveedorDTO.class);
    }
    
    /******************************************************************************************************************************************************************************/
    
    /**
     * Metodo que obtiene los datos del curso para mostrarlos en la pantalla de asignar calendario
     * @author Gualberto G.
     * @param idCurso
     * @return RegistroCalendarioDTO
     */
    public RegistroCalendarioDTO getRegistroCalendario(Integer idCurso) {
        List<CustomRegistroCalendario> listaRegistroCalendario = super.persistence().get(QueryTnCapCalCursoDAO.class).getDatosCurso(idCurso);
        RegistroCalendarioDTO registroCalendarioDTO = null;
        List<CustomTnCapCalendarioCurso>  listaCustomTnCapCalendarioCurso =  super.persistence().get(QueryTnCapCalCursoDAO.class).findDiasByIdCurso(idCurso);
        
        if (listaRegistroCalendario != null && !listaRegistroCalendario.isEmpty()) {
            CustomRegistroCalendario customRegistroCalendario = listaRegistroCalendario.get(0);
            registroCalendarioDTO = super.transformation().map(customRegistroCalendario, RegistroCalendarioDTO.class);
        }
        int diaDeLaSemana = 0;
        if(listaCustomTnCapCalendarioCurso != null && !listaCustomTnCapCalendarioCurso.isEmpty() ){
            List<CustomTnCapCalendarioCursoDTO> listaCustomTnCapCalendarioCursoDTO = super.transformation().map(listaCustomTnCapCalendarioCurso, CustomTnCapCalendarioCursoDTO.class);
            for(CustomTnCapCalendarioCursoDTO customTnCapCalendarioCursoDTO : listaCustomTnCapCalendarioCursoDTO){
                diaDeLaSemana = customTnCapCalendarioCursoDTO.getDiaSemana() != null && customTnCapCalendarioCursoDTO.getDiaSemana() > 0 ? customTnCapCalendarioCursoDTO.getDiaSemana() : 0;
                switch(diaDeLaSemana){
                    case 1 :
                        registroCalendarioDTO.setDia1(true);
                        registroCalendarioDTO.setIdHorarioInicialCurso1(customTnCapCalendarioCursoDTO.getIdHorarioCursoInicial());
                        registroCalendarioDTO.setIdHorarioFinalCurso1(customTnCapCalendarioCursoDTO.getIdHorarioCursoFinal());
                        break;
                    case 2 :
                        registroCalendarioDTO.setDia2(true);
                        registroCalendarioDTO.setIdHorarioInicialCurso2(customTnCapCalendarioCursoDTO.getIdHorarioCursoInicial());
                        registroCalendarioDTO.setIdHorarioFinalCurso2(customTnCapCalendarioCursoDTO.getIdHorarioCursoFinal());
                        break;
                    case 3 :
                        registroCalendarioDTO.setDia3(true);
                        registroCalendarioDTO.setIdHorarioInicialCurso3(customTnCapCalendarioCursoDTO.getIdHorarioCursoInicial());
                        registroCalendarioDTO.setIdHorarioFinalCurso3(customTnCapCalendarioCursoDTO.getIdHorarioCursoFinal());
                        break;
                    case 4 :
                        registroCalendarioDTO.setDia4(true);
                        registroCalendarioDTO.setIdHorarioInicialCurso4(customTnCapCalendarioCursoDTO.getIdHorarioCursoInicial());
                        registroCalendarioDTO.setIdHorarioFinalCurso4(customTnCapCalendarioCursoDTO.getIdHorarioCursoFinal());
                        break;
                    case 5 :
                        registroCalendarioDTO.setDia5(true);
                        registroCalendarioDTO.setIdHorarioInicialCurso5(customTnCapCalendarioCursoDTO.getIdHorarioCursoInicial());
                        registroCalendarioDTO.setIdHorarioFinalCurso5(customTnCapCalendarioCursoDTO.getIdHorarioCursoFinal());
                        break;
                    case 6 :
                        registroCalendarioDTO.setDia6(true);
                        registroCalendarioDTO.setIdHorarioInicialCurso6(customTnCapCalendarioCursoDTO.getIdHorarioCursoInicial());
                        registroCalendarioDTO.setIdHorarioFinalCurso6(customTnCapCalendarioCursoDTO.getIdHorarioCursoFinal());
                        break;
                    case 7 :
                        registroCalendarioDTO.setDia7(true);
                        registroCalendarioDTO.setIdHorarioInicialCurso7(customTnCapCalendarioCursoDTO.getIdHorarioCursoInicial());
                        registroCalendarioDTO.setIdHorarioFinalCurso7(customTnCapCalendarioCursoDTO.getIdHorarioCursoFinal());
                        break;
                }
            }
        }
        return registroCalendarioDTO;
    }

    /**
     * Metodo encargado de guardar los datos de calendarizacion ingresados en la pantalla por el usuario
     * @author Gualberto G.
     * @param registroCalendarioDTO
     */
    public void saveRegistroCalendario(RegistroCalendarioDTO registroCalendarioDTO) {
        
        // Se obtienen los valores de horario inicial y final para cada dia.
        // Para los dias no seleccionados, el horario inicial y el final sera 0
        Integer horarioInicialLunes =  registroCalendarioDTO.isDia1() ? registroCalendarioDTO.getIdHorarioInicialCurso1() : Integer.valueOf(0) ;
        Integer horarioInicialMartes = registroCalendarioDTO.isDia2() ? registroCalendarioDTO.getIdHorarioInicialCurso2() : Integer.valueOf(0) ;
        Integer horarioInicialMiercoles = registroCalendarioDTO.isDia3() ? registroCalendarioDTO.getIdHorarioInicialCurso3() : Integer.valueOf(0) ;
        Integer horarioInicialJueves = registroCalendarioDTO.isDia4() ? registroCalendarioDTO.getIdHorarioInicialCurso4() : Integer.valueOf(0) ;
        Integer horarioInicialViernes = registroCalendarioDTO.isDia5() ? registroCalendarioDTO.getIdHorarioInicialCurso5() : Integer.valueOf(0) ;
        Integer horarioInicialSabado = registroCalendarioDTO.isDia6() ? registroCalendarioDTO.getIdHorarioInicialCurso6() : Integer.valueOf(0) ;
        Integer horarioInicialDomingo = registroCalendarioDTO.isDia7() ? registroCalendarioDTO.getIdHorarioInicialCurso7() : Integer.valueOf(0) ;
         
        Integer horarioFinalLunes = registroCalendarioDTO.isDia1() ? registroCalendarioDTO.getIdHorarioFinalCurso1() : Integer.valueOf(0) ;
        Integer horarioFinalMartes = registroCalendarioDTO.isDia2() ? registroCalendarioDTO.getIdHorarioFinalCurso2() : Integer.valueOf(0) ;
        Integer horarioFinalMiercoles = registroCalendarioDTO.isDia3() ? registroCalendarioDTO.getIdHorarioFinalCurso3() : Integer.valueOf(0) ;
        Integer horarioFinalJueves = registroCalendarioDTO.isDia4() ? registroCalendarioDTO.getIdHorarioFinalCurso4() : Integer.valueOf(0) ;
        Integer horarioFinalViernes = registroCalendarioDTO.isDia5() ? registroCalendarioDTO.getIdHorarioFinalCurso5() : Integer.valueOf(0) ;
        Integer horarioFinalSabado = registroCalendarioDTO.isDia6() ? registroCalendarioDTO.getIdHorarioFinalCurso6() : Integer.valueOf(0) ;
        Integer horarioFinalDomingo = registroCalendarioDTO.isDia7() ? registroCalendarioDTO.getIdHorarioFinalCurso7() : Integer.valueOf(0) ;
        
        // Consulta todos los cursos que se encuentran entre CursoFecIni y CursoFecFin y en esos dias en esos horarios en esa aula
        List<TnCapCalCursoDTO> listaCustomTnCapCalendarioCursoDTO = 
            getCalendarioCursoByDiasYHora(registroCalendarioDTO.getIdCurso(), registroCalendarioDTO.getCursoFecIni(), registroCalendarioDTO.getCursoFecFin(), registroCalendarioDTO.getIdAula(),
                                          horarioInicialLunes, horarioFinalLunes, 
                                          horarioInicialMartes, horarioFinalMartes, 
                                          horarioInicialMiercoles, horarioFinalMiercoles, 
                                          horarioInicialJueves, horarioFinalJueves, 
                                          horarioInicialViernes, horarioFinalViernes, 
                                          horarioInicialSabado, horarioFinalSabado, 
                                          horarioInicialDomingo, horarioFinalDomingo);

        // Si la lista no viene vacia, se envia error y se detiene el proceso
        if (listaCustomTnCapCalendarioCursoDTO != null && !listaCustomTnCapCalendarioCursoDTO.isEmpty()) {
            throw new ServiceException("El Aula se encuentra ocupada para el horario que está registrando, favor de revisar disponibilidad");
        }
                
        // Procede a guardar la calendarizacion
        TnCapCurso tnCapCursoBase = super.persistence().get(TnCapCursoDAO.class).getById(registroCalendarioDTO.getIdCurso());
        // Construye la lista de registros a guardar
        List<TnCapCalCursoDTO> listaTnCapCalendarioCursoDTO  = buidListaRegistrosCalendario(registroCalendarioDTO.getIdCurso(), registroCalendarioDTO.getCursoFecIni(), registroCalendarioDTO.getCursoFecFin() , 
                                                                                horarioInicialLunes, horarioFinalLunes,
                                                                                horarioInicialMartes,  horarioFinalMartes, 
                                                                                horarioInicialMiercoles,  horarioFinalMiercoles, 
                                                                                horarioInicialJueves,  horarioFinalJueves, 
                                                                                horarioInicialViernes,  horarioFinalViernes, 
                                                                                horarioInicialSabado,  horarioFinalSabado, 
                                                                                horarioInicialDomingo,  horarioFinalDomingo);

        tnCapCursoBase.setCursoFecIni(registroCalendarioDTO.getCursoFecIni());
        tnCapCursoBase.setCursoFecFin(registroCalendarioDTO.getCursoFecFin());
        tnCapCursoBase.setIdSede(registroCalendarioDTO.getIdSede());
        tnCapCursoBase.setIdAula(registroCalendarioDTO.getIdAula());
        tnCapCursoBase.setCursoMinimoParticipantes(registroCalendarioDTO.getCursoMinimoParticipantes());
        
        // Si el curso ya se encuentra confirmado, no vamos a cambiar estatus
        if (registroCalendarioDTO.getIdControlCurso() == null || !registroCalendarioDTO.getIdControlCurso().equals("CON")) {
            tnCapCursoBase.setIdControlCurso("PRO");
        }
        tnCapCursoBase.setUsuario(super.security().getUserName());
        tnCapCursoBase.setFecModifico(new Date());


        List<TnCapCalCurso> listaTnCapCalendarioCursoExistentes = super.persistence().get(QueryTnCapCalCursoDAO.class).findByIdCurso(registroCalendarioDTO.getIdCurso());
        if (listaTnCapCalendarioCursoExistentes != null && !listaTnCapCalendarioCursoExistentes.isEmpty()) {
            for (TnCapCalCurso tnCapCalendarioCurso: listaTnCapCalendarioCursoExistentes) {
                super.persistence().get(TnCapCalCursoDAO.class).delete(tnCapCalendarioCurso);
            }
        }
        
        super.persistence().get(TnCapCursoDAO.class).save(tnCapCursoBase);
        
        List<TnCapCalCurso> listaTnCapCalendarioCursoSave = super.transformation().map(listaTnCapCalendarioCursoDTO, TnCapCalCurso.class);

        if (listaTnCapCalendarioCursoSave != null && !listaTnCapCalendarioCursoSave.isEmpty()) {
            for (TnCapCalCurso tnCapCalendarioCurso: listaTnCapCalendarioCursoSave) {
                super.persistence().get(TnCapCalCursoDAO.class).save(tnCapCalendarioCurso);
            }
        }
    }
    
    /**
     * Construye una lista de objetos con las fechas correspondientes a los horarios seleccionados
     * @param idCurso
     * @param cursoFecIni
     * @param cursoFecFin
     * @param horarioInicialLunes
     * @param horarioFinalLunes
     * @param horarioInicialMartes
     * @param horarioFinalMartes
     * @param horarioInicialMiercoles
     * @param horarioFinalMiercoles
     * @param horarioInicialJueves
     * @param horarioFinalJueves
     * @param horarioInicialViernes
     * @param horarioFinalViernes
     * @param horarioInicialSabado
     * @param horarioFinalSabado
     * @param horarioInicialDomingo
     * @param horarioFinalDomingo
     * @return List&ltTnCapCalendarioCursoDTO&rt
     */
    private List<TnCapCalCursoDTO> buidListaRegistrosCalendario(Integer idCurso, java.util.Date cursoFecIni, java.util.Date cursoFecFin, 
                                                                       Integer horarioInicialLunes, Integer horarioFinalLunes, 
                                                                       Integer horarioInicialMartes, Integer horarioFinalMartes, 
                                                                       Integer horarioInicialMiercoles, Integer horarioFinalMiercoles, 
                                                                       Integer horarioInicialJueves, Integer horarioFinalJueves, 
                                                                       Integer horarioInicialViernes, Integer horarioFinalViernes, 
                                                                       Integer horarioInicialSabado, Integer horarioFinalSabado, 
                                                                       Integer horarioInicialDomingo, Integer horarioFinalDomingo) {
        String usuario = super.security().getUserName();
        List<TnCapCalCursoDTO> listTnCapCalendarioCursoDTO = new ArrayList<TnCapCalCursoDTO>();
        TnCapCalCursoDTO tnCapCalendarioCursoDTO = null;
        Calendar fechaInicial = Calendar.getInstance();
        Calendar fechaFinal = Calendar.getInstance();

        fechaInicial.setTime(cursoFecIni);
        fechaFinal.setTime(cursoFecFin);
        fechaFinal.add(Calendar.DAY_OF_MONTH, 1);
        while (fechaInicial.before(fechaFinal)) {
            int dayOfweek = transformDayOfWeekFromJavaToOracle(fechaInicial.get(Calendar.DAY_OF_WEEK));
            switch (dayOfweek) {
            case 1:
                if (horarioInicialLunes != 0 && horarioFinalLunes != 0) {
                    tnCapCalendarioCursoDTO = 
                            new TnCapCalCursoDTO(fechaInicial.getTime(), idCurso, horarioFinalLunes, horarioInicialLunes, new Date(), usuario);
                    listTnCapCalendarioCursoDTO.add(tnCapCalendarioCursoDTO);
                }
                break;
            case 2:
                if (horarioInicialMartes != 0 && horarioFinalMartes != 0) {
                    tnCapCalendarioCursoDTO = new TnCapCalCursoDTO(fechaInicial.getTime(), idCurso, horarioFinalMartes, horarioInicialMartes, new Date(), usuario);
                    listTnCapCalendarioCursoDTO.add(tnCapCalendarioCursoDTO);
                }
                break;
            case 3:
                if (horarioInicialMiercoles != 0 && horarioFinalMiercoles != 0) {
                    tnCapCalendarioCursoDTO = 
                            new TnCapCalCursoDTO(fechaInicial.getTime(), idCurso, horarioFinalMiercoles, horarioInicialMiercoles, new Date(), usuario);
                    listTnCapCalendarioCursoDTO.add(tnCapCalendarioCursoDTO);
                }
                break;
            case 4:
                if (horarioInicialJueves != 0 && horarioFinalJueves != 0) {
                    tnCapCalendarioCursoDTO = 
                            new TnCapCalCursoDTO(fechaInicial.getTime(), idCurso, horarioFinalJueves, horarioInicialJueves, new Date(), usuario);
                    listTnCapCalendarioCursoDTO.add(tnCapCalendarioCursoDTO);
                }
                break;
            case 5:
                if (horarioInicialViernes != 0 && horarioFinalViernes != 0) {
                    tnCapCalendarioCursoDTO = 
                            new TnCapCalCursoDTO(fechaInicial.getTime(), idCurso, horarioFinalViernes, horarioInicialViernes, new Date(), usuario);
                    listTnCapCalendarioCursoDTO.add(tnCapCalendarioCursoDTO);
                }
                break;
            case 6:
                if (horarioInicialSabado != 0 && horarioFinalSabado != 0) {
                    tnCapCalendarioCursoDTO = 
                            new TnCapCalCursoDTO(fechaInicial.getTime(), idCurso, horarioFinalSabado, horarioInicialSabado, new Date(), usuario);
                    listTnCapCalendarioCursoDTO.add(tnCapCalendarioCursoDTO);
                }
                break;
            case 7:
                if (horarioInicialDomingo != 0 && horarioFinalDomingo != 0) {
                    tnCapCalendarioCursoDTO = 
                            new TnCapCalCursoDTO(fechaInicial.getTime(), idCurso, horarioFinalDomingo, horarioInicialDomingo, new Date(), usuario);
                    listTnCapCalendarioCursoDTO.add(tnCapCalendarioCursoDTO);
                }
                break;
            }
            fechaInicial.add(Calendar.DAY_OF_MONTH, 1);
        }
        return listTnCapCalendarioCursoDTO;
    }
    
    /**
     * Convierte un DAY_OF_WEEK  de Java a Oracle
     * @param dayOfWeek
     * @return
     */
    private int transformDayOfWeekFromJavaToOracle(int dayOfWeek) {
        return dayOfWeek == 1 ? 7 : dayOfWeek - 1;
    }


    /**
     * Metodo que consulta los datos de la tabla TC_CAP_AULA por idAula
     * @author Gualberto G.
     * @param idAula
     * @return TcCapAulaDTO
     */
    public TcCapAulaDTO getDatosAula(String idAula) {
        TcCapAula tcCapAula = super.persistence().get(TcCapAulaDAO.class).getById(idAula);
        TcCapAulaDTO tcCapAulaDTO = super.transformation().map(tcCapAula, TcCapAulaDTO.class);
        return tcCapAulaDTO;
    }
    
    /**
     * Obtiene los datos de la tabla TN_CAP_CAL_CURSO para un aula determinada
     * @author Gualberto G
     * @param idAula String
     * @return List&ltCustomTnCapCalendarioCursoDTO&gt
     */
    public List<CustomTnCapCalendarioCursoDTO> getCalendarioByAula(String idAula){
        List<CustomTnCapCalendarioCurso> lista = super.persistence().get(QueryTnCapCalCursoDAO.class).getCalendarioCursoByAula(idAula);
        List<CustomTnCapCalendarioCursoDTO> listaCustomTnCapCalendarioCursoDTO = super.transformation().map(lista, CustomTnCapCalendarioCursoDTO.class);
        return listaCustomTnCapCalendarioCursoDTO;
    }
    
    /** Obtiene los cursos que existen en el calendario en los horarios enviados como parametro
     * @author Gualberto G
.... * @param idCurso
     * @param cursoFecIni
     * @param cursoFecFin
     * @param horarioInicialLunes
     * @param horarioFinalLunes
     * @param horarioInicialMartes
     * @param horarioFinalMartes
     * @param horarioInicialMiercoles
     * @param horarioFinalMiercoles
     * @param horarioInicialJueves
     * @param horarioFinalJueves
     * @param horarioInicialViernes
     * @param horarioFinalViernes
     * @param horarioInicialSabado
     * @param horarioFinalSabado
     * @param horarioInicialDomingo
     * @param horarioFinalDomingo
     * @return List&ltCustomTnCapCalendarioCursoDTO&gt
     */
    public List<TnCapCalCursoDTO> getCalendarioCursoByDiasYHora(Integer idCurso, java.util.Date cursoFecIni, java.util.Date cursoFecFin, String idAula,
                                                                             Integer horarioInicialLunes, Integer horarioFinalLunes, 
                                                                             Integer horarioInicialMartes, Integer horarioFinalMartes, 
                                                                             Integer horarioInicialMiercoles, Integer horarioFinalMiercoles,
                                                                             Integer horarioInicialJueves, Integer horarioFinalJueves, 
                                                                             Integer horarioInicialViernes, Integer horarioFinalViernes, 
                                                                             Integer horarioInicialSabado, Integer horarioFinalSabado, 
                                                                             Integer horarioInicialDomingo, Integer horarioFinalDomingo){
        List<TnCapCalCurso> listaTnCapCalendarioCurso = 
            super.persistence().get(QueryTnCapCalCursoDAO.class).getCalendarioCursoByDiasYHora(idCurso, cursoFecIni, cursoFecFin, idAula,
                                                                                            horarioInicialLunes, horarioInicialLunes, horarioFinalLunes, horarioFinalLunes, 
                                                                                            horarioInicialMartes, horarioInicialMartes, horarioFinalMartes, horarioFinalMartes, 
                                                                                            horarioInicialMiercoles, horarioInicialMiercoles, horarioFinalMiercoles, horarioFinalMiercoles, 
                                                                                            horarioInicialJueves, horarioInicialJueves, horarioFinalJueves, horarioFinalJueves, 
                                                                                            horarioInicialViernes, horarioInicialViernes, horarioFinalViernes, horarioFinalViernes, 
                                                                                            horarioInicialSabado, horarioInicialSabado, horarioFinalSabado, horarioFinalSabado, 
                                                                                            horarioInicialDomingo, horarioInicialDomingo, horarioFinalDomingo, horarioFinalDomingo);
        List<TnCapCalCursoDTO> listaTnCapCalendarioCursoDTO = super.transformation().map(listaTnCapCalendarioCurso, TnCapCalCursoDTO.class);
        return listaTnCapCalendarioCursoDTO;
    }
    
    /******************************************************************************************************************************************************************************/
    
     /**
     * Metodo que obtiene los datos del curso para mostrarlos en la pantalla Asignar participante
     * @author Oscar S.
     * @param idCurso
     * @return asignarParticipanteDTO AsignarParticipanteDTO
     */
    public AsignarParticipanteDTO getAsignarParticipante(Integer idCurso) {
        List<CustomRegistroParticipante> listaRegistroParticipante = super.persistence().get(QueryTnCapCursoDAO.class).getDatosCursoParticipante(idCurso);
        logger.debug("RegistroCursoSPCBS --> getParticipantesCandidatos --> getAsignarParticipante --> listaRegistroParticipante.size() --> " + listaRegistroParticipante.size());
        AsignarParticipanteDTO asignarParticipanteDTO = null;
        
        if (listaRegistroParticipante != null && !listaRegistroParticipante.isEmpty()) {
            CustomRegistroParticipante customRegistroParticipante = listaRegistroParticipante.get(0);
            asignarParticipanteDTO = super.transformation().map(customRegistroParticipante, AsignarParticipanteDTO.class);
        }
        
        return asignarParticipanteDTO;
    }

    /**
     * Metodo que obtiene el listado de participantes candidatos
     * @author Oscar S.
     * @param ciclo Integer
     * @param idCurso Integer
     * @return customParticipantesCandidatosDTO CustomParticipantesCandidatosDTO
     */
    public List<CustomParticipantesCandidatosDTO> getParticipantesCandidatos(Integer ciclo, Integer idCurso) {
        List<CustomParticipantesCandidatos> customParticipantesCandidatos = super.persistence().get(QueryTnCapCursoDAO.class).getParticipantesCandidatos(ciclo, idCurso, idCurso);
        logger.debug("RegistroCursoSPCBS --> getParticipantesCandidatos --> customParticipantesCandidatos.size() --> " + customParticipantesCandidatos.size());
        return super.transformation().map(customParticipantesCandidatos, CustomParticipantesCandidatosDTO.class);
    }

    /**
     * Metodo que Registra el participante con base en el objeto tnCapParticipanteDTO
     * @author Oscar S.
     * @param tnCapCursoDTO TnCapCursoDTO
     * @param tnCapParticipanteDTO TnCapParticipanteDTO
     */
    public void saveInscribirParticipante(TnCapCursoDTO tnCapCursoDTO, TnCapParticipanteDTO tnCapParticipanteDTO) {
        // Obtener numero de participantes
        List<CustomParticipantesInscritosDTO> participantes = getParticipantesInscritos(tnCapCursoDTO.getCicloEjeTematico(), tnCapParticipanteDTO.getIdCurso());
        int noParticipantes = participantes.size();
        
        // Actualizar curso
        tnCapCursoDTO.setCursoParticipantes(new Integer(noParticipantes + 1));
        tnCapCursoDTO.setUsuario(super.security().getUserName());
        tnCapCursoDTO.setFecModifico(new Date());
        
        // Transformar objeto
        TnCapCurso tnCapCurso = super.transformation().map(tnCapCursoDTO, TnCapCurso.class);
        
        // Actualizar curso
        super.persistence().get(TnCapCursoDAO.class).save(tnCapCurso);
        
        // Transformar objeto
        TnCapParticipante tnCapParticipante = super.transformation().map(tnCapParticipanteDTO, TnCapParticipante.class);
        TnCapParticipantePK pk = new TnCapParticipantePK();
        pk.setIdCurso(tnCapParticipanteDTO.getIdCurso());
        pk.setRfcEmpleado(tnCapParticipanteDTO.getRfcEmpleado());
        tnCapParticipante.setIdentity(pk);
        
        // Preparar objeto
        TnCapBitacoraCur tnCapBitacora = SirehUtils.transformToTnCapBitacora(tnCapCurso, tnCapParticipante, super.security().getUserName(), new Date());
        // Obtener movimiento
        int idMovimiento = super.configuration().getNumber("movCapCode", "ASIGNAR_PARTICIPANTE_MANUAL").intValue();
        tnCapBitacora.setIdCapMovto(idMovimiento);
        // Guardar bitacora
        super.persistence().get(TnCapBitacoraCurDAO.class).save(tnCapBitacora);
        
        // Registrar participante
        super.persistence().get(TnCapParticipanteDAO.class).save(tnCapParticipante);
    }

    /**
     * Metodo que obtiene los datos del empleado
     * @author Oscar S.
     * @param rfcEmpleado String
     * @return tdEmpleadoDTO TdEmpleadoDTO
     */
    public TdEmpleadoDTO getEmpleado(String rfcEmpleado) {
        TdEmpleado empleado = super.persistence().get(TdEmpleadoDAO.class).getById(rfcEmpleado);
        return super.transformation().map(empleado, TdEmpleadoDTO.class);
    }

    /**
     * Metodo que obtiene los datos de la plaza
     * @author Oscar S.
     * @param idPlaza Integer
     * @return tdPlazaDTO TdPlazaDTO
     */
    public TdPlazaDTO getPlaza(Integer idPlaza) {
        TdPlaza plaza = super.persistence().get(TdPlazaDAO.class).getById(idPlaza);
        return super.transformation().map(plaza, TdPlazaDTO.class);
    }
    
    /**
     * Metodo que obtiene los datos del atributo puesto
     * @author Oscar S.
     * @param idPuesto String
     * @return tcAtributoPuestoDTO TcAtributoPuestoDTO
     */
    public TcAtributoPuestoDTO getAtributoPuestoConEspacios(String idPuesto) {
        List<TcAtributoPuesto> puestos = super.persistence().get(QueryTdPlazaDAO.class).findCodigoPuestoConEspacios(idPuesto);
        TcAtributoPuesto tcAtributoPuesto = puestos.get(0);
        return super.transformation().map(tcAtributoPuesto, TcAtributoPuestoDTO.class);
    }

    /**
     * Metodo que obtiene el listado de participantes inscritos
     * @author Oscar S.
     * @param ciclo Integer
     * @param idCurso Integer
     * @return customParticipantesInscritosDTO CustomParticipantesInscritosDTO
     */
    public List<CustomParticipantesInscritosDTO> getParticipantesInscritos(Integer ciclo, Integer idCurso) {
        List<CustomParticipantesInscritos> customParticipantesInscritos = super.persistence().get(QueryTnCapCursoDAO.class).getParticipantesInscritos(ciclo, idCurso);
        logger.debug("RegistroCursoSPCBS --> getParticipantesInscritos --> getParticipantesInscritos --> customParticipantesInscritos.size() --> " + customParticipantesInscritos.size());
        return super.transformation().map(customParticipantesInscritos, CustomParticipantesInscritosDTO.class);
    }

    /**
     * Metodo que desasigna al participante del curso
     * @author Oscar S.
     * @param rfcEmpleado String
     * @param asignarParticipanteDTO AsignarParticipanteDTO
     */
    public void saveCancelarParticipante(String rfcEmpleado, AsignarParticipanteDTO asignarParticipanteDTO) {
        // Obtener curso
        TnCapCurso tnCapCurso = super.persistence().get(TnCapCursoDAO.class).getById(asignarParticipanteDTO.getIdCurso());

        // Obtener numero de participantes
        List<CustomParticipantesInscritosDTO> participantes = getParticipantesInscritos(tnCapCurso.getCicloEjeTematico(), asignarParticipanteDTO.getIdCurso());
        int noParticipantes = participantes.size();

        // Actualizar curso
        tnCapCurso.setCursoParticipantes(new Integer(noParticipantes - 1));
        tnCapCurso.setUsuario(super.security().getUserName());
        tnCapCurso.setFecModifico(new Date());

        // Actualizar curso
        super.persistence().get(TnCapCursoDAO.class).save(tnCapCurso);
        
        // Formar llave
        TnCapParticipantePK pk = new TnCapParticipantePK();
        pk.setIdCurso(asignarParticipanteDTO.getIdCurso());
        pk.setRfcEmpleado(rfcEmpleado);

        // Obtener participante
        TnCapParticipante tnCapParticipante = super.persistence().get(TnCapParticipanteDAO.class).getById(pk);
        
        // Preparar objeto
        TnCapBitacoraCur tnCapBitacora = SirehUtils.transformToTnCapBitacora(tnCapCurso, tnCapParticipante, super.security().getUserName(), new Date());
        // Obtener movimiento
        int idMovimiento = super.configuration().getNumber("movCapCode", "DESASIGNAR_PARTICIPANTE_MANUAL").intValue();
        tnCapBitacora.setIdCapMovto(idMovimiento);
        
        // Motivo Desasigna participante
        tnCapBitacora.setIdMotivoDesasignaPartic(asignarParticipanteDTO.getIdMotivoDesasigna());
        
        // Guardar bitacora
        super.persistence().get(TnCapBitacoraCurDAO.class).save(tnCapBitacora);
        
        // Eliminar participante
        super.persistence().get(TnCapParticipanteDAO.class).delete(tnCapParticipante);
    }

    /**
     * Obtiene un objeto java.sql.Connection
     * @author Gualberto G.
     * @return Connection
     */
    public java.sql.Connection getConnection() {
        java.sql.Connection conn = super.persistence().get(CustomConnectionDAO.class).getMyConnection();
        return conn;
    }

    /**
     * Metodo encargado de consultar los datos de la tabla TN_CAP_NOTIF_CURSO por modalidad
     * @author Gualberto G.
     * @param capNotifCursoCiclo Integer
     * @param idModalidad Integer
     * @return TcCapNotifCursoDTO
     */
    public TcCapNotifCursoDTO getTcCapNotifCurso(Integer capNotifCursoCiclo, Integer idModalidad) {
        TcCapNotifCurso tcCapNotifCurso = super.persistence().get(TcCapNotifCursoDAO.class).getById(new TcCapNotifCursoPK(capNotifCursoCiclo, idModalidad));
        if (tcCapNotifCurso != null) {
            return super.transformation().map(tcCapNotifCurso, TcCapNotifCursoDTO.class);
        } else {
            return null;
        }
    }

    /**
     * Metodo encargado del envio de notificaciones por correo electronico 
     * @author Gualberto G./Oscar S.
     * @param operationalYear Integer
     * @param idCurso Integer
     * @param idModalidad Integer
     * @param listaMapas List&gt;Map&lt;String, Object&gt;&gt;
     */
    public void enviarMensajesCorreo(Integer operationalYear, Integer idCurso, Integer idModalidad, List<Map<String, Object>> listaMapas, String rfcSesion, String usuario) {
        TcCapNotifCursoDTO tcCapNotifCursoDTO = super.getService(RegistroCursoSPCService.class).getTcCapNotifCurso(operationalYear, idModalidad);
        
        // Obtener template
        String archivoTemplateHtml = super.configuration().getString("capcer", "correo.template.dir") + File.separator + super.configuration().getString("capcer", "mail.template.capcer.notificacion.html");
        //String imagen = super.configuration().getString("capcer", "correo.template.dir") + File.separator + "SHCP.jpg";
        String template = null;

        try {
            template = FileUtils.readFileToString(new File(archivoTemplateHtml));
        } catch (IOException e) {
            throw new ServiceException("IOException-> " + e.toString(), e);
        }

        
        String cuerpo = "";
        boolean error = false;
        
        // Asunto
        cuerpo = template.replace("<!--ASUNTO-->", "&quot;" + tcCapNotifCursoDTO.getCapNotifCursoAsunto() + "&quot;");
        // Mensaje
        cuerpo = cuerpo.replace("<!--MENSAJE-->", tcCapNotifCursoDTO.getCapNotifCursoMsg());

        if (listaMapas.size() > 0) {
            for (Map<String, Object> mapaEmpleados: listaMapas) {
                error = false;
                
                // Nombre del participante
                cuerpo = cuerpo.replace("<!--PARTICIPANTE-->", (String)mapaEmpleados.get("PAR_NOMBRE_EMPLEADO"));
                // Unidad
                cuerpo = cuerpo.replace("<!--UNIDAD-->", (String)mapaEmpleados.get("PAR_UNIDAD_EMPLEADO"));
                
                MailParams mailParams = new MailParams();
                mailParams.setTemplateProperties(mail().getTemplateParams("simple-mail"));
                mailParams.addRecipient((String)mapaEmpleados.get("E_MAIL"));
                mailParams.addAttachment((String)mapaEmpleados.get("DEST_FILE"));

                mailParams.setText(cuerpo != null ? cuerpo.toString() : "");

                mailParams.setSubject(tcCapNotifCursoDTO.getCapNotifCursoAsunto());
                mailParams.setFrom(super.configuration().getString("capcer", "mail.fromAddress"));
                
                //String bccAddress = super.configuration().getString("capcer", "mail.bccAddress");
                //List<String> items = Arrays.asList(bccAddress.split("\\s*,\\s*"));
                //mailParams.setBccRecipients(items);

                Properties messageProps = new Properties();
                messageProps.setProperty("dia", (new SimpleDateFormat("dd/MM/yyyy")).format(new Date()));
                messageProps.setProperty("hora", (new SimpleDateFormat("hh:mm:ss")).format(new Date()));
                messageProps.setProperty("usuario", usuario);
                mailParams.setPropertyValues(messageProps);
                
                // TODO: Habilitar solo para pruebas
                //Thread.currentThread().setContextClassLoader(getClass().getClassLoader());
                logger.debug("RegistroCursoSPCBS -> enviarMensajesCorreo -> " + cuerpo);
                
                try {
                    // Enviar notificacion
                    TnNotificacionDTO tnNotificacionDTO = new TnNotificacionDTO();
                                    
                    // Obtener id de la secuencia
                    
                    // Preparar objeto tnNotificacionDTO
                    tnNotificacionDTO.setIdTipoNotificacion("1"); // ASIGNACION A CURSO
                    tnNotificacionDTO.setFromRfcNotificacion(rfcSesion); // RFC de sesion
                    tnNotificacionDTO.setToRfcNotificacion((String)mapaEmpleados.get("RFC_EMPLEADO"));
                    tnNotificacionDTO.setTituloNotificacion(tcCapNotifCursoDTO.getCapNotifCursoAsunto());
                    tnNotificacionDTO.setMsgNotificacion(tcCapNotifCursoDTO.getCapNotifCursoMsg());
                    tnNotificacionDTO.setIdSituacionNotificacion("1"); // NO LEIDO
                    tnNotificacionDTO.setUsuario(usuario);
                    tnNotificacionDTO.setFecModifico(new Date());
                    super.getService(NotificacionesService.class).getSaveNotificacion(tnNotificacionDTO);
                    
                    // TODO: Deshabilitar solo para pruebas
                    // Enviar correo
                    super.mail().send(mailParams);
                    TnCapParticipantePK tnCapParticipantePK = new TnCapParticipantePK(idCurso, (String)mapaEmpleados.get("RFC_EMPLEADO"));
                    TnCapParticipante tnCapParticipante = super.persistence().get(TnCapParticipanteDAO.class).getById(tnCapParticipantePK);
                    tnCapParticipante.setParticipanteNotificacion(new Date());
                    super.persistence().get(TnCapParticipanteDAO.class).save(tnCapParticipante);
                    
                     // Actualizar idNotificacion del participante
                } catch (Exception e) {

                    TnCapParticipante tnCapParticipante = super.persistence().get(TnCapParticipanteDAO.class).getById(new TnCapParticipantePK(idCurso, (String) mapaEmpleados.get("RFC_EMPLEADO")));
                    tnCapParticipante.setParticipanteObservaciones(e.toString().substring(0, 100));
                    super.persistence().get(TnCapParticipanteDAO.class).save(tnCapParticipante);
                    error = true;
                }
            }
        }
        
        // Modifica el estatus del curso a CUR - EN CURSO
        TnCapCurso tnCapCurso = super.persistence().get(TnCapCursoDAO.class).getById(idCurso);
        if(tnCapCurso != null && tnCapCurso.getIdControlCurso() != null && tnCapCurso.getIdControlCurso().equals("CON")){
            tnCapCurso.setIdControlCurso("CUR");
        }

        super.persistence().get(TnCapCursoDAO.class).save(tnCapCurso);
    }
    
    /******************************************************************************************************************************************************************************/
    
    /**
     * Metodo que Registra el contrato con base en el objeto tnCapContratoCursoDTO
     * @author Oscar S.
     * @param tnCapContratoCursoDTO TnCapContratoCursoDTO
     */
    public void saveContrato(TnCapContratoCurDTO tnCapContratoCursoDTO) {
        // Paso 1) Obtener la secuencia
        List<TnCapContratoCur> tnCapContratoCursoList = super.persistence().get(QueryTnCapContratoCurDAO.class).getSequenceTnCapContratoCurso();
        TnCapContratoCur sequence = tnCapContratoCursoList.get(0);
        tnCapContratoCursoDTO.setIdContratoCurso(sequence.getIdContratoCurso());

        // Paso 2) Transformar objeto
        TnCapContratoCur tnCapContratoCurso = super.transformation().map(tnCapContratoCursoDTO, TnCapContratoCur.class);

        // Preparar objeto
        TnCapBitacoraCont tnCapBitacoraContrato = SirehUtils.transformToTnCapBitacoraContrato(tnCapContratoCurso, new TnCapFacturaCurso(), super.security().getUserName(), new Date());
        // Obtener movimiento
        int idMovimiento = super.configuration().getNumber("movCapCode", "ASIGNAR_CONTRATO").intValue();
        tnCapBitacoraContrato.setIdCapMovto(idMovimiento);
        // Guardar bitacora
        super.persistence().get(TnCapBitacoraContDAO.class).save(tnCapBitacoraContrato);

        // Paso 3) Guardar registro
        super.persistence().get(TnCapContratoCurDAO.class).save(tnCapContratoCurso);
    }
    
    /**
     * Metodo que obtiene los datos del contrato
     * @author Oscar S.
     * @param idContrato Integer
     * @return tnCapContratoCursoDTO TnCapContratoCursoDTO
     */
    public TnCapContratoCurDTO getContrato(Integer idContrato) {
        // Obtener contrato
        TnCapContratoCur tnCapContratoCurso = super.persistence().get(TnCapContratoCurDAO.class).getById(idContrato);;
        return super.transformation().map(tnCapContratoCurso, TnCapContratoCurDTO.class);
    }
    
    /**
     * Metodo que obtiene los datos del contrato
     * @author Oscar S.
     * @param idContrato Integer
     * @return customAltaContratoDTO CustomAltaContratoDTO
     */
    public CustomAltaContratoDTO getContratoCustom(Integer idContrato) {
        // Obtener contrato
        List<CustomAltaContrato> listaAltaContrato = super.persistence().get(QueryTnCapContratoCurDAO.class).getContratoCustom(idContrato);
        CustomAltaContratoDTO customAltaContratoDTO = null;
        
        if (listaAltaContrato != null && !listaAltaContrato.isEmpty()) {
            CustomAltaContrato customAltaContrato = listaAltaContrato.get(0);
            customAltaContratoDTO = super.transformation().map(customAltaContrato, CustomAltaContratoDTO.class);
        }
        return customAltaContratoDTO;
    }
    
    /**
     * Metodo que Actualiza los datos del contrato del curso con base en el objeto tnCapCursoDTO
     * @author Oscar S.
     * @param tnCapContratoCursoDTO TnCapContratoCursoDTO
     * @param idMovimiento int
     */
    public void updateContrato(TnCapContratoCurDTO tnCapContratoCursoDTO, int idMovimiento) {
        // Paso 1) Transformar objeto
        TnCapContratoCur tnCapContratoCurso = super.transformation().map(tnCapContratoCursoDTO, TnCapContratoCur.class);

        // Paso 2) Actualizar registro
        super.persistence().get(TnCapContratoCurDAO.class).save(tnCapContratoCurso);
        
        // Preparar objeto
        TnCapBitacoraCont tnCapBitacoraContrato = SirehUtils.transformToTnCapBitacoraContrato(tnCapContratoCurso, new TnCapFacturaCurso(), super.security().getUserName(), new Date());
        tnCapBitacoraContrato.setIdCapMovto(idMovimiento);
        // Guardar bitacora
        super.persistence().get(TnCapBitacoraContDAO.class).save(tnCapBitacoraContrato);
    }

    /**
     * Solicitud asincrona para validar si un número de contrato está duplicado.
     * @author Oscar S.
     * @param numeroContrato String
     * @param ciclo Integer
     * @return boolean
     */
    public boolean getContratoCursoNumero(String numeroContrato, Integer ciclo) {
        // Obtener contrato
        List<TnCapContratoCur> listaAltaContrato = new ArrayList<TnCapContratoCur>();
        listaAltaContrato = super.persistence().get(QueryTnCapContratoCurDAO.class).getContratoCursoNumero(numeroContrato, ciclo);
        return listaAltaContrato.size() == 0 ? false : true;
    }
         
    /**
     * Metodo que Elimina contratos con base en el objeto contratos
     * @author Oscar S.
     * @param contratos Integer[]
     */
    public void deleteContrato(Integer[] contratos) {
        for (Integer contrato : contratos) {
            // Datos del Contrato
            TnCapContratoCurDTO tnCapContratoCursoDTO = getContrato(contrato);
            TnCapContratoCur tnCapContratoCurso = super.transformation().map(tnCapContratoCursoDTO, TnCapContratoCur.class);
            
            // Validacion
            if (tnCapContratoCurso.getIdSituacionContrato() == 1) {
                // Eliminacion fisica
                super.persistence().get(TnCapContratoCurDAO.class).delete(tnCapContratoCurso);
                
                // Preparar objeto
                TnCapBitacoraCont tnCapBitacoraContrato = SirehUtils.transformToTnCapBitacoraContrato(tnCapContratoCurso, new TnCapFacturaCurso(), super.security().getUserName(), new Date());
                // Obtener movimiento
                int idMovimiento = super.configuration().getNumber("movCapCode", "ELIMINACION_DE_CONTRATO").intValue();
                tnCapBitacoraContrato.setIdCapMovto(idMovimiento);
                // Guardar bitacora
                super.persistence().get(TnCapBitacoraContDAO.class).save(tnCapBitacoraContrato);
            } else {
                // Eliminacion logica
                tnCapContratoCurso.setIdSituacionContrato(13); // CANCELADO
                tnCapContratoCurso.setUsuario(super.security().getUserName());
                tnCapContratoCurso.setFecModifico(new Date());
                super.persistence().get(TnCapContratoCurDAO.class).save(tnCapContratoCurso);
                
                // Preparar objeto
                TnCapBitacoraCont tnCapBitacoraContrato = SirehUtils.transformToTnCapBitacoraContrato (tnCapContratoCurso, new TnCapFacturaCurso(), super.security().getUserName(), new Date());
                // Obtener movimiento
                int idMovimiento = super.configuration().getNumber("movCapCode", "CANCELACION_DE_CONTRATO").intValue();
                tnCapBitacoraContrato.setIdCapMovto(idMovimiento);
                // Guardar bitacora
                super.persistence().get(TnCapBitacoraContDAO.class).save(tnCapBitacoraContrato);
            }
        } 
    }

    /**
     * Metodo que Actualiza los datos del contrato del curso con base en el objeto tnCapCursoDTO
     * @author Oscar S.
     * @param tnCapCursoDTO TnCapCursoDTO
     */
    public void saveAsignarContrato(TnCapCursoDTO tnCapCursoDTO) {
        // Paso 1) Obtener la secuencia
        List<TnCapCurso> tnCapCursoList = super.persistence().get(QueryTnCapCursoDAO.class).getSequenceTnCapCurso();
        TnCapCurso sequence = tnCapCursoList.get(0);
        tnCapCursoDTO.setIdCurso(sequence.getIdCurso());

        // Paso 2) Transformar objeto
        TnCapCurso tnCapCurso = super.transformation().map(tnCapCursoDTO, TnCapCurso.class);

        // Paso 3) Actualizar registro
        super.persistence().get(TnCapCursoDAO.class).save(tnCapCurso);
    }
    
    /**
     * Metodo encargado de obtener información del contrato con base en su idCurso
     * @author Oscar S.
     * @param idCurso int
     * @return customAsignarContratoDTO CustomAsignarContratoDTO
     */
    public CustomAsignarContratoDTO getAsignarContrato(int idCurso) {
        List<CustomAsignarContrato> listaAsignarContrato = super.persistence().get(QueryTnCapCursoDAO.class).getAsignarContrato(idCurso);
        CustomAsignarContratoDTO customAsignarContratoDTO = null;
        
        if (listaAsignarContrato != null && !listaAsignarContrato.isEmpty()) {
            CustomAsignarContrato customAsignarContrato = listaAsignarContrato.get(0);
            customAsignarContratoDTO = super.transformation().map(customAsignarContrato, CustomAsignarContratoDTO.class);
        }
        return customAsignarContratoDTO;
    }
    
    /** 
     * Metodo encargado de obtener facturas por curso
     * @author Oscar S.
     * @param ciclo Integer
     * @param contrato Integer
     * @param fechaContrato String
     * @param cursoFacturaContrato boolean
     * @return List&lt;CustomCursosFacturasDTO&gt;
     */
    public List<CustomCursosFacturasDTO> getCursosFacturas(Integer ciclo, Integer contrato, String fechaContrato, boolean cursoFacturaContrato) {
        List<CustomCursosFacturas> customCursosFacturas = new ArrayList<CustomCursosFacturas>();
        
        if (cursoFacturaContrato) {
            customCursosFacturas = super.persistence().get(QueryTnCapCursoDAO.class).getFacturasContrato(ciclo, ciclo, contrato);
            logger.debug("RegistroCursoSPCBS -> getCursosFacturas ----> Facturas-Contrato");
        } else  {
            customCursosFacturas = super.persistence().get(QueryTnCapCursoDAO.class).getCursosContrato(ciclo, ciclo, contrato, fechaContrato, ciclo, ciclo, fechaContrato);
            logger.debug("RegistroCursoSPCBS -> getCursosFacturas ----> Cursos-Contrato");
        }
        logger.debug("RegistroCursoSPCBS --> getCursosFacturas --> customCursosFacturas.size() --> " + customCursosFacturas.size());
        
        return super.transformation().map(customCursosFacturas, CustomCursosFacturasDTO.class);
    }
    
    /** 
     * Metodo encargado de desasignar cursos afectados por cambio en la fecha del contrato
     * @author Oscar S.
     * @param cursosAfectados List&lt;CustomCursosFacturasDTO&gt;
     */
    public void desasignaCursosPorCambioFecha(List<CustomCursosFacturasDTO> cursosAfectados) {
        for (CustomCursosFacturasDTO cursoAfectado : cursosAfectados) {
            logger.debug("RegistroCursoSPCBS -> desasignaCursosPorCambioFecha ----> curso-> " + cursoAfectado.getIdCurso());
            
            // Obtener curso
            TnCapCurso tnCapCurso = super.persistence().get(TnCapCursoDAO.class).getById(cursoAfectado.getIdCurso());
            
            // Actualizar curso
            tnCapCurso.setIdContratoCurso(null);
            super.persistence().get(TnCapCursoDAO.class).save(tnCapCurso);
        }
    }
    
    /**
     * Metodo que Asigna/Desasignar cursos al contrato con base en el objeto tnCapCursoDTO
     * @author Oscar S.
     * @param tnCapCursoDTO TnCapCursoDTO
     * @param idMovimiento int
     * @param desasignar boolean
     */
    public void saveAsignarCursoContrato(TnCapCursoDTO tnCapCursoDTO, Integer idContratoCurso, int idMovimiento, boolean desasignar) {
        // Transformar objeto
        TnCapCurso tnCapCurso = super.transformation().map(tnCapCursoDTO, TnCapCurso.class);
        
        // Obtener contrato
        TnCapContratoCur tnCapContratoCurso = super.persistence().get(TnCapContratoCurDAO.class).getById(idContratoCurso);
        
        if (desasignar) {
            // Actualizar registro
            tnCapCurso.setIdContratoCurso(null);
            super.persistence().get(TnCapCursoDAO.class).save(tnCapCurso);
        } else {
            // Actualizar registro
            super.persistence().get(TnCapCursoDAO.class).save(tnCapCurso);
        }
        
        // Preparar objeto
        TnCapBitacoraCont tnCapBitacoraContrato = SirehUtils.transformToTnCapBitacoraContrato(tnCapContratoCurso, new TnCapFacturaCurso(),  super.security().getUserName(), new Date());
        tnCapBitacoraContrato.setIdCapMovto(idMovimiento);
        
        // Guardar bitacora
        super.persistence().get(TnCapBitacoraContDAO.class).save(tnCapBitacoraContrato);
    }
    
    /**
     * Metodo que Asigna/Desasigna facturas al contrato con base en el objeto tnCapFacturaCursoDTO
     * @author Oscar S.
     * @param tnCapFacturaCursoDTO TnCapFacturaCursoDTO
     * @param idContratoCurso Integer
     * @param idMovimiento int
     * @param desasignar boolean
     */
    public void saveAsignarFacturaContrato(TnCapFacturaCursoDTO tnCapFacturaCursoDTO, Integer idContratoCurso, int idMovimiento, boolean desasignar) {
        // Transformar objeto
        TnCapFacturaCurso tnCapFacturaCurso = super.transformation().map(tnCapFacturaCursoDTO, TnCapFacturaCurso.class);
        
        // Obtener contrato
        TnCapContratoCur tnCapContratoCurso = super.persistence().get(TnCapContratoCurDAO.class).getById(idContratoCurso);
        
        if (desasignar) {
            // Eliminar registro
            super.persistence().get(TnCapFacturaCursoDAO.class).delete(tnCapFacturaCurso);
        } else {
            // Actualizar registro
            super.persistence().get(TnCapFacturaCursoDAO.class).save(tnCapFacturaCurso);
        }
        
        // Preparar objeto
        TnCapBitacoraCont tnCapBitacoraContrato = SirehUtils.transformToTnCapBitacoraContrato(tnCapContratoCurso, tnCapFacturaCurso,  super.security().getUserName(), new Date());
        tnCapBitacoraContrato.setIdCapMovto(idMovimiento);
        
        // Guardar bitacora
        super.persistence().get(TnCapBitacoraContDAO.class).save(tnCapBitacoraContrato);
    }
    
    /**
     * Alta contrato - Metodo encargado de obtener el listado de situaciones validas de facturas por curso.
     * @author Oscar S.
     * @param idCurso Integer
     * @param idContratoCurso Integer
     * @param facturaFolio String
     * @param administrador boolean
     * @return estatusFacturasList List&lt;ItemDTO&gt;
     */
    public List<ItemDTO> getDynamicEstatusFacturas(Integer idCurso, Integer idContratoCurso, String facturaFolio, boolean administrador) {
        // Formar llave
        TnCapFacturaCursoPK pk = new TnCapFacturaCursoPK();
        pk.setIdCurso(idCurso);
        pk.setIdContratoCurso(idContratoCurso);
        pk.setFacturaFolio(facturaFolio);
        TnCapFacturaCurso tnCapFacturaCurso = null;
        // Obtener objeto
        if(facturaFolio != null && !facturaFolio.equals("")){
            tnCapFacturaCurso = super.persistence().get(TnCapFacturaCursoDAO.class).getById(pk);
        }
        tnCapFacturaCurso = new TnCapFacturaCurso();
        // Lista de estatus
        List<ItemDTO> estatusFacturasList = new ArrayList<ItemDTO>();
        int idSituacionFactura = tnCapFacturaCurso.getIdSituacionFactura();
        logger.debug("getDynamicEstatusFacturas -> idSituacionFactura -> " + idSituacionFactura);
        
        if (administrador) {
            estatusFacturasList.add(new ItemDTO(1, "FACTURA RECIBIDA"));
            estatusFacturasList.add(new ItemDTO(2, "FACTURA INCORRECTA"));
            estatusFacturasList.add(new ItemDTO(3, "VALIDADA"));
            estatusFacturasList.add(new ItemDTO(4, "TRAMITADA"));
            estatusFacturasList.add(new ItemDTO(5, "PAGADA"));
            estatusFacturasList.add(new ItemDTO(6, "RECHAZADA"));
        } else {
            if (idSituacionFactura == 1) {
                estatusFacturasList.add(new ItemDTO(1, "FACTURA RECIBIDA"));
                estatusFacturasList.add(new ItemDTO(2, "FACTURA INCORRECTA"));
                estatusFacturasList.add(new ItemDTO(6, "RECHAZADA"));
            } else if (idSituacionFactura == 2) {
                estatusFacturasList.add(new ItemDTO(2, "FACTURA RECIBIDA"));
                estatusFacturasList.add(new ItemDTO(3, "FACTURA INCORRECTA"));
                estatusFacturasList.add(new ItemDTO(6, "RECHAZADA"));
            } else if (idSituacionFactura == 3) {
                estatusFacturasList.add(new ItemDTO(3, "VALIDADA"));
                estatusFacturasList.add(new ItemDTO(4, "TRAMITADA"));
                estatusFacturasList.add(new ItemDTO(6, "RECHAZADA"));
            } else if (idSituacionFactura == 4) {
                estatusFacturasList.add(new ItemDTO(4, "TRAMITADA"));
                estatusFacturasList.add(new ItemDTO(5, "PAGADA"));
                estatusFacturasList.add(new ItemDTO(6, "RECHAZADA"));
            } else if (idSituacionFactura == 5) {
                estatusFacturasList.add(new ItemDTO(5, "PAGADA"));
                estatusFacturasList.add(new ItemDTO(6, "RECHAZADA"));
            } else if (idSituacionFactura == 6) {
                estatusFacturasList.add(new ItemDTO(6, "RECHAZADA"));
            } else {
                estatusFacturasList.add(new ItemDTO(1, "FACTURA RECIBIDA"));
            }
        }
        logger.debug("getDynamicEstatusFacturas -> estatusFacturasList -> " + estatusFacturasList.size());
        return estatusFacturasList;
    }

    /******************************************************************************************************************************************************************************/

    /**
     * Metodo que Obtiene los datos para el formulario Asignar Instructor
     * @author Martin C.
     * @param claveCurso String
     * @return asignarInstructorDTO AsignarInstructorDTO
     */
    public AsignarInstructorDTO getAsignarInstructor(String claveCurso) {
        AsignarInstructorDTO asignarInstructorDTO = new AsignarInstructorDTO();
        List<AsignarInstructor> asignarInstructor = super.persistence().get(QueryTnCapCursoDAO.class).getAsignarInstructor(claveCurso);
        
        if (asignarInstructor.size() > 0) {
            asignarInstructorDTO = super.transformation().map(asignarInstructor.get(0), AsignarInstructorDTO.class);
        } else {
            asignarInstructorDTO = new AsignarInstructorDTO();
        }
        return asignarInstructorDTO;
    }

    /**
     * Asigna/Desasigna el instructor al curso
     * @author Martin C.
     * @param asignarInstructorDTO AsignarInstructorDTO
     */
    public void saveAsignarInstructor(AsignarInstructorDTO asignarInstructorDTO) {
        AsignarInstructor asignarInstructor = super.transformation().map(asignarInstructorDTO, AsignarInstructor.class);

        TnCapCurso tnCapCurso = super.persistence().get(TnCapCursoDAO.class).getById(asignarInstructor.getIdCurso());
        TnCapBitacoraInst tnCapBitacoraInstr = new TnCapBitacoraInst();

        if (asignarInstructor.isAsignarTitular()) {
            tnCapCurso.setIdInstructorTitular(new Integer(asignarInstructor.getIdInstructor()));
            tnCapBitacoraInstr.setIdInstrTit(new Integer(asignarInstructor.getIdInstructorTitular()));
            tnCapBitacoraInstr.setIdMotivoDesasignaInstr(null);
            tnCapBitacoraInstr.setIdInstrSup(null);
        } else if (asignarInstructor.isAsignarSuplente()) {
            tnCapCurso.setIdInstructorSuplente(new Integer(asignarInstructor.getIdInstructor()));
            tnCapBitacoraInstr.setIdInstrSup(new Integer(asignarInstructor.getIdInstructorSuplente()));
            tnCapBitacoraInstr.setIdMotivoDesasignaInstr(null);
            tnCapBitacoraInstr.setIdInstrTit(null);
        } else if (asignarInstructor.isDesasignarTitular()) {
            tnCapCurso.setIdInstructorTitular(null);
            tnCapBitacoraInstr.setIdInstrTit(new Integer(asignarInstructor.getInstructorTitular().split(" - ")[0]));
            tnCapBitacoraInstr.setIdMotivoDesasignaInstr(asignarInstructor.getMotivoDesasigna());
            tnCapBitacoraInstr.setIdInstrSup(null);
        } else if (asignarInstructor.isDesasignarSuplente()) {
            tnCapCurso.setIdInstructorSuplente(null);
            tnCapBitacoraInstr.setIdInstrSup(new Integer(asignarInstructor.getInstructorSuplente().split(" - ")[0]));
            tnCapBitacoraInstr.setIdMotivoDesasignaInstr(asignarInstructor.getMotivoDesasigna());
            tnCapBitacoraInstr.setIdInstrTit(null);
        }

        tnCapBitacoraInstr.setIdCurso(asignarInstructor.getIdCurso());
        tnCapBitacoraInstr.setIdCapBitacInstr(getSecuenciaBitacoraInstructor());
        tnCapBitacoraInstr.setUsuario(super.security().getUserName());
        tnCapBitacoraInstr.setFecModifico(new Date());

        super.persistence().get(TnCapCursoDAO.class).save(tnCapCurso);
        
        if (asignarInstructor.isEnCurso()) {
            super.persistence().get(TnCapBitacoraInstDAO.class).save(tnCapBitacoraInstr);
            if(asignarInstructor.isDesasignarTitular() && asignarInstructor.getMotivoDesasigna() == 1){
                super.persistence().get(CustomConceptoPagoCapturaDAO.class).betarInstructor(tnCapBitacoraInstr.getIdInstrTit(), tnCapCurso.getIdProveedor());
            }
        }
        
        
    }

    /**
     * Obtiene el instructor por su id
     * @Autor Martin C.
     * @param idInstructor Integer
     * @return String
     */
    public String getInstructor(Integer idInstructor) {
        List<AsignarInstructor> asignarInstructor = super.persistence().get(QueryTnCapCursoDAO.class).getNombreInstructorById(idInstructor);
        
        if ((asignarInstructor != null) && (asignarInstructor.size() > 0)) {
            return asignarInstructor.get(0).getIdInstructor();
        } else {
            return "";
        }
    }

    public Long getSecuenciaBitacoraInstructor() {
        List<TnCapBitacoraInst> tnCapBitacoraInstrList = super.persistence().get(QueryTnCapBitacoraInstDAO.class).getSequenceTnCapBitacoraInstructor();
        Long sequencia = null;
        
        if (tnCapBitacoraInstrList.size() > 0) {
            TnCapBitacoraInst tnCapBitacoraInstr = tnCapBitacoraInstrList.get(0);
            sequencia = tnCapBitacoraInstr.getIdCapBitacInstr();
        } else {
            sequencia = new Long(0);
        }
        return sequencia;
    }

    /**
     * Obtiene el ultimo instructor que fue desasignado
     * @Autor Martin C.
     * @return TnCapBitacoraInstrDTO
     */
    public TnCapBitacoraInstDTO getDesasignado(Integer idCurso) {
        List<TnCapBitacoraInst> tnCapBitacoraInstrList = super.persistence().get(QueryTnCapBitacoraInstDAO.class).getDesasignado(idCurso);
        
        if (tnCapBitacoraInstrList.size() > 0) {
            return super.transformation().map(tnCapBitacoraInstrList.get(0), TnCapBitacoraInstDTO.class);
        } else {
            return new TnCapBitacoraInstDTO();
        }
    }

    /******************************************************************************************************************************************************************************/

    
}


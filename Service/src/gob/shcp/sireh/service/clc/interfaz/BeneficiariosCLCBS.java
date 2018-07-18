package gob.shcp.sireh.service.clc.interfaz;

import gob.shcp.sireh.data.jdbc.TcBeneficiarioSicopDAO;

import gob.shcp.sireh.domain.jdbc.TcBeneficiarioSicop;
import gob.shcp.sireh.domain.jdbc.TcBeneficiarioSicopPK;

import gob.shcp.sireh.model.clc.interfaz.DetalleBeneficiarioDTO;

import gob.shcp.sireh.service.AbstractSirehService;

/**
 * Business Service encargado de atender solicitudes correspondientes al Modulo Cambio de Beneficiarios CLC.
 */
public class BeneficiariosCLCBS extends AbstractSirehService implements BeneficiariosCLCService {

    /**
     * Metodo encargado de armar la llave y consultar Beneficiarios 1 a 1 de CLC.
     * @author Josue L. Torres.
     * @param bsCtaBancaria String
     * @param bsLeyenda String
     * @param bsTipoPago String
     * @param idBeneSicop String
     * @return detalleBeneficiarioDTO DetalleBeneficiarioDTO
     */
    public DetalleBeneficiarioDTO getBeneficiario(String bsCtaBancaria, String bsLeyenda, String bsTipoPago, String idBeneSicop) {
        TcBeneficiarioSicopPK id = new TcBeneficiarioSicopPK();

        id.setBsCtaBancaria(bsCtaBancaria);
        id.setBsLeyenda(bsLeyenda);
        id.setBsTipoPago(bsTipoPago);
        id.setIdBeneSicop(idBeneSicop);

        TcBeneficiarioSicop registro = super.persistence().get(TcBeneficiarioSicopDAO.class).getById(id);
        DetalleBeneficiarioDTO registroDTO = super.transformation().map(registro, DetalleBeneficiarioDTO.class);
        return registroDTO;
    }
    
    /**
    * Metodo encargado de actualizar Beneficiarios.
    * @author Josue L. Torres.
    * @param detalleBeneficiarioDTO DetalleBeneficiarioDTO
    */
    public void updateBeneficiario(DetalleBeneficiarioDTO detalleBeneficiarioDTO) {
        //TcBeneficiarioSicop tcBeneficiarioSicop = new TcBeneficiarioSicop();
        TcBeneficiarioSicopPK pk = new TcBeneficiarioSicopPK();
        pk.setBsCtaBancaria(detalleBeneficiarioDTO.getBsCtaBancaria());
        pk.setBsLeyenda(detalleBeneficiarioDTO.getBsLeyenda());
        pk.setBsTipoPago(detalleBeneficiarioDTO.getBsTipoPago());
        pk.setIdBeneSicop(detalleBeneficiarioDTO.getIdBeneSicop());

        TcBeneficiarioSicop tcBeneficiarioSicop = super.persistence().get(TcBeneficiarioSicopDAO.class).getById(pk);
        //SirehUtils.copyProperties(tcBeneficiarioSicop, detalleBeneficiarioDTO);
        tcBeneficiarioSicop.setBsTipoNom(detalleBeneficiarioDTO.getBsTipoNom());

        super.persistence().get(TcBeneficiarioSicopDAO.class).save(tcBeneficiarioSicop);
    }
}

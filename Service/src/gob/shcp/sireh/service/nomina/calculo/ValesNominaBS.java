package gob.shcp.sireh.service.nomina.calculo;

import gob.shcp.sireh.data.jdbc.support.CustomCalculoDAO;


import gob.shcp.sireh.model.ItemKeyDTO;
import gob.shcp.sireh.model.nomina.QnaCapturaDTO;

import gob.shcp.sireh.model.nomina.calculo.vales.ValesNominaDTO;
import gob.shcp.sireh.service.AbstractSirehService;
import gob.shcp.sireh.service.SirehUtils;


import java.text.SimpleDateFormat;


import java.util.Calendar;

import java.util.List;


public class ValesNominaBS extends AbstractSirehService implements ValesNominaService{
    private static final String formatoDate = "dd/MM/yyyy";
    private static final String DIA_HACENDARIO = "04.12.";

    public void getValoresIniciales(ValesNominaDTO valesNominaDTO) {
        QnaCapturaDTO qnaCapturaDTO = getQuincenaCaptura();
        String uniciclo = super.security().getOperationYear();
        Integer year = SirehUtils.getCurrentYear();
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DATE, 1);
        cal.set(Calendar.MONTH, 0);
        cal.set(Calendar.YEAR, year);
        valesNominaDTO.setFecIni(cal.getTime());
        valesNominaDTO.setQnaProceso(qnaCapturaDTO.intValue());
        valesNominaDTO.setFecFin(qnaCapturaDTO.getInicioQuincena());

        Integer limiteInferior = qnaCapturaDTO.intValue();
        Integer limiteSuperior = qnaCapturaDTO.intValue();
        limiteInferior = limiteInferior - SirehUtils.getCurrentYear() * 100;
        limiteSuperior = limiteSuperior - SirehUtils.getCurrentYear() * 100;
        valesNominaDTO.setFilterQnaInferior(limiteInferior - 2);
        valesNominaDTO.setFilterQnaSuperior(limiteSuperior + 1);
        valesNominaDTO.setAnio(Integer.valueOf( qnaCapturaDTO.getAnio()));
        SimpleDateFormat df = new SimpleDateFormat(formatoDate);

            valesNominaDTO.setDiaHacendario(DIA_HACENDARIO + uniciclo);
            
        valesNominaDTO.setStrFecIni(df.format(cal.getTime()));    
        valesNominaDTO.setStrFecFin(df.format(qnaCapturaDTO.getInicioQuincena()));
        valesNominaDTO.setUniciclo(uniciclo);
        
        List<ItemKeyDTO> listaTiposNomina = valesNominaDTO.getListaTiposNomina();
        ItemKeyDTO item1 = new ItemKeyDTO(1, "FIN DE AÑO"); 
        ItemKeyDTO item2 = new ItemKeyDTO(2, "DÍA DEL HACENDARIO"); 
        listaTiposNomina.add(item1);
        listaTiposNomina.add(item2);
    }

    /**
     * Método encargado de llamar al procedimiento que genera las nominas de vales, obtiene los candidatos y los inserta en la tabla TN_CALCULO_NOMINA_QNA
     * @param valesNominaDTO
     */
    public void updateNominaVales(ValesNominaDTO valesNominaDTO) {
        SimpleDateFormat df = new SimpleDateFormat(formatoDate);
        valesNominaDTO.setQnaProceso(super.getQuincenaCaptura().intValue());
        switch (valesNominaDTO.getTipoNomina()) {
        case 1:
            super.persistence().get(CustomCalculoDAO.class).generarNominaValesFinAnio(df.format(valesNominaDTO.getFecIni()), 
                                                                                      df.format(valesNominaDTO.getFecFin()), 
                                                                                      valesNominaDTO.getQnaProceso(), 
                                                                                      valesNominaDTO.getMonto());
            break;
        case 2:
            super.persistence().get(CustomCalculoDAO.class).generarNominaValesDiaHacendario(df.format(valesNominaDTO.getFecIni()), 
                                                                                            df.format(valesNominaDTO.getFecFin()), 
                                                                                            valesNominaDTO.getQnaProceso(), 
                                                                                            valesNominaDTO.getMonto());
            break;
        case 3:
            super.persistence().get(CustomCalculoDAO.class).generarNominaValesDiaHacendario(df.format(valesNominaDTO.getFecIni()), 
                                                                                            df.format(valesNominaDTO.getFecFin()), 
                                                                                            valesNominaDTO.getQnaProceso(), 
                                                                                            valesNominaDTO.getMonto());
            break;
        }

    }

}

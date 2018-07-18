package gob.shcp.sireh.service.nomina.gestion;

import gob.shcp.sireh.data.jdbc.TnNominaDAO;
import gob.shcp.sireh.data.jdbc.support.CustomArmaArchivoTercerosDAO;
import gob.shcp.sireh.data.jdbc.support.CustomTnNominaDao;
import gob.shcp.sireh.domain.jdbc.TnNomina;
import gob.shcp.sireh.model.nomina.QnaCapturaDTO;
import gob.shcp.sireh.model.nomina.gestion.NominaDTO;
import gob.shcp.sireh.service.AbstractSirehService;
import gob.shcp.sireh.service.nomina.terceros.TercerosNominaService;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

import java.sql.Blob;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class GestionNominaBS extends AbstractSirehService implements GestionNominaService {

    public NominaDTO getNomina(Integer id) {
        TnNomina tnNomina = null;
        try {
            tnNomina = super.persistence().get(TnNominaDAO.class).getById(id);
        } catch (Exception e) {
            super.throwServiceException(e, "nomina.gestion.get.error", id);
            return null;
        }
        return super.transformation().map(tnNomina, NominaDTO.class);
    }

    public QnaCapturaDTO getQuincenaVigente() {
        return super.getQuincenaCaptura();
    }

    public List<Integer> getListadoNominas(int numQuincenas) {
        QnaCapturaDTO qnaCapturaDTO = super.getQuincenaCaptura();
        return getListadoAUnAnio(Integer.valueOf(qnaCapturaDTO.getAnio()), Integer.valueOf(qnaCapturaDTO.getQuincena()), numQuincenas);
    }

    public int getNextComplemento(NominaDTO nominaDTO) {
        return super.persistence().get(CustomTnNominaDao.class).getNextComplemento(super.transformation().map(nominaDTO, TnNomina.class));
    }

    public Long insertNomina(NominaDTO nominaDTO, String usuario) {
        TnNomina tnNomina = super.transformation().map(nominaDTO, TnNomina.class);
        tnNomina.setUsuario(usuario);
        tnNomina.setFecModifico(new Date());
        try {
            super.persistence().get(TnNominaDAO.class).save(tnNomina);
        } catch (Exception e) {
            super.throwServiceException(e, "configuracion.movimientos.concepto.update.error");
        }
        return tnNomina.getIdNomina();
    }

    public Long updateNomina(NominaDTO nominaDTO, String usuario) {
        TnNomina tnNomina = super.persistence().get(TnNominaDAO.class).getById( nominaDTO.getIdNomina().intValue() );
        
        tnNomina.setNomQnaCaptura(nominaDTO.getNomQnaCaptura() );
        tnNomina.setIdTipoNomina(nominaDTO.getIdTipoNomina() );
        tnNomina.setNomNumComplem(nominaDTO.getNomNumComplem() );
        tnNomina.setIdGrupoPagoNom(nominaDTO.getIdGrupoPagoNom() );
        tnNomina.setDescNomina(nominaDTO.getDescNomina() );
        tnNomina.setNomLeyenda(nominaDTO.getNomLeyenda() );
        tnNomina.setNomReglaCalculo(nominaDTO.getNomReglaCalculo() );
        tnNomina.setNomFuenteDatos(nominaDTO.getNomFuenteDatos() );
        tnNomina.setIdEdoNom(nominaDTO.getIdEdoNom() ); 
        tnNomina.setNomDiasPagar(nominaDTO.getNomDiasPagar() );
        tnNomina.setNomAplicarExentos( nominaDTO.getNomAplicarExentos() );
        tnNomina.setNomVigente(nominaDTO.getNomVigente() );
        tnNomina.setNomGratifAgui( nominaDTO.getNomGratifAgui() );
        tnNomina.setNomCompletarPeriodo( nominaDTO.getNomCompletarPeriodo() );
        tnNomina.setNomGobFed1(nominaDTO.getNomGobFed1());
        tnNomina.setNomGobFed2(nominaDTO.getNomGobFed2());
        tnNomina.setNomGobFed3(nominaDTO.getNomGobFed3());
        tnNomina.setNomGobFed4(nominaDTO.getNomGobFed4());
        tnNomina.setNomFacRen1(nominaDTO.getNomFacRen1());
        tnNomina.setNomFacRen2(nominaDTO.getNomFacRen2());
        tnNomina.setNomImpSin1(nominaDTO.getNomImpSin1());
        tnNomina.setNomImpSin2(nominaDTO.getNomImpSin2());
        tnNomina.setNomCicloFon(nominaDTO.getNomCicloFon());
        tnNomina.setNomRemesa(nominaDTO.getNomRemesa());
        tnNomina.setNomIniPago(nominaDTO.getNomIniPago());
        tnNomina.setNomFinPago(nominaDTO.getNomFinPago());
        tnNomina.setNomFecPago(nominaDTO.getNomFecPago());
        tnNomina.setNomFecDeposito(nominaDTO.getNomFecDeposito());
        tnNomina.setNomFecApertura(nominaDTO.getNomFecApertura());
        tnNomina.setNomFecCierre(nominaDTO.getNomFecCierre());
        
        
        
        tnNomina.setUsuario(usuario);
        tnNomina.setFecModifico(new Date());
        try {
            super.persistence().get(TnNominaDAO.class).save(tnNomina);
        } catch (Exception e) {
            super.throwServiceException(e, "configuracion.movimientos.concepto.update.error");
        }
        return tnNomina.getIdNomina();
    }

    private List<Integer> getListadoAUnAnio(Integer anio, Integer quincena, int numQuincenas) {
        List<Integer> listadoQuincenas = new ArrayList<Integer>();
        int q = quincena.intValue();
        int a = anio.intValue();
        for (int i = 0; i < numQuincenas; i++) {
            listadoQuincenas.add(a * 100 + q);
            if (q == 24) {
                q = 1;
                a++;
            } else {
                q++;
            }
        }
        return listadoQuincenas;
    }
    
    public synchronized void processAcumuConcentrPercepcDeduc(Integer idNomina){
        super.persistence().get(CustomArmaArchivoTercerosDAO.class).exeSpAcumConcentrPercepDeduc(idNomina);
    }
    
    /**
     * Metodo encargado de actualizar los archivos del sat relacionados con la nómina.
     * @author Martin C.
     */
/*    public void updateNominaArchivoSat(NominaDTO nominaDTO, String usuario) {
        TnNomina tnNomina = super.persistence().get(TnNominaDAO.class).getById( nominaDTO.getIdNomina().intValue() );
        tnNomina.setNomFecCreacion(nominaDTO.getNomFecCreacion() );
        tnNomina.setNomFecAnexo20(nominaDTO.getNomFecAnexo20() );
        tnNomina.setNomFecTimbrado(new Date());
        tnNomina.setNomRefTimbrado(nominaDTO.getNomRefTimbrado() );
        tnNomina.setNomFecCancSireh(nominaDTO.getNomFecCancSireh() );
        tnNomina.setNomFecCancSat(nominaDTO.getNomFecCancSat() );
        tnNomina.setNomFecCancA20(nominaDTO.getNomFecCancA20() );
        tnNomina.setNomRefSat(nominaDTO.getNomRefSat() );
        tnNomina.setUsuario(usuario);
        tnNomina.setFecModifico(new Date());
        
        // Respalda los archivos de tn_nomina, si es que existen
        Blob blob = null;
        byte[] buffer = new byte[4096];
        Integer idNomina = nominaDTO.getIdNomina().intValue();
        
        if(tnNomina.getNomArchCreacion() != null){
            try{
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                blob = super.getService(TercerosNominaService.class).getFile(idNomina, "nomArchCreacion");
                InputStream in = blob.getBinaryStream();
                int n = 0;
                while((n = in.read(buffer)) > 0){ baos.write(buffer, 0, n); }
                in.close();
                baos.close();
                tnNomina.setNomArchCreacion(baos.toByteArray());
            }catch(Exception e){ e.printStackTrace(); }
        } else{ tnNomina.setNomArchCreacion(null); }
            
            
        if(tnNomina.getNomArchAnexo20() != null){
            try{
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                blob = super.getService(TercerosNominaService.class).getFile(idNomina, "nomArchAnexo20");
                InputStream in = blob.getBinaryStream();
                int n = 0;
                while((n = in.read(buffer)) > 0){ 
                    baos.write(buffer, 0, n); 
                }
                in.close();
                baos.close();
                tnNomina.setNomArchAnexo20(baos.toByteArray());
            }catch(Exception e){ e.printStackTrace(); }
        } else{ tnNomina.setNomArchAnexo20(null); }
            
            
        if(tnNomina.getNomArchTimbrado() != null){
            try{
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                blob = super.getService(TercerosNominaService.class).getFile(idNomina, "nomArchTimbrado");
                InputStream in = blob.getBinaryStream();
                int n = 0;
                while((n = in.read(buffer)) > 0){ baos.write(buffer, 0, n); }
                in.close();
                baos.close();
                tnNomina.setNomArchTimbrado(baos.toByteArray());
            }catch(Exception e){ e.printStackTrace(); }
        } else{ tnNomina.setNomArchTimbrado(null); }
            
            
        if(tnNomina.getNomArchCanc() != null){
            try{
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                blob = super.getService(TercerosNominaService.class).getFile(idNomina, "nomArchCanc");
                InputStream in = blob.getBinaryStream();
                int n = 0;
                while((n = in.read(buffer)) > 0){ baos.write(buffer, 0, n); }
                in.close();
                baos.close();
                tnNomina.setNomArchCanc(baos.toByteArray());
            }catch(Exception e){ e.printStackTrace(); }
        } else{ tnNomina.setNomArchCanc(null); }
            
        // agrega los archivos que seran cargados en tn_nomina
        if(nominaDTO.getNomArchCreacion() != null){ tnNomina.setNomArchCreacion(nominaDTO.getNomArchCreacion()); }
        if(nominaDTO.getNomArchAnexo20() != null){ tnNomina.setNomArchAnexo20(nominaDTO.getNomArchAnexo20() ); }
        if(nominaDTO.getNomArchTimbrado() != null){ tnNomina.setNomArchTimbrado(nominaDTO.getNomArchTimbrado()); }
        if(nominaDTO.getNomArchCanc() != null){ tnNomina.setNomArchCanc(nominaDTO.getNomArchCanc()); }
        
        super.persistence().get(TnNominaDAO.class).save(tnNomina);
    }
    */
    
    public NominaDTO getNominaById(Integer id) {
        TnNomina tnNomina = super.persistence().get(CustomTnNominaDao.class).getById(id);
        NominaDTO nominaDTO = super.transformation().map(tnNomina, NominaDTO.class );
        return nominaDTO;
        
    }
    
    public Long updateNominaCompleta( NominaDTO nominaDTO ){
        TnNomina tnNomina = super.transformation().map(nominaDTO, TnNomina.class );
        super.persistence().get(TnNominaDAO.class).save(tnNomina);
        return nominaDTO.getIdNomina();
    }


}

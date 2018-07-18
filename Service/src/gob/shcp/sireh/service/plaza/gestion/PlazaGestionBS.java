package gob.shcp.sireh.service.plaza.gestion;

import gob.shcp.fsn.service.AbstractService;

import gob.shcp.sireh.data.jdbc.QueryTdPlazaDAO;

import gob.shcp.sireh.data.jdbc.QueryTnHistoricoPagoDAO;
import gob.shcp.sireh.data.jdbc.TdPlazaDAO;
import gob.shcp.sireh.domain.jdbc.CustomConsultaLinea;

import gob.shcp.sireh.domain.jdbc.CustomOutputFile;
import gob.shcp.sireh.model.nomina.terceros.enteros.fonac.PadronFonacDTO;
import gob.shcp.sireh.model.plaza.gestion.ConsultaLineaDTO;

import gob.shcp.sireh.model.plaza.reporte.ReportePlazaDTO;

import java.text.NumberFormat;

import java.util.ArrayList;
import java.util.List;

/**
 * Business Service encargado de atender solicitudes correspondientes a la Consulta de Plazas.
 */
 public class PlazaGestionBS extends AbstractService implements PlazaGestionService {

    /**
     * Metodo encargado de obtener los datos de la Plaza con base en su id.
     * @author Roberto Muñoz.
     * @param idPlaza Integer
     * @return consultaLineaDTO ConsultaLineaDTO
     */
    public ConsultaLineaDTO getEmpleadoPlaza(Integer idPlaza) {
        // Paso 1) Obtener la Plaza actual
        String uniciclo = super.security().getOperationYear();

        List<CustomConsultaLinea> plazas = 
            super.persistence().get(QueryTdPlazaDAO.class).findPlazaGestionConsultaLinea(idPlaza, 
                                                                                         uniciclo, 
                                                                                         uniciclo);
        CustomConsultaLinea plaza = plazas.get(0);

        // Paso 2) Conversion de objeto de dominio a DTO
        final ConsultaLineaDTO consultaLineaDTO = 
            super.transformation().map(plaza, ConsultaLineaDTO.class);

        // Paso 3) Formateo de importes
        NumberFormat formatter = NumberFormat.getCurrencyInstance();

        consultaLineaDTO.setSueldoPreLabel(formatter.format(consultaLineaDTO.getTabSueldoPre()));

        consultaLineaDTO.setCompensacionPreLabel(formatter.format(consultaLineaDTO.getTabCompensacionPre()));

        consultaLineaDTO.setSueldoNomLabel(formatter.format(consultaLineaDTO.getTabSueldoNom()));

        consultaLineaDTO.setCompensacionNomLabel(formatter.format(consultaLineaDTO.getTabCompensacionNom()));

        consultaLineaDTO.setSueldoHonLabel(formatter.format(consultaLineaDTO.getPlazaImpHono()));

        // Paso 4) Datos del Inmueble
        if (consultaLineaDTO.getIdInmueble() != null && 
            consultaLineaDTO.getIdInmueble() != 0) {
            StringBuilder descInmueble = new StringBuilder();

            descInmueble.append(consultaLineaDTO.getIdInmueble() != null ? 
                                consultaLineaDTO.getIdInmueble() + " " : "");
            descInmueble.append(consultaLineaDTO.getInmuebleCalle() != null ? 
                                consultaLineaDTO.getInmuebleCalle() + " " : 
                                "");
            descInmueble.append(consultaLineaDTO.getInmuebleNumExt() != null ? 
                                consultaLineaDTO.getInmuebleNumExt() + " " : 
                                "");
            descInmueble.append(consultaLineaDTO.getInmuebleNumInt() != null ? 
                                consultaLineaDTO.getInmuebleNumInt() + " " : 
                                "");

            descInmueble.append(consultaLineaDTO.getInmuebleColonia() != null ? 
                                " COLONIA " + 
                                consultaLineaDTO.getInmuebleColonia() + ", " : 
                                "");
            descInmueble.append(consultaLineaDTO.getDescMunicipioNom() != 
                                null ? 
                                consultaLineaDTO.getDescMunicipioNom() + ", " : 
                                "");
            descInmueble.append(consultaLineaDTO.getDescEstadoPre() != null ? 
                                consultaLineaDTO.getDescEstadoPre() + 
                                ", MEXICO" : "");

            descInmueble.append(consultaLineaDTO.getPlazaEdif() != null ? 
                                ", EDIF " + consultaLineaDTO.getPlazaEdif() : 
                                "");
            descInmueble.append(consultaLineaDTO.getPlazaPiso() != null ? 
                                " PISO " + consultaLineaDTO.getPlazaPiso() : 
                                "");
            descInmueble.append(consultaLineaDTO.getPlazaAla() != null ? 
                                " ALA " + consultaLineaDTO.getPlazaAla() : "");
            descInmueble.append(consultaLineaDTO.getPlazaOfna() != null ? 
                                " OFNA " + consultaLineaDTO.getPlazaOfna() : 
                                "");

            descInmueble.append(consultaLineaDTO.getPlazaTelOf1() != null ? 
                                ", TELEFONOS " + 
                                consultaLineaDTO.getPlazaTelOf1() + " " : "");
            descInmueble.append(consultaLineaDTO.getPlazaTelOf2() != null ? 
                                consultaLineaDTO.getPlazaTelOf2() + " " : "");
            descInmueble.append(consultaLineaDTO.getPlazaConmut() != null ? 
                                consultaLineaDTO.getPlazaConmut() + " " : "");

            descInmueble.append(consultaLineaDTO.getPlazaExt1() != null ? 
                                " EXT " + consultaLineaDTO.getPlazaExt1() + 
                                " " : "");
            descInmueble.append(consultaLineaDTO.getPlazaExt2() != null ? 
                                consultaLineaDTO.getPlazaExt2() + " " : "");

            consultaLineaDTO.setDescInmueble(descInmueble.toString());
        } else {
            consultaLineaDTO.setDescInmueble(" - ");
        }

        return consultaLineaDTO;
    }

    /**
     * Metodo encargado de obtener los datos del POT.
     * @author Cesar B.
     * @param reportePlazaDTO ReportePlazaDTO
     * @return List
     */
    public List<String> pot(ReportePlazaDTO reportePlazaDTO) {
        List<CustomOutputFile> lista = new ArrayList<CustomOutputFile>();
        List<String> listaString = new ArrayList<String>();

        String qnaCaptura = reportePlazaDTO.getQnaCaptura();
        String qnaCaptura2 = "";

        if (new Integer(qnaCaptura) % 2 == 0) {
            qnaCaptura2 = String.valueOf((new Integer(qnaCaptura) - 1));
        } else {
            qnaCaptura2 = qnaCaptura;
        }


        if (reportePlazaDTO.getOrigen().equalsIgnoreCase("e")) {

            lista = 
                    super.persistence().get(QueryTdPlazaDAO.class).findBypotEscenario(qnaCaptura);
            listaString.add("ID del Cargo,Nombre del Cargo");
        } else if (reportePlazaDTO.getOrigen().equalsIgnoreCase("i")) {
            lista = 
                    super.persistence().get(QueryTdPlazaDAO.class).findBypotInmueble(qnaCaptura);
            listaString.add("Id Domicilio,Calle,Número Exterior,Número Interior,Colonia,Municipio,Estado/Entidad Fef.,País,Código Postal,Tipo de Oficina");
        } else if (reportePlazaDTO.getOrigen().equalsIgnoreCase("a")) {
            lista = 
                    super.persistence().get(QueryTdPlazaDAO.class).findBypotAltas(qnaCaptura, 
                                                                                  qnaCaptura2);
            listaString.add("ID del Servidor Público,Nombre,Primer Apellido,Segundo Apellido,Tipo Vacancia,Telefono Directo,Conmutador,Extensión,Fax,Email,ID Domicilio,Nivel de Puesto,Id del Cargo,ID del Cargo Superior,Nivel_Jerarquico");
        } else if (reportePlazaDTO.getOrigen().equalsIgnoreCase("b")) {
            lista = 
                    super.persistence().get(QueryTdPlazaDAO.class).findBypotBajas(qnaCaptura, 
                                                                                  qnaCaptura2);
            listaString.add("ID del Servidor Público");
        } else if (reportePlazaDTO.getOrigen().equalsIgnoreCase("d")) {
            lista = 
                    super.persistence().get(QueryTdPlazaDAO.class).findBypotDirectorio(qnaCaptura, 
                                                                                       qnaCaptura2);
            listaString.add("Unidad,RFC,ID del Servidor Público,Nombre,Primer Apellido,Segundo Apellido,Tipo Vacancia,Telefono Directo,Conmutador,Extensión,Fax,Email,ID Domicilio,Nivel de Puesto,Id del Cargo,ID del Cargo Superior,Nivel_Jerarquico");
        } else if (reportePlazaDTO.getOrigen().equalsIgnoreCase("r")) {
            lista = 
                    super.persistence().get(QueryTdPlazaDAO.class).findBypotRemuneraciones(qnaCaptura, 
                                                                                           qnaCaptura2);
            listaString.add("Id Puesto,Nombre,Tipo,SubTipo,Sueldo Base,Compensación Garantizada, Total Bruto, Total Neto,Nombre 01 Remuneracion,Monto 01 Remuneracion,Nombre 02 Remuneracion,Monto 02 Remuneracion,Nombre 03 Remuneracion,Monto 03 Remuneracion,Nombre 04 Remuneracion,Monto 04 Remuneracion,Nombre 05 Remuneracion,Monto 05 Remuneracion,Nombre 06 Remuneracion,Monto 06 Remuneracion,Nombre 07 Remuneracion,Monto 07 Remuneracion,Nombre 08 Remuneracion,Monto 08 Remuneracion,Nombre 09 Remuneracion,Monto 09 Remuneracion,Nombre 10 Remuneracion,Monto 10 Remuneracion,Nombre 11 Remuneracion,Monto 11 Remuneracion,Nombre 12 Remuneracion,Monto 12 Remuneracion,Nombre 13 Remuneracion,Monto 13 Remuneracion,Nombre 14 Remuneracion,Monto 14 Remuneracion,Nombre 15 Remuneracion,Monto 15 Remuneracion,Institucional,Colectivo de Retiro,Gastos Médicos,Separación Individualizado,Riesgos de Trabajo,Nombre Otros Seguros 1,Monto Otros Seguros 1,Nombre Otros Seguros 2,Monto Otros Seguros 2,Nombre Otros Seguros 3,Monto Otros Seguros 3,Nombre Otros Seguros 4,Monto Otros Seguros 4,Nombre Otros Seguros 5,Monto Otros Seguros 5,Nombre Otros Seguros 6,Monto Otros Seguros 6,Nombre Otros Seguros 7,Monto Otros Seguros 7,Nombre Otros Seguros 8,Monto Otros Seguros 8,Nombre Otros Seguros 9,Monto Otros Seguros 9,Nombre Otros Seguros 10,Monto Otros Seguros 10,Nombre Otros Seguros 11,Monto Otros Seguros 11,Nombre Otros Seguros 12,Monto Otros Seguros 12,Nombre Otros Seguros 13,Monto Otros Seguros 13,Nombre Otros Seguros 14,Monto Otros Seguros 14,Nombre Otros Seguros15,Monto Otros Seguros 15,Prima Vacacional,Primas de Antigüedad,Gratificación de Fin de Año,Pagas de Defunción,Ayuda para Despensa,Vacaciones,Nombre Prest. Econom 1,Monto Prest. Econom 1,Nombre Prest. Econom 2,Monto Prest. Econom 2,Nombre Prest. Econom 3,Monto Prest. Econom 3,Nombre Prest. Econom 4,Monto Prest. Econom 4,Nombre Prest. Econom 5,Monto Prest. Econom 5,Nombre Prest. Econom 6,Monto Prest. Econom 6,Nombre Prest.Econom 7,Monto Prest. Econom 7,Nombre Prest. Econom 8,Monto Prest. Econom 8,Nombre Prest. Econom 9,Monto Prest. Econom 9,Nombre Prest. Econom 10,Monto Prest. Econom 10,Nombre Prest. Econom 11,Monto Prest. Econom 11,Nombre Prest. Econom 12,Monto Prest. Econom 12,Nombre Prest. Econom 13,Monto Prest. Econom 13,Nombre Prest. Econom 14,Monto Prest. Econom 14,Nombre Prest. Econom 15,Monto Prest. Econom 15,Asistencia Legal,Asignación de Vehículo y/o Apoyo Económico ,Equipo de Telefonía Celular,Gastos de Alimentación,Nombre Prest. Inherentes al Puesto 1,Monto Prest. Inherentes al Puesto 1,Nombre Prest. Inherentes al Puesto 2,Monto Prest. Inherentes al Puesto 2,Nombre Prest. Inherentes al Puesto 3,Monto Prest. Inherentes al Puesto 3,Nombre Prest. Inherentes al Puesto 4,Monto Prest. Inherentes al Puesto 4,Nombre Prest. Inherentes al Puesto 5,Monto Prest. Inherentes al Puesto 5,Nombre Prest. Inherentes al Puesto 6,Monto Prest. Inherentes al Puesto 6,Nombre Prest. Inherentes al Puesto 7,Monto Prest. Inherentes al Puesto 7,Nombre Prest. Inherentes al Puesto 8,Monto Prest. Inherentes al Puesto 8,Nombre Prest. Inherentes al Puesto 9,Monto Prest. Inherentes al Puesto 9,Nombre Prest. Inherentes al Puesto 10,Monto Prest. Inherentes al Puesto 10,Nombre Prest. Inherentes al Puesto 11,Monto Prest. Inherentes al Puesto 11,Nombre Prest. Inherentes al Puesto 12,Monto Prest. Inherentes al Puesto 12,Nombre Prest. Inherentes al Puesto 13,Monto Prest. Inherentes al Puesto 13,Nombre Prest. Inherentes al Puesto 14,Monto Prest. Inherentes al Puesto 14,Nombre Prest. Inherentes al Puesto 15,Monto Prest. Inherentes al Puesto 15,ISSSTE / IMSS,FOVISSSTE / INFONAVIT,SAR,Nombre 01 Prest.Seg Social,Monto 01 Prest.Seg Social,Nombre 02 Prest.Seg Social,Monto 02 Prest.Seg Social,Nombre 03 Prest.Seg Social,Monto 03 Prest.Seg Social,Nombre 04 Prest.Seg Social,Monto 04 Prest.Seg Social,Nombre 05 Prest.Seg Social,Monto 05 Prest.Seg Social,Nombre 06 Prest.Seg Social,Monto 06 Prest.Seg Social,Nombre 07 Prest.Seg Social,Monto 07 Prest.Seg Social,Nombre 08 Prest.Seg Social,Monto 08 Prest.Seg Social,Nombre 09 Prest.Seg Social,Monto 09 Prest.Seg Social,Nombre 10 Prest.Seg Social,Monto 10 Prest.Seg Social,Nombre 11 Prest.Seg Social,Monto 11 Prest.Seg Social,Nombre 12 Prest.Seg Social,Monto 12 Prest.Seg Social,Nombre 13 Prest.Seg Social,Monto 13 Prest.Seg Social,Nombre 14 Prest.Seg Social,Monto 14 Prest.Seg Social,Nombre 15 Prest.Seg Social,Monto 15 Prest.Seg Social,Préstamos,Becas,Indemnizaciones,Nombre Otro Tipo Incentivo 01,Monto. Otro Tipo Incentivo 01,Nombre Otro Tipo Incentivo 02,Monto. Otro Tipo Incentivo 02,Nombre Otro Tipo Incentivo 03,Monto. Otro Tipo Incentivo 03,Nombre Otro Tipo Incentivo 04,Monto. Otro Tipo Incentivo 04,Nombre Otro Tipo Incentivo05,Monto. Otro Tipo Incentivo 05,Nombre Otro Tipo Incentivo 06,Monto. Otro Tipo Incentivo 06,Nombre Otro Tipo Incentivo 07,Monto. Otro Tipo Incentivo 07,Nombre Otro Tipo Incentivo 08,Monto. Otro Tipo Incentivo 08,Nombre Otro Tipo Incentivo 09,Monto. Otro Tipo Incentivo 09,Nombre Otro Tipo Incentivo 10,Monto. Otro Tipo Incentivo10,Nombre Otro Tipo Incentivo 11,Monto. Otro Tipo Incentivo 11,Nombre Otro Tipo Incentivo 12,Monto. Otro Tipo Incentivo12,Nombre Otro Tipo Incentivo 13,Monto. Otro Tipo Incentivo 13,Nombre Otro Tipo Incentivo 14,Monto. Otro Tipo Incentivo 14,Nombre Otro Tipo Incentivo 15,Monto. Otro Tipo Incentivo 15");
        } else if (reportePlazaDTO.getOrigen().equalsIgnoreCase("f")) {
            lista = 
                    super.persistence().get(QueryTdPlazaDAO.class).findBypotFuncion((reportePlazaDTO.getQnaCaptura().substring(0, 
                                                                                                                               4)));
            listaString.add("Identificador de la Facultad,Fundamento Legal,Documento Registrado,Unidad Administrativa,Nombre de la Unidad Administrativa");
        } else if (reportePlazaDTO.getOrigen().equalsIgnoreCase("s")) {
            lista = 
                    super.persistence().get(QueryTdPlazaDAO.class).findBypotEstadistico(qnaCaptura);
            listaString.add("NIVEL,G,H,HH,I,J,K,L,M,N,O,Total");
        }

        if (lista != null) {
            for (CustomOutputFile row: lista) {
                listaString.add(row.getRegistro());
            }
        } else
            listaString = null;
        return listaString;

    }

    /**
     * Metodo encargado de obtener los datos del PNT DIRECTORIO.
     * @author Cesar B.
     * @param reportePlazaDTO ReportePlazaDTO
     * @return List
     */
    public List<String> pntdirectorio(ReportePlazaDTO reportePlazaDTO) {
        List<CustomOutputFile> lista = new ArrayList<CustomOutputFile>();
        List<String> listaString = new ArrayList<String>();

        String qnaCaptura = reportePlazaDTO.getQnaCaptura();
        String qnaCaptura2 = "";

        if (new Integer(qnaCaptura) % 2 == 0) {
            qnaCaptura2 = String.valueOf((new Integer(qnaCaptura) - 1));
        } else {
            qnaCaptura2 = qnaCaptura;
        }

        lista = 
                super.persistence().get(QueryTdPlazaDAO.class).findBypntDirectorio(qnaCaptura, 
                                                                                   qnaCaptura2);
        listaString.add("Plaza,Puesto,Cargo,Nombre,Primer Apellido,Segundo Apellido,Unidad,Fecha Alta Puesto,Vialidad,Nombre vialidad,Num ext, Num int,Asentamiento,Nom asentamiento,Localidad,Nom localidad,Mun-Del,Nom mun-del,Edo,Nom edo,Cod Post,Telefono,Ext,Email,Leyenda,Fec valida,Area responsable,Año,Fec actualiza,Nota");

        if (lista != null) {
            for (CustomOutputFile row: lista) {
                listaString.add(row.getRegistro());
            }
        } else
            listaString = null;
        return listaString;

    }

    /**
     * Metodo encargado de obtener los datos del PNT ESTRUCTURA.
     * @author Cesar B.
     * @param reportePlazaDTO ReportePlazaDTO
     * @return List
     */
    public List<String> pntestructura(ReportePlazaDTO reportePlazaDTO) {
        List<CustomOutputFile> lista = new ArrayList<CustomOutputFile>();
        List<String> listaString = new ArrayList<String>();

        String qnaCaptura = reportePlazaDTO.getQnaCaptura();
        String qnaCaptura2 = "";

        if (new Integer(qnaCaptura) % 2 == 0) {
            qnaCaptura2 = String.valueOf((new Integer(qnaCaptura) - 1));
        } else {
            qnaCaptura2 = qnaCaptura;
        }

        lista = 
                super.persistence().get(QueryTdPlazaDAO.class).findBypntEstructura(qnaCaptura, 
                                                                                   qnaCaptura2);
        listaString.add("Plaza,Unidad,Descripcion Puesto,Cargo o Funcion,Codigo Puesto,Tipo,Unidad Jefe,Denominacion,Fundamento,Atribuciones,Hipervinculo,Prestador,Organigrama,Leyenda,Fec valida,Area responsable,Año,Fec actualiza,Nota");

        if (lista != null) {
            for (CustomOutputFile row: lista) {
                listaString.add(row.getRegistro());
            }
        } else
            listaString = null;
        return listaString;

    }

    /**
     * Metodo encargado de obtener los datos del PNT REMUNERACION.
     * @author Cesar B.
     * @param reportePlazaDTO ReportePlazaDTO
     * @return List
     */
    public List<String> pntremuneracion(ReportePlazaDTO reportePlazaDTO) {
        List<CustomOutputFile> lista = new ArrayList<CustomOutputFile>();
        List<String> listaString = new ArrayList<String>();

        String qnaCaptura = reportePlazaDTO.getQnaCaptura();
        String qnaCaptura2 = "";

        if (new Integer(qnaCaptura) % 2 == 0) {
            qnaCaptura2 = String.valueOf((new Integer(qnaCaptura) - 1));
        } else {
            qnaCaptura2 = qnaCaptura;
        }

        lista = 
                super.persistence().get(QueryTdPlazaDAO.class).findBypntRemuneracion(qnaCaptura, 
                                                                                     qnaCaptura2);
        listaString.add("Tipo de integrante del sujeto obligado,Clave o nivel del puesto,Denominación del puesto,Denominación del cargo,Área de adscripción,Nombre completo del servidor público y/o toda persona que desempeñe un empleo cargo o comisión y/o ejerzan actos de autoridad,Sexo,Remuneración mensual bruta,Remuneración mensual neta,Percepciones adicionales en efectivo,Percepciones adicionales en especie,Periodicidad,Ingresos,Sistemas de compensación,Periodicidad,Gratificaciones,Periodicidad,Primas,Periodicidad,Comisiones,Periodicidad,Dietas,Periodicidad,Bonos,Periodicidad,Estímulos,Periodicidad,Apoyos económicos,Periodicidad,Prestaciones económicas,Prestaciones en especie,Periodicidad,Otro tipo de percepción,Fec valida,Area responsable,Año,Fec actualiza,Nota");

        if (lista != null) {
            for (CustomOutputFile row: lista) {
                listaString.add(row.getRegistro());
            }
        } else
            listaString = null;
        return listaString;

    }

    /**
     * Metodo encargado de obtener los datos del PNT ESTADISTICO.
     * @author Cesar B.
     * @param reportePlazaDTO ReportePlazaDTO
     * @return List
     */
    public List<String> pntestadistico(ReportePlazaDTO reportePlazaDTO) {
        List<CustomOutputFile> lista = new ArrayList<CustomOutputFile>();
        List<String> listaString = new ArrayList<String>();

        String qnaCaptura = reportePlazaDTO.getQnaCaptura();
        String qnaCaptura2 = "";

        if (new Integer(qnaCaptura) % 2 == 0) {
            qnaCaptura2 = String.valueOf((new Integer(qnaCaptura) - 1));
        } else {
            qnaCaptura2 = qnaCaptura;
        }

        lista = 
                super.persistence().get(QueryTdPlazaDAO.class).findBypntEstadistico(qnaCaptura, 
                                                                                    qnaCaptura2);
        listaString.add("RFC,Plaza,Periodo,Unidad,Descripcion puesto,Puesto,Tipo,Tipo pza,Adscripcion,Observaciones,Observa,Hipervinculo,Fec val,Area val,Año,Fec act,Nota");

        if (lista != null) {
            for (CustomOutputFile row: lista) {
                listaString.add(row.getRegistro());
            }
        } else
            listaString = null;
        return listaString;

    }

    /**
     * Metodo encargado de obtener los datos del PNT FACULTADES.
     * @author Cesar B.
     * @param reportePlazaDTO ReportePlazaDTO
     * @return List
     */
    public List<String> pntfuncion(ReportePlazaDTO reportePlazaDTO) {
        List<CustomOutputFile> lista = new ArrayList<CustomOutputFile>();
        List<String> listaString = new ArrayList<String>();

        String qnaCaptura = reportePlazaDTO.getQnaCaptura();
        String qnaCaptura2 = "";

        if (new Integer(qnaCaptura) % 2 == 0) {
            qnaCaptura2 = String.valueOf((new Integer(qnaCaptura) - 1));
        } else {
            qnaCaptura2 = qnaCaptura;
        }

        lista = 
                super.persistence().get(QueryTdPlazaDAO.class).findBypntFuncion(qnaCaptura);
        listaString.add("Unidad,Norma, Fundamento Legal,Fraccion,Fec valida,Area responsable,Año,Fec actualiza,Nota");

        if (lista != null) {
            for (CustomOutputFile row: lista) {
                listaString.add(row.getRegistro());
            }
        } else
            listaString = null;
        return listaString;

    }

    /**
     * Metodo encargado de obtener los datos del PNT INMUEBLE.
     * @author Cesar B.
     * @param reportePlazaDTO ReportePlazaDTO
     * @return List
     */
    public List<String> pntinmueble(ReportePlazaDTO reportePlazaDTO) {
        List<CustomOutputFile> lista = new ArrayList<CustomOutputFile>();
        List<String> listaString = new ArrayList<String>();

        String qnaCaptura = reportePlazaDTO.getQnaCaptura();
        String qnaCaptura2 = "";

        if (new Integer(qnaCaptura) % 2 == 0) {
            qnaCaptura2 = String.valueOf((new Integer(qnaCaptura) - 1));
        } else {
            qnaCaptura2 = qnaCaptura;
        }

        lista = 
                super.persistence().get(QueryTdPlazaDAO.class).findBypotInmueble(qnaCaptura);
        listaString.add("Id Domicilio,Calle,Número Exterior,Número Interior,Colonia,Municipio,Estado/Entidad Fef.,País,Código Postal,Tipo de Oficina");

        if (lista != null) {
            for (CustomOutputFile row: lista) {
                listaString.add(row.getRegistro());
            }
        } else
            listaString = null;
        return listaString;

    }

    /**
     * Metodo encargado de obtener los datos del PNT ALTAS.
     * @author Cesar B.
     * @param reportePlazaDTO ReportePlazaDTO
     * @return List
     */
    public List<String> pntaltas(ReportePlazaDTO reportePlazaDTO) {
        List<CustomOutputFile> lista = new ArrayList<CustomOutputFile>();
        List<String> listaString = new ArrayList<String>();

        String qnaCaptura = reportePlazaDTO.getQnaCaptura();
        String qnaCaptura2 = "";

        if (new Integer(qnaCaptura) % 2 == 0) {
            qnaCaptura2 = String.valueOf((new Integer(qnaCaptura) - 1));
        } else {
            qnaCaptura2 = qnaCaptura;
        }

        lista = 
                super.persistence().get(QueryTdPlazaDAO.class).findBypotAltas(qnaCaptura, 
                                                                              qnaCaptura2);
        listaString.add("ID del Servidor Público,Nombre,Primer Apellido,Segundo Apellido,Tipo Vacancia,Telefono Directo,Conmutador,Extensión,Fax,Email,ID Domicilio,Nivel de Puesto,Id del Cargo,ID del Cargo Superior,Nivel_Jerarquico");

        if (lista != null) {
            for (CustomOutputFile row: lista) {
                listaString.add(row.getRegistro());
            }
        } else
            listaString = null;
        return listaString;

    }

    /**
     * Metodo encargado de obtener los datos del PNT BAJAS.
     * @author Cesar B.
     * @param reportePlazaDTO ReportePlazaDTO
     * @return List
     */
    public List<String> pntbajas(ReportePlazaDTO reportePlazaDTO) {
        List<CustomOutputFile> lista = new ArrayList<CustomOutputFile>();
        List<String> listaString = new ArrayList<String>();

        String qnaCaptura = reportePlazaDTO.getQnaCaptura();
        String qnaCaptura2 = "";

        if (new Integer(qnaCaptura) % 2 == 0) {
            qnaCaptura2 = String.valueOf((new Integer(qnaCaptura) - 1));
        } else {
            qnaCaptura2 = qnaCaptura;
        }

        lista = 
                super.persistence().get(QueryTdPlazaDAO.class).findBypotBajas(qnaCaptura, 
                                                                              qnaCaptura2);
        listaString.add("ID del Servidor Público");

        if (lista != null) {
            for (CustomOutputFile row: lista) {
                listaString.add(row.getRegistro());
            }
        } else
            listaString = null;
        return listaString;

    }

    /**
     * Metodo encargado de obtener los datos del PNT CONTRATACION DE HONORARIOS.
     * @author Cesar B.
     * @param reportePlazaDTO ReportePlazaDTO
     * @return List
     */
    public List<String> pntcontratacionhonorarios(ReportePlazaDTO reportePlazaDTO) {
        List<CustomOutputFile> lista = new ArrayList<CustomOutputFile>();
        List<String> listaString = new ArrayList<String>();

        String qnaCaptura = reportePlazaDTO.getQnaCaptura();
        String qnaCaptura2 = "";

        if (new Integer(qnaCaptura) % 2 == 0) {
            qnaCaptura2 = String.valueOf((new Integer(qnaCaptura) - 1));
        } else {
            qnaCaptura2 = qnaCaptura;
        }

        lista = 
                super.persistence().get(QueryTdPlazaDAO.class).findBypntContratacionHonorarios(qnaCaptura);
        listaString.add("Ejercicio,Periodo que se informa,Tipo de contratación,Partida presupuestal de los recursos con que se cubran los honorarios pactados,Nombre(s),Primer apellido,Segundo apellido,Número de contrato,Fecha de inicio del contrato,Fecha de término del contrato,Hipervínculo al contrato,Servicios contratados,Remuneración mensual bruta o contraprestación,Monto total a pagar,Prestaciones (en su caso),Hipervínculo a la normatividad que regula la celebración de contratos de servicios profesionales por honorarios,Fec valida,Area responsable,Año,Fec actualiza,Nota");

        if (lista != null) {
            for (CustomOutputFile row: lista) {
                listaString.add(row.getRegistro());
            }
        } else
            listaString = null;
        return listaString;

    }

    /**
     * Metodo encargado de generar archivo de plazas vigentes.
     * @author Ricardo León E..
     * @param tipoArchivo String
     * @return listaString List<String>
     */
    public List<String> getConsultaPlazasVigentes(ReportePlazaDTO reportePlazaDTO) {
        List<String> listaString = new ArrayList<String>();
        List<CustomOutputFile> lista = new ArrayList<CustomOutputFile>();
        List<CustomOutputFile> itemsHeader = new ArrayList<CustomOutputFile>();
        //List<TnHistoricoPago> nomina;
        //reportePlazaDTO.setUniCiclo = super.security().getOperationYear();

        lista = super.persistence().get(QueryTdPlazaDAO.class).getConsultaPlazasVigentes();
        if (lista != null) {
            for (CustomOutputFile row: lista) {
                listaString.add(row.getRegistro());
            }
        } else {
            listaString = null;
        }
        return listaString;
    }

}

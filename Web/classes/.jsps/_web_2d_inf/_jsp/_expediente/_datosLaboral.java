package _web_2d_inf._jsp._expediente;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _datosLaboral extends com.orionserver.http.OrionHttpJspPage {


  // ** Begin Declarations


  // ** End Declarations

  public void _jspService(HttpServletRequest request, HttpServletResponse response) throws java.io.IOException, ServletException {

    response.setContentType( "text/html");
    /* set up the intrinsic variables using the pageContext goober:
    ** session = HttpSession
    ** application = ServletContext
    ** out = JspWriter
    ** page = this
    ** config = ServletConfig
    ** all session/app beans declared in globals.jsa
    */
    PageContext pageContext = JspFactory.getDefaultFactory().getPageContext( this, request, response, null, true, JspWriter.DEFAULT_BUFFER, true);
    // Note: this is not emitted if the session directive == false
    HttpSession session = pageContext.getSession();
    int __jsp_tag_starteval;
    ServletContext application = pageContext.getServletContext();
    JspWriter out = pageContext.getOut();
    _datosLaboral page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      out.write(__oracle_jsp_text[4]);
      {
        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_1=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag text");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setText(" Datos");
        try {
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_1.doCatch(th);
        } finally {
          __jsp_taghandler_1.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
      }
      out.write(__oracle_jsp_text[5]);
      {
        org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_2=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
        __jsp_taghandler_2.setParent(null);
        __jsp_taghandler_2.setCode("usopc.jpg");
        try {
          __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
          if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_2.doCatch(th);
        } finally {
          __jsp_taghandler_2.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,1);
      }
      out.write(__oracle_jsp_text[6]);
      {
        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_3=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag text");
        __jsp_taghandler_3.setParent(null);
        __jsp_taghandler_3.setText("Laborales ");
        try {
          __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
          if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_3.doCatch(th);
        } finally {
          __jsp_taghandler_3.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,1);
      }
      out.write(__oracle_jsp_text[7]);
      {
        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_4=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
        __jsp_taghandler_4.setParent(null);
        __jsp_taghandler_4.setCode("sireh.label.expediente.idPlaza");
        try {
          __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
          if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_4.doCatch(th);
        } finally {
          __jsp_taghandler_4.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,1);
      }
      out.write(__oracle_jsp_text[8]);
      {
        _oracle._jsp._tag._label_tag __jsp_taghandler_5=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
        __jsp_taghandler_5.setJspContext(pageContext);
        __jsp_taghandler_5.setPath("idPlaza");
        __jsp_taghandler_5.doTag();
        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_5, pageContext);
      }
      out.write(__oracle_jsp_text[9]);
      {
        _oracle._jsp._tag._label_tag __jsp_taghandler_6=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
        __jsp_taghandler_6.setJspContext(pageContext);
        __jsp_taghandler_6.setPath("descSitPlaza");
        __jsp_taghandler_6.doTag();
        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_6, pageContext);
      }
      out.write(__oracle_jsp_text[10]);
      {
        _oracle._jsp._tag._label_tag __jsp_taghandler_7=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
        __jsp_taghandler_7.setJspContext(pageContext);
        __jsp_taghandler_7.setPath("descNombramientoNom");
        __jsp_taghandler_7.doTag();
        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_7, pageContext);
      }
      out.write(__oracle_jsp_text[11]);
      {
        _oracle._jsp._tag._detalleCalculoNomina_tag __jsp_taghandler_8=(_oracle._jsp._tag._detalleCalculoNomina_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._detalleCalculoNomina_tag.class, pageContext);
        __jsp_taghandler_8.setJspContext(pageContext);
        __jsp_taghandler_8.setPlaza((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteDTO.idPlaza}",java.lang.String.class, __ojsp_varRes,null));
        __jsp_taghandler_8.setName("plaza");
        __jsp_taghandler_8.setImage("detail.gif");
        __jsp_taghandler_8.doTag();
        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_8, pageContext);
      }
      out.write(__oracle_jsp_text[12]);
      {
        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_9=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
        __jsp_taghandler_9.setParent(null);
        __jsp_taghandler_9.setCode("sireh.label.expediente.uniDescNom");
        try {
          __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
          if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_9.doCatch(th);
        } finally {
          __jsp_taghandler_9.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,1);
      }
      out.write(__oracle_jsp_text[13]);
      {
        _oracle._jsp._tag._label_tag __jsp_taghandler_10=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
        __jsp_taghandler_10.setJspContext(pageContext);
        __jsp_taghandler_10.setPath("uniDescNom");
        __jsp_taghandler_10.doTag();
        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_10, pageContext);
      }
      out.write(__oracle_jsp_text[14]);
      {
        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_11=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
        __jsp_taghandler_11.setParent(null);
        __jsp_taghandler_11.setCode("sireh.label.expediente.descPuestoNom");
        try {
          __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
          if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_11.doCatch(th);
        } finally {
          __jsp_taghandler_11.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,1);
      }
      out.write(__oracle_jsp_text[15]);
      {
        _oracle._jsp._tag._label_tag __jsp_taghandler_12=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
        __jsp_taghandler_12.setJspContext(pageContext);
        __jsp_taghandler_12.setPath("descPuestoNom");
        __jsp_taghandler_12.doTag();
        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_12, pageContext);
      }
      out.write(__oracle_jsp_text[16]);
      {
        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_13=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
        __jsp_taghandler_13.setParent(null);
        __jsp_taghandler_13.setCode("sireh.label.expediente.idNivelPtoNom");
        try {
          __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
          if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_13.doCatch(th);
        } finally {
          __jsp_taghandler_13.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13,1);
      }
      out.write(__oracle_jsp_text[17]);
      {
        _oracle._jsp._tag._label_tag __jsp_taghandler_14=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
        __jsp_taghandler_14.setJspContext(pageContext);
        __jsp_taghandler_14.setPath("idNivelPtoNom");
        __jsp_taghandler_14.doTag();
        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_14, pageContext);
      }
      out.write(__oracle_jsp_text[18]);
      {
        _oracle._jsp._tag._label_tag __jsp_taghandler_15=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
        __jsp_taghandler_15.setJspContext(pageContext);
        __jsp_taghandler_15.setPath("idRangoNom");
        __jsp_taghandler_15.doTag();
        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_15, pageContext);
      }
      out.write(__oracle_jsp_text[19]);
      {
        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_16=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
        __jsp_taghandler_16.setParent(null);
        __jsp_taghandler_16.setCode("sireh.label.expediente.descGrupoPago");
        try {
          __jsp_tag_starteval=__jsp_taghandler_16.doStartTag();
          if (__jsp_taghandler_16.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_16.doCatch(th);
        } finally {
          __jsp_taghandler_16.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_16,1);
      }
      out.write(__oracle_jsp_text[20]);
      {
        _oracle._jsp._tag._label_tag __jsp_taghandler_17=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
        __jsp_taghandler_17.setJspContext(pageContext);
        __jsp_taghandler_17.setPath("descGrupoPago");
        __jsp_taghandler_17.doTag();
        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_17, pageContext);
      }
      out.write(__oracle_jsp_text[21]);
      {
        _oracle._jsp._tag._label_tag __jsp_taghandler_18=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
        __jsp_taghandler_18.setJspContext(pageContext);
        __jsp_taghandler_18.setPath("descJeraquiaNom");
        __jsp_taghandler_18.doTag();
        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_18, pageContext);
      }
      out.write(__oracle_jsp_text[22]);
      {
        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_19=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
        __jsp_taghandler_19.setParent(null);
        __jsp_taghandler_19.setCode("sireh.label.expediente.descEstadoNom");
        try {
          __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
          if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_19.doCatch(th);
        } finally {
          __jsp_taghandler_19.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19,1);
      }
      out.write(__oracle_jsp_text[23]);
      {
        _oracle._jsp._tag._label_tag __jsp_taghandler_20=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
        __jsp_taghandler_20.setJspContext(pageContext);
        __jsp_taghandler_20.setPath("descEstadoNom");
        __jsp_taghandler_20.doTag();
        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_20, pageContext);
      }
      out.write(__oracle_jsp_text[24]);
      {
        _oracle._jsp._tag._label_tag __jsp_taghandler_21=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
        __jsp_taghandler_21.setJspContext(pageContext);
        __jsp_taghandler_21.setPath("descMunicipioNom");
        __jsp_taghandler_21.doTag();
        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_21, pageContext);
      }
      out.write(__oracle_jsp_text[25]);
      {
        _oracle._jsp._tag._label_tag __jsp_taghandler_22=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
        __jsp_taghandler_22.setJspContext(pageContext);
        __jsp_taghandler_22.setPath("idZonaEcoNom");
        __jsp_taghandler_22.doTag();
        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_22, pageContext);
      }
      out.write(__oracle_jsp_text[26]);
      {
        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_23=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
        __jsp_taghandler_23.setParent(null);
        __jsp_taghandler_23.setCode("sireh.label.expediente.plazaIniCont");
        try {
          __jsp_tag_starteval=__jsp_taghandler_23.doStartTag();
          if (__jsp_taghandler_23.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_23.doCatch(th);
        } finally {
          __jsp_taghandler_23.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_23,1);
      }
      out.write(__oracle_jsp_text[27]);
      {
        _oracle._jsp._tag._label_tag __jsp_taghandler_24=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
        __jsp_taghandler_24.setJspContext(pageContext);
        __jsp_taghandler_24.setPath("plazaIniCont");
        __jsp_taghandler_24.doTag();
        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_24, pageContext);
      }
      out.write(__oracle_jsp_text[28]);
      {
        _oracle._jsp._tag._label_tag __jsp_taghandler_25=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
        __jsp_taghandler_25.setJspContext(pageContext);
        __jsp_taghandler_25.setPath("plazaFinCont");
        __jsp_taghandler_25.doTag();
        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_25, pageContext);
      }
      out.write(__oracle_jsp_text[29]);
      {
        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_26=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
        __jsp_taghandler_26.setParent(null);
        __jsp_taghandler_26.setCode("sireh.label.expediente.plazaIniLic");
        try {
          __jsp_tag_starteval=__jsp_taghandler_26.doStartTag();
          if (__jsp_taghandler_26.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_26.doCatch(th);
        } finally {
          __jsp_taghandler_26.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_26,1);
      }
      out.write(__oracle_jsp_text[30]);
      {
        _oracle._jsp._tag._label_tag __jsp_taghandler_27=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
        __jsp_taghandler_27.setJspContext(pageContext);
        __jsp_taghandler_27.setPath("plazaIniLic");
        __jsp_taghandler_27.doTag();
        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_27, pageContext);
      }
      out.write(__oracle_jsp_text[31]);
      {
        _oracle._jsp._tag._label_tag __jsp_taghandler_28=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
        __jsp_taghandler_28.setJspContext(pageContext);
        __jsp_taghandler_28.setPath("plazaFinLic");
        __jsp_taghandler_28.doTag();
        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_28, pageContext);
      }
      out.write(__oracle_jsp_text[32]);
      {
        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_29=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
        __jsp_taghandler_29.setParent(null);
        __jsp_taghandler_29.setCode("sireh.label.expediente.descMovsPersonalEmp");
        try {
          __jsp_tag_starteval=__jsp_taghandler_29.doStartTag();
          if (__jsp_taghandler_29.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_29.doCatch(th);
        } finally {
          __jsp_taghandler_29.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_29,1);
      }
      out.write(__oracle_jsp_text[33]);
      {
        _oracle._jsp._tag._label_tag __jsp_taghandler_30=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
        __jsp_taghandler_30.setJspContext(pageContext);
        __jsp_taghandler_30.setPath("descMovsPersonalEmp");
        __jsp_taghandler_30.doTag();
        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_30, pageContext);
      }
      out.write(__oracle_jsp_text[34]);
      {
        _oracle._jsp._tag._label_tag __jsp_taghandler_31=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
        __jsp_taghandler_31.setJspContext(pageContext);
        __jsp_taghandler_31.setPath("plazaUltimoMovto");
        __jsp_taghandler_31.doTag();
        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_31, pageContext);
      }
      out.write(__oracle_jsp_text[35]);
      {
        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_32=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
        __jsp_taghandler_32.setParent(null);
        __jsp_taghandler_32.setCode("sireh.label.expediente.sueldoHonLabel");
        try {
          __jsp_tag_starteval=__jsp_taghandler_32.doStartTag();
          if (__jsp_taghandler_32.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_32.doCatch(th);
        } finally {
          __jsp_taghandler_32.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_32,1);
      }
      out.write(__oracle_jsp_text[36]);
      {
        _oracle._jsp._tag._label_tag __jsp_taghandler_33=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
        __jsp_taghandler_33.setJspContext(pageContext);
        __jsp_taghandler_33.setPath("sueldoHonLabel");
        __jsp_taghandler_33.doTag();
        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_33, pageContext);
      }
      out.write(__oracle_jsp_text[37]);
      {
        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_34=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
        __jsp_taghandler_34.setParent(null);
        __jsp_taghandler_34.setCode("sireh.label.expediente.sueldoNomLabel");
        try {
          __jsp_tag_starteval=__jsp_taghandler_34.doStartTag();
          if (__jsp_taghandler_34.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_34.doCatch(th);
        } finally {
          __jsp_taghandler_34.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_34,1);
      }
      out.write(__oracle_jsp_text[38]);
      {
        _oracle._jsp._tag._label_tag __jsp_taghandler_35=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
        __jsp_taghandler_35.setJspContext(pageContext);
        __jsp_taghandler_35.setPath("sueldoNomLabel");
        __jsp_taghandler_35.doTag();
        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_35, pageContext);
      }
      out.write(__oracle_jsp_text[39]);
      {
        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_36=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
        __jsp_taghandler_36.setParent(null);
        __jsp_taghandler_36.setCode("sireh.label.expediente.compensacionNomLabel");
        try {
          __jsp_tag_starteval=__jsp_taghandler_36.doStartTag();
          if (__jsp_taghandler_36.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_36.doCatch(th);
        } finally {
          __jsp_taghandler_36.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_36,1);
      }
      out.write(__oracle_jsp_text[40]);
      {
        _oracle._jsp._tag._label_tag __jsp_taghandler_37=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
        __jsp_taghandler_37.setJspContext(pageContext);
        __jsp_taghandler_37.setPath("compensacionNomLabel");
        __jsp_taghandler_37.doTag();
        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_37, pageContext);
      }
      out.write(__oracle_jsp_text[41]);

    }
    catch (Throwable e) {
      if (!(e instanceof javax.servlet.jsp.SkipPageException)){
        try {
          if (out != null) out.clear();
        }
        catch (Exception clearException) {
        }
        pageContext.handlePageException(e);
      }
    }
    finally {
      OracleJspRuntime.extraHandlePCFinally(pageContext, true);
      JspFactory.getDefaultFactory().releasePageContext(pageContext);
    }

  }
  private static final char __oracle_jsp_text[][]=new char[42][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\r\n\r\n<table width=\"100%\">\r\n    <tr>\r\n        <td align=\"center\">\r\n            <fieldset style='border-style:outset; border-width: <c:out value=\"".toCharArray();
    __oracle_jsp_text[2] = 
    "\"/>; border-color: <c:out value=\"".toCharArray();
    __oracle_jsp_text[3] = 
    "\"/>;'>\r\n                <legend style='font-size:<c:out value=\"".toCharArray();
    __oracle_jsp_text[4] = 
    "\"/>; border-style:solid; border-color:white;  background-color:white; color:black;'>\r\n                    <strong>\r\n                    ".toCharArray();
    __oracle_jsp_text[5] = 
    "\r\n                    <img class=\"fotografia\" width=\"50\" src=\"".toCharArray();
    __oracle_jsp_text[6] = 
    "\" align=\"middle\"/>\r\n                    ".toCharArray();
    __oracle_jsp_text[7] = 
    "</strong>\r\n                </legend>\r\n                <table width=\"100%\">\r\n                    <tr> <td>&nbsp;</td> </tr>\r\n                    <tr align=\"left\">\r\n                        <td class=\"label\" width=\"250\"> ".toCharArray();
    __oracle_jsp_text[8] = 
    " </td>\r\n                        <td align=\"left\" width=\"250\">  ".toCharArray();
    __oracle_jsp_text[9] = 
    " - ".toCharArray();
    __oracle_jsp_text[10] = 
    " - ".toCharArray();
    __oracle_jsp_text[11] = 
    "&nbsp;".toCharArray();
    __oracle_jsp_text[12] = 
    " </td>\r\n                        <td class=\"label\" width=\"250\"> ".toCharArray();
    __oracle_jsp_text[13] = 
    " </td>\r\n                        <td align=\"left\" width=\"250\">  ".toCharArray();
    __oracle_jsp_text[14] = 
    " </td>\r\n                    </tr>\r\n                    <tr align=\"left\">\r\n                        <td class=\"label\" width=\"250\"> ".toCharArray();
    __oracle_jsp_text[15] = 
    " </td>\r\n                        <td align=\"left\" width=\"250\">  ".toCharArray();
    __oracle_jsp_text[16] = 
    " </td>\r\n                        <td class=\"label\" width=\"250\"> ".toCharArray();
    __oracle_jsp_text[17] = 
    " </td>\r\n                        <td align=\"left\" width=\"250\">  ".toCharArray();
    __oracle_jsp_text[18] = 
    " - ".toCharArray();
    __oracle_jsp_text[19] = 
    " </td>\r\n                    </tr>\r\n                    <tr align=\"left\">\r\n                        <td class=\"label\" width=\"250\"> ".toCharArray();
    __oracle_jsp_text[20] = 
    " </td>\r\n                        <td align=\"left\" width=\"250\">  ".toCharArray();
    __oracle_jsp_text[21] = 
    " - ".toCharArray();
    __oracle_jsp_text[22] = 
    " </td>\r\n                        <td class=\"label\" width=\"250\"> ".toCharArray();
    __oracle_jsp_text[23] = 
    " </td>\r\n                        <td align=\"left\" width=\"250\">  ".toCharArray();
    __oracle_jsp_text[24] = 
    " - ".toCharArray();
    __oracle_jsp_text[25] = 
    " - ".toCharArray();
    __oracle_jsp_text[26] = 
    " </td>\r\n                    </tr>\r\n                    <tr align=\"left\">\r\n                        <td class=\"label\" width=\"250\"> ".toCharArray();
    __oracle_jsp_text[27] = 
    " </td>\r\n                        <td align=\"left\" width=\"250\">  ".toCharArray();
    __oracle_jsp_text[28] = 
    " - ".toCharArray();
    __oracle_jsp_text[29] = 
    " </td>\r\n                        <td class=\"label\" width=\"250\"> ".toCharArray();
    __oracle_jsp_text[30] = 
    " </td>\r\n                        <td align=\"left\" width=\"250\">  ".toCharArray();
    __oracle_jsp_text[31] = 
    " - ".toCharArray();
    __oracle_jsp_text[32] = 
    " </td>\r\n                    </tr>\r\n                    <tr align=\"left\">\r\n                        <td class=\"label\" width=\"250\"> ".toCharArray();
    __oracle_jsp_text[33] = 
    " </td>\r\n                        <td align=\"left\" width=\"250\">  ".toCharArray();
    __oracle_jsp_text[34] = 
    " - Vigencia: ".toCharArray();
    __oracle_jsp_text[35] = 
    " </td>\r\n                        <td class=\"label\" width=\"250\"> ".toCharArray();
    __oracle_jsp_text[36] = 
    " </td>\r\n                        <td align=\"left\" width=\"250\">  ".toCharArray();
    __oracle_jsp_text[37] = 
    " </td>\r\n                    </tr>\r\n                    <tr align=\"left\">\r\n                        <td class=\"label\" width=\"250\"> ".toCharArray();
    __oracle_jsp_text[38] = 
    " </td>\r\n                        <td align=\"left\" width=\"250\">  ".toCharArray();
    __oracle_jsp_text[39] = 
    " </td>\r\n                        <td class=\"label\" width=\"250\"> ".toCharArray();
    __oracle_jsp_text[40] = 
    " </td>\r\n                        <td align=\"left\" width=\"250\">  ".toCharArray();
    __oracle_jsp_text[41] = 
    " </td>\r\n                    </tr>\r\n                    <tr> <td>&nbsp;</td> </tr>\r\n                </table>\r\n            </fieldset>\r\n        </td>\r\n    </tr>\r\n    <tr> <td>&nbsp;</td> </tr>\r\n</table>\r\n<br/>".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}

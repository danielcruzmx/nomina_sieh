package _web_2d_inf._jsp._expediente._consultas;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _datosGenerales extends com.orionserver.http.OrionHttpJspPage {


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
    _datosGenerales page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      {
        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_1=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteDTO.gruesolinea}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
      }
      out.write(__oracle_jsp_text[3]);
      {
        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_2=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
        __jsp_taghandler_2.setParent(null);
        __jsp_taghandler_2.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteDTO.colormarco}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
        if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,1);
      }
      out.write(__oracle_jsp_text[4]);
      {
        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_3=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
        __jsp_taghandler_3.setParent(null);
        __jsp_taghandler_3.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteDTO.gruesoletra}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
        if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,1);
      }
      out.write(__oracle_jsp_text[5]);
      {
        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_4=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag text");
        __jsp_taghandler_4.setParent(null);
        __jsp_taghandler_4.setText(" Datos ");
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
      out.write(__oracle_jsp_text[6]);
      {
        org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_5=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
        __jsp_taghandler_5.setParent(null);
        __jsp_taghandler_5.setCode("persona.jpg");
        try {
          __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
          if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_5.doCatch(th);
        } finally {
          __jsp_taghandler_5.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,1);
      }
      out.write(__oracle_jsp_text[7]);
      {
        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_6=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag text");
        __jsp_taghandler_6.setParent(null);
        __jsp_taghandler_6.setText("Generales ");
        try {
          __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
          if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_6.doCatch(th);
        } finally {
          __jsp_taghandler_6.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,1);
      }
      out.write(__oracle_jsp_text[8]);
      {
        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_7=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
        __jsp_taghandler_7.setParent(null);
        __jsp_taghandler_7.setCode("sireh.label.expediente.rfcEmpleado");
        try {
          __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
          if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_7.doCatch(th);
        } finally {
          __jsp_taghandler_7.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,1);
      }
      out.write(__oracle_jsp_text[9]);
      {
        _oracle._jsp._tag._label_tag __jsp_taghandler_8=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
        __jsp_taghandler_8.setJspContext(pageContext);
        __jsp_taghandler_8.setPath("rfcEmpleado");
        __jsp_taghandler_8.doTag();
        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_8, pageContext);
      }
      out.write(__oracle_jsp_text[10]);
      {
        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_9=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
        __jsp_taghandler_9.setParent(null);
        __jsp_taghandler_9.setCode("sireh.label.expediente.curpEmpleado");
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
      out.write(__oracle_jsp_text[11]);
      {
        _oracle._jsp._tag._label_tag __jsp_taghandler_10=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
        __jsp_taghandler_10.setJspContext(pageContext);
        __jsp_taghandler_10.setPath("curpEmpleado");
        __jsp_taghandler_10.doTag();
        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_10, pageContext);
      }
      out.write(__oracle_jsp_text[12]);
      {
        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_11=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
        __jsp_taghandler_11.setParent(null);
        __jsp_taghandler_11.setCode("sireh.label.expediente.ingresoGobFed");
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
      out.write(__oracle_jsp_text[13]);
      {
        _oracle._jsp._tag._label_tag __jsp_taghandler_12=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
        __jsp_taghandler_12.setJspContext(pageContext);
        __jsp_taghandler_12.setPath("ingresoGobFed");
        __jsp_taghandler_12.doTag();
        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_12, pageContext);
      }
      out.write(__oracle_jsp_text[14]);
      {
        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_13=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
        __jsp_taghandler_13.setParent(null);
        __jsp_taghandler_13.setCode("sireh.label.expediente.ingresoDependencia");
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
      out.write(__oracle_jsp_text[15]);
      {
        _oracle._jsp._tag._label_tag __jsp_taghandler_14=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
        __jsp_taghandler_14.setJspContext(pageContext);
        __jsp_taghandler_14.setPath("ingresoDependencia");
        __jsp_taghandler_14.doTag();
        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_14, pageContext);
      }
      out.write(__oracle_jsp_text[16]);
      {
        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_15=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
        __jsp_taghandler_15.setParent(null);
        __jsp_taghandler_15.setCode("sireh.label.expediente.fecIngSpc");
        try {
          __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
          if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_15.doCatch(th);
        } finally {
          __jsp_taghandler_15.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15,1);
      }
      out.write(__oracle_jsp_text[17]);
      {
        _oracle._jsp._tag._label_tag __jsp_taghandler_16=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
        __jsp_taghandler_16.setJspContext(pageContext);
        __jsp_taghandler_16.setPath("fecIngSpc");
        __jsp_taghandler_16.doTag();
        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_16, pageContext);
      }
      out.write(__oracle_jsp_text[18]);
      {
        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_17=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
        __jsp_taghandler_17.setParent(null);
        __jsp_taghandler_17.setCode("sireh.label.expediente.fecIniDeclPatr");
        try {
          __jsp_tag_starteval=__jsp_taghandler_17.doStartTag();
          if (__jsp_taghandler_17.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_17.doCatch(th);
        } finally {
          __jsp_taghandler_17.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_17,1);
      }
      out.write(__oracle_jsp_text[19]);
      {
        _oracle._jsp._tag._label_tag __jsp_taghandler_18=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
        __jsp_taghandler_18.setJspContext(pageContext);
        __jsp_taghandler_18.setPath("fecIniDeclPatr");
        __jsp_taghandler_18.doTag();
        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_18, pageContext);
      }
      out.write(__oracle_jsp_text[20]);

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
  private static final char __oracle_jsp_text[][]=new char[21][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\r\n<table width=\"100%\">\r\n    <tr>\r\n        <td align=\"center\">\r\n            <fieldset style='border-style:outset; border-width: ".toCharArray();
    __oracle_jsp_text[3] = 
    "; border-color: ".toCharArray();
    __oracle_jsp_text[4] = 
    ";'>\r\n                <legend style='font-size:".toCharArray();
    __oracle_jsp_text[5] = 
    "; border-style:solid; border-color:white;  background-color:white; color:black;'>\r\n                    <strong>\r\n                        ".toCharArray();
    __oracle_jsp_text[6] = 
    "\r\n                        <img class=\"fotografia\" width=\"40\" src='".toCharArray();
    __oracle_jsp_text[7] = 
    "' align=\"middle\"/>\r\n                        ".toCharArray();
    __oracle_jsp_text[8] = 
    "\r\n                         </strong>\r\n                </legend>\r\n                <table width=\"100%\">\r\n                    <tr>\r\n                        <td class=\"label\" width=\"250\">\r\n                            ".toCharArray();
    __oracle_jsp_text[9] = 
    "\r\n                        </td>\r\n                        <td align=\"left\" width=\"250\"> \r\n                            ".toCharArray();
    __oracle_jsp_text[10] = 
    "\r\n                        </td>\r\n                        <td class=\"label\" width=\"250\">\r\n                            ".toCharArray();
    __oracle_jsp_text[11] = 
    "\r\n                        </td>\r\n                        <td align=\"left\" width=\"250\"> \r\n                            ".toCharArray();
    __oracle_jsp_text[12] = 
    "\r\n                        </td>\r\n                    </tr>\r\n                    <tr align=\"left\">\r\n                        <td class=\"label\" width=\"250\">\r\n                            ".toCharArray();
    __oracle_jsp_text[13] = 
    "\r\n                        </td>\r\n                        <td align=\"left\" width=\"250\">\r\n                            ".toCharArray();
    __oracle_jsp_text[14] = 
    "\r\n                        </td>\r\n                        <td class=\"label\" width=\"250\">\r\n                            ".toCharArray();
    __oracle_jsp_text[15] = 
    "\r\n                        </td>\r\n                        <td align=\"left\" width=\"250\">\r\n                            ".toCharArray();
    __oracle_jsp_text[16] = 
    "\r\n                        </td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td class=\"label\" width=\"250\">\r\n                            ".toCharArray();
    __oracle_jsp_text[17] = 
    "\r\n                        </td>\r\n                        <td align=\"left\" width=\"250\">\r\n                            ".toCharArray();
    __oracle_jsp_text[18] = 
    "\r\n                        </td>\r\n                        <td class=\"label\" width=\"250\">\r\n                            ".toCharArray();
    __oracle_jsp_text[19] = 
    "\r\n                        </td>\r\n                        <td align=\"left\" width=\"250\">\r\n                            ".toCharArray();
    __oracle_jsp_text[20] = 
    "\r\n                        </td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td>&nbsp;</td>\r\n                    </tr>\r\n                </table>\r\n            </fieldset>\r\n        </td>\r\n    </tr>\r\n    <tr>\r\n        <td>&nbsp;</td>\r\n    </tr>\r\n</table>\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}

package _web_2d_inf._jsp._expediente;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _organigrama extends com.orionserver.http.OrionHttpJspPage {


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
    _organigrama page = this;
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
        __jsp_taghandler_1.setText("Estructura");
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
        __jsp_taghandler_2.setCode("organigrama.jpg");
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
        __jsp_taghandler_3.setText("B&aacute;sica ");
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
      out.write(__oracle_jsp_text[8]);
      out.write(__oracle_jsp_text[9]);
      out.write(__oracle_jsp_text[10]);
      {
        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_4=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag text");
        __jsp_taghandler_4.setParent(null);
        __jsp_taghandler_4.setText(" Puesto y Ubicaci&oacute;n ");
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
      out.write(__oracle_jsp_text[11]);
      {
        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_5=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
        __jsp_taghandler_5.setParent(null);
        __jsp_taghandler_5.setCode("sireh.label.expediente.escTipoPlaza");
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
      out.write(__oracle_jsp_text[12]);
      {
        _oracle._jsp._tag._label_tag __jsp_taghandler_6=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
        __jsp_taghandler_6.setJspContext(pageContext);
        __jsp_taghandler_6.setPath("descTipoPlaza");
        __jsp_taghandler_6.doTag();
        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_6, pageContext);
      }
      out.write(__oracle_jsp_text[13]);
      {
        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_7=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
        __jsp_taghandler_7.setParent(null);
        __jsp_taghandler_7.setCode("sireh.label.expediente.descTipoServPub");
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
      out.write(__oracle_jsp_text[14]);
      {
        _oracle._jsp._tag._label_tag __jsp_taghandler_8=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
        __jsp_taghandler_8.setJspContext(pageContext);
        __jsp_taghandler_8.setPath("descTipoServPub");
        __jsp_taghandler_8.doTag();
        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_8, pageContext);
      }
      out.write(__oracle_jsp_text[15]);
      {
        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_9=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
        __jsp_taghandler_9.setParent(null);
        __jsp_taghandler_9.setCode("sireh.label.expediente.nombrePuesto");
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
      out.write(__oracle_jsp_text[16]);
      {
        _oracle._jsp._tag._label_tag __jsp_taghandler_10=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
        __jsp_taghandler_10.setJspContext(pageContext);
        __jsp_taghandler_10.setPath("codigoPuesto");
        __jsp_taghandler_10.doTag();
        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_10, pageContext);
      }
      out.write(__oracle_jsp_text[17]);
      {
        _oracle._jsp._tag._label_tag __jsp_taghandler_11=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
        __jsp_taghandler_11.setJspContext(pageContext);
        __jsp_taghandler_11.setPath("nombrePuesto");
        __jsp_taghandler_11.doTag();
        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_11, pageContext);
      }
      out.write(__oracle_jsp_text[18]);
      {
        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_12=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
        __jsp_taghandler_12.setParent(null);
        __jsp_taghandler_12.setCode("sireh.label.expediente.idInmueble");
        try {
          __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
          if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_12.doCatch(th);
        } finally {
          __jsp_taghandler_12.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,1);
      }
      out.write(__oracle_jsp_text[19]);
      {
        _oracle._jsp._tag._label_tag __jsp_taghandler_13=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
        __jsp_taghandler_13.setJspContext(pageContext);
        __jsp_taghandler_13.setPath("idInmueble");
        __jsp_taghandler_13.doTag();
        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_13, pageContext);
      }
      out.write(__oracle_jsp_text[20]);
      {
        _oracle._jsp._tag._label_tag __jsp_taghandler_14=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
        __jsp_taghandler_14.setJspContext(pageContext);
        __jsp_taghandler_14.setPath("descInmueble");
        __jsp_taghandler_14.doTag();
        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_14, pageContext);
      }
      out.write(__oracle_jsp_text[21]);
      out.write(__oracle_jsp_text[22]);
      out.write(__oracle_jsp_text[23]);
      out.write(__oracle_jsp_text[24]);
      {
        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_15=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag text");
        __jsp_taghandler_15.setParent(null);
        __jsp_taghandler_15.setText(" Superior Jer&aacute;rquico ");
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
      out.write(__oracle_jsp_text[25]);
      {
        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_16=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
        __jsp_taghandler_16.setParent(null);
        __jsp_taghandler_16.setCode("sireh.label.expediente.nombreJefe");
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
      out.write(__oracle_jsp_text[26]);
      {
        _oracle._jsp._tag._label_tag __jsp_taghandler_17=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
        __jsp_taghandler_17.setJspContext(pageContext);
        __jsp_taghandler_17.setPath("nombreJefe");
        __jsp_taghandler_17.doTag();
        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_17, pageContext);
      }
      out.write(__oracle_jsp_text[27]);
      {
        _oracle._jsp._tag._label_tag __jsp_taghandler_18=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
        __jsp_taghandler_18.setJspContext(pageContext);
        __jsp_taghandler_18.setPath("nombrePuestoJefe");
        __jsp_taghandler_18.doTag();
        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_18, pageContext);
      }
      out.write(__oracle_jsp_text[28]);
      {
        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_19=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
        __jsp_taghandler_19.setParent(null);
        __jsp_taghandler_19.setCode("sireh.label.expediente.idInmueble");
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
      out.write(__oracle_jsp_text[29]);
      {
        _oracle._jsp._tag._label_tag __jsp_taghandler_20=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
        __jsp_taghandler_20.setJspContext(pageContext);
        __jsp_taghandler_20.setPath("idInmuebleJefe");
        __jsp_taghandler_20.doTag();
        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_20, pageContext);
      }
      out.write(__oracle_jsp_text[30]);
      {
        _oracle._jsp._tag._label_tag __jsp_taghandler_21=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
        __jsp_taghandler_21.setJspContext(pageContext);
        __jsp_taghandler_21.setPath("descInmuebleJefe");
        __jsp_taghandler_21.doTag();
        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_21, pageContext);
      }
      out.write(__oracle_jsp_text[31]);

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
  private static final char __oracle_jsp_text[][]=new char[32][];
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
    "\"/>; border-style:solid; border-color:white;  background-color:white; color:black;'>\r\n                    <strong>\r\n                        ".toCharArray();
    __oracle_jsp_text[5] = 
    "\r\n                        <img class=\"fotografia\" width=\"65\" src=\"".toCharArray();
    __oracle_jsp_text[6] = 
    "\" align=\"middle\"/>\r\n                        ".toCharArray();
    __oracle_jsp_text[7] = 
    "\r\n                    </strong>\r\n                </legend>\r\n                <table>\r\n                     <tr>\r\n                        <td>\r\n                            <fieldset style='border-style:outset; border-width: <c:out value=\"".toCharArray();
    __oracle_jsp_text[8] = 
    "\"/>; border-color: <c:out value=\"".toCharArray();
    __oracle_jsp_text[9] = 
    "\"/>;'>\r\n                                <legend style='font-size:<c:out value=\"".toCharArray();
    __oracle_jsp_text[10] = 
    "\"/>; border-style:solid; border-color:white;  background-color:white; color:black;'>\r\n                                    <strong>".toCharArray();
    __oracle_jsp_text[11] = 
    "</strong>\r\n                                </legend>\r\n                                <table width=\"100%\">\r\n                                    <tr> <td>&nbsp;</td> </tr>\r\n                                    <tr align=\"left\">\r\n                                        <td class=\"label\"> ".toCharArray();
    __oracle_jsp_text[12] = 
    " </td>\r\n                                        <td align=\"left\">  ".toCharArray();
    __oracle_jsp_text[13] = 
    " </td>\r\n                                    </tr>\r\n                                    <tr align=\"left\">\r\n                                        <td class=\"label\"> ".toCharArray();
    __oracle_jsp_text[14] = 
    " </td>\r\n                                        <td align=\"left\">  ".toCharArray();
    __oracle_jsp_text[15] = 
    " </td>\r\n                                    </tr>\r\n                                    <tr align=\"left\">\r\n                                        <td class=\"label\"> ".toCharArray();
    __oracle_jsp_text[16] = 
    " </td>\r\n                                        <td align=\"left\">  ".toCharArray();
    __oracle_jsp_text[17] = 
    " - ".toCharArray();
    __oracle_jsp_text[18] = 
    " </td>\r\n                                    </tr> \r\n                                    <tr align=\"left\">\r\n                                        <td class=\"label\"> ".toCharArray();
    __oracle_jsp_text[19] = 
    " </td>\r\n                                        <td align=\"left\">  ".toCharArray();
    __oracle_jsp_text[20] = 
    " - ".toCharArray();
    __oracle_jsp_text[21] = 
    " </td>\r\n                                    </tr>\r\n                                    <tr> <td>&nbsp;</td> </tr>\r\n                                </table>\r\n                            </fieldset>\r\n                        </td>\r\n                    </tr>\r\n                    <tr> <td>&nbsp;</td> </tr>\r\n                    <tr>\r\n                        <td>\r\n                            <fieldset style='border-style:outset; border-width: <c:out value=\"".toCharArray();
    __oracle_jsp_text[22] = 
    "\"/>; border-color: <c:out value=\"".toCharArray();
    __oracle_jsp_text[23] = 
    "\"/>;'>\r\n                                <legend style='font-size:<c:out value=\"".toCharArray();
    __oracle_jsp_text[24] = 
    "\"/>; border-style:solid; border-color:white;  background-color:white; color:black;'>\r\n                                    <strong>".toCharArray();
    __oracle_jsp_text[25] = 
    "</strong>\r\n                                </legend>\r\n                                <table width=\"100%\">\r\n                                    <tr> <td>&nbsp;</td> </tr>\r\n                                    <tr align=\"left\">\r\n                                        <td class=\"label\"> ".toCharArray();
    __oracle_jsp_text[26] = 
    " </td>\r\n                                        <td align=\"left\">  ".toCharArray();
    __oracle_jsp_text[27] = 
    " - ".toCharArray();
    __oracle_jsp_text[28] = 
    " </td>\r\n                                    </tr>\r\n                                    <tr align=\"left\">\r\n                                        <td class=\"label\"> ".toCharArray();
    __oracle_jsp_text[29] = 
    " </td>\r\n                                        <td align=\"left\">  ".toCharArray();
    __oracle_jsp_text[30] = 
    " - ".toCharArray();
    __oracle_jsp_text[31] = 
    " </td>\r\n                                    </tr>\r\n                                    <tr> <td>&nbsp;</td> </tr>\r\n                                </table>\r\n                            </fieldset>\r\n                        </td>\r\n                    </tr>\r\n                    <tr> <td>&nbsp;</td> </tr>\r\n                </table>\r\n            </fieldset>\r\n        </td>\r\n    </tr>\r\n</table>\r\n<br/>".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}

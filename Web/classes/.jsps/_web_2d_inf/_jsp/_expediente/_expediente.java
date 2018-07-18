package _web_2d_inf._jsp._expediente;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _expediente extends com.orionserver.http.OrionHttpJspPage {


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
    _expediente page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      {
        org.springframework.web.servlet.tags.form.FormTag __jsp_taghandler_1=(org.springframework.web.servlet.tags.form.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.FormTag.class,"org.springframework.web.servlet.tags.form.FormTag modelAttribute");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setModelAttribute("expedienteDTO");
        try {
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[4]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_2=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_2.setParent(__jsp_taghandler_1);
                __jsp_taghandler_2.setCode("sireh.label.expediente.titulo");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
                  if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_2.doCatch(th);
                } finally {
                  __jsp_taghandler_2.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,2);
              }
              out.write(__oracle_jsp_text[5]);
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_3=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_3.setParent(__jsp_taghandler_1);
                __jsp_taghandler_3.setJspContext(pageContext);
                __jsp_taghandler_3.setPath("nombreEmp");
                __jsp_taghandler_3.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_3, pageContext);
              }
              out.write(__oracle_jsp_text[6]);
              {
                org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_4=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var");
                __jsp_taghandler_4.setParent(__jsp_taghandler_1);
                __jsp_taghandler_4.setVar("content1");
                __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_4,__jsp_tag_starteval,out);
                    do {
                      out.write(__oracle_jsp_text[7]);
                      {
                        String __url=OracleJspRuntime.toStr("../expediente/aviso.jsp");
                        // Include 
                        pageContext.include( __url,false);
                        if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
                      }

                      out.write(__oracle_jsp_text[8]);
                    } while (__jsp_taghandler_4.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,2);
              }
              out.write(__oracle_jsp_text[9]);
              {
                org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_5=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var");
                __jsp_taghandler_5.setParent(__jsp_taghandler_1);
                __jsp_taghandler_5.setVar("content2");
                __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_5,__jsp_tag_starteval,out);
                    do {
                      out.write(__oracle_jsp_text[10]);
                      {
                        String __url=OracleJspRuntime.toStr("../expediente/personales.jsp");
                        // Include 
                        pageContext.include( __url,false);
                        if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
                      }

                      out.write(__oracle_jsp_text[11]);
                    } while (__jsp_taghandler_5.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,2);
              }
              out.write(__oracle_jsp_text[12]);
              {
                org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_6=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var");
                __jsp_taghandler_6.setParent(__jsp_taghandler_1);
                __jsp_taghandler_6.setVar("content3");
                __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_6,__jsp_tag_starteval,out);
                    do {
                      out.write(__oracle_jsp_text[13]);
                      {
                        String __url=OracleJspRuntime.toStr("../expediente/dependientes.jsp");
                        // Include 
                        pageContext.include( __url,false);
                        if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
                      }

                      out.write(__oracle_jsp_text[14]);
                    } while (__jsp_taghandler_6.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,2);
              }
              out.write(__oracle_jsp_text[15]);
              {
                org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_7=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var");
                __jsp_taghandler_7.setParent(__jsp_taghandler_1);
                __jsp_taghandler_7.setVar("content4");
                __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_7,__jsp_tag_starteval,out);
                    do {
                      out.write(__oracle_jsp_text[16]);
                      {
                        String __url=OracleJspRuntime.toStr("../expediente/academicos.jsp");
                        // Include 
                        pageContext.include( __url,false);
                        if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
                      }

                      out.write(__oracle_jsp_text[17]);
                    } while (__jsp_taghandler_7.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,2);
              }
              out.write(__oracle_jsp_text[18]);
              {
                org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_8=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var");
                __jsp_taghandler_8.setParent(__jsp_taghandler_1);
                __jsp_taghandler_8.setVar("content5");
                __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_8,__jsp_tag_starteval,out);
                    do {
                      out.write(__oracle_jsp_text[19]);
                      {
                        String __url=OracleJspRuntime.toStr("../expediente/expLaboral.jsp");
                        // Include 
                        pageContext.include( __url,false);
                        if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
                      }

                      out.write(__oracle_jsp_text[20]);
                    } while (__jsp_taghandler_8.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,2);
              }
              out.write(__oracle_jsp_text[21]);
              {
                org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_9=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var");
                __jsp_taghandler_9.setParent(__jsp_taghandler_1);
                __jsp_taghandler_9.setVar("content6");
                __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_9,__jsp_tag_starteval,out);
                    do {
                      out.write(__oracle_jsp_text[22]);
                      {
                        String __url=OracleJspRuntime.toStr("../expediente/datosLaboral.jsp");
                        // Include 
                        pageContext.include( __url,false);
                        if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
                      }

                      out.write(__oracle_jsp_text[23]);
                    } while (__jsp_taghandler_9.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,2);
              }
              out.write(__oracle_jsp_text[24]);
              {
                org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_10=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var");
                __jsp_taghandler_10.setParent(__jsp_taghandler_1);
                __jsp_taghandler_10.setVar("content7");
                __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_10,__jsp_tag_starteval,out);
                    do {
                      out.write(__oracle_jsp_text[25]);
                      {
                        String __url=OracleJspRuntime.toStr("../expediente/organigrama.jsp");
                        // Include 
                        pageContext.include( __url,false);
                        if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
                      }

                      out.write(__oracle_jsp_text[26]);
                    } while (__jsp_taghandler_10.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,2);
              }
              out.write(__oracle_jsp_text[27]);
              {
                org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_11=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var");
                __jsp_taghandler_11.setParent(__jsp_taghandler_1);
                __jsp_taghandler_11.setVar("content8");
                __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_11,__jsp_tag_starteval,out);
                    do {
                      out.write(__oracle_jsp_text[28]);
                      {
                        String __url=OracleJspRuntime.toStr("../expediente/conceptosAdicionales.jsp");
                        // Include 
                        pageContext.include( __url,false);
                        if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
                      }

                      out.write(__oracle_jsp_text[29]);
                    } while (__jsp_taghandler_11.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,2);
              }
              out.write(__oracle_jsp_text[30]);
              {
                org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_12=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var");
                __jsp_taghandler_12.setParent(__jsp_taghandler_1);
                __jsp_taghandler_12.setVar("content9");
                __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_12,__jsp_tag_starteval,out);
                    do {
                      out.write(__oracle_jsp_text[31]);
                      {
                        String __url=OracleJspRuntime.toStr("../expediente/conceptosAdicionalesHistorico.jsp");
                        // Include 
                        pageContext.include( __url,false);
                        if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
                      }

                      out.write(__oracle_jsp_text[32]);
                    } while (__jsp_taghandler_12.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,2);
              }
              out.write(__oracle_jsp_text[33]);
              {
                org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_13=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var");
                __jsp_taghandler_13.setParent(__jsp_taghandler_1);
                __jsp_taghandler_13.setVar("content10");
                __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_13,__jsp_tag_starteval,out);
                    do {
                      out.write(__oracle_jsp_text[34]);
                      {
                        String __url=OracleJspRuntime.toStr("../expediente/trayectoriaLaboral.jsp");
                        // Include 
                        pageContext.include( __url,false);
                        if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
                      }

                      out.write(__oracle_jsp_text[35]);
                    } while (__jsp_taghandler_13.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13,2);
              }
              out.write(__oracle_jsp_text[36]);
              {
                org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_14=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var");
                __jsp_taghandler_14.setParent(__jsp_taghandler_1);
                __jsp_taghandler_14.setVar("content11");
                __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_14,__jsp_tag_starteval,out);
                    do {
                      out.write(__oracle_jsp_text[37]);
                      {
                        String __url=OracleJspRuntime.toStr("../expediente/historicoPagos.jsp");
                        // Include 
                        pageContext.include( __url,false);
                        if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
                      }

                      out.write(__oracle_jsp_text[38]);
                    } while (__jsp_taghandler_14.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14,2);
              }
              out.write(__oracle_jsp_text[39]);
              {
                org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_15=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var");
                __jsp_taghandler_15.setParent(__jsp_taghandler_1);
                __jsp_taghandler_15.setVar("content17");
                __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_15,__jsp_tag_starteval,out);
                    do {
                      out.write(__oracle_jsp_text[40]);
                      {
                        String __url=OracleJspRuntime.toStr("../expediente/timbrado.jsp");
                        // Include 
                        pageContext.include( __url,false);
                        if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
                      }

                      out.write(__oracle_jsp_text[41]);
                    } while (__jsp_taghandler_15.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15,2);
              }
              out.write(__oracle_jsp_text[42]);
              {
                org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_16=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var");
                __jsp_taghandler_16.setParent(__jsp_taghandler_1);
                __jsp_taghandler_16.setVar("content12");
                __jsp_tag_starteval=__jsp_taghandler_16.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_16,__jsp_tag_starteval,out);
                    do {
                      out.write(__oracle_jsp_text[43]);
                      {
                        String __url=OracleJspRuntime.toStr("../expediente/incidencias.jsp");
                        // Include 
                        pageContext.include( __url,false);
                        if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
                      }

                      out.write(__oracle_jsp_text[44]);
                    } while (__jsp_taghandler_16.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_16.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_16,2);
              }
              out.write(__oracle_jsp_text[45]);
              {
                org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_17=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var");
                __jsp_taghandler_17.setParent(__jsp_taghandler_1);
                __jsp_taghandler_17.setVar("content13");
                __jsp_tag_starteval=__jsp_taghandler_17.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_17,__jsp_tag_starteval,out);
                    do {
                      out.write(__oracle_jsp_text[46]);
                      {
                        String __url=OracleJspRuntime.toStr("../expediente/notasMerito.jsp");
                        // Include 
                        pageContext.include( __url,false);
                        if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
                      }

                      out.write(__oracle_jsp_text[47]);
                    } while (__jsp_taghandler_17.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_17.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_17,2);
              }
              out.write(__oracle_jsp_text[48]);
              {
                org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_18=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var");
                __jsp_taghandler_18.setParent(__jsp_taghandler_1);
                __jsp_taghandler_18.setVar("content14");
                __jsp_tag_starteval=__jsp_taghandler_18.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_18,__jsp_tag_starteval,out);
                    do {
                      out.write(__oracle_jsp_text[49]);
                      {
                        String __url=OracleJspRuntime.toStr("../expediente/cursos.jsp");
                        // Include 
                        pageContext.include( __url,false);
                        if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
                      }

                      out.write(__oracle_jsp_text[50]);
                    } while (__jsp_taghandler_18.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18,2);
              }
              out.write(__oracle_jsp_text[51]);
              {
                org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_19=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var");
                __jsp_taghandler_19.setParent(__jsp_taghandler_1);
                __jsp_taghandler_19.setVar("content15");
                __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_19,__jsp_tag_starteval,out);
                    do {
                      out.write(__oracle_jsp_text[52]);
                      {
                        String __url=OracleJspRuntime.toStr("../expediente/servicioProfCarrera.jsp");
                        // Include 
                        pageContext.include( __url,false);
                        if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
                      }

                      out.write(__oracle_jsp_text[53]);
                    } while (__jsp_taghandler_19.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19,2);
              }
              out.write(__oracle_jsp_text[54]);
              {
                org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_20=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var");
                __jsp_taghandler_20.setParent(__jsp_taghandler_1);
                __jsp_taghandler_20.setVar("content16");
                __jsp_tag_starteval=__jsp_taghandler_20.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_20,__jsp_tag_starteval,out);
                    do {
                      out.write(__oracle_jsp_text[55]);
                      {
                        String __url=OracleJspRuntime.toStr("../expediente/docElectronica.jsp");
                        // Include 
                        pageContext.include( __url,false);
                        if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
                      }

                      out.write(__oracle_jsp_text[56]);
                    } while (__jsp_taghandler_20.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_20.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_20,2);
              }
              out.write(__oracle_jsp_text[57]);
              {
                _oracle._jsp._tag._container_tag __jsp_taghandler_21=(_oracle._jsp._tag._container_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._container_tag.class, pageContext);
                __jsp_taghandler_21.setParent(__jsp_taghandler_1);
                __jsp_taghandler_21.setJspContext(pageContext);
                __jsp_taghandler_21.setSection("init");
                __jsp_taghandler_21.setType("tab");
                __jsp_taghandler_21.setTabHeight("35");
                __jsp_taghandler_21.setDisplayTime("10");
                __jsp_taghandler_21.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_21, pageContext);
              }
              out.write(__oracle_jsp_text[58]);
              {
                _oracle._jsp._tag._container_tag __jsp_taghandler_22=(_oracle._jsp._tag._container_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._container_tag.class, pageContext);
                __jsp_taghandler_22.setParent(__jsp_taghandler_1);
                __jsp_taghandler_22.setJspContext(pageContext);
                __jsp_taghandler_22.setTitle("Leyenda de Confidencialidad");
                __jsp_taghandler_22.setName("divContent1");
                __jsp_taghandler_22.setContent((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${content1}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_22.setSelected("true");
                __jsp_taghandler_22.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_22, pageContext);
              }
              out.write(__oracle_jsp_text[59]);
              {
                _oracle._jsp._tag._container_tag __jsp_taghandler_23=(_oracle._jsp._tag._container_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._container_tag.class, pageContext);
                __jsp_taghandler_23.setParent(__jsp_taghandler_1);
                __jsp_taghandler_23.setJspContext(pageContext);
                __jsp_taghandler_23.setTitle("Datos Personales");
                __jsp_taghandler_23.setName("divContent2");
                __jsp_taghandler_23.setContent((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${content2}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_23.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_23, pageContext);
              }
              out.write(__oracle_jsp_text[60]);
              {
                _oracle._jsp._tag._container_tag __jsp_taghandler_24=(_oracle._jsp._tag._container_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._container_tag.class, pageContext);
                __jsp_taghandler_24.setParent(__jsp_taghandler_1);
                __jsp_taghandler_24.setJspContext(pageContext);
                __jsp_taghandler_24.setTitle("Familiares y/o Dependientes");
                __jsp_taghandler_24.setName("divContent3");
                __jsp_taghandler_24.setContent((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${content3}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_24.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_24, pageContext);
              }
              out.write(__oracle_jsp_text[61]);
              {
                _oracle._jsp._tag._container_tag __jsp_taghandler_25=(_oracle._jsp._tag._container_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._container_tag.class, pageContext);
                __jsp_taghandler_25.setParent(__jsp_taghandler_1);
                __jsp_taghandler_25.setJspContext(pageContext);
                __jsp_taghandler_25.setTitle("Antecedentes Acad&eacute;micos");
                __jsp_taghandler_25.setName("divContent4");
                __jsp_taghandler_25.setContent((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${content4}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_25.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_25, pageContext);
              }
              out.write(__oracle_jsp_text[62]);
              {
                _oracle._jsp._tag._container_tag __jsp_taghandler_26=(_oracle._jsp._tag._container_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._container_tag.class, pageContext);
                __jsp_taghandler_26.setParent(__jsp_taghandler_1);
                __jsp_taghandler_26.setJspContext(pageContext);
                __jsp_taghandler_26.setTitle("Experiencia Laboral");
                __jsp_taghandler_26.setName("divContent5");
                __jsp_taghandler_26.setContent((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${content5}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_26.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_26, pageContext);
              }
              out.write(__oracle_jsp_text[63]);
              {
                _oracle._jsp._tag._container_tag __jsp_taghandler_27=(_oracle._jsp._tag._container_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._container_tag.class, pageContext);
                __jsp_taghandler_27.setParent(__jsp_taghandler_1);
                __jsp_taghandler_27.setJspContext(pageContext);
                __jsp_taghandler_27.setTitle("Datos Laborales");
                __jsp_taghandler_27.setName("divContent6");
                __jsp_taghandler_27.setContent((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${content6}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_27.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_27, pageContext);
              }
              out.write(__oracle_jsp_text[64]);
              {
                _oracle._jsp._tag._container_tag __jsp_taghandler_28=(_oracle._jsp._tag._container_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._container_tag.class, pageContext);
                __jsp_taghandler_28.setParent(__jsp_taghandler_1);
                __jsp_taghandler_28.setJspContext(pageContext);
                __jsp_taghandler_28.setTitle("Estructura B&aacute;sica");
                __jsp_taghandler_28.setName("divContent7");
                __jsp_taghandler_28.setContent((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${content7}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_28.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_28, pageContext);
              }
              out.write(__oracle_jsp_text[65]);
              {
                _oracle._jsp._tag._container_tag __jsp_taghandler_29=(_oracle._jsp._tag._container_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._container_tag.class, pageContext);
                __jsp_taghandler_29.setParent(__jsp_taghandler_1);
                __jsp_taghandler_29.setJspContext(pageContext);
                __jsp_taghandler_29.setTitle("Conceptos de N&oacute;mina Adics Vigentes");
                __jsp_taghandler_29.setName("divContent8");
                __jsp_taghandler_29.setContent((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${content8}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_29.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_29, pageContext);
              }
              out.write(__oracle_jsp_text[66]);
              {
                _oracle._jsp._tag._container_tag __jsp_taghandler_30=(_oracle._jsp._tag._container_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._container_tag.class, pageContext);
                __jsp_taghandler_30.setParent(__jsp_taghandler_1);
                __jsp_taghandler_30.setJspContext(pageContext);
                __jsp_taghandler_30.setTitle("Conceptos de N&oacute;mina Adics Hist&oacute;ricos");
                __jsp_taghandler_30.setName("divContent9");
                __jsp_taghandler_30.setContent((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${content9}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_30.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_30, pageContext);
              }
              out.write(__oracle_jsp_text[67]);
              {
                _oracle._jsp._tag._container_tag __jsp_taghandler_31=(_oracle._jsp._tag._container_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._container_tag.class, pageContext);
                __jsp_taghandler_31.setParent(__jsp_taghandler_1);
                __jsp_taghandler_31.setJspContext(pageContext);
                __jsp_taghandler_31.setTitle("Trayectoria Laboral");
                __jsp_taghandler_31.setName("divContent10");
                __jsp_taghandler_31.setContent((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${content10}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_31.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_31, pageContext);
              }
              out.write(__oracle_jsp_text[68]);
              {
                _oracle._jsp._tag._container_tag __jsp_taghandler_32=(_oracle._jsp._tag._container_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._container_tag.class, pageContext);
                __jsp_taghandler_32.setParent(__jsp_taghandler_1);
                __jsp_taghandler_32.setJspContext(pageContext);
                __jsp_taghandler_32.setTitle("Hist&oacute;rico de Pagos");
                __jsp_taghandler_32.setName("divContent11");
                __jsp_taghandler_32.setContent((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${content11}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_32.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_32, pageContext);
              }
              out.write(__oracle_jsp_text[69]);
              {
                _oracle._jsp._tag._container_tag __jsp_taghandler_33=(_oracle._jsp._tag._container_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._container_tag.class, pageContext);
                __jsp_taghandler_33.setParent(__jsp_taghandler_1);
                __jsp_taghandler_33.setJspContext(pageContext);
                __jsp_taghandler_33.setTitle("Comprobantes de pago CFDI");
                __jsp_taghandler_33.setName("divContent17");
                __jsp_taghandler_33.setContent((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${content17}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_33.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_33, pageContext);
              }
              out.write(__oracle_jsp_text[70]);
              {
                _oracle._jsp._tag._container_tag __jsp_taghandler_34=(_oracle._jsp._tag._container_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._container_tag.class, pageContext);
                __jsp_taghandler_34.setParent(__jsp_taghandler_1);
                __jsp_taghandler_34.setJspContext(pageContext);
                __jsp_taghandler_34.setTitle("Incidencias Laborales");
                __jsp_taghandler_34.setName("divContent12");
                __jsp_taghandler_34.setContent((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${content12}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_34.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_34, pageContext);
              }
              out.write(__oracle_jsp_text[71]);
              {
                _oracle._jsp._tag._container_tag __jsp_taghandler_35=(_oracle._jsp._tag._container_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._container_tag.class, pageContext);
                __jsp_taghandler_35.setParent(__jsp_taghandler_1);
                __jsp_taghandler_35.setJspContext(pageContext);
                __jsp_taghandler_35.setTitle("Notas de M&eacute;rito");
                __jsp_taghandler_35.setName("divContent13");
                __jsp_taghandler_35.setContent((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${content13}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_35.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_35, pageContext);
              }
              out.write(__oracle_jsp_text[72]);
              {
                _oracle._jsp._tag._container_tag __jsp_taghandler_36=(_oracle._jsp._tag._container_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._container_tag.class, pageContext);
                __jsp_taghandler_36.setParent(__jsp_taghandler_1);
                __jsp_taghandler_36.setJspContext(pageContext);
                __jsp_taghandler_36.setTitle("Capacitaci&oacute;n y Cursos");
                __jsp_taghandler_36.setName("divContent14");
                __jsp_taghandler_36.setContent((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${content14}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_36.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_36, pageContext);
              }
              out.write(__oracle_jsp_text[73]);
              {
                _oracle._jsp._tag._container_tag __jsp_taghandler_37=(_oracle._jsp._tag._container_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._container_tag.class, pageContext);
                __jsp_taghandler_37.setParent(__jsp_taghandler_1);
                __jsp_taghandler_37.setJspContext(pageContext);
                __jsp_taghandler_37.setTitle("Servicio Profesional de Carrera");
                __jsp_taghandler_37.setName("divContent15");
                __jsp_taghandler_37.setContent((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${content15}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_37.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_37, pageContext);
              }
              out.write(__oracle_jsp_text[74]);
              {
                _oracle._jsp._tag._container_tag __jsp_taghandler_38=(_oracle._jsp._tag._container_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._container_tag.class, pageContext);
                __jsp_taghandler_38.setParent(__jsp_taghandler_1);
                __jsp_taghandler_38.setJspContext(pageContext);
                __jsp_taghandler_38.setTitle("Documentaci&oacute;n Electr&oacute;nica");
                __jsp_taghandler_38.setName("divContent16");
                __jsp_taghandler_38.setContent((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${content16}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_38.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_38, pageContext);
              }
              out.write(__oracle_jsp_text[75]);
              {
                _oracle._jsp._tag._container_tag __jsp_taghandler_39=(_oracle._jsp._tag._container_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._container_tag.class, pageContext);
                __jsp_taghandler_39.setParent(__jsp_taghandler_1);
                __jsp_taghandler_39.setJspContext(pageContext);
                __jsp_taghandler_39.setSection("final");
                __jsp_taghandler_39.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_39, pageContext);
              }
              out.write(__oracle_jsp_text[76]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_40=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_40.setParent(__jsp_taghandler_1);
                __jsp_taghandler_40.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${!expedienteDTO.filtradoPorRfc}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_40.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[77]);
                    {
                      _oracle._jsp._tag._submit_tag __jsp_taghandler_41=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                      __jsp_taghandler_41.setParent(__jsp_taghandler_40);
                      __jsp_taghandler_41.setJspContext(pageContext);
                      __jsp_taghandler_41.setPath("cancel");
                      __jsp_taghandler_41.setAction((java.lang.String) ("expediente/"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteDTO.urlOrigen}",java.lang.String.class, __ojsp_varRes, null)));
                      __jsp_taghandler_41.setValue("submit.cancel");
                      __jsp_taghandler_41.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_41, pageContext);
                    }
                    out.write(__oracle_jsp_text[78]);
                  } while (__jsp_taghandler_40.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_40.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_40,2);
              }
              out.write(__oracle_jsp_text[79]);
            } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_1.doCatch(th);
        } finally {
          __jsp_taghandler_1.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
      }

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
  private static final char __oracle_jsp_text[][]=new char[80][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[3] = 
    "\r\n\r\n".toCharArray();
    __oracle_jsp_text[4] = 
    "\r\n    <table width=\"100%\">\r\n        <tr align=\"left\">\r\n            <td> <h1> ".toCharArray();
    __oracle_jsp_text[5] = 
    " ".toCharArray();
    __oracle_jsp_text[6] = 
    "</h1> </td>\r\n        </tr>\r\n        <tr align=\"center\">\r\n            <td>\r\n                ".toCharArray();
    __oracle_jsp_text[7] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[8] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[9] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[10] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[11] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[12] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[13] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[14] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[15] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[16] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[17] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[18] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[19] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[20] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[21] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[22] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[23] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[24] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[25] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[26] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[27] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[28] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[29] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[30] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[31] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[32] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[33] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[34] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[35] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[36] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[37] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[38] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[39] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[40] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[41] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[42] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[43] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[44] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[45] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[46] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[47] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[48] = 
    "        \r\n                ".toCharArray();
    __oracle_jsp_text[49] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[50] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[51] = 
    "    \r\n                ".toCharArray();
    __oracle_jsp_text[52] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[53] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[54] = 
    "    \r\n                ".toCharArray();
    __oracle_jsp_text[55] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[56] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[57] = 
    "\r\n                \r\n                ".toCharArray();
    __oracle_jsp_text[58] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[59] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[60] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[61] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[62] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[63] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[64] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[65] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[66] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[67] = 
    "                    \r\n                    ".toCharArray();
    __oracle_jsp_text[68] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[69] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[70] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[71] = 
    "   \r\n                    ".toCharArray();
    __oracle_jsp_text[72] = 
    "   \r\n                    ".toCharArray();
    __oracle_jsp_text[73] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[74] = 
    "                                 \r\n                    ".toCharArray();
    __oracle_jsp_text[75] = 
    "                    \r\n                ".toCharArray();
    __oracle_jsp_text[76] = 
    "\r\n            </td>\r\n        </tr>\r\n        <tr align=\"center\">\r\n            <td align=\"center\">\r\n                ".toCharArray();
    __oracle_jsp_text[77] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[78] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[79] = 
    "\r\n            </td>\r\n        </tr>\r\n    </table>\r\n    \r\n    <script type=\"text/javascript\">        \r\n        function currentTab(currentDiv) { }\r\n    </script>\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}

package _web_2d_inf._jsp._nomina._calculo._calculonominaext;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _asociacionEmpleadoPlaza extends com.orionserver.http.OrionHttpJspPage {


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
    _asociacionEmpleadoPlaza page = this;
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
        __jsp_taghandler_1.setModelAttribute("asociaPlazaEmpleadoDTO");
        try {
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[4]);
              {
                org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_2=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
                __jsp_taghandler_2.setParent(__jsp_taghandler_1);
                __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[5]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_3=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_3.setParent(__jsp_taghandler_2);
                      __jsp_taghandler_3.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${asociaPlazaEmpleadoDTO.idTipoNomina eq 'EX'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[6]);
                          {
                            org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_4=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
                            __jsp_taghandler_4.setParent(__jsp_taghandler_3);
                            __jsp_taghandler_4.setVar("args");
                            __jsp_taghandler_4.setValue("Sueldos");
                            __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
                            if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,4);
                          }
                          out.write(__oracle_jsp_text[7]);
                        } while (__jsp_taghandler_3.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,3);
                    }
                    out.write(__oracle_jsp_text[8]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_5=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_5.setParent(__jsp_taghandler_2);
                      __jsp_taghandler_5.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${asociaPlazaEmpleadoDTO.idTipoNomina eq 'LA'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[9]);
                          {
                            org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_6=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
                            __jsp_taghandler_6.setParent(__jsp_taghandler_5);
                            __jsp_taghandler_6.setVar("args");
                            __jsp_taghandler_6.setValue("Laudos");
                            __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
                            if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,4);
                          }
                          out.write(__oracle_jsp_text[10]);
                        } while (__jsp_taghandler_5.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,3);
                    }
                    out.write(__oracle_jsp_text[11]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_7=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_7.setParent(__jsp_taghandler_2);
                      __jsp_taghandler_7.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${asociaPlazaEmpleadoDTO.idTipoNomina eq 'OB'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[12]);
                          {
                            org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_8=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
                            __jsp_taghandler_8.setParent(__jsp_taghandler_7);
                            __jsp_taghandler_8.setVar("args");
                            __jsp_taghandler_8.setValue("Personal de bajas");
                            __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
                            if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,4);
                          }
                          out.write(__oracle_jsp_text[13]);
                        } while (__jsp_taghandler_7.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,3);
                    }
                    out.write(__oracle_jsp_text[14]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_9=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_9.setParent(__jsp_taghandler_2);
                      __jsp_taghandler_9.setTest(false);
                      __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[15]);
                          {
                            org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_10=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
                            __jsp_taghandler_10.setParent(__jsp_taghandler_9);
                            __jsp_taghandler_10.setVar("args");
                            __jsp_taghandler_10.setValue("Vivienda");
                            __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
                            if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,4);
                          }
                          out.write(__oracle_jsp_text[16]);
                        } while (__jsp_taghandler_9.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,3);
                    }
                    out.write(__oracle_jsp_text[17]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_11=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_11.setParent(__jsp_taghandler_2);
                      __jsp_taghandler_11.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${asociaPlazaEmpleadoDTO.idTipoNomina eq 'CJ'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[18]);
                          {
                            org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_12=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
                            __jsp_taghandler_12.setParent(__jsp_taghandler_11);
                            __jsp_taghandler_12.setVar("args");
                            __jsp_taghandler_12.setValue("Diferencias");
                            __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
                            if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,4);
                          }
                          out.write(__oracle_jsp_text[19]);
                        } while (__jsp_taghandler_11.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,3);
                    }
                    out.write(__oracle_jsp_text[20]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_13=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_13.setParent(__jsp_taghandler_2);
                      __jsp_taghandler_13.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${asociaPlazaEmpleadoDTO.idTipoNomina eq 'DJ' or asociaPlazaEmpleadoDTO.idTipoNomina eq 'DE'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[21]);
                          {
                            org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_14=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
                            __jsp_taghandler_14.setParent(__jsp_taghandler_13);
                            __jsp_taghandler_14.setVar("args");
                            __jsp_taghandler_14.setValue("Devoluciones");
                            __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
                            if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14,4);
                          }
                          out.write(__oracle_jsp_text[22]);
                        } while (__jsp_taghandler_13.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13,3);
                    }
                    out.write(__oracle_jsp_text[23]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_15=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_15.setParent(__jsp_taghandler_2);
                      __jsp_taghandler_15.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${asociaPlazaEmpleadoDTO.idTipoNomina eq 'AC'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[24]);
                          {
                            org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_16=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
                            __jsp_taghandler_16.setParent(__jsp_taghandler_15);
                            __jsp_taghandler_16.setVar("args");
                            __jsp_taghandler_16.setValue("Aguinaldo de consejerias");
                            __jsp_tag_starteval=__jsp_taghandler_16.doStartTag();
                            if (__jsp_taghandler_16.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_16,4);
                          }
                          out.write(__oracle_jsp_text[25]);
                        } while (__jsp_taghandler_15.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15,3);
                    }
                    out.write(__oracle_jsp_text[26]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_17=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_17.setParent(__jsp_taghandler_2);
                      __jsp_taghandler_17.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${asociaPlazaEmpleadoDTO.idTipoNomina eq 'VA'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_17.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[27]);
                          {
                            org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_18=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
                            __jsp_taghandler_18.setParent(__jsp_taghandler_17);
                            __jsp_taghandler_18.setVar("args");
                            __jsp_taghandler_18.setValue("Vales de despensa");
                            __jsp_tag_starteval=__jsp_taghandler_18.doStartTag();
                            if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18,4);
                          }
                          out.write(__oracle_jsp_text[28]);
                        } while (__jsp_taghandler_17.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_17.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_17,3);
                    }
                    out.write(__oracle_jsp_text[29]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_19=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_19.setParent(__jsp_taghandler_2);
                      __jsp_taghandler_19.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${asociaPlazaEmpleadoDTO.idTipoNomina eq 'OD'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[30]);
                          {
                            org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_20=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
                            __jsp_taghandler_20.setParent(__jsp_taghandler_19);
                            __jsp_taghandler_20.setVar("args");
                            __jsp_taghandler_20.setValue("Ordinaria diferencias");
                            __jsp_tag_starteval=__jsp_taghandler_20.doStartTag();
                            if (__jsp_taghandler_20.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_20,4);
                          }
                          out.write(__oracle_jsp_text[31]);
                        } while (__jsp_taghandler_19.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19,3);
                    }
                    out.write(__oracle_jsp_text[32]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_21=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_21.setParent(__jsp_taghandler_2);
                      __jsp_taghandler_21.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${asociaPlazaEmpleadoDTO.idTipoNomina eq 'DB'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_21.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[33]);
                          {
                            org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_22=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
                            __jsp_taghandler_22.setParent(__jsp_taghandler_21);
                            __jsp_taghandler_22.setVar("args");
                            __jsp_taghandler_22.setValue("Diferencias baja");
                            __jsp_tag_starteval=__jsp_taghandler_22.doStartTag();
                            if (__jsp_taghandler_22.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_22,4);
                          }
                          out.write(__oracle_jsp_text[34]);
                        } while (__jsp_taghandler_21.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_21.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_21,3);
                    }
                    out.write(__oracle_jsp_text[35]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_23=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_23.setParent(__jsp_taghandler_2);
                      __jsp_taghandler_23.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${asociaPlazaEmpleadoDTO.idTipoNomina eq 'AG'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_23.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[36]);
                          {
                            org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_24=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
                            __jsp_taghandler_24.setParent(__jsp_taghandler_23);
                            __jsp_taghandler_24.setVar("args");
                            __jsp_taghandler_24.setValue("Aguinaldo");
                            __jsp_tag_starteval=__jsp_taghandler_24.doStartTag();
                            if (__jsp_taghandler_24.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_24,4);
                          }
                          out.write(__oracle_jsp_text[37]);
                        } while (__jsp_taghandler_23.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_23.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_23,3);
                    }
                    out.write(__oracle_jsp_text[38]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_25=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_25.setParent(__jsp_taghandler_2);
                      __jsp_taghandler_25.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${asociaPlazaEmpleadoDTO.idTipoNomina eq 'FO'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_25.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[39]);
                          {
                            org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_26=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
                            __jsp_taghandler_26.setParent(__jsp_taghandler_25);
                            __jsp_taghandler_26.setVar("args");
                            __jsp_taghandler_26.setValue("Fin de ciclo");
                            __jsp_tag_starteval=__jsp_taghandler_26.doStartTag();
                            if (__jsp_taghandler_26.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_26,4);
                          }
                          out.write(__oracle_jsp_text[40]);
                        } while (__jsp_taghandler_25.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_25.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_25,3);
                    }
                    out.write(__oracle_jsp_text[41]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_27=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_27.setParent(__jsp_taghandler_2);
                      __jsp_taghandler_27.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${asociaPlazaEmpleadoDTO.idTipoNomina eq 'FE'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_27.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[42]);
                          {
                            org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_28=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
                            __jsp_taghandler_28.setParent(__jsp_taghandler_27);
                            __jsp_taghandler_28.setVar("args");
                            __jsp_taghandler_28.setValue("Liquidaci&oacute;n anticipada");
                            __jsp_tag_starteval=__jsp_taghandler_28.doStartTag();
                            if (__jsp_taghandler_28.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_28,4);
                          }
                          out.write(__oracle_jsp_text[43]);
                        } while (__jsp_taghandler_27.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_27.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_27,3);
                    }
                    out.write(__oracle_jsp_text[44]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_29=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_29.setParent(__jsp_taghandler_2);
                      __jsp_taghandler_29.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${asociaPlazaEmpleadoDTO.idTipoNomina eq 'EXR'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_29.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[45]);
                          {
                            org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_30=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
                            __jsp_taghandler_30.setParent(__jsp_taghandler_29);
                            __jsp_taghandler_30.setVar("args");
                            __jsp_taghandler_30.setValue("Con reglas");
                            __jsp_tag_starteval=__jsp_taghandler_30.doStartTag();
                            if (__jsp_taghandler_30.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_30,4);
                          }
                          out.write(__oracle_jsp_text[46]);
                        } while (__jsp_taghandler_29.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_29.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_29,3);
                    }
                    out.write(__oracle_jsp_text[47]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_31=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_31.setParent(__jsp_taghandler_2);
                      __jsp_taghandler_31.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${asociaPlazaEmpleadoDTO.idTipoNomina eq 'SA'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_31.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[48]);
                          {
                            org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_32=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
                            __jsp_taghandler_32.setParent(__jsp_taghandler_31);
                            __jsp_taghandler_32.setVar("args");
                            __jsp_taghandler_32.setValue("Sar Fovissste");
                            __jsp_tag_starteval=__jsp_taghandler_32.doStartTag();
                            if (__jsp_taghandler_32.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_32,4);
                          }
                          out.write(__oracle_jsp_text[49]);
                        } while (__jsp_taghandler_31.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_31.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_31,3);
                    }
                    out.write(__oracle_jsp_text[50]);
                  } while (__jsp_taghandler_2.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,2);
              }
              out.write(__oracle_jsp_text[51]);
              {
                org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_33=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
                __jsp_taghandler_33.setParent(__jsp_taghandler_1);
                __jsp_tag_starteval=__jsp_taghandler_33.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[52]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_34=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_34.setParent(__jsp_taghandler_33);
                      __jsp_taghandler_34.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${asociaPlazaEmpleadoDTO.idTipoNomina eq 'FO' or asociaPlazaEmpleadoDTO.idTipoNomina eq 'FE'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_34.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[53]);
                          {
                            org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_35=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code arguments");
                            __jsp_taghandler_35.setParent(__jsp_taghandler_34);
                            __jsp_taghandler_35.setCode("sireh.label.nomina.gestion.title.liquidacionFonac");
                            __jsp_taghandler_35.setArguments((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${args}",java.lang.Object.class, __ojsp_varRes,null));
                            try {
                              __jsp_tag_starteval=__jsp_taghandler_35.doStartTag();
                              if (__jsp_taghandler_35.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                            } catch (Throwable th) {
                              __jsp_taghandler_35.doCatch(th);
                            } finally {
                              __jsp_taghandler_35.doFinally();
                            }
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_35,4);
                          }
                          out.write(__oracle_jsp_text[54]);
                        } while (__jsp_taghandler_34.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_34.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_34,3);
                    }
                    out.write(__oracle_jsp_text[55]);
                    {
                      org.apache.taglibs.standard.tag.common.core.OtherwiseTag __jsp_taghandler_36=(org.apache.taglibs.standard.tag.common.core.OtherwiseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class,"org.apache.taglibs.standard.tag.common.core.OtherwiseTag");
                      __jsp_taghandler_36.setParent(__jsp_taghandler_33);
                      __jsp_tag_starteval=__jsp_taghandler_36.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[56]);
                          {
                            org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_37=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code arguments");
                            __jsp_taghandler_37.setParent(__jsp_taghandler_36);
                            __jsp_taghandler_37.setCode("sireh.label.nomina.calculo.extraordinaria.titulo");
                            __jsp_taghandler_37.setArguments((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${args}",java.lang.Object.class, __ojsp_varRes,null));
                            try {
                              __jsp_tag_starteval=__jsp_taghandler_37.doStartTag();
                              if (__jsp_taghandler_37.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                            } catch (Throwable th) {
                              __jsp_taghandler_37.doCatch(th);
                            } finally {
                              __jsp_taghandler_37.doFinally();
                            }
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_37,4);
                          }
                          out.write(__oracle_jsp_text[57]);
                        } while (__jsp_taghandler_36.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_36.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_36,3);
                    }
                    out.write(__oracle_jsp_text[58]);
                  } while (__jsp_taghandler_33.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_33.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_33,2);
              }
              out.write(__oracle_jsp_text[59]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_38=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_38.setParent(__jsp_taghandler_1);
                __jsp_taghandler_38.setCode("sireh.label.nomina.movimiento.movimientosPersonal.datosEmpleado.header");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_38.doStartTag();
                  if (__jsp_taghandler_38.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_38.doCatch(th);
                } finally {
                  __jsp_taghandler_38.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_38,2);
              }
              out.write(__oracle_jsp_text[60]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_39=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_39.setParent(__jsp_taghandler_1);
                __jsp_taghandler_39.setCode("sireh.label.nomina.movimiento.movimientosPersonal.fechaInicial");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_39.doStartTag();
                  if (__jsp_taghandler_39.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_39.doCatch(th);
                } finally {
                  __jsp_taghandler_39.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_39,2);
              }
              out.write(__oracle_jsp_text[61]);
              {
                _oracle._jsp._tag._calendar_tag __jsp_taghandler_40=(_oracle._jsp._tag._calendar_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._calendar_tag.class, pageContext);
                __jsp_taghandler_40.setParent(__jsp_taghandler_1);
                __jsp_taghandler_40.setJspContext(pageContext);
                __jsp_taghandler_40.setPath("fechaInicial");
                __jsp_taghandler_40.setSize("10");
                __jsp_taghandler_40.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_40, pageContext);
              }
              out.write(__oracle_jsp_text[62]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_41=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_41.setParent(__jsp_taghandler_1);
                __jsp_taghandler_41.setCode("sireh.label.nomina.movimiento.movimientosPersonal.fechaFinal");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_41.doStartTag();
                  if (__jsp_taghandler_41.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_41.doCatch(th);
                } finally {
                  __jsp_taghandler_41.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_41,2);
              }
              out.write(__oracle_jsp_text[63]);
              {
                _oracle._jsp._tag._calendar_tag __jsp_taghandler_42=(_oracle._jsp._tag._calendar_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._calendar_tag.class, pageContext);
                __jsp_taghandler_42.setParent(__jsp_taghandler_1);
                __jsp_taghandler_42.setJspContext(pageContext);
                __jsp_taghandler_42.setPath("fechaFinal");
                __jsp_taghandler_42.setSize("10");
                __jsp_taghandler_42.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_42, pageContext);
              }
              out.write(__oracle_jsp_text[64]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_43=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_43.setParent(__jsp_taghandler_1);
                __jsp_taghandler_43.setCode("sireh.label.nomina.movimiento.movimientosPersonal.primerApellido");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_43.doStartTag();
                  if (__jsp_taghandler_43.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_43.doCatch(th);
                } finally {
                  __jsp_taghandler_43.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_43,2);
              }
              out.write(__oracle_jsp_text[65]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_44=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_44.setParent(__jsp_taghandler_1);
                __jsp_taghandler_44.setJspContext(pageContext);
                __jsp_taghandler_44.setPath("primerApellido");
                __jsp_taghandler_44.setMaxlength("40");
                __jsp_taghandler_44.setReadonly("true");
                __jsp_taghandler_44.setSize("40");
                __jsp_taghandler_44.setUppercase("true");
                __jsp_taghandler_44.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_44, pageContext);
              }
              out.write(__oracle_jsp_text[66]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_45=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_45.setParent(__jsp_taghandler_1);
                __jsp_taghandler_45.setCode("sireh.label.nomina.movimiento.movimientosPersonal.segundoApellido");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_45.doStartTag();
                  if (__jsp_taghandler_45.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_45.doCatch(th);
                } finally {
                  __jsp_taghandler_45.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_45,2);
              }
              out.write(__oracle_jsp_text[67]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_46=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_46.setParent(__jsp_taghandler_1);
                __jsp_taghandler_46.setJspContext(pageContext);
                __jsp_taghandler_46.setPath("segundoApellido");
                __jsp_taghandler_46.setMaxlength("40");
                __jsp_taghandler_46.setReadonly("true");
                __jsp_taghandler_46.setSize("40");
                __jsp_taghandler_46.setUppercase("true");
                __jsp_taghandler_46.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_46, pageContext);
              }
              out.write(__oracle_jsp_text[68]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_47=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_47.setParent(__jsp_taghandler_1);
                __jsp_taghandler_47.setCode("sireh.label.nomina.movimiento.movimientosPersonal.nombreEmpleado");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_47.doStartTag();
                  if (__jsp_taghandler_47.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_47.doCatch(th);
                } finally {
                  __jsp_taghandler_47.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_47,2);
              }
              out.write(__oracle_jsp_text[69]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_48=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_48.setParent(__jsp_taghandler_1);
                __jsp_taghandler_48.setJspContext(pageContext);
                __jsp_taghandler_48.setPath("nombreEmpleado");
                __jsp_taghandler_48.setMaxlength("40");
                __jsp_taghandler_48.setReadonly("true");
                __jsp_taghandler_48.setSize("40");
                __jsp_taghandler_48.setUppercase("true");
                __jsp_taghandler_48.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_48, pageContext);
              }
              out.write(__oracle_jsp_text[70]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_49=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_49.setParent(__jsp_taghandler_1);
                __jsp_taghandler_49.setCode("sireh.label.nomina.movimiento.movimientosPersonal.rfcEmpleado");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_49.doStartTag();
                  if (__jsp_taghandler_49.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_49.doCatch(th);
                } finally {
                  __jsp_taghandler_49.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_49,2);
              }
              out.write(__oracle_jsp_text[71]);
              {
                _oracle._jsp._tag._helpRoutine_tag __jsp_taghandler_50=(_oracle._jsp._tag._helpRoutine_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._helpRoutine_tag.class, pageContext);
                __jsp_taghandler_50.setParent(__jsp_taghandler_1);
                __jsp_taghandler_50.setJspContext(pageContext);
                __jsp_taghandler_50.setBeanName("empleadoPopUp");
                __jsp_taghandler_50.setPath("rfcEmpleado");
                __jsp_taghandler_50.setFieldMapping("rfcEmpleado,idTipoPago,imssIssste,clabeEmpleado,curpEmpleado,nombreEmpleado,primerApellido,segundoApellido,ingresoGobFed,ingresoDependencia,calleParticular,coloniaParticular,codigoMunicipio,idEdoParticular,codpostParticular,telParticular");
                __jsp_taghandler_50.setWidth("650");
                __jsp_taghandler_50.setHeight("400");
                __jsp_taghandler_50.setMaxlength("13");
                __jsp_taghandler_50.setDisabled("true");
                __jsp_taghandler_50.setSize("18");
                __jsp_taghandler_50.setTitle("Seleccione un empleado");
                __jsp_taghandler_50.setOnClose("notyfyChanges()");
                __jsp_taghandler_50.setMaxRows("100");
                __jsp_taghandler_50.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_50, pageContext);
              }
              out.write(__oracle_jsp_text[72]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_51=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_51.setParent(__jsp_taghandler_1);
                __jsp_taghandler_51.setJspContext(pageContext);
                __jsp_taghandler_51.setPath("rfcEmpleadoNuevo");
                __jsp_taghandler_51.setMaxlength("13");
                __jsp_taghandler_51.setSize("18");
                __jsp_taghandler_51.setUppercase("true");
                __jsp_taghandler_51.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_51, pageContext);
              }
              out.write(__oracle_jsp_text[73]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_52=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_52.setParent(__jsp_taghandler_1);
                __jsp_taghandler_52.setCode("sireh.label.nomina.movimiento.movimientosPersonal.checkEmpleadoRfc");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_52.doStartTag();
                  if (__jsp_taghandler_52.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_52.doCatch(th);
                } finally {
                  __jsp_taghandler_52.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_52,2);
              }
              out.write(__oracle_jsp_text[74]);
              {
                org.springframework.web.servlet.tags.form.CheckboxTag __jsp_taghandler_53=(org.springframework.web.servlet.tags.form.CheckboxTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.CheckboxTag.class,"org.springframework.web.servlet.tags.form.CheckboxTag path onclick value");
                __jsp_taghandler_53.setParent(__jsp_taghandler_1);
                __jsp_taghandler_53.setPath("checkRfcEmpleado");
                __jsp_taghandler_53.setOnclick("renderRfcEmpleado();");
                __jsp_taghandler_53.setValue("1");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_53.doStartTag();
                  if (__jsp_taghandler_53.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_53.doCatch(th);
                } finally {
                  __jsp_taghandler_53.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_53,2);
              }
              out.write(__oracle_jsp_text[75]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_54=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_54.setParent(__jsp_taghandler_1);
                __jsp_taghandler_54.setCode("sireh.label.nomina.movimiento.movimientosPersonal.curpEmpleado");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_54.doStartTag();
                  if (__jsp_taghandler_54.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_54.doCatch(th);
                } finally {
                  __jsp_taghandler_54.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_54,2);
              }
              out.write(__oracle_jsp_text[76]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_55=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_55.setParent(__jsp_taghandler_1);
                __jsp_taghandler_55.setJspContext(pageContext);
                __jsp_taghandler_55.setPath("curpEmpleado");
                __jsp_taghandler_55.setMaxlength("18");
                __jsp_taghandler_55.setReadonly("true");
                __jsp_taghandler_55.setSize("40");
                __jsp_taghandler_55.setUppercase("true");
                __jsp_taghandler_55.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_55, pageContext);
              }
              out.write(__oracle_jsp_text[77]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_56=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_56.setParent(__jsp_taghandler_1);
                __jsp_taghandler_56.setCode("sireh.label.nomina.movimiento.movimientosPersonal.imssIssste");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_56.doStartTag();
                  if (__jsp_taghandler_56.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_56.doCatch(th);
                } finally {
                  __jsp_taghandler_56.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_56,2);
              }
              out.write(__oracle_jsp_text[78]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_57=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_57.setParent(__jsp_taghandler_1);
                __jsp_taghandler_57.setJspContext(pageContext);
                __jsp_taghandler_57.setPath("imssIssste");
                __jsp_taghandler_57.setMaxlength("11");
                __jsp_taghandler_57.setReadonly("true");
                __jsp_taghandler_57.setSize("40");
                __jsp_taghandler_57.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_57, pageContext);
              }
              out.write(__oracle_jsp_text[79]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_58=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_58.setParent(__jsp_taghandler_1);
                __jsp_taghandler_58.setCode("sireh.label.nomina.movimiento.movimientosPersonal.ingresoGobFed");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_58.doStartTag();
                  if (__jsp_taghandler_58.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_58.doCatch(th);
                } finally {
                  __jsp_taghandler_58.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_58,2);
              }
              out.write(__oracle_jsp_text[80]);
              {
                _oracle._jsp._tag._calendar_tag __jsp_taghandler_59=(_oracle._jsp._tag._calendar_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._calendar_tag.class, pageContext);
                __jsp_taghandler_59.setParent(__jsp_taghandler_1);
                __jsp_taghandler_59.setJspContext(pageContext);
                __jsp_taghandler_59.setPath("ingresoGobFed");
                __jsp_taghandler_59.setReadonly("true");
                __jsp_taghandler_59.setSize("10");
                __jsp_taghandler_59.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_59, pageContext);
              }
              out.write(__oracle_jsp_text[81]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_60=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_60.setParent(__jsp_taghandler_1);
                __jsp_taghandler_60.setCode("sireh.label.nomina.movimiento.movimientosPersonal.ingresoDependencia");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_60.doStartTag();
                  if (__jsp_taghandler_60.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_60.doCatch(th);
                } finally {
                  __jsp_taghandler_60.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_60,2);
              }
              out.write(__oracle_jsp_text[82]);
              {
                _oracle._jsp._tag._calendar_tag __jsp_taghandler_61=(_oracle._jsp._tag._calendar_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._calendar_tag.class, pageContext);
                __jsp_taghandler_61.setParent(__jsp_taghandler_1);
                __jsp_taghandler_61.setJspContext(pageContext);
                __jsp_taghandler_61.setPath("ingresoDependencia");
                __jsp_taghandler_61.setReadonly("true");
                __jsp_taghandler_61.setSize("10");
                __jsp_taghandler_61.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_61, pageContext);
              }
              out.write(__oracle_jsp_text[83]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_62=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_62.setParent(__jsp_taghandler_1);
                __jsp_taghandler_62.setCode("sireh.label.nomina.movimiento.movimientosPersonal.idTipoPago");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_62.doStartTag();
                  if (__jsp_taghandler_62.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_62.doCatch(th);
                } finally {
                  __jsp_taghandler_62.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_62,2);
              }
              out.write(__oracle_jsp_text[84]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_63=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_63.setParent(__jsp_taghandler_1);
                __jsp_taghandler_63.setJspContext(pageContext);
                __jsp_taghandler_63.setKey("0");
                __jsp_taghandler_63.setValue("selectList.nonValue");
                __jsp_taghandler_63.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_63, pageContext);
              }
              out.write(__oracle_jsp_text[85]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_64=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_64.setParent(__jsp_taghandler_1);
                __jsp_taghandler_64.setJspContext(pageContext);
                __jsp_taghandler_64.setBeanName("tcTipoPago");
                __jsp_taghandler_64.setPath("idTipoPago");
                __jsp_taghandler_64.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_64, pageContext);
              }
              out.write(__oracle_jsp_text[86]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_65=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_65.setParent(__jsp_taghandler_1);
                __jsp_taghandler_65.setCode("sireh.label.nomina.movimiento.movimientosPersonal.clabeEmpleado");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_65.doStartTag();
                  if (__jsp_taghandler_65.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_65.doCatch(th);
                } finally {
                  __jsp_taghandler_65.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_65,2);
              }
              out.write(__oracle_jsp_text[87]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_66=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_66.setParent(__jsp_taghandler_1);
                __jsp_taghandler_66.setJspContext(pageContext);
                __jsp_taghandler_66.setKey("0");
                __jsp_taghandler_66.setValue("selectList.nonValue");
                __jsp_taghandler_66.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_66, pageContext);
              }
              out.write(__oracle_jsp_text[88]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_67=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_67.setParent(__jsp_taghandler_1);
                __jsp_taghandler_67.setJspContext(pageContext);
                __jsp_taghandler_67.setBeanName("descBancos");
                __jsp_taghandler_67.setName("idBanco");
                __jsp_taghandler_67.setPath("idBanco");
                __jsp_taghandler_67.setOnchange("changeIbBank();");
                __jsp_taghandler_67.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_67, pageContext);
              }
              out.write(__oracle_jsp_text[89]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_68=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_68.setParent(__jsp_taghandler_1);
                __jsp_taghandler_68.setJspContext(pageContext);
                __jsp_taghandler_68.setPath("clabeEmpleado1");
                __jsp_taghandler_68.setMaxlength("3");
                __jsp_taghandler_68.setReadonly("true");
                __jsp_taghandler_68.setSize("3");
                __jsp_taghandler_68.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_68, pageContext);
              }
              out.write(__oracle_jsp_text[90]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_69=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_69.setParent(__jsp_taghandler_1);
                __jsp_taghandler_69.setJspContext(pageContext);
                __jsp_taghandler_69.setPath("clabeEmpleado2");
                __jsp_taghandler_69.setMaxlength("15");
                __jsp_taghandler_69.setSize("20");
                __jsp_taghandler_69.setCss("numeric");
                __jsp_taghandler_69.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_69, pageContext);
              }
              out.write(__oracle_jsp_text[91]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_70=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_70.setParent(__jsp_taghandler_1);
                __jsp_taghandler_70.setCode("sireh.label.nomina.movimiento.movimientosPersonal.cnqFolio");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_70.doStartTag();
                  if (__jsp_taghandler_70.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_70.doCatch(th);
                } finally {
                  __jsp_taghandler_70.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_70,2);
              }
              out.write(__oracle_jsp_text[92]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_71=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_71.setParent(__jsp_taghandler_1);
                __jsp_taghandler_71.setJspContext(pageContext);
                __jsp_taghandler_71.setPath("cnqFolio");
                __jsp_taghandler_71.setMaxlength("18");
                __jsp_taghandler_71.setReadonly((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${not (asociaPlazaEmpleadoDTO.idTipoNomina eq 'AG' or asociaPlazaEmpleadoDTO.idTipoNomina eq 'AC' or asociaPlazaEmpleadoDTO.idTipoNomina eq 'OD' or asociaPlazaEmpleadoDTO.idTipoNomina eq 'DB' or asociaPlazaEmpleadoDTO.idTipoNomina eq 'FE' or asociaPlazaEmpleadoDTO.idTipoNomina eq 'FO' or asociaPlazaEmpleadoDTO.idTipoNomina eq 'SA')}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_71.setSize("40");
                __jsp_taghandler_71.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_71, pageContext);
              }
              out.write(__oracle_jsp_text[93]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_72=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_72.setParent(__jsp_taghandler_1);
                __jsp_taghandler_72.setCode("sireh.label.nomina.movimiento.cambioDomicilio.calle");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_72.doStartTag();
                  if (__jsp_taghandler_72.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_72.doCatch(th);
                } finally {
                  __jsp_taghandler_72.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_72,2);
              }
              out.write(__oracle_jsp_text[94]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_73=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_73.setParent(__jsp_taghandler_1);
                __jsp_taghandler_73.setJspContext(pageContext);
                __jsp_taghandler_73.setPath("calleParticular");
                __jsp_taghandler_73.setMaxlength("60");
                __jsp_taghandler_73.setReadonly("true");
                __jsp_taghandler_73.setSize("60");
                __jsp_taghandler_73.setUppercase("true");
                __jsp_taghandler_73.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_73, pageContext);
              }
              out.write(__oracle_jsp_text[95]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_74=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_74.setParent(__jsp_taghandler_1);
                __jsp_taghandler_74.setCode("sireh.label.nomina.movimiento.cambioDomicilio.colonia");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_74.doStartTag();
                  if (__jsp_taghandler_74.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_74.doCatch(th);
                } finally {
                  __jsp_taghandler_74.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_74,2);
              }
              out.write(__oracle_jsp_text[96]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_75=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_75.setParent(__jsp_taghandler_1);
                __jsp_taghandler_75.setJspContext(pageContext);
                __jsp_taghandler_75.setPath("coloniaParticular");
                __jsp_taghandler_75.setMaxlength("60");
                __jsp_taghandler_75.setReadonly("true");
                __jsp_taghandler_75.setSize("60");
                __jsp_taghandler_75.setUppercase("true");
                __jsp_taghandler_75.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_75, pageContext);
              }
              out.write(__oracle_jsp_text[97]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_76=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_76.setParent(__jsp_taghandler_1);
                __jsp_taghandler_76.setCode("sireh.label.nomina.movimiento.cambioDomicilio.telefono");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_76.doStartTag();
                  if (__jsp_taghandler_76.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_76.doCatch(th);
                } finally {
                  __jsp_taghandler_76.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_76,2);
              }
              out.write(__oracle_jsp_text[98]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_77=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_77.setParent(__jsp_taghandler_1);
                __jsp_taghandler_77.setJspContext(pageContext);
                __jsp_taghandler_77.setPath("telParticular");
                __jsp_taghandler_77.setMaxlength("15");
                __jsp_taghandler_77.setReadonly("true");
                __jsp_taghandler_77.setSize("15");
                __jsp_taghandler_77.setUppercase("true");
                __jsp_taghandler_77.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_77, pageContext);
              }
              out.write(__oracle_jsp_text[99]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_78=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_78.setParent(__jsp_taghandler_1);
                __jsp_taghandler_78.setCode("sireh.label.nomina.movimiento.cambioDomicilio.cp");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_78.doStartTag();
                  if (__jsp_taghandler_78.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_78.doCatch(th);
                } finally {
                  __jsp_taghandler_78.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_78,2);
              }
              out.write(__oracle_jsp_text[100]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_79=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_79.setParent(__jsp_taghandler_1);
                __jsp_taghandler_79.setJspContext(pageContext);
                __jsp_taghandler_79.setPath("codpostParticular");
                __jsp_taghandler_79.setMaxlength("5");
                __jsp_taghandler_79.setReadonly("true");
                __jsp_taghandler_79.setSize("10");
                __jsp_taghandler_79.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_79, pageContext);
              }
              out.write(__oracle_jsp_text[101]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_80=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_80.setParent(__jsp_taghandler_1);
                __jsp_taghandler_80.setCode("sireh.label.nomina.movimiento.cambioDomicilio.entidadFederativa");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_80.doStartTag();
                  if (__jsp_taghandler_80.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_80.doCatch(th);
                } finally {
                  __jsp_taghandler_80.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_80,2);
              }
              out.write(__oracle_jsp_text[102]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_81=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_81.setParent(__jsp_taghandler_1);
                __jsp_taghandler_81.setJspContext(pageContext);
                __jsp_taghandler_81.setKey("0");
                __jsp_taghandler_81.setValue("selectList.nonValue");
                __jsp_taghandler_81.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_81, pageContext);
              }
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_82=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_82.setParent(__jsp_taghandler_1);
                __jsp_taghandler_82.setJspContext(pageContext);
                __jsp_taghandler_82.setBeanName("tcEstado");
                __jsp_taghandler_82.setPath("idEdoParticular");
                __jsp_taghandler_82.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_82, pageContext);
              }
              out.write(__oracle_jsp_text[103]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_83=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_83.setParent(__jsp_taghandler_1);
                __jsp_taghandler_83.setCode("sireh.label.nomina.movimiento.cambioDomicilio.delegacion");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_83.doStartTag();
                  if (__jsp_taghandler_83.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_83.doCatch(th);
                } finally {
                  __jsp_taghandler_83.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_83,2);
              }
              out.write(__oracle_jsp_text[104]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_84=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_84.setParent(__jsp_taghandler_1);
                __jsp_taghandler_84.setJspContext(pageContext);
                __jsp_taghandler_84.setKey("-1");
                __jsp_taghandler_84.setValue("selectList.nonValue");
                __jsp_taghandler_84.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_84, pageContext);
              }
              out.write(__oracle_jsp_text[105]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_85=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_85.setParent(__jsp_taghandler_1);
                __jsp_taghandler_85.setJspContext(pageContext);
                __jsp_taghandler_85.setBeanName("tcMunicipio");
                __jsp_taghandler_85.setPath("idMuniParticular");
                __jsp_taghandler_85.setParentPath("idEdoParticular");
                __jsp_taghandler_85.setProgress("true");
                __jsp_taghandler_85.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_85, pageContext);
              }
              out.write(__oracle_jsp_text[106]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_86=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_86.setParent(__jsp_taghandler_1);
                __jsp_taghandler_86.setCode("sireh.label.nomina.movimiento.movimientosPersonal.datosPlaza.header");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_86.doStartTag();
                  if (__jsp_taghandler_86.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_86.doCatch(th);
                } finally {
                  __jsp_taghandler_86.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_86,2);
              }
              out.write(__oracle_jsp_text[107]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_87=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_87.setParent(__jsp_taghandler_1);
                __jsp_taghandler_87.setCode("sireh.label.nomina.movimiento.movimientosPersonal.descPuesto");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_87.doStartTag();
                  if (__jsp_taghandler_87.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_87.doCatch(th);
                } finally {
                  __jsp_taghandler_87.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_87,2);
              }
              out.write(__oracle_jsp_text[108]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_88=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_88.setParent(__jsp_taghandler_1);
                __jsp_taghandler_88.setJspContext(pageContext);
                __jsp_taghandler_88.setPath("descPuesto");
                __jsp_taghandler_88.setReadonly("true");
                __jsp_taghandler_88.setSize("40");
                __jsp_taghandler_88.setUppercase("true");
                __jsp_taghandler_88.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_88, pageContext);
              }
              out.write(__oracle_jsp_text[109]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_89=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_89.setParent(__jsp_taghandler_1);
                __jsp_taghandler_89.setCode("sireh.label.nomina.movimiento.movimientosPersonal.idPlaza");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_89.doStartTag();
                  if (__jsp_taghandler_89.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_89.doCatch(th);
                } finally {
                  __jsp_taghandler_89.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_89,2);
              }
              out.write(__oracle_jsp_text[110]);
              {
                _oracle._jsp._tag._helpRoutine_tag __jsp_taghandler_90=(_oracle._jsp._tag._helpRoutine_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._helpRoutine_tag.class, pageContext);
                __jsp_taghandler_90.setParent(__jsp_taghandler_1);
                __jsp_taghandler_90.setJspContext(pageContext);
                __jsp_taghandler_90.setBeanName((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${asociaPlazaEmpleadoDTO.helproutineBeanName}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_90.setPath("idPlaza");
                __jsp_taghandler_90.setFieldMapping("idPlaza, idPuestoNom, descPuesto, idRangoNom, idUnidadNom, idJerarquia, idNombramiento, idNivelPto, idZonaEcoNom, idEdo, descEstado, idMunicipio, descMunicipio, idGrupoPago, descGrupoPago, plazaImpHono, idZonaDistNom, plazaReferencia, plazaIniCont, plazaFinCont");
                __jsp_taghandler_90.setWidth("650");
                __jsp_taghandler_90.setHeight("400");
                __jsp_taghandler_90.setMaxlength("20");
                __jsp_taghandler_90.setDisabled("true");
                __jsp_taghandler_90.setSize("20");
                __jsp_taghandler_90.setTitle("Seleccione una plaza");
                __jsp_taghandler_90.setOnClose("notyfyChangesUnidad()");
                __jsp_taghandler_90.setMaxRows("100");
                __jsp_taghandler_90.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_90, pageContext);
              }
              out.write(__oracle_jsp_text[111]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_91=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_91.setParent(__jsp_taghandler_1);
                __jsp_taghandler_91.setCode("sireh.label.nomina.movimiento.movimientosPersonal.idRangoNom");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_91.doStartTag();
                  if (__jsp_taghandler_91.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_91.doCatch(th);
                } finally {
                  __jsp_taghandler_91.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_91,2);
              }
              out.write(__oracle_jsp_text[112]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_92=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_92.setParent(__jsp_taghandler_1);
                __jsp_taghandler_92.setJspContext(pageContext);
                __jsp_taghandler_92.setPath("idRangoNom");
                __jsp_taghandler_92.setReadonly("true");
                __jsp_taghandler_92.setSize("40");
                __jsp_taghandler_92.setUppercase("true");
                __jsp_taghandler_92.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_92, pageContext);
              }
              out.write(__oracle_jsp_text[113]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_93=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_93.setParent(__jsp_taghandler_1);
                __jsp_taghandler_93.setCode("sireh.label.nomina.movimiento.movimientosPersonal.idPuestoNom");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_93.doStartTag();
                  if (__jsp_taghandler_93.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_93.doCatch(th);
                } finally {
                  __jsp_taghandler_93.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_93,2);
              }
              out.write(__oracle_jsp_text[114]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_94=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_94.setParent(__jsp_taghandler_1);
                __jsp_taghandler_94.setJspContext(pageContext);
                __jsp_taghandler_94.setPath("idPuestoNom");
                __jsp_taghandler_94.setReadonly("true");
                __jsp_taghandler_94.setSize("40");
                __jsp_taghandler_94.setUppercase("true");
                __jsp_taghandler_94.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_94, pageContext);
              }
              out.write(__oracle_jsp_text[115]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_95=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_95.setParent(__jsp_taghandler_1);
                __jsp_taghandler_95.setCode("sireh.label.nomina.movimiento.movimientosPersonal.idNivelPto");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_95.doStartTag();
                  if (__jsp_taghandler_95.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_95.doCatch(th);
                } finally {
                  __jsp_taghandler_95.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_95,2);
              }
              out.write(__oracle_jsp_text[116]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_96=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_96.setParent(__jsp_taghandler_1);
                __jsp_taghandler_96.setJspContext(pageContext);
                __jsp_taghandler_96.setPath("idNivelPto");
                __jsp_taghandler_96.setReadonly("true");
                __jsp_taghandler_96.setSize("40");
                __jsp_taghandler_96.setUppercase("true");
                __jsp_taghandler_96.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_96, pageContext);
              }
              out.write(__oracle_jsp_text[117]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_97=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_97.setParent(__jsp_taghandler_1);
                __jsp_taghandler_97.setCode("sireh.label.nomina.movimiento.movimientosPersonal.idZonaEcoNom");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_97.doStartTag();
                  if (__jsp_taghandler_97.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_97.doCatch(th);
                } finally {
                  __jsp_taghandler_97.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_97,2);
              }
              out.write(__oracle_jsp_text[118]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_98=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_98.setParent(__jsp_taghandler_1);
                __jsp_taghandler_98.setJspContext(pageContext);
                __jsp_taghandler_98.setPath("idZonaEcoNom");
                __jsp_taghandler_98.setReadonly("true");
                __jsp_taghandler_98.setSize("40");
                __jsp_taghandler_98.setUppercase("true");
                __jsp_taghandler_98.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_98, pageContext);
              }
              out.write(__oracle_jsp_text[119]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_99=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_99.setParent(__jsp_taghandler_1);
                __jsp_taghandler_99.setCode("sireh.label.nomina.movimiento.movimientosPersonal.descEstado");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_99.doStartTag();
                  if (__jsp_taghandler_99.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_99.doCatch(th);
                } finally {
                  __jsp_taghandler_99.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_99,2);
              }
              out.write(__oracle_jsp_text[120]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_100=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_100.setParent(__jsp_taghandler_1);
                __jsp_taghandler_100.setJspContext(pageContext);
                __jsp_taghandler_100.setPath("descEstado");
                __jsp_taghandler_100.setReadonly("true");
                __jsp_taghandler_100.setSize("40");
                __jsp_taghandler_100.setUppercase("true");
                __jsp_taghandler_100.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_100, pageContext);
              }
              out.write(__oracle_jsp_text[121]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_101=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_101.setParent(__jsp_taghandler_1);
                __jsp_taghandler_101.setCode("sireh.label.nomina.movimiento.movimientosPersonal.descMunicipio");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_101.doStartTag();
                  if (__jsp_taghandler_101.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_101.doCatch(th);
                } finally {
                  __jsp_taghandler_101.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_101,2);
              }
              out.write(__oracle_jsp_text[122]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_102=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_102.setParent(__jsp_taghandler_1);
                __jsp_taghandler_102.setJspContext(pageContext);
                __jsp_taghandler_102.setPath("descMunicipio");
                __jsp_taghandler_102.setReadonly("true");
                __jsp_taghandler_102.setSize("40");
                __jsp_taghandler_102.setUppercase("true");
                __jsp_taghandler_102.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_102, pageContext);
              }
              out.write(__oracle_jsp_text[123]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_103=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_103.setParent(__jsp_taghandler_1);
                __jsp_taghandler_103.setCode("sireh.label.nomina.movimiento.movimientosPersonal.plazaImpHono");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_103.doStartTag();
                  if (__jsp_taghandler_103.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_103.doCatch(th);
                } finally {
                  __jsp_taghandler_103.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_103,2);
              }
              out.write(__oracle_jsp_text[124]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_104=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_104.setParent(__jsp_taghandler_1);
                __jsp_taghandler_104.setJspContext(pageContext);
                __jsp_taghandler_104.setPath("plazaImpHono");
                __jsp_taghandler_104.setReadonly("true");
                __jsp_taghandler_104.setSize("40");
                __jsp_taghandler_104.setUppercase("true");
                __jsp_taghandler_104.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_104, pageContext);
              }
              out.write(__oracle_jsp_text[125]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_105=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_105.setParent(__jsp_taghandler_1);
                __jsp_taghandler_105.setCode("sireh.label.nomina.movimiento.movimientosPersonal.descGrupoPago");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_105.doStartTag();
                  if (__jsp_taghandler_105.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_105.doCatch(th);
                } finally {
                  __jsp_taghandler_105.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_105,2);
              }
              out.write(__oracle_jsp_text[126]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_106=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_106.setParent(__jsp_taghandler_1);
                __jsp_taghandler_106.setJspContext(pageContext);
                __jsp_taghandler_106.setPath("descGrupoPago");
                __jsp_taghandler_106.setReadonly("true");
                __jsp_taghandler_106.setSize("40");
                __jsp_taghandler_106.setUppercase("true");
                __jsp_taghandler_106.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_106, pageContext);
              }
              out.write(__oracle_jsp_text[127]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_107=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_107.setParent(__jsp_taghandler_1);
                __jsp_taghandler_107.setCode("sireh.label.nomina.movimiento.movimientosPersonal.idZonaDistNom");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_107.doStartTag();
                  if (__jsp_taghandler_107.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_107.doCatch(th);
                } finally {
                  __jsp_taghandler_107.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_107,2);
              }
              out.write(__oracle_jsp_text[128]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_108=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_108.setParent(__jsp_taghandler_1);
                __jsp_taghandler_108.setJspContext(pageContext);
                __jsp_taghandler_108.setPath("idZonaDistNom");
                __jsp_taghandler_108.setReadonly("true");
                __jsp_taghandler_108.setSize("40");
                __jsp_taghandler_108.setUppercase("true");
                __jsp_taghandler_108.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_108, pageContext);
              }
              out.write(__oracle_jsp_text[129]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_109=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_109.setParent(__jsp_taghandler_1);
                __jsp_taghandler_109.setCode("sireh.label.nomina.movimiento.movimientosPersonal.plazaReferencia");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_109.doStartTag();
                  if (__jsp_taghandler_109.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_109.doCatch(th);
                } finally {
                  __jsp_taghandler_109.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_109,2);
              }
              out.write(__oracle_jsp_text[130]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_110=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_110.setParent(__jsp_taghandler_1);
                __jsp_taghandler_110.setJspContext(pageContext);
                __jsp_taghandler_110.setPath("plazaReferencia");
                __jsp_taghandler_110.setMaxlength("40");
                __jsp_taghandler_110.setReadonly("true");
                __jsp_taghandler_110.setSize("40");
                __jsp_taghandler_110.setUppercase("true");
                __jsp_taghandler_110.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_110, pageContext);
              }
              out.write(__oracle_jsp_text[131]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_111=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_111.setParent(__jsp_taghandler_1);
                __jsp_taghandler_111.setCode("sireh.form.required.fields");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_111.doStartTag();
                  if (__jsp_taghandler_111.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_111.doCatch(th);
                } finally {
                  __jsp_taghandler_111.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_111,2);
              }
              out.write(__oracle_jsp_text[132]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_112=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_112.setParent(__jsp_taghandler_1);
                __jsp_taghandler_112.setJspContext(pageContext);
                __jsp_taghandler_112.setPath("aceptar");
                __jsp_taghandler_112.setAction("calculoNominaExt/agregarRfcPlaza.do");
                __jsp_taghandler_112.setValue("submit.accept");
                __jsp_taghandler_112.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_112, pageContext);
              }
              out.write(__oracle_jsp_text[133]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_113=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_113.setParent(__jsp_taghandler_1);
                __jsp_taghandler_113.setJspContext(pageContext);
                __jsp_taghandler_113.setPath("cancel");
                __jsp_taghandler_113.setAction("calculoNominaExt/cancelarAsociacion.do");
                __jsp_taghandler_113.setValue("submit.cancel");
                __jsp_taghandler_113.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_113, pageContext);
              }
              out.write(__oracle_jsp_text[134]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_114=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_114.setParent(__jsp_taghandler_1);
                __jsp_taghandler_114.setPath("clabeEmpleado");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_114.doStartTag();
                  if (__jsp_taghandler_114.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_114.doCatch(th);
                } finally {
                  __jsp_taghandler_114.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_114,2);
              }
              out.write(__oracle_jsp_text[135]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_115=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_115.setParent(__jsp_taghandler_1);
                __jsp_taghandler_115.setPath("idUnidadNom");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_115.doStartTag();
                  if (__jsp_taghandler_115.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_115.doCatch(th);
                } finally {
                  __jsp_taghandler_115.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_115,2);
              }
              out.write(__oracle_jsp_text[136]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_116=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_116.setParent(__jsp_taghandler_1);
                __jsp_taghandler_116.setPath("idNomina");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_116.doStartTag();
                  if (__jsp_taghandler_116.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_116.doCatch(th);
                } finally {
                  __jsp_taghandler_116.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_116,2);
              }
              out.write(__oracle_jsp_text[137]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_117=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_117.setParent(__jsp_taghandler_1);
                __jsp_taghandler_117.setPath("idTipoNomina");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_117.doStartTag();
                  if (__jsp_taghandler_117.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_117.doCatch(th);
                } finally {
                  __jsp_taghandler_117.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_117,2);
              }
              out.write(__oracle_jsp_text[138]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_118=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_118.setParent(__jsp_taghandler_1);
                __jsp_taghandler_118.setPath("idGrupoPagoNomina");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_118.doStartTag();
                  if (__jsp_taghandler_118.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_118.doCatch(th);
                } finally {
                  __jsp_taghandler_118.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_118,2);
              }
              out.write(__oracle_jsp_text[139]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_119=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_119.setParent(__jsp_taghandler_1);
                __jsp_taghandler_119.setPath("idGrupoPago");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_119.doStartTag();
                  if (__jsp_taghandler_119.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_119.doCatch(th);
                } finally {
                  __jsp_taghandler_119.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_119,2);
              }
              out.write(__oracle_jsp_text[140]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_120=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_120.setParent(__jsp_taghandler_1);
                __jsp_taghandler_120.setPath("idJerarquia");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_120.doStartTag();
                  if (__jsp_taghandler_120.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_120.doCatch(th);
                } finally {
                  __jsp_taghandler_120.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_120,2);
              }
              out.write(__oracle_jsp_text[141]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_121=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_121.setParent(__jsp_taghandler_1);
                __jsp_taghandler_121.setPath("idNombramiento");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_121.doStartTag();
                  if (__jsp_taghandler_121.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_121.doCatch(th);
                } finally {
                  __jsp_taghandler_121.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_121,2);
              }
              out.write(__oracle_jsp_text[142]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_122=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_122.setParent(__jsp_taghandler_1);
                __jsp_taghandler_122.setPath("inicioQuincenaCaptura");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_122.doStartTag();
                  if (__jsp_taghandler_122.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_122.doCatch(th);
                } finally {
                  __jsp_taghandler_122.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_122,2);
              }
              out.write(__oracle_jsp_text[143]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_123=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_123.setParent(__jsp_taghandler_1);
                __jsp_taghandler_123.setPath("finQuincenaCaptura");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_123.doStartTag();
                  if (__jsp_taghandler_123.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_123.doCatch(th);
                } finally {
                  __jsp_taghandler_123.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_123,2);
              }
              out.write(__oracle_jsp_text[144]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_124=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_124.setParent(__jsp_taghandler_1);
                __jsp_taghandler_124.setPath("finSiguienteQuincenaCaptura");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_124.doStartTag();
                  if (__jsp_taghandler_124.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_124.doCatch(th);
                } finally {
                  __jsp_taghandler_124.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_124,2);
              }
              out.write(__oracle_jsp_text[145]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_125=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_125.setParent(__jsp_taghandler_1);
                __jsp_taghandler_125.setPath("plazaIniCont");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_125.doStartTag();
                  if (__jsp_taghandler_125.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_125.doCatch(th);
                } finally {
                  __jsp_taghandler_125.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_125,2);
              }
              out.write(__oracle_jsp_text[146]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_126=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_126.setParent(__jsp_taghandler_1);
                __jsp_taghandler_126.setPath("plazaFinCont");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_126.doStartTag();
                  if (__jsp_taghandler_126.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_126.doCatch(th);
                } finally {
                  __jsp_taghandler_126.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_126,2);
              }
              out.write(__oracle_jsp_text[147]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_127=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_127.setParent(__jsp_taghandler_1);
                __jsp_taghandler_127.setPath("agVigente");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_127.doStartTag();
                  if (__jsp_taghandler_127.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_127.doCatch(th);
                } finally {
                  __jsp_taghandler_127.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_127,2);
              }
              out.write(__oracle_jsp_text[148]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_128=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_128.setParent(__jsp_taghandler_1);
                __jsp_taghandler_128.setPath("helproutineBeanName");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_128.doStartTag();
                  if (__jsp_taghandler_128.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_128.doCatch(th);
                } finally {
                  __jsp_taghandler_128.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_128,2);
              }
              out.write(__oracle_jsp_text[149]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_129=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_129.setParent(__jsp_taghandler_1);
                __jsp_taghandler_129.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${asociaPlazaEmpleadoDTO.checkRfcEmpleado}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_129.doStartTag();
                if (__jsp_taghandler_129.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_129,2);
              }
              out.write(__oracle_jsp_text[150]);
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
  private static final char __oracle_jsp_text[][]=new char[151][];
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
    "\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[5] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[6] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[7] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[8] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[9] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[10] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[11] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[12] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[13] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[14] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[15] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[16] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[17] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[18] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[19] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[20] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[21] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[22] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[23] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[24] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[25] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[26] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[27] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[28] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[29] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[30] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[31] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[32] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[33] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[34] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[35] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[36] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[37] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[38] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[39] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[40] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[41] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[42] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[43] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[44] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[45] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[46] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[47] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[48] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[49] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[50] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[51] = 
    "\r\n\r\n    ".toCharArray();
    __oracle_jsp_text[52] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[53] = 
    "\r\n            <h1>".toCharArray();
    __oracle_jsp_text[54] = 
    "</h1>\r\n        ".toCharArray();
    __oracle_jsp_text[55] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[56] = 
    "\r\n            <h1>".toCharArray();
    __oracle_jsp_text[57] = 
    "</h1>\r\n        ".toCharArray();
    __oracle_jsp_text[58] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[59] = 
    "\r\n    \r\n    <p>&nbsp;</p>\r\n    <table align=\"center\" width=\"100%\">\r\n        <tr>\r\n            <td>\r\n                <fieldset>\r\n                    <legend style=\"font-size:1.3em\"><strong>".toCharArray();
    __oracle_jsp_text[60] = 
    "</strong></legend>\r\n                    <table align=\"center\" width=\"100%\">\r\n                        <tr><td>&nbsp;</td></tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[61] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[62] = 
    "</td>\r\n                            <td align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[63] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[64] = 
    "</td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[65] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[66] = 
    "</td>\r\n                            <td align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[67] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[68] = 
    "</td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[69] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[70] = 
    "</td>\r\n                            <td align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[71] = 
    "</td>\r\n                            <td align=\"left\">\r\n                                <table border=\"0\" >\r\n                                    <tr>\r\n                                        <td width=\"130px\">\r\n                                            <span id=\"spanEmpleadoExistente\" style=\"width:140px\">\r\n                                                ".toCharArray();
    __oracle_jsp_text[72] = 
    "\r\n                                            </span>\r\n                                            <span id=\"spanEmpleadoNuevo\" style=\"width:140px\">\r\n                                                ".toCharArray();
    __oracle_jsp_text[73] = 
    "\r\n                                            </span>\r\n                                        </td>\r\n                                        <td>\r\n                                            <span style=\"width:100px\">\r\n                                                ".toCharArray();
    __oracle_jsp_text[74] = 
    "\r\n                                                ".toCharArray();
    __oracle_jsp_text[75] = 
    "\r\n                                            </span>\r\n                                        </td>\r\n                                    </tr>\r\n                                </table>\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[76] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[77] = 
    "</td>\r\n                            <td align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[78] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[79] = 
    "</td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[80] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[81] = 
    "</td>\r\n                            <td align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[82] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[83] = 
    "</td>            \r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[84] = 
    "</td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[85] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[86] = 
    "\r\n                            </td>\r\n                            <td align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[87] = 
    "</td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[88] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[89] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[90] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[91] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[92] = 
    "</td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[93] = 
    "\r\n                            </td>\r\n                            <td></td>\r\n                            <td></td>\r\n                        </tr>\r\n                        <!-- DATOS DE DOMICILIO -->\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\" width=\"40%\">* ".toCharArray();
    __oracle_jsp_text[94] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[95] = 
    "</td>\r\n                            <td align=\"right\" class=\"label\" width=\"40%\">* ".toCharArray();
    __oracle_jsp_text[96] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[97] = 
    "</td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[98] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[99] = 
    "</td>\r\n                            <td align=\"right\" class=\"label\" width=\"40%\">* ".toCharArray();
    __oracle_jsp_text[100] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[101] = 
    "</td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[102] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[103] = 
    "</td>\r\n                            <td align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[104] = 
    "</td>\r\n                            <td align=\"left\">\r\n                                <input type=\"hidden\" id=\"codigoMunicipio\"/>\r\n                                ".toCharArray();
    __oracle_jsp_text[105] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[106] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr><td>&nbsp;</td></tr>\r\n                    </table>\r\n                </fieldset>\r\n            </td>\r\n        </tr>\r\n    </table>\r\n\r\n    <table align=\"center\" width=\"100%\">\r\n        <tr>\r\n            <td>\r\n                <fieldset>\r\n                    <legend style=\"font-size:1.3em\"><strong>".toCharArray();
    __oracle_jsp_text[107] = 
    "</strong></legend>\r\n                    <table align=\"center\" width=\"100%\">\r\n                        <tr><td>&nbsp;</td></tr>\r\n                        <!-- DATOS DE PLAZA -->\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[108] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[109] = 
    "</td>\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[110] = 
    "</td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[111] = 
    "\r\n                            </td>\r\n                        </tr>  \r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[112] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[113] = 
    "</td>\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[114] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[115] = 
    "</td>\r\n                        </tr>    \r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[116] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[117] = 
    "</td>\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[118] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[119] = 
    "</td>\r\n                        </tr>         \r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[120] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[121] = 
    "</td>\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[122] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[123] = 
    "</td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[124] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[125] = 
    "</td>\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[126] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[127] = 
    "</td>\r\n                        </tr>\r\n                         <tr>\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[128] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[129] = 
    "</td>\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[130] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[131] = 
    "</td>\r\n                        </tr>\r\n                        <tr><td>&nbsp;</td></tr>\r\n                    </table>\r\n                </fieldset>\r\n            </td>\r\n        </tr>\r\n    </table>\r\n\t\t\r\n    <table align=\"center\" width=\"100%\">\r\n        <tr>\r\n            <td colspan=\"4\" align=\"left\" height=\"20px\" valign=\"middle\">".toCharArray();
    __oracle_jsp_text[132] = 
    "</td>\r\n        </tr>\r\n        <tr>\r\n            <td align=\"center\" colspan=\"2\">\r\n                ".toCharArray();
    __oracle_jsp_text[133] = 
    "\r\n            </td>\r\n            <td align=\"center\" colspan=\"2\">\r\n                ".toCharArray();
    __oracle_jsp_text[134] = 
    "\r\n            </td>\r\n        </tr>\r\n    </table>\r\n    ".toCharArray();
    __oracle_jsp_text[135] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[136] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[137] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[138] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[139] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[140] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[141] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[142] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[143] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[144] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[145] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[146] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[147] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[148] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[149] = 
    "\r\n    \r\n\r\n    <script type=\"text/javascript\" >\r\n\r\n        document.getElementById(\"idUnidadNom\").style.display = 'none';\r\n        var clabeEmpleadoTD = '';\r\n        function notyfyChanges(){\r\n            var selectidEdoParticular = document.getElementById('idEdoParticular');\r\n            if(document.all) { // IE Way\r\n                selectidEdoParticular.fireEvent('onchange');\r\n            } else  { // Firefox Way\r\n                var evtidEdoParticular = document.createEvent('HTMLEvents');\r\n                evtidEdoParticular.initEvent('change', true, true);\r\n                selectidEdoParticular.dispatchEvent(evtidEdoParticular);\r\n            }\r\n            setTimeout(selectMuni, 2000);\r\n            clabeEmpleadoTD = $j('#clabeEmpleado').val();\r\n            var clabeEmpleado1 = clabeEmpleadoTD.substring(0, 3);\r\n            var clabeEmpleado2 = clabeEmpleadoTD.substring(3);\r\n            $j('#clabeEmpleado1').val(clabeEmpleado1);\r\n            $j('#clabeEmpleado2').val(clabeEmpleado2);\r\n            $j('#idBanco').val(clabeEmpleado1);\r\n        }\r\n\r\n        function selectMuni(){\r\n            selectIdMuniParticular = document.getElementById('idMuniParticular');\r\n            selectIdMuniParticular.value= document.getElementById('codigoMunicipio').value;\r\n        }\r\n\r\n        function notyfyChangesUnidad(){\r\n            var selectidUnidadNom = document.getElementById('idUnidadNom');\r\n            if(document.all) { // IE Way\r\n                selectidUnidadNom.fireEvent('onchange');\r\n            } else  { // Firefox Way\r\n                var evtidUnidadNom = document.createEvent('HTMLEvents');\r\n                evtidUnidadNom.initEvent('change', true, true);\r\n                selectidUnidadNom.dispatchEvent(evtidUnidadNom);\r\n            }\r\n            clabeEmpleadoTD = $j('#clabeEmpleado').val();\r\n        }\r\n\r\n        \r\n\r\n        var seleccionInicialRfc = ".toCharArray();
    __oracle_jsp_text[150] = 
    ";\r\n        if (seleccionInicialRfc) {\r\n            document.getElementById(\"spanEmpleadoExistente\").style.display = 'none';\r\n            document.getElementById(\"spanEmpleadoNuevo\").style.display = 'block';\r\n        } else {\r\n            document.getElementById(\"spanEmpleadoExistente\").style.display = 'block';\r\n            document.getElementById(\"spanEmpleadoNuevo\").style.display = 'none';\r\n        }\r\n        \r\n        function renderRfcEmpleado() {\r\n            var seleccion = document.getElementById(\"checkRfcEmpleado1\").checked;\r\n        \r\n            if (seleccion) {\r\n                document.getElementById(\"spanEmpleadoExistente\").style.display = 'none';\r\n                document.getElementById(\"spanEmpleadoNuevo\").style.display = 'block';\r\n            } else {\r\n                document.getElementById(\"spanEmpleadoExistente\").style.display = 'block';\r\n                document.getElementById(\"spanEmpleadoNuevo\").style.display = 'none';\r\n            }\r\n        }\r\n        \r\n        $j(document).ready(function(){\r\n        \r\n            $j('.numeric').numeric();\r\n            if (document.getElementById(\"checkRfcEmpleado1\").checked) {\r\n                habilitarCampos();\r\n            }\r\n            else{\r\n                deshabilitarCampos();\r\n            }\r\n            if( $j('#idTipoPago').val() == 'CH'){\r\n                $j('#idBanco').attr('disabled', 'false');\r\n                $j('#clabeEmpleado2').attr('disabled', 'true');\r\n                $j('#clabeEmpleado2').val('000000000000000');\r\n            }\r\n            \r\n            if( $j('#idTipoPago').val() == 'TD'){\r\n                $j('#idBanco').removeAttr('disabled');\r\n                $j('#clabeEmpleado2').removeAttr('disabled');\r\n            }\r\n            $j('.numeric').numeric();\r\n            \r\n        });\r\n        \r\n        $j('#checkRfcEmpleado1').change(function(){\r\n            limpiarCampos();\r\n            if (document.getElementById(\"checkRfcEmpleado1\").checked) {\r\n                habilitarCampos();\r\n            }\r\n            else{\r\n                deshabilitarCampos();\r\n            }\r\n        });\r\n        \r\n        function changeIbBank(){\r\n            var idBanco = document.getElementsByName(\"idBanco\");\r\n            var clabeEmpleado = document.getElementById(\"clabeEmpleado1\");\r\n            clabeEmpleado.value = idBanco[0].value;\r\n        }\r\n        \r\n        $j('#idTipoPago').change(function(){\r\n            if( $j('#idTipoPago').val() == 'CH'){\r\n                $j('#idBanco').val('000');                \r\n                $j('#idBanco').attr('disabled', 'false');\r\n                $j('#clabeEmpleado1').val('000');\r\n                $j('#clabeEmpleado2').val('000000000000000');\r\n                $j('#clabeEmpleado2').attr('disabled', 'true');\r\n            }\r\n            \r\n            if( $j('#idTipoPago').val() == 'TD'){\r\n                $j('#idBanco').val('0');                \r\n                $j('#idBanco').removeAttr('disabled');\r\n                $j('#clabeEmpleado1').val('');\r\n                $j('#clabeEmpleado2').removeAttr('disabled');\r\n            }\r\n            \r\n            if( $j('#idTipoPago').val() == '0'){\r\n                $j('#idBanco').val('0');                \r\n                $j('#idBanco').attr('disabled', 'disabled');\r\n                $j('#clabeEmpleado1').val('');\r\n                $j('#clabeEmpleado2').val('');\r\n                $j('#clabeEmpleado2').attr('disabled', 'disabled');\r\n            }\r\n        });\r\n        \r\n        function limpiarCampos(){\r\n            $j('#rfcEmpleado').val('');\r\n            $j('#rfcEmpleadoNuevo').val('');\r\n            $j('#primerApellido').val('');\r\n            $j('#segundoApellido').val('');\r\n            $j('#nombreEmpleado').val('');\r\n            $j('#rfcEmpleadoNuevo').val('');\r\n            $j('#curpEmpleado').val('');\r\n            $j('#imssIssste').val('');\r\n            $j('#text_ingresoGobFed').val('');\r\n            $j('#text_ingresoDependencia').val('');\r\n            $j('#idTipoPago').val('0');\r\n            $j('#clabeEmpleado').val('');\r\n            $j('#calleParticular').val('');\r\n            $j('#coloniaParticular').val('')\r\n            $j('#telParticular').val('')\r\n            $j('#codpostParticular').val('')\r\n            $j('#idEdoParticular').val(0);\r\n            $j('#idMuniParticular').val(-1);\r\n        }\r\n\r\n        function habilitarCampos(){\r\n            $j('#primerApellido').removeAttr('readonly');\r\n            $j('#segundoApellido').removeAttr('readonly');\r\n            $j('#nombreEmpleado').removeAttr('readonly');\r\n            $j('#rfcEmpleadoNuevo').removeAttr('readonly');\r\n            $j('#curpEmpleado').removeAttr('readonly');\r\n            $j('#imssIssste').removeAttr('readonly');\r\n            $j('#text_ingresoGobFed').removeAttr('readonly');\r\n            $j('#button_ingresoGobFed').show();\r\n            $j('#text_ingresoDependencia').removeAttr('readonly');\r\n            $j('#button_ingresoDependencia').show();\r\n            //$j('#idTipoPago').removeAttr('disabled');\r\n            $j('#clabeEmpleado').removeAttr('readonly');\r\n            $j('#calleParticular').removeAttr('readonly');\r\n            $j('#coloniaParticular').removeAttr('readonly');\r\n            $j('#telParticular').removeAttr('readonly');\r\n            $j('#codpostParticular').removeAttr('readonly');\r\n            $j('#idEdoParticular').removeAttr('disabled');\r\n            $j('#idMuniParticular').removeAttr('disabled');\r\n        }\r\n        \r\n        function deshabilitarCampos(){\r\n            $j('#primerApellido').attr('readonly', 'readonly');\r\n            $j('#segundoApellido').attr('readonly', 'readonly');\r\n            $j('#nombreEmpleado').attr('readonly', 'readonly');\r\n            $j('#rfcEmpleadoNuevo').attr('readonly', 'readonly');\r\n            $j('#curpEmpleado').attr('readonly', 'readonly');\r\n            $j('#imssIssste').attr('readonly', 'readonly');\r\n            $j('#text_ingresoGobFed').attr('readonly', 'readonly');\r\n            $j('#button_ingresoGobFed').hide();\r\n            $j('#text_ingresoDependencia').attr('readonly', 'readonly');\r\n            $j('#button_ingresoDependencia').hide();\r\n            //$j('#idTipoPago').attr('disabled', 'disabled');\r\n            $j('#clabeEmpleado').attr('readonly', 'readonly');\r\n            $j('#calleParticular').attr('readonly', 'readonly');\r\n            $j('#coloniaParticular').attr('readonly', 'readonly');\r\n            $j('#telParticular').attr('readonly', 'readonly');\r\n            $j('#codpostParticular').attr('readonly', 'readonly');\r\n            $j('#idEdoParticular').attr('disabled', 'disabled');\r\n            $j('#idMuniParticular').attr('disabled', 'disabled');\r\n        }\r\n\r\n    </script>    \r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}

<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page contentType="text/html;charset=ISO_8859-1"%>
<%@ page errorPage="/unknownError.do" autoFlush="true"%>

<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
  <head>
    <META HTTP-EQUIV="Content-Type" CONTENT="text/html;charset=ISO_8859-1"/>
    <META HTTP-EQUIV="Pragma" CONTENT="no-cache"/>
    <META HTTP-EQUIV="Expires" CONTENT="0"/>
    <META HTTP-EQUIV="Cache-Control" CONTENT="no-cache"/>
    <META HTTP-EQUIV="Cache-Control" CONTENT="no-store"/>
    <META HTTP-EQUIV="X-UA-Compatible" CONTENT="IE=8" />
    <base target="_self"/>
    <tiles:insertAttribute name="javaScript" ignore="true"/>
    <tiles:insertAttribute name="htmlHeader" ignore="true"/>
    <title>.:<spring:message code="main.header.system.name"/>&nbsp;<spring:message code="main.header.application.name"/>:.</title>
  </head>
  <body>
      <table width="100%" align="center">
        <tr> <!--Header-->
          <td>
            <tiles:insertAttribute name="header"/>
          </td>
        </tr>        
      </table>
      <table width="100%" align="center">
        <tr> <!--Body-->
          <td align="center">
            <table class="body">
              <tr>
                <td>
                  <tiles:insertAttribute name="message"/>
                  <tiles:insertAttribute name="body"/>
                </td>
              </tr>
            </table>
          </td>
        </tr>
      </table>
      <table width="100%" align="center">
        <tr> <!--Footer-->
          <td align="center">
            <tiles:insertAttribute name="footer"/>
          </td>
        </tr>
      </table>
  </body>
  <tiles:insertAttribute name="nocache"/>
</html>

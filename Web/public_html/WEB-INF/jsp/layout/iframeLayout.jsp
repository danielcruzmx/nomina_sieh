<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page contentType="text/html;charset=ISO_8859-1"%>

<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
  <head>
    <META HTTP-EQUIV="Content-Type" CONTENT="text/html;charset=ISO_8859-1"/>
    <META HTTP-EQUIV="Pragma" CONTENT="no-cache"/>
    <META HTTP-EQUIV="Expires" CONTENT="-1"/>
    <META HTTP-EQUIV="Cache-Control" CONTENT="no-cache"/>
    <META HTTP-EQUIV="Cache-Control" CONTENT="no-store"/>
    <META HTTP-EQUIV="X-UA-Compatible" CONTENT="IE=8" />
    <tiles:insertAttribute name="javaScript" ignore="true"/>    
    <tiles:insertAttribute name="htmlHeader" ignore="true"/>        
  </head>    
  <body>
    <table width="100%" align="center">
        <tr> <!--Header-->
          <td>
            <tiles:insertAttribute name="breadCrumb"/>
            <tiles:insertAttribute name="onLoad" ignore="true"/>
          </td>
        </tr>        
    </table>    
    <table width="100%" align="center">
        <tr> <!--Body-->
          <td align="center">
            <table>
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
  </body>
  <tiles:insertAttribute name="onFinishLoad" ignore="true"/>
  <tiles:insertAttribute name="nocache"/>
</html>

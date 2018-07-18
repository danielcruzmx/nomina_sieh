<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<!-- Debe ir antes de cargar el xtree.js y el progess.js para obtener el contexto de la aplicacion web de recursos estaticos -->
<script type="text/javascript">
  function getThemeBaseUrl() {
     return ('<spring:theme code="themeBaseUrl" text="../../resources" />');
  }
</script>

<!-- GENERAL -->
    <script type="text/javascript" src="<spring:theme code="functions.js"/>"></script>
    <script type="text/javascript" src="<spring:theme code="dragndrop.js"/>"> </script>
    <script type="text/javascript" src="<spring:theme code="doubleSelect.js"/>"></script>

<!-- MENU -->
    <script type="text/javascript" src="<spring:theme code="navmenu.js"/>"></script>

<!-- CALENDAR -->
    <script type="text/javascript" src="<spring:theme code="calendar.js"/>"></script>
    <script type="text/javascript" src="<spring:theme code="callang.js"/>"></script>
    <script type="text/javascript" src="<spring:theme code="calsetup.js"/>"></script>
    
<!-- CONTAINER -->    
    <script type="text/javascript" src="<spring:theme code="container.js"/>"></script>    
    
<!-- PROGRESS -->
    <script type="text/javascript" src="<spring:theme code="progress.js"/>"></script>

<!-- XTREE -->
    <script type="text/javascript" src="<spring:theme code="xtree.js"/>"></script>
    <script type="text/javascript" src="<spring:theme code="rightcontext.js"/>"></script>

<!-- AJAX TAGS -->
    <script type="text/javascript" src="<spring:theme code="ajxproto.js"/>"></script>
    <script type="text/javascript" src="<spring:theme code="ajxscript.js"/>"></script>
    <script type="text/javascript" src="<spring:theme code="ajxeffects.js"/>"></script>
    <script type="text/javascript" src="<spring:theme code="ajxovlib.js"/>"></script>
    <script type="text/javascript" src="<spring:theme code="ajxovlibcf.js"/>"></script>
    <script type="text/javascript" src="<spring:theme code="ajxovlibif.js"/>"></script>
    <script type="text/javascript" src="<spring:theme code="ajxovlibhd.js"/>"></script>
    <script type="text/javascript" src="<spring:theme code="ajxovlibsw.js"/>"></script>
    <script type="text/javascript" src="<spring:theme code="ajaxtags.js"/>"></script>
    <script type="text/javascript" src="<spring:theme code="ajaxtagsctl.js"/>"></script>
    <script type="text/javascript" src="<spring:theme code="ajaxtagspsr.js"/>"></script>
    <script type="text/javascript" src="<spring:theme code="jquery.min.js"/>"></script>
    <script type="text/javascript" src="<spring:theme code="jquery.ui.min.js"/>"></script>

<!-- AJAX DISPLAY TAG -->
    <script type="text/javascript" src="<spring:theme code="jquery.displaytag-ajax.js"/>"></script>
    
<!-- CUSTOM -->
    <script type="text/javascript" src="<spring:theme code="zebradatepicker.js"/>"></script>
    <script type="text/javascript">

      var $j = jQuery.noConflict();

      function doSubmit(submitId) {
        var anchor = document.getElementById(submitId);
        if(anchor) {
            var action = anchor.getAttribute("action");
            var path = anchor.getAttribute("path");
            var message = anchor.getAttribute("alertCode");
            return doSubmitInternal(action, path, message, submitId);
        }
        return doSubmitInternal();
      }

      function doSubmitInternal(action, path, message, submitId) {
        if(path && '' != path) {
          document.getElementsByName(path)[0].value = "true";
        }
        if(message && '' != message) {
            if(confirm(message)) {
                hideMessageDiv();
                showLightbox(submitId);
                document.forms[0].action = action;
                return true;
            } else {
                return false;
            }
        }
        hideMessageDiv();
        showLightbox(submitId);
        if(action && '' != action) {
            document.forms[0].action = action;
        }
        return true;
      }

      //Deshabilita el boton que haya sido presionado
      function disableButton() {
            var objectSrc = window.event.srcElement;
            if(objectSrc.type == 'submit' || objectSrc.type == 'reset') {
                if(document.forms[0] != null) {
                    var onSubmitFunction = document.forms[0].onsubmit;
                    document.forms[0].onsubmit = function() {
                        for(var i=0; i<document.forms[0].elements.length; i++) {
                              var object = document.forms[0].elements[i];
                              if(object.type == 'submit' || object.type == 'reset') {
//                                if( objectSrc.name == object.name && objectSrc.name == '<!--%=Constants.CANCEL_PROPERTY%-->' ){
//                                    var newHidden = document.createElement("input");
//                                    newHidden.type = "hidden";
//                                    newHidden.name="<!--%=Constants.CANCEL_PROPERTY%-->";
//                                    newHidden.value=objectSrc.value;
//                                    document.forms[0].appendChild( newHidden );
//                                }
                                  object.disabled = true;
                              }
                        }
                        if(onSubmitFunction) {
                          onSubmitFunction();
                        }
                        //return true;
                    }
                }
            }
      }

      function delegateOpener(url) {
         if (window.opener != undefined && !window.opener.closed) {
            window.opener.document.location = url;
            window.opener.focus();
            window.close();
         } else {
            document.location = url;
         }
      }
    </script>
    
<!-- JQGRID -->
    <script type="text/javascript" src="<spring:theme code="jquery.jqGrid.js"/>"></script>
    <script type="text/javascript" src="<spring:theme code="jquery.grid.locale.js"/>"></script>
    <script type="text/javascript">
        $j.jgrid.no_legacy_api = true;
        $j.jgrid.useJSON = false;
    </script>
    
<!-- MASKED INPUT -->
    <script type="text/javascript" src="<spring:theme code="jquery.maskedinput.js"/>"></script>
    <script type="text/javascript" src="<spring:theme code="jquery.maskedinputV2.js"/>"></script>
    <script type="text/javascript" src="<spring:theme code="jquery.alphanumeric.js"/>"></script>
    
<!-- CONTAINER V2 -->    
    <script type="text/javascript" src="<spring:theme code="containerV2.js"/>"></script>  

<!-- MESSI -->    
    <script type="text/javascript" src="<spring:theme code="messi.js"/>"></script> 

<!-- BOOTSTRAP -->    
    <script type="text/javascript" src="<spring:theme code="bootstrap.js"/>"></script>
    
<!-- SMOKE -->    
    <script type="text/javascript" src="<spring:theme code="smoke.js"/>"></script> 

<!-- PKI -->
    <script type="text/javascript" src="<spring:theme code="pki-applet.js"/>"></script>

<!-- FULLCALENDAR -->
    <script type="text/javascript" src="<spring:theme code="moment.js"/>"></script>
    <script type="text/javascript" src="<spring:theme code="fullcalendar.js"/>"></script>
    <script type="text/javascript" src="<spring:theme code="lang-all.js"/>"></script>
    
<!-- FireBug Lite -->
    <!--  <script type='text/javascript' src='http://getfirebug.com/releases/lite/1.2/firebug-lite-compressed.js'></script> -->

<!-- Agrega codigo js para manejo de GUI de navegador protegida -->
    <fsn:browserCtrl />

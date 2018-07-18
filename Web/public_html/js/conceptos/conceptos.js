//******************************** PARA TODOS LOS PROCESOS **************************************
function calculaQuincenas(){
        var mcpQnaADescontar = document.getElementById("mcpQnaADescontar");
        
        var mcpQnaIni = document.getElementById("mcpQnaIni").value;
        var mcpQnaFin = document.getElementById("mcpQnaFin").value;
        
        var anioQnaIni =    parseInt(mcpQnaIni.substring(0, 4), 10);
        var qnaQnaIni  =    parseInt(mcpQnaIni.substring(4), 10);
        
        var anioQnaFin =    parseInt(mcpQnaFin.substring(0, 4), 10);
        var qnaQnaFin  =    parseInt(mcpQnaFin.substring(4), 10);
        
        if(anioQnaIni == anioQnaFin){    mcpQnaADescontar.value =  (qnaQnaFin -  qnaQnaIni) + 1;   }
        
        else if(anioQnaIni == (anioQnaFin - 1)){   mcpQnaADescontar.value =  ((24 - qnaQnaIni) + qnaQnaFin) + 1;   }
        
        else if(anioQnaIni < (anioQnaFin - 1)){
            var anios = 24 * (anioQnaFin - (anioQnaIni + 1));
            var qnas  = ((24 - qnaQnaIni) + qnaQnaFin) + 1;
            mcpQnaADescontar.value = anios + qnas;
        }
    }
    
    function calculaQnasAdeudo(){
        var mcpQnasAdeudo = document.getElementById("mcpQnasAdeudo");
        var mcpQnaIni = document.getElementById("mcpQnaIni").value;
        var mcpQnaFin = document.getElementById("mcpQnaFin").value;
        
        var anioQnaIni = parseInt(mcpQnaIni.substring(0,4), 10);
        var qnaQnaIni  =    parseInt(mcpQnaIni.substring(4), 10);
        
        var anioQnaFin =    parseInt(mcpQnaFin.substring(0, 4), 10);
        var qnaQnaFin  =    parseInt(mcpQnaFin.substring(4), 10);
        
        if(anioQnaIni == anioQnaFin){    mcpQnasAdeudo.value =  (qnaQnaFin -  qnaQnaIni) + 1;          }
        if(anioQnaIni == (anioQnaFin - 1)){     mcpQnasAdeudo.value =  ((24 - qnaQnaIni) + qnaQnaFin) + 1;    }
        
        if(anioQnaIni < (anioQnaFin - 1)){
            var anios = 24 * (anioQnaFin - (anioQnaIni + 1));
            var qnas  = 24 - qnaQnaIni + qnaQnaFin;
            mcpQnasAdeudo.value = anios + qnas +1;
        }
    }

//********************************** agregaConceptosTipoC ****************************************
function calculaMontoAC(ctrl){
        var idTipoCpto = document.getElementById("idTipoCpto").value;
        var idConcepto = document.getElementById("idConcepto").value;
       
        var tabSueldo = document.getElementById("tabSueldo").value;
        var tabCompensacion = document.getElementById("tabCompensacion").value;
        
        var montoLabel = document.getElementById("mcpMontoLabel");
        var monto = document.getElementById("mcpMonto");
        
        if((idTipoCpto == 'D' && idConcepto == 29) || (idTipoCpto == 'D' && idConcepto == 'LP')){
            var mcpHorasDiasLabel = document.getElementById("mcpHorasDiasLabel").value;
            var montoVar = (((  (parseFloat(tabSueldo) + parseFloat(tabCompensacion) ) / 30    ) * 1.4) * parseFloat(mcpHorasDiasLabel)).toFixed(2);
            montoLabel.value = montoVar;
            monto.value = parseFloat(montoVar);
        }
        if((idTipoCpto == 'P' && idConcepto == 'NM') ||
           (idTipoCpto == 'P' && idConcepto == 'PE') ||
           (idTipoCpto == 'P' && idConcepto == 'PF') ||
           (idTipoCpto == 'P' && idConcepto == 'PI') ||
           (idTipoCpto == 'P' && idConcepto == 'NP') ||
           (idTipoCpto == 'P' && idConcepto == 'PC') ){
            var diasD29Label = document.getElementById("mcpHorasDiasLabel").value;
            var montoVar = ((parseFloat(tabSueldo)/30 ) * parseFloat(diasD29Label)).toFixed(2);
            montoLabel.value = montoVar;
            monto = parseFloat(montoVar);
        }
        if(idTipoCpto == 'D' && idConcepto == 83){
            var mcpPorcentajeLabel = document.getElementById("mcpPorcentajeLabel").value;
            var montoVar = (((parseFloat(tabSueldo) + parseFloat(tabCompensacion)) / 2) * (parseFloat(mcpPorcentajeLabel) / 100)).toFixed(2);
            montoLabel.value = montoVar;
        }
        if( (idTipoCpto == 'P' && idConcepto == 'TA')||
            (idTipoCpto == 'P' && idConcepto == 'TD')||
            (idTipoCpto == 'P' && idConcepto == 'T0')||
            (idTipoCpto == 'P' && idConcepto == 'T1')||
            (idTipoCpto == 'P' && idConcepto == 'T2')||
            (idTipoCpto == 'P' && idConcepto == 'T3')||
            (idTipoCpto == 'P' && idConcepto == 'T4')||
            (idTipoCpto == 'P' && idConcepto == 'T5')||
            (idTipoCpto == 'P' && idConcepto == 'T6')||
            (idTipoCpto == 'P' && idConcepto == 'T7')||
            (idTipoCpto == 'P' && idConcepto == 'T8')||
            (idTipoCpto == 'P' && idConcepto == 'T9')
        ){
            var mcpHorasDiasLabel = document.getElementById("mcpHorasDiasLabel").value;
            var montoVar = (  (  (parseFloat(monto.value) / 30)   / 8) * parseFloat(mcpHorasDiasLabel)).toFixed(2);
            //var montoVar = parseFloat(monto.value);
            montoLabel.value = montoVar;
            monto.value = montoVar;
        }
        if(idTipoCpto == 'P' && idConcepto == 'PD'){
            var mcpHorasDiasLabel = document.getElementById("mcpHorasDiasLabel").value;
            var montoVar = (parseFloat(monto.value) * parseFloat(mcpHorasDiasLabel)).toFixed(2);
            montoLabel.value = montoVar;
            monto.value = montoVar;
        }
    }
    
    function validaMontoAC(){
        var url  = '/sireh/actualizacionNomina/agregarConceptoEmpleado.do';
        
        var idTipoCpto = document.getElementById("idTipoCpto").value;
        var idConcepto = document.getElementById("idConcepto").value;
        
        var mcpMonto = document.getElementById("mcpMonto");
        var mcpMontoLabel = document.getElementById("mcpMontoLabel").value;
        
        if(idTipoCpto == 'P' && idConcepto == '84'){
            var idNivelPto = 'G';document.getElementById("idNivelPto").value;
            if(idNivelPto == 'G'){
                if(parseFloat(mcpMontoLabel) <= 11460.00 ){
                    mcpMonto.value = parseFloat(mcpMontoLabel);
                    document.agrCptsO.action = url;
                    return true;
                } 
                if(parseFloat(mcpMontoLabel) > 11460.00 ){
                    alert("Su nivel es: " + idNivelPto + "  el monto proporcionado excede los $ 11460.00  permitidos");
                    return false;
                }
            }
            if(idNivelPto == 'H' || idNivelPto == 'I' || idNivelPto == 'J'){
                if( parseFloat(mcpMontoLabel) <= 7500.00 ){
                    mcpMonto.value = parseFloat(mcpMontoLabel);
                    document.agrCptsO.action = url;
                    return true;
                } 
                if( parseFloat(mcpMontoLabel) > 7500.00 ){  
                    alert("Su nivel es: " + idNivelPto + " el monto proporcionado excede los $ 7500.00  permitidos");  
                    return false;
                } 
            }
            if(idNivelPto == 'K'){
                if( parseFloat(mcpMontoLabel) <= 5916.00 ){
                    mcpMonto.value = parseFloat(mcpMontoLabel);
                    document.agrCptsO.action = url;
                    return true;
                } 
                if(parseFloat(mcpMontoLabel) > 5916.00 ){  
                    alert("Su nivel es: " + idNivelPto + " el monto proporcionado excede los $ 5916.00  permitidos");  
                    return false;
                } 
            }
            if(idNivelPto != 'G' || idNivelPto != 'H' || idNivelPto != 'I' || idNivelPto != 'J' || idNivelPto != 'K'){
                mcpMonto.value = parseFloat(mcpMontoLabel);
                document.agrCptsO.action = url;
                return true;
            }
        }
    }

//********************************** agregaConceptoTipoO ****************************************
 function calculaMontoAO(ctrl){
        var montoLabel = document.getElementById("mcpMontoLabel");
        var monto = document.getElementById("mcpMonto");
        
        var tabSueldo = document.getElementById("tabSueldo");
        var tabCompensacion = document.getElementById("tabCompensacion");
        
        var idTipoCpto = document.getElementById("idTipoCpto");
        var idConcepto = document.getElementById("idConcepto");
        
        for(i=0;i<ctrl.length;i++){
            if(ctrl[i].checked){
                porciento = ctrl[i].value;
            }
        }
        
        //  idTipoCpto= D, idConcepto=50
        if(idTipoCpto.value == "D" && idConcepto.value == 50){
            var montoVar = (((parseFloat(tabSueldo.value) + parseFloat(tabCompensacion.value)) / 2) * (porciento / 100)).toFixed(2);
            montoLabel.value = montoVar;
            monto.value = parseFloat(montoVar);
        }
        
        //  idTipoCpto= D, idConcepto=82
        else if(idTipoCpto.value == "D" && idConcepto.value == 82){
            var montoVar = (((parseFloat(tabSueldo.value) + parseFloat(tabCompensacion.value)) / 2) * (porciento/100)).toFixed(2);
            montoLabel.value = montoVar;
            monto.value = parseFloat(montoVar);
        }
        
         // idTipoCpto= D, idConcepto=AS
       else if(idTipoCpto.value == "D" && idConcepto.value == "AS"){
            var montoVar = 0.00;
            montoLabel.value = montoVar;
            monto.value = parseFloat(montoVar);
        }
        
        //  idTipoCpto= P, idConcepto=98
       else if(idTipoCpto.value == "P" && idConcepto.value == 98){
            var montoVar = ( ( (parseFloat(tabSueldo.value) + parseFloat(tabCompensacion.value) ) / 2) * (porciento/100) ).toFixed(2);
            montoLabel.value = montoVar;
            monto.value = parseFloat(montoVar);
        }
        
        //  idTipoCpto= P, idConcepto=AX
        else if(idTipoCpto.value == "P" && idConcepto.value == 'AX'){
            var montoVar = ( ( (parseFloat(tabSueldo.value) + parseFloat(tabCompensacion.value) ) / 2) * (porciento/100) ).toFixed(2);
            montoLabel.value = porciento;
            monto.value = parseFloat(porciento);
        }
        // conceptos que no han sido implementados
        else{
            var montoVar = parseFloat(0);
            montoLabel.value = '0.00';
            monto.value = parseFloat(0);
        }
    }

//********************************** agregaConceptoTipoS ****************************************
 function calculaMontoAS(){
        var idTipoCpto = document.getElementById("idTipoCpto").value;
        var idConcepto = document.getElementById("idConcepto").value;
        
        var montoLabel = document.getElementById("mcpMontoLabel");
        var monto = document.getElementById("mcpMonto").value;
        
        if(idTipoCpto == 'P' && idConcepto == 'T0'){
            var horasPTXLabel = document.getElementById("mcpHorasDiasLabel").value;
            var montoVar = (monto * parseFloat(horasPTXLabel)).toFixed(2);
            montoLabel.value = montoVar;
            monto = montoVar;
        }
        
        if((idTipoCpto == 'P' && idConcepto == 'P0') ||
           (idTipoCpto == 'P' && idConcepto == 'PA') ||
           (idTipoCpto == 'P' && idConcepto == 'PB') ){
            var dias = document.getElementById("mcpHorasDiasLabel").value;
            var montoVar = (monto * parseFloat(dias)).toFixed(2);
            montoLabel.value = montoVar;
        }
    }

//********************************** adeudoConceptoEmpleado ****************************************
function calculaMontoQuincenal(){
        var mcpMontoAdeudoLabel     = document.getElementById("mcpMontoAdeudoLabel").value;
        var mcpMontoQnalAdeudoLabel  = document.getElementById("mcpMontoQnalAdeudoLabel");
        var mcpMontoAdeudo          = document.getElementById("mcpMontoAdeudo");
        var mcpQnasAdeudo           = document.getElementById("mcpQnasAdeudo").value;
       
       if(mcpMontoAdeudoLabel == '' && mcpQnasAdeudo == ''){
        alert('1- Proporcione el Monto total y \n2.- Seleccione una quincena de la lista desplegable en el campo Hasta.');
       }
       else {
        var montoVar                        = parseFloat(mcpMontoAdeudoLabel) / mcpQnasAdeudo;
            mcpMontoAdeudo.value            = parseFloat(mcpMontoAdeudoLabel);
            mcpMontoQnalAdeudoLabel.value   = montoVar;
       }
    }

//********************************** editaConceptoTipoC ****************************************
function calculaMontoEC(){
        var idTipoCpto = document.getElementById("idTipoCpto").value;
        var idConcepto = document.getElementById("idConcepto").value;
        
        var tabSueldo = document.getElementById("tabSueldo").value;
        var tabCompensacion = document.getElementById("tabCompensacion").value;
        
        var montoLabel = document.getElementById("mcpMontoLabel");
        var monto = document.getElementById("mcpMonto");
        
        if((idTipoCpto == 'D' && idConcepto == 29) || (idTipoCpto == 'D' && idConcepto == 'LP')){
            var mcpHorasDiasLabel = document.getElementById("mcpHorasDiasLabel").value;
            var montoVar = ((( (parseFloat(tabSueldo) + parseFloat(tabCompensacion) ) /30 ) * 1.4) * parseFloat(mcpHorasDiasLabel)).toFixed(2);
            montoLabel.value = montoVar;
            monto = parseFloat(montoVar);
        }
        
        if(idTipoCpto == 'D' && idConcepto == 83){
            var mcpPorcentajeLabel = document.getElementById("mcpPorcentajeLabel").value;
            var montoVar = (((parseFloat(tabSueldo) + parseFloat(tabCompensacion)) / 2) * (parseFloat(mcpPorcentajeLabel) / 100)).toFixed(2);
            montoLabel.value = montoVar;
        }
        if( (idTipoCpto == 'P' && idConcepto == 'TA')||
            (idTipoCpto == 'P' && idConcepto == 'TD')||
            (idTipoCpto == 'P' && idConcepto == 'T0')||
            (idTipoCpto == 'P' && idConcepto == 'T1')||
            (idTipoCpto == 'P' && idConcepto == 'T2')||
            (idTipoCpto == 'P' && idConcepto == 'T3')||
            (idTipoCpto == 'P' && idConcepto == 'T4')||
            (idTipoCpto == 'P' && idConcepto == 'T5')||
            (idTipoCpto == 'P' && idConcepto == 'T6')||
            (idTipoCpto == 'P' && idConcepto == 'T7')||
            (idTipoCpto == 'P' && idConcepto == 'T8')||
            (idTipoCpto == 'P' && idConcepto == 'T9')
        ){
            var mcpHorasDiasLabel = document.getElementById("mcpHorasDiasLabel").value;
            var montoVar = (  (  (parseFloat(monto.value) / 30)   / 8) * parseFloat(mcpHorasDiasLabel)).toFixed(2);
            montoLabel.value = montoVar;
            monto.value = montoVar;
        }
        if(idTipoCpto == 'P' && idConcepto == 'PD'){
            var mcpHorasDiasLabel = document.getElementById("mcpHorasDiasLabel").value;
            var montoVar = (parseFloat(monto.value) * parseFloat(mcpHorasDiasLabel)).toFixed(2);
            montoLabel.value = montoVar;
            monto.value = montoVar;
        }
    }
    
    function calculaMontoPPX(ctrl){
        var idTipoCpto = document.getElementById("idTipoCpto").value;
        var idConcepto = document.getElementById("idConcepto").value;
        
        var montoLabel = document.getElementById("mcpMontoLabel");
        
        var monto = document.getElementById("mcpMonto").value;
        
        if((idTipoCpto == 'P' && idConcepto == 'NM') ||
           (idTipoCpto == 'P' && idConcepto == 'PC') ){
            var mcpHorasDiasLabel = document.getElementById("mcpHorasDiasLabel").value;
            var montoVar = (parseFloat(monto) * parseFloat(mcpHorasDiasLabel)).toFixed(2);
            montoLabel.value = montoVar;
            monto.value = montoVar;
        }
    }
    
    function validaMontoEC(){
        var url  = '/sireh/actualizacionNomina/modificarConceptoDelEmpleado.do';
        
        var idTipoCpto = document.getElementById("idTipoCpto").value;
        var idConcepto = document.getElementById("idConcepto").value;
        
        var monto = document.getElementById("mcpMonto");
        var montoLabel = document.getElementById("mcpMontoLabel").value;
    
        if(idTipoCpto == 'P' && idConcepto == '84'){
            var idNivelPto = 'G'; document.getElementById("idNivelPto").value;
            if(idNivelPto == 'G'){
                if(parseFloat(montoLabel) <= 11460.00 ){
                    monto.value = parseFloat(montoLabel);
                    document.agrCptsO.action = url;
                    return true;
                } 
                if(parseFloat(montoLabel) > 11460.00 ){
                    alert("Su nivel es: " + idNivelPto + "  el monto proporcionado excede los $ 11460.00  permitidos");
                    return false;
                }
            }
            if(idNivelPto == 'H' || idNivelPto == 'I' || idNivelPto == 'J'){
                if( parseFloat(montoLabel) <= 7500.00 ){
                    monto.value = parseFloat(montoLabel);
                    document.agrCptsO.action = url;
                    return true;
                } 
                if( parseFloat(montoLabel) > 7500.00 ){  
                    alert("Su nivel es: " + idNivelPto + "El monto proporcionado excede los $ 7500.00  permitidos");  
                    return false;
                } 
            }
            if(idNivelPto == 'K'){
                if( parseFloat(montoLabel) <= 5916.00 ){
                    monto.value = parseFloat(montoLabel);
                    document.agrCptsO.action = url;
                    return true;
                } 
                if(parseFloat(montoLabel) > 5916.00 ){  
                    alert("Su nivel es: " + idNivelPto + "El monto proporcionado excede los $ 5916.00  permitidos");  
                    return false;
                } 
            }
            if(idNivelPto != 'G' || idNivelPto != 'H' || idNivelPto != 'I' || idNivelPto != 'J' || idNivelPto != 'K'){
                 monto.value = parseFloat(montoLabel);
                document.agrCptsO.action = url;
                return true;
            }
        }
    }
    
//********************************** editaConceptoTipoO ****************************************
function calculaMontoEO(ctrl){
        var montoLabel = document.getElementById("mcpMontoLabel");
        var monto = document.getElementById("mcpMonto");
        
        var tabSueldo = document.getElementById("tabSueldo");
        var tabCompensacion = document.getElementById("tabCompensacion");
        
        var idTipoCpto = document.getElementById("idTipoCpto");
        var idConcepto = document.getElementById("idConcepto");
        
        for(i=0;i<ctrl.length;i++){
            if(ctrl[i].checked){ 
                porciento = ctrl[i].value;
            }
        }
        
        //  idTipoCpto= D, idConcepto=50
        if(idTipoCpto.value == "D" && idConcepto.value == 50){
            var montoVar = (((parseFloat(tabSueldo.value) + parseFloat(tabCompensacion.value)) / 2) * (parseFloat(porciento) / 100)).toFixed(2);
            montoLabel.value = montoVar;
            monto.value = parseFloat(montoVar);
        }
        
        //  idTipoCpto= D, idConcepto=82
        else if(idTipoCpto.value == "D" && idConcepto.value == 82){
            
            var montoVar = (((parseFloat(tabSueldo.value) + parseFloat(tabCompensacion.value)) / 2) * (parseInt(porciento)/100)).toFixed(2);
            montoLabel.value = montoVar;
            monto.value = parseFloat(montoVar);
        }
        
         // idTipoCpto= D, idConcepto=AS
        else if(idTipoCpto.value == "D" && idConcepto.value == "AS"){
            var montoVar = 0.00;
            montoLabel.value = montoVar;
            monto.value = parseFloat(montoVar);
        }
        
        //  idTipoCpto= P, idConcepto=98
        else if(idTipoCpto.value == "P" && idConcepto.value == 98){
            var montoVar = (((parseFloat(tabSueldo.value) + parseFloat(tabCompensacion.value)) / 2) * (parseInt(porciento)/100)).toFixed(2);
            montoLabel.value = montoVar;
            monto.value = parseFloat(montoVar);
        }
        else {
            var montoVar = parseFloat(0);
            montoLabel.value = '0.00';
            monto.value = parseFloat(0);
        }
    }
    
//********************************** editaConceptoTipoS ****************************************    
    function calculaMontoES(ctrl){
        var idTipoCpto = document.getElementById("idTipoCpto").value;
        var idConcepto = document.getElementById("idConcepto").value;
        
        var mcpHorasDias = document.getElementById("mcpHorasDias").value;
        
        var montoLabel = document.getElementById("mcpMontoLabel");
        var monto = document.getElementById("mcpMonto").value;
        
        if(idTipoCpto == 'P' && idConcepto == 'T0'){
            var mcpHorasDias = document.getElementById("mcpHorasDias").value;
            var montoVar = (monto * parseFloat(mcpHorasDias)).toFixed(2);
            montoLabel.value = montoVar;
            monto.value = montoVar;
        }
    }
    
    function calculaMontoPPXES(ctrl){
        var idTipoCpto = document.getElementById("idTipoCpto").value;
        var idConcepto = document.getElementById("idConcepto").value;
        
        var montoLabel = document.getElementById("mcpMontoLabel");
        var monto = document.getElementById("mcpMonto").value;
        
        if((idTipoCpto == 'P' && idConcepto == 'P0') ||
           (idTipoCpto == 'P' && idConcepto == 'PA') ||
           (idTipoCpto == 'P' && idConcepto == 'PB') ){
            var mcpHorasDiasLabel = document.getElementById("mcpHorasDiasLabel").value;
            var montoVar = (monto * parseFloat(mcpHorasDiasLabel)).toFixed(2);
            montoLabel.value = montoVar;
            monto = montoVar;
        }
    }
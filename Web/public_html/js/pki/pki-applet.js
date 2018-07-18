function getDefaultAppletTag(id, baseUrl, width, height, paramNames, paramValues) {
    if(baseUrl.lastIndexOf("/") + 1 == baseUrl.length) {
        baseUrl = baseUrl.substring(0, baseUrl.length - 1);
    }
    var archive = baseUrl + "/applet/pki/pki-applet.jar";
    return getAppletTag(navigator.userAgent, id, baseUrl, archive, "gob.shcp.security.pki.applet.AppletPKI.class", width, height, getDefaultNotPlugInMessage("notPlugIn"), getDefaultPlugInURL(), paramNames, paramValues, null);
}

function getDefaultAppletTag(id, baseUrl, width, height, paramNames, paramValues, javaArgs) {
    if(baseUrl.lastIndexOf("/") + 1 == baseUrl.length) {
        baseUrl = baseUrl.substring(0, baseUrl.length - 1);
    }
    var archive = baseUrl + "/applet/pki/pki-applet.jar";
    return getAppletTag(navigator.userAgent, id, baseUrl, archive, "gob.shcp.security.pki.applet.AppletPKI.class", width, height, getDefaultNotPlugInMessage("notPlugIn"), getDefaultPlugInURL(), paramNames, paramValues, javaArgs);
}

function getAppletTag(userAgent, id, baseUrl, archive, code, width, height, notPlugInMessage, plugInURL, params, values, javaArgs) {
    if(javaArgs == null || javaArgs == ""){
        javaArgs = "-Xmx512m";
    }
    
    if(userAgent.indexOf("MSIE")>0 && userAgent.indexOf("Win")>0 && userAgent.indexOf("Windows 3.1")<0 && userAgent.indexOf("Opera")<0) {
        var objectTags = "";
        objectTags += "<object id='" + id + "' name='" + id + "' classid='clsid:8AD9C840-044E-11D1-B3E9-00805F499D93' codebase='" + plugInURL + "' width='" + width + "' height='" + height + "' align='center'>";
        objectTags += "<param name='id' value='" + id + "'/>";
        objectTags += "<param name='name' value='" + id + "'/>";
        objectTags += "<param name='mayscript' value='true'/>";
        objectTags += "<param name='scriptable' value='true'/>";
        objectTags += "<param name='java_type' value='application/x-java-applet;jpi-version=1.3' />";
        objectTags += "<param name='java_archive' value='" + archive + "' />";
        objectTags += "<param name='java_code' value='" + code + "'  />";
        objectTags += "<param name='codebase_lookup' value='false' />";

        if(params!=null && values!=null && params.length==values.length) {
            for(i=0; i<params.length; i++) {
                objectTags += "<param name='" + params[i] + "' value='" + values[i] + "'  />";                
            }
            objectTags += "<param name='baseUrl' value='" + baseUrl + "'  />";
            objectTags += "<param name='java_arguments' value='" + javaArgs + "'/>";
        }
        objectTags += notPlugInMessage;
        objectTags += "</object>"
        return objectTags;
    } else if((navigator.appName.indexOf("Netscape")>=0 || navigator.appName.indexOf("Opera")>=0 || userAgent.indexOf("Opera")>=0) && ((userAgent.indexOf("Win")>0 && userAgent.indexOf("Win16")<0 && userAgent.indexOf("Mozilla/5")>=0) || userAgent.indexOf("Sun")>0)) {
        var embedTags = "";
        embedTags += "<embed id='" + id + "' name='" + id + "' type='application/x-java-applet' pluginspage='http://www.java.com/es/' mayscript='true' scriptable='true' archive='" + archive + "' code='" + code + "' width='" + width + "' height='" + height + "' align='center'";
        if(params!=null && values!=null && params.length==values.length) {
            for(i=0; i<params.length; i++) {
                embedTags += params[i] + "='" + values[i] + "' ";
            }
            embedTags += "baseUrl='" + baseUrl + "' ";
            embedTags += "java_arguments='" + javaArgs + "' ";
        }
        embedTags += "codebase_lookup='false' ";
        embedTags += ">";
        embedTags += "<noembed>";
        embedTags += notPlugInMessage;
        embedTags += "</noembed>";
        embedTags += "</embed>";
        return embedTags;
    } else {
        var appletTags = "";
        appletTags += "<applet id='" + id + "' name='" + id + "' mayscript archive='" + archive + "' code='" + code + "' width='" + width + "' height='" + height + "' align='center'>";
        if(params!=null && values!=null && params.length==values.length) {
            for(i=0; i<params.length; i++) {
                appletTags += "<param name='" + params[i] + "' value='" + values[i] + "'  />";
            }
            appletTags += "<param name='baseUrl' value='" + baseUrl + "'  />";
            appletTags += "<param name='java_arguments' value='" + javaArgs + "'/>";
        }
        appletTags += "<param name='codebase_lookup' value='false' />";        
        appletTags += notPlugInMessage;
        appletTags += "</applet>";
        return appletTags;
    }
}

function getDefaultNotPlugInMessage(id) {
    return "<table name='" + id + "' id='" + id + "' border='0' width='100%'><tr><td align='center'><br/><b>[ Se requiere Java Plug-in 1.3.1 o superior para ejecutar el Applet ]</b><br/><a href='http://www.java.com/es/' target='_blank'>http://www.java.com/es/</a><br/></td></tr></table>";
}

function getDefaultPlugInLoadingMessage(id) {
    return "<table name='" + id + "' id='" + id + "' border='0' width='100%'><tr><td align='center'><b>Descargando Java Plug-in. Puede tardar unos minutos...</b></td></tr></table>";
}

function getDefaultPlugInURL() {
    return "http://java.sun.com/products/plugin/1.3/jinstall-13-win32.cab#Version=1,3,0,mn";
}

function getDefaultPopupBlockerDetectedMessage(id) {
    var message = "<table name='" + id + "' id='" + id + "' bgcolor='#e0eaf4' border='0' width='100%'><tr><td>";
    message += "<font face='arial' size='2'><b>Se ha detectado un bloqueador de ventanas emergentes (pop-up).</b><br/>Es posible que la información de su acuse no se muestre correctamente. Verifique la configuración de su navegador y/o si tiene instalado algún software que bloquee ventanas pop-up.</font>";
    message += "</td></tr><table>";
    return message;
}

function getHeaderTags(id, title, subtitle, version) {
    var headerTags = "";
    headerTags += "<table name='" + id + "' id='" + id + "' border='0' cellpadding='0' cellspacing='0' width='100%'>";
    headerTags += "<tr>";
    headerTags += "<td valign='bottom' width='85%'><font face='arial' size='2'>"+ title +"</font></td>";
    headerTags += "</tr>";
    headerTags += "<tr>";
    headerTags += "<td valign='top' width='85%'><font face='arial' size='2'><b>"+ subtitle +"</b></font></td>";
    headerTags += "<td valign='top' width='15%'><p align='right'><font face='arial' size='2'>"+ version +"</font></p></td>";
    headerTags += "</tr>";
    headerTags += "</table>";
    return headerTags;
}

function isPopupBlockerDetected() {
    var isPopupBlocked = true;
    var testWindow1 = window.open("", "test", "width=0,height=0,left=2000,top=2000");
    var testWindow2 = window.open("", "test", "width=0,height=0");

    if(testWindow1==testWindow2) {
        isPopupBlocked = false;
    }
    if(testWindow1!=null) {
        testWindow1.blur();
        testWindow1.close();
    } else {
        isPopupBlocked = true;
    }
    return isPopupBlocked;
}

function resizeComponent(id, percentWidth, percentHeight) {
    document.getElementById(id).width = percentWidth;
    document.getElementById(id).height = percentHeight;
}

function showPopupWindow(url, features) {
    window.open(url, "link", features);
}

var arrayContent = new Array();
var arraySignatureContent = new Array();

function getElement(i) {
    return this.arrayContent[i];
}

function getSizeContent() {
    if(this.arrayContent == null) {
        return 0;
    }
    return this.arrayContent.length;
}

function getElementSignature(i) {
    return this.arraySignatureContent[i];
}

function getSizeContentSignature() {
    if(this.arraySignatureContent == null) {
        return 0;
    }
    return this.arraySignatureContent.length;
}

//Objeto javascript que encapsula el arreglo de datos de la forma
function arrayWrapper(thisArray) {
    this.arrayContent = thisArray;
    this.getElement = getElement; 
    this.getSizeContent = getSizeContent;
    return this;
}

//Objeto javascript que encapsula el arreglo de firmas de la forma
function arraySignatureWrapper(thisArray) {
    this.arraySignatureContent = thisArray;
    this.getElementSignature = getElementSignature; 
    this.getSizeContentSignature = getSizeContentSignature;
    return this;
}

//Metodo que se invoca desde el applet para setear el arreglo de datos 
//obtenido desde la forma a traves del metodo "getContent()" en el objeto
//javascript "arrayWrapper"
function getContentArray() {
    this.arrayContent = getContent();
    return new arrayWrapper(arrayContent);
}

//Metodo que se invoca desde el applet para setear el arreglo de firmas
//obtenido desde la forma a traves del metodo "getSignature()" en el objeto
//javascript "arraySignatureWrapper"
function getSignatureArray() {
    this.arraySignatureContent = getSignature();
    return new arraySignatureWrapper(arraySignatureContent);
}

/**
 *  Base64 encode / decode
 *  http://www.webtoolkit.info/
 **/
var Base64 = {
    // private property
    _keyStr : "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=",

    // public method for encoding
    encode : function (input) {
        var output = "";
        var chr1, chr2, chr3, enc1, enc2, enc3, enc4;
        var i = 0;
        input = Base64._utf8_encode(input);
        while (i < input.length) {
            chr1 = input.charCodeAt(i++);
            chr2 = input.charCodeAt(i++);
            chr3 = input.charCodeAt(i++);

            enc1 = chr1 >> 2;
            enc2 = ((chr1 & 3) << 4) | (chr2 >> 4);
            enc3 = ((chr2 & 15) << 2) | (chr3 >> 6);
            enc4 = chr3 & 63;

            if (isNaN(chr2)) {
                enc3 = enc4 = 64;
            } else if (isNaN(chr3)) {
                enc4 = 64;
            }

            output = output +
            this._keyStr.charAt(enc1) + this._keyStr.charAt(enc2) +
            this._keyStr.charAt(enc3) + this._keyStr.charAt(enc4);
        }
        return output;
    },

    // public method for decoding
    decode : function (input) {
        var output = "";
        var chr1, chr2, chr3;
        var enc1, enc2, enc3, enc4;
        var i = 0;
        input = input.replace(/[^A-Za-z0-9\+\/\=]/g, "");
        while (i < input.length) {
            enc1 = this._keyStr.indexOf(input.charAt(i++));
            enc2 = this._keyStr.indexOf(input.charAt(i++));
            enc3 = this._keyStr.indexOf(input.charAt(i++));
            enc4 = this._keyStr.indexOf(input.charAt(i++));

            chr1 = (enc1 << 2) | (enc2 >> 4);
            chr2 = ((enc2 & 15) << 4) | (enc3 >> 2);
            chr3 = ((enc3 & 3) << 6) | enc4;

            output = output + String.fromCharCode(chr1);
            if (enc3 != 64) {
                output = output + String.fromCharCode(chr2);
            }
            if (enc4 != 64) {
                output = output + String.fromCharCode(chr3);
            }
        }
        output = Base64._utf8_decode(output);
        return output;
    },

    // private method for UTF-8 encoding
    _utf8_encode : function (string) {
        string = string.replace(/\r\n/g,"\n");
        var utftext = "";
        for (var n = 0; n < string.length; n++) {
            var c = string.charCodeAt(n);
            if (c < 128) {
                utftext += String.fromCharCode(c);
            } else if((c > 127) && (c < 2048)) {
                utftext += String.fromCharCode((c >> 6) | 192);
                utftext += String.fromCharCode((c & 63) | 128);
            } else {
                utftext += String.fromCharCode((c >> 12) | 224);
                utftext += String.fromCharCode(((c >> 6) & 63) | 128);
                utftext += String.fromCharCode((c & 63) | 128);
            }
        }
        return utftext;
    },

    // private method for UTF-8 decoding
    _utf8_decode : function (utftext) {
        var string = "";
        var i = 0;
        var c = c1 = c2 = 0;
        while ( i < utftext.length ) {
            c = utftext.charCodeAt(i);
            if (c < 128) {
                string += String.fromCharCode(c);
                i++;
            } else if((c > 191) && (c < 224)) {
                c2 = utftext.charCodeAt(i+1);
                string += String.fromCharCode(((c & 31) << 6) | (c2 & 63));
                i += 2;
            } else {
                c2 = utftext.charCodeAt(i+1);
                c3 = utftext.charCodeAt(i+2);
                string += String.fromCharCode(((c & 15) << 12) | ((c2 & 63) << 6) | (c3 & 63));
                i += 3;
            }
        }
        return string;
    }
}
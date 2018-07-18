<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<table class="copyright">
    <tr>
        <td>
            <p>
                <div class="divBase"></div>
                <div class="infoBase"><spring:message code="footer.copyright.text"/></div>
                <div class="divBase"></div>
            </p>
        </td>
    </tr>
</table>
       
<script>
    var host = window.location.hostname;
    
    (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
    (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
    m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
    })(window,document,'script','//www.google-analytics.com/analytics.js','ga');
    ga('create', host == "www.mst.hacienda.gob.mx" ? 'UA-51891103-1':'UA-50791007-1', 'hacienda.gob.mx');
    ga('send', 'pageview');
</script>

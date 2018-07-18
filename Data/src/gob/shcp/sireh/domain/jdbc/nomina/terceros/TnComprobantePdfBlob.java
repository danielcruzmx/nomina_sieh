package gob.shcp.sireh.domain.jdbc.nomina.terceros;

import java.sql.Blob;

public class TnComprobantePdfBlob extends TnComprobantePdf{

    private java.sql.Blob cnArchivoPdfBlob;
    
    public TnComprobantePdfBlob(){}
    public TnComprobantePdfBlob(java.sql.Blob cnArchivoPdfBlob) {
    super();
    this.setCnArchivoPdfBlob(cnArchivoPdfBlob);
    }

    public void setCnArchivoPdfBlob(Blob cnArchivoPdfBlob) {
        this.cnArchivoPdfBlob = cnArchivoPdfBlob;
    }

    public Blob getCnArchivoPdfBlob() {
        return cnArchivoPdfBlob;
    }
}

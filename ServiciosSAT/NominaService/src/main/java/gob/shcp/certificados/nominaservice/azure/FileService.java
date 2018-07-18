package gob.shcp.certificados.nominaservice.azure;

import com.microsoft.azure.storage.StorageException;
import com.microsoft.azure.storage.StorageUri;
import com.microsoft.azure.storage.blob.CloudBlockBlob;
import gob.shcp.certificados.nominaservice.model.PaqueteEnvio;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 *
 * @author omar_gomez
 */
public class FileService {

    //public static final String url ="https://intgnomina.blob.core.windows.net/contenedorarchivoscva0506151x5/";
    //public static final String sas ="?sr=c&si=ReadWrite&sig=5NBycw4IYdVI45uYh%2FJF9Qp2Tw3glGNWl5dJk%2B7WOuU%3D";

    public static final String url ="https://anexo20cfdinominauat.blob.core.windows.net/contenedorarchivoscva0506151x5/";
    public static final String sas ="?sv=2015-12-11&si=contenedorarchivoscva0506151x5-15C5C6537C9&sr=c&sig=6G7LA1jS%2F9NzdNyPJYQ3Ibp9tQZ5L8A%2FSDd1aLoc0Uw%3D";
    
    public static URI upload(PaqueteEnvio envio) throws StorageException, URISyntaxException, IOException{
        
        String direccion = url+envio.getFileName()+sas;
        URI uri = new URI(direccion);
        CloudBlockBlob cloudBlockBlob = new CloudBlockBlob(new StorageUri(uri));
        System.out.println("Before uploaded:"+cloudBlockBlob.exists());
        ByteArrayInputStream bis = new ByteArrayInputStream(envio.getResource());
        cloudBlockBlob.upload(bis, envio.getResource().length);
        System.out.println("URI:"+cloudBlockBlob.getUri().toString());
        System.out.println("After uploaded:"+cloudBlockBlob.exists());

        return cloudBlockBlob.getUri();
    }
}

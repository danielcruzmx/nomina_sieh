package gob.shcp.sireh.ws;

/*import gob.shcp.fsn.service.Service;
import gob.shcp.fsn.service.factory.ServiceFactory;
import gob.shcp.sireh.model.spc.registro.CustomParticipantesInscritosDTO;
import gob.shcp.sireh.service.spc.capcer.registro.RegistroCursoSPCService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;*/

public class SHCPWS /*extends SpringBeanAutowiringSupport implements ApplicationContextAware*/ {
    
    /*private ServiceFactory serviceFactory;
    
    @Autowired
    private ApplicationContext applicationContext;

    /**
     * @param applicationContext ApplicationContext
     
    @Required
    public void setApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }
    
    public List<CustomParticipantesInscritosDTO> participantesInscritos(Integer idCurso) {
        List<CustomParticipantesInscritosDTO> customParticipantesInscritosDTO = getService(RegistroCursoSPCService.class).getParticipantesInscritos(2015, idCurso);
        return customParticipantesInscritosDTO;
    }

    protected <T extends Service> T getService(Class<T> serviceClass) {
        if (serviceFactory == null) {
            if (applicationContext != null) {
                serviceFactory = 
                        (ServiceFactory)applicationContext.getBean(ServiceFactory.BEAN_NAME, ServiceFactory.class);
            } else {
                throw new IllegalStateException("Cannot determine 'applicationContext' bean. Make sure this class gets constructed in a Spring web application.");
            }
        }
        final String localServiceName = serviceClass.getName() + Service.LOCAL_SUFFIX;
        if (serviceFactory.containsService(localServiceName)) {
            return (T)serviceFactory.getService(localServiceName);
        }
        return (T)serviceFactory.getService(serviceClass);
    }*/
}

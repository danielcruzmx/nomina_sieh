package gob.shcp.sireh.ws;

import gob.shcp.sireh.model.spc.registro.CustomParticipantesInscritosDTO;

import java.rmi.Remote;
import java.rmi.RemoteException;

import java.util.Collection;

public interface MyWebService1 extends Remote {
    public Dept getDeptInfo(int id) throws RemoteException;

    public String getDeptInfoString(int id) throws RemoteException;

    public Collection<CustomParticipantesInscritosDTO> getParticipantesInscritos(int idCurso) throws RemoteException;
}

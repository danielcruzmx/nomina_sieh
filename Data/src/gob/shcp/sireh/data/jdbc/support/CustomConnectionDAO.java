package gob.shcp.sireh.data.jdbc.support;

import gob.shcp.fsn.service.data.DataService;

import java.sql.Connection;

public interface CustomConnectionDAO extends DataService{
    public Connection getMyConnection();
}

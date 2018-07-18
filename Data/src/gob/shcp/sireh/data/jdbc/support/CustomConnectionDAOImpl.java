package gob.shcp.sireh.data.jdbc.support;

import gob.shcp.fsn.data.support.JdbcDAO;

import java.sql.Connection;

import java.sql.SQLException;





public class CustomConnectionDAOImpl extends JdbcDAO  implements CustomConnectionDAO{
    public Connection getMyConnection(){
        
    Connection conn = null;
        try {
            conn = super.getJdbcTemplate().getDataSource().getConnection();
        } catch (SQLException e) {
            // TODO
        }
        return conn;
    }
}

package gob.shcp.sireh.service.parser;

import gob.shcp.fsn.model.Model;

import java.io.InputStream;

import java.util.List;
import java.util.Map;

public interface ParserService {

    /*Parsea todo el archivo*/
    public <T extends Model> List<T> parseFile(Parser parser, InputStream data, final Class<T> modelClass);

    /*Parsea solo el rango de lineas*/
    public <T extends Model> List<T> parseLines(Parser parser, InputStream data, int begin, int fin, final Class<T> modelClass);

    /*Parsea desde la linea begin hasta el final del archivo*/
    public <T extends Model> List<T> parseFrom(Parser parser, InputStream data, int begin, final Class<T> modelClass);

    /*SI OCURRE UN ERROR EN EL PARSEO EL PROCESO CONTINUA REGISTRANDO EL ERROR POR NUMERO DE LINEA*/
    /*Parsea todo el archivo*/
    public <T extends Model> List<T> parseFile(Parser parser, InputStream data, final Class<T> modelClass, Map errors);

    /*Parsea solo el rango de lineas*/
    public <T extends Model> List<T> parseLines(Parser parser, InputStream data, int begin, int fin, final Class<T> modelClass, Map errors);

    /*Parsea desde la linea begin hasta el final del archivo*/
    public <T extends Model> List<T> parseFrom(Parser parser, InputStream data, int begin, final Class<T> modelClass, Map errors);
}

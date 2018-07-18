package gob.shcp.sireh.service.parser;

import gob.shcp.fsn.model.Model;

import java.io.InputStream;

import java.util.List;
import java.util.Map;

public interface Parser {

    public <T extends Model> List<T> parseFile(InputStream data, Class<T> modelClass);

    public <T extends Model> List<T> parseLines(InputStream data, int begin, int fin, Class<T> modelClass);

    public <T extends Model> List<T> ParseFrom(InputStream data, int begin, Class<T> modelClass);

    public <T extends Model> List<T> parseFile(InputStream data, Class<T> modelClass, Map errors);

    public <T extends Model> List<T> parseLines(InputStream data, int begin, int fin, Class<T> modelClass, Map errors);

    public <T extends Model> List<T> parseFrom(InputStream data, int begin, Class<T> modelClass, Map errors);
}

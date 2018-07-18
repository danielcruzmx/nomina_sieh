package gob.shcp.sireh.service.parser;

import com.blackbear.flatworm.FileFormat;
import com.blackbear.flatworm.MatchedRecord;
import com.blackbear.flatworm.errors.FlatwormConversionException;
import com.blackbear.flatworm.errors.FlatwormInputLineLengthException;
import com.blackbear.flatworm.errors.FlatwormInvalidRecordException;
import com.blackbear.flatworm.errors.FlatwormUnsetFieldValueException;

import gob.shcp.fsn.model.Model;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ParserFlatFile implements Parser {

    private FileFormat ff;
    private String format;

    public ParserFlatFile() {
    }

    public <T extends Model> List<T> parseFile(InputStream data, Class<T> modelClass) {
        List<Model> lista = new ArrayList<Model>();

        try {
            BufferedReader bufIn = new BufferedReader(new InputStreamReader(data));
            MatchedRecord results = null;
            Constructor constructor;
            Object dto;

            try {
                constructor = modelClass.getConstructor();
                dto = constructor.newInstance();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
            //lee los registros del archivo y los almacena en el bean bajo lavalidaciond e laplantilla xml 
            while ((results = ff.getNextRecord(bufIn)) != null) {
                results.getRecordName().equals(format);
                if (results.getRecordName().equals(format)) {
                    dto = results.getBean("datosDTO");
                    lista.add((Model)dto);
                }
            }
        } catch (FlatwormUnsetFieldValueException flatwormUnsetFieldValueError) {
            flatwormUnsetFieldValueError.printStackTrace();
            return null;
        } catch (FlatwormInvalidRecordException e) {
            e.printStackTrace();
            return null;
        } catch (FlatwormInputLineLengthException e) {
            e.printStackTrace();
            return null;
        } catch (FlatwormConversionException e) {
            e.printStackTrace();
            return null;
        }
        return (List<T>)lista;
    }

    public <T extends Model> List<T> parseLines(InputStream data, int begin, int fin, Class<T> modelClass) {
        return null;
    }

    public <T extends Model> List<T> ParseFrom(InputStream data, int begin, Class<T> modelClass) {
        return null;
    }

    public <T extends Model> List<T> parseFile(InputStream data, Class<T> modelClass, Map errors) {
        return null;
    }

    public <T extends Model> List<T> parseLines(InputStream data, int begin, int fin, Class<T> modelClass, 
                                                Map errors) {
        return null;
    }

    public <T extends Model> List<T> parseFrom(InputStream data, int begin, Class<T> modelClass, Map errors) {
        return null;
    }

    public Model parseLine(InputStream data, int line, Class<Model> modelClass) {
        return null;
    }

    public void setFf(FileFormat ff) {
        this.ff = ff;
    }

    public FileFormat getFf() {
        return ff;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getFormat() {
        return format;
    }
}

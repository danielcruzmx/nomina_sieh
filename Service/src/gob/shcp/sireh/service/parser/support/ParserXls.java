package gob.shcp.sireh.service.parser.support;

import gob.shcp.fsn.model.Model;
import gob.shcp.fsn.service.ServiceException;
import gob.shcp.sireh.model.merito.EncabezadoDTO;
import gob.shcp.sireh.service.parser.Parser;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import net.sf.jxls.reader.ReaderBuilder;
import net.sf.jxls.reader.ReaderConfig;
import net.sf.jxls.reader.XLSReadMessage;
import net.sf.jxls.reader.XLSReadStatus;
import net.sf.jxls.reader.XLSReader;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import org.xml.sax.SAXException;

public class ParserXls implements Parser {
   private InputStream inputStreamXml;
   private EncabezadoDTO encabezadoDTO;
   
   public ParserXls(InputStream inputStreamXml) {
       this.inputStreamXml = inputStreamXml;
       encabezadoDTO = new EncabezadoDTO();
   }

   public <T extends Model> List<T> parseFile(InputStream data, Class<T> modelClass) {
        InputStream inputStreamXls = data;
        List<Model> returnValueList = null;

        try {
            Map beans = new HashMap();
            String ultimo = null;
            StringTokenizer token = new StringTokenizer(modelClass.getName(), ".");
            if (token.countTokens() > 0) {
                while (token.hasMoreTokens()) {
                    ultimo = token.nextToken();
                }
            } else {
                throw new ServiceException("Exception to parser ParserXls[parseFile] ");
            }
            Model modelo = null;
            String nameBean = "";
            nameBean = ultimo.substring(0, 1).toLowerCase() + ultimo.substring(1);
            Constructor constuctors[] = modelClass.getConstructors();
            Constructor constructor = constuctors[0];
            Class[] parameterTypes = constructor.getParameterTypes();
            modelo = (Model)constructor.newInstance(null);
            beans.put(nameBean, modelo);
            beans.put("encabezadoDTO", encabezadoDTO);
            ReaderConfig.getInstance().setSkipErrors(true);
            XLSReader mainReader = ReaderBuilder.buildFromXML(inputStreamXml);
            XLSReadStatus readStatus = mainReader.read(inputStreamXls, beans);
            
            if (readStatus.isStatusOK()) {
                Method method = modelClass.getMethod("getListModel", null);
                Object returnValue = method.invoke(modelo, null);
                returnValueList = (List<Model>)returnValue;
            } else {
                List errores = readStatus.getReadMessages();
                StringBuffer buffer = new StringBuffer();
                buffer.append("Exception to parser ParserXls[parseFile] - ");
                
                for (Object msj: errores) {
                    XLSReadMessage m = (XLSReadMessage)msj;
                    buffer.append(m.getMessage());
                }
                throw new ServiceException(buffer.toString());
            }

        } catch (FileNotFoundException e) {
            throw new ServiceException(e.toString());
        } catch (IOException e) {
            throw new ServiceException(e.toString());
        } catch (SAXException e) {
            throw new ServiceException(e.toString());
        } catch (InvalidFormatException e) {
            throw new ServiceException(e.toString());
        } catch (NoSuchMethodException e) {
            throw new ServiceException(e.toString());
        } catch (InstantiationException e) {
            throw new ServiceException(e.toString());
        } catch (IllegalAccessException e) {
            throw new ServiceException(e.toString());
        } catch (InvocationTargetException e) {
            throw new ServiceException(e.toString());
        } finally {
            try {
                if (inputStreamXls != null)
                    inputStreamXls.close();
            } catch (IOException e) {
                throw new ServiceException(e.toString());
            }
            try {
                if (inputStreamXml != null)
                    inputStreamXml.close();
            } catch (IOException e) {
                throw new ServiceException(e.toString());
            }
        }
        return (List<T>)returnValueList;
    }

    public <T extends Model> List<T> parseLines(InputStream data, int begin, int fin, Class<T> modelClass){
        return null;
    }

    public <T extends Model> List<T> ParseFrom(InputStream data, int begin, Class<T> modelClass){
        return null;
    }

    public <T extends Model> List<T> parseFile(InputStream data, Class<T> modelClass, Map errors){
        return null;
    }

    public <T extends Model> List<T> parseLines(InputStream data, int begin, int fin, Class<T> modelClass, Map errors){
        return null;
    }

    public <T extends Model> List<T> parseFrom(InputStream data, int begin, Class<T> modelClass, Map errors){
        return null;
    }

    public InputStream getInputStreamXml() {
        return inputStreamXml;
    }
    
    public void setInputStreamXml(InputStream inputStreamXml) {
        this.inputStreamXml = inputStreamXml;
    }

    public EncabezadoDTO getEncabezadoDTO() {
        return encabezadoDTO;
    }

    public void setEncabezadoDTO(EncabezadoDTO encabezadoDTO) {
        this.encabezadoDTO = encabezadoDTO;
    }
}
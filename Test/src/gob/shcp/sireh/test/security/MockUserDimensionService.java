package gob.shcp.sireh.test.security;

import gob.shcp.fsn.model.support.DynaDTO;
import gob.shcp.fsn.service.security.UserDimensionService;

import java.util.HashMap;
import java.util.Map;

public class MockUserDimensionService implements UserDimensionService {
    public final String[] unidades = 
    { "100", "110", "111", "112", "113", "114", "115", "116", "200", "210", "211", "212", "213", "214", "215", "300", 
      "310", "311", "312", "313", "314", "400", "410", "411", "412", "415", "416", "418", "419", "500", "510", "511", "512", 
      "513", "600", "610", "611", "612", "613", "700", "710", "711", "712", "713", "714", "715", "716", "X01", "X02", 
      "X03", "X04", "X05", "X06", "X07", "X08", "X09", "X10", "X11", "X12", "X14", "X15", "X16", "X17", "X18", "X19", 
      "X20", "X21", "X22", "X23", "X24", "X25", "XXX" };

    public MockUserDimensionService() {
    }

    /**
     * @param userName String
     * @param applicationName String
     * @param operationYear String
     * @return DynaDTO
     */
    public DynaDTO getDimensionValues(String userName, String applicationName, String operationYear) {
        final DynaDTO dimensions = new DynaDTO();
        Map<String, String> dimensionValues = new HashMap<String, String>();
        for (String unidad: unidades) {
            dimensionValues.put(unidad, null);
        }
        dimensions.put("sirehunidad", dimensionValues);
        return dimensions;
    }
}


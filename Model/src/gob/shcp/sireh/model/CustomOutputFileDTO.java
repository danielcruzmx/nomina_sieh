package gob.shcp.sireh.model;



import gob.shcp.fsn.model.Model;




    public class CustomOutputFileDTO implements java.io.Serializable, Model {

        private String registro;

        public CustomOutputFileDTO() {
        }

        public CustomOutputFileDTO(String registro) {
            this.registro = registro;
        }

        public void setRegistro(String registro) {
            this.registro = registro;
        }

        public String getRegistro() {
            return registro;
        }



}

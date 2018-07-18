package gob.shcp.sireh.ws;

import java.util.Collection;

public class TestClient {

    public TestClient() {
    }

    public static void main(String[] args) {
        MyCompanyWS company = new MyCompanyWS();
        Collection<Dept> depts = company.getMyDepts();
        
        System.out.println("\n--> Now printing departments:");
        for (Dept b: depts) {
            System.out.println("\nDept: " + b.getId() + "-" + b.getName());
            
            Collection<Emp> emps = (Collection<Emp>)b.getEmployees();
            for (Emp c: emps) {
                System.out.println("Emp: " + c.getId() + "-" + c.getName());
            }
        }
        
        System.out.println("--> Call Dept Info Method: " + company.getDeptInfoString(20));
        System.out.println("--> Call Dept Info2 Method: " + company.getDeptInfo(20));
    }
}

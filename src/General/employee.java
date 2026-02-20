package General;


public class employee {

    protected int empid;
    private String ename;
    protected double basic;

    public employee(int empid, String ename, double basic) {
        this.empid = empid;
        this.ename = ename;
        this.basic = basic;
    }


    public double earnings() {
        double da = 0.80 * basic;   // 80% DA
        double hra = 0.15 * basic;  // 15% HRA
        return basic + da + hra;
    }

    public int getEmpid() {
        return empid;
    }
}

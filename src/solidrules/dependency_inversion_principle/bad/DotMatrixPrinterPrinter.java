package solidrules.dependency_inversion_principle.bad;

public class DotMatrixPrinterPrinter {
    private String inc;

    public String getInc() {
        return inc;
    }

    public void setInc(String inc) {
        this.inc = inc;
    }


    public void print(String text){
        System.out.println(text);
    }
}

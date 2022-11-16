package ee.ufcg.maratonajava.javacore.YColecoes.dominio;

public class SmartPhone {

    private String serialNumber;
    private String marca;

    public SmartPhone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(this == obj) return true;
        if(obj.getClass() != this.getClass()) return false;
        return this.serialNumber != null && this.serialNumber.equals(((SmartPhone) obj).getSerialNumber());

    }

    @Override
    public int hashCode() {
        return serialNumber == null ? 0 : serialNumber.hashCode();
    }


    @Override
    public String toString() {
        return "SmartPhone{" +
                "serialNumber='" + serialNumber + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }


}

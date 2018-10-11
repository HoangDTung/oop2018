package week4.task1;

public class Tao extends HoaQua{
    private String ngaynhap;

    public String getNgaynhap()
    {
        return ngaynhap;
    }

    public void setNgaynhap(String nhap)
    {
        ngaynhap=nhap;
    }

    Tao(){}
    Tao(String nhap)
    {
        ngaynhap = nhap;
    }
    Tao(String l, String xx, String nn)
    {
        super.setLoai(l);
        super.setXuatxu(xx);
        ngaynhap = nn;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args)
    {
        Tao t = new Tao();
        t.setLoai("Tao");
        t.setXuatxu("EU");
        t.setNgaynhap("10/11/2018");
        System.out.println(t);

    }
}

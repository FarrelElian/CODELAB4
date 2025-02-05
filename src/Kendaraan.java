package kendaraan;

public abstract class Kendaraan {
    private String name;
    private String model;
    private String warna;
    private int tahun;

    public abstract void Start();

    public abstract void Stop();

    public abstract void Brake();

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public void getInfo() {
        System.out.println("Info Kendaraan:");
        System.out.println("Nama: " + name);
        System.out.println("Model: " + model);
        System.out.println("Warna: " + warna);
        System.out.println("Tahun: " + tahun);
    }

    public abstract void fly();
}
package kendaraan.khusus;

import kendaraan.Kendaraan;

public class Pesawat extends Kendaraan implements kendaraan.khusus.FlyAble {

    @Override
    public void Start() {
        System.out.println("Pesawat started");
    }

    @Override
    public void Stop() {
        System.out.println("Pesawat stopped");
    }

    @Override
    public void Brake() {
        System.out.println("Pesawat brakes applied");
    }

    @Override
    public void fly() {
        System.out.println("Pesawat flying");
    }
}

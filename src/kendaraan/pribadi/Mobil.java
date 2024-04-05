package kendaraan.pribadi;

import kendaraan.Kendaraan;

public class Mobil extends Kendaraan {

    @Override
    public void Start() {
        System.out.println("Motor started");
    }

    @Override
    public void Stop() {
        System.out.println("Motor stopped");
    }

    @Override
    public void Brake() {
        System.out.println("Motor brakes applied");
    }

    @Override
    public void fly() {

    }
}
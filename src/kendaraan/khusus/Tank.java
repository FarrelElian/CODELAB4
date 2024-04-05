package kendaraan.khusus;

import kendaraan.Kendaraan;

public  class Tank extends Kendaraan implements kendaraan.khusus.ShootAble {

    @Override
    public void Start() {
        System.out.println("Tank started");
    }

    @Override
    public void Stop() {
        System.out.println("Tank stopped");
    }

    @Override
    public void Brake() {
        System.out.println("Tank brakes applied");
    }

    @Override
    public void fly() {

    }

    @Override
    public void Shoot(String target) {
        System.out.println("Tank shooting at " + target);
    }
}

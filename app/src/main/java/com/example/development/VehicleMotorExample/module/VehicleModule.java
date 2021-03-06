package com.example.development.VehicleMotorExample.module;

import javax.inject.Singleton;

import com.example.development.VehicleMotorExample.model.Motor;
import com.example.development.VehicleMotorExample.model.Vehicle;
import dagger.Module;
import dagger.Provides;

@Module
public class VehicleModule {

    @Provides
    @Singleton
    Motor provideMotor() {
        return new Motor();
    }

    @Provides
    @Singleton
    Vehicle provideVehicle(Motor motor) {
        return new Vehicle(motor);
    }
}
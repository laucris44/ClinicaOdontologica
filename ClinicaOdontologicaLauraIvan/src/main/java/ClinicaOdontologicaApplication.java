package ClinicaOdontologica;


import dao.BD;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClinicaOdontologicaApplication {
    public static void main(String[] args) {
        BD.crearTablas();
        SpringApplication.run(ClinicaOdontologicaApplication.class, args);
    }
}

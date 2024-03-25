package ma.enset.hopital;

import ma.enset.hopital.entities.Patient;
import ma.enset.hopital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Date;
import java.util.stream.Stream;

// implements CommandLineRunner
@SpringBootApplication
public class HopitalApplication {
    /*
    @Autowired
    private PatientRepository patientRepository;

     */

    public static void main(String[] args) {
        SpringApplication.run(HopitalApplication.class, args);
    }
    /*
    @Override
    public void run(String... args) throws Exception {
        Patient patient=new Patient();
        patient.setNom("mohammed");
        patient.setDateNaissance(new Date());
        patient.setMalade(false);
        patient.setScore(102);

        Patient patient1=new Patient(null,"yassine",new Date(),false,101);

        Patient patient2=Patient.builder()
                .nom("imane")
                .dateNaissance(new Date())
                .malade(false)
                .score(200)
                .build();

        patientRepository.save(patient);
        patientRepository.save(patient1);
        patientRepository.save(patient2);
    }

     */

    //@Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository){return args -> {
        Stream.of("XXXX","Hassan","Najat").forEach(name->{
            Patient patient=new Patient();
            patient.setNom(name);
            patient.setDateNaissance(new Date());
            patient.setMalade(false);
            patient.setScore(101);
            patientRepository.save(patient);
        });
    };
    }
    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}

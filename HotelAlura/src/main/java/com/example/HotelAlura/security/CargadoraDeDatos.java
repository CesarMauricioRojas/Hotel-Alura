package com.example.HotelAlura.security;



import com.example.HotelAlura.domain.Usuario;
import com.example.HotelAlura.domain.UsuarioRol;
import com.example.HotelAlura.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class CargadoraDeDatos implements ApplicationRunner {
    private UsuarioRepository usuarioRepository;
    @Autowired
    public CargadoraDeDatos(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public void run(ApplicationArguments args) {
        BCryptPasswordEncoder cifrador= new BCryptPasswordEncoder();
        String passACifrarUser="12345";
        String passCifradaUser=cifrador.encode(passACifrarUser);

        Usuario user= new Usuario("fulano","12345",UsuarioRol.ROLE_USER);

        try{
            usuarioRepository.save(user);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}


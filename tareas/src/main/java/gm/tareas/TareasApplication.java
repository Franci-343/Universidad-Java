package gm.tareas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import gm.tareas.presentacion.SistemasTareasFx;
import javafx.application.Application;

@SpringBootApplication
public class TareasApplication {

	public static void main(String[] args) {
		//SpringApplication.run(TareasApplication.class, args);
		Application.launch(SistemasTareasFx.class, args);
	}

}

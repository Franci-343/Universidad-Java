package gm.tareas.presentacion;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import gm.tareas.TareasApplication;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SistemasTareasFx extends Application {
    private ConfigurableApplicationContext applicationContext;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void init() {
        this.applicationContext = new SpringApplicationBuilder(TareasApplication.class).run();
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/templates/index.fxml"));
        loader.setControllerFactory(applicationContext::getBean);
        Scene escena = new Scene(loader.load());
        stage.setScene(escena);
        stage.show();
    }

    @Override
    public void stop() {
        try {
            if (applicationContext != null) {
                applicationContext.close();
            }
        } catch (Exception e) {
            System.err.println("Error al cerrar el contexto de Spring: " + e.getMessage());
        } finally {
            javafx.application.Platform.exit();
        }
    }
}
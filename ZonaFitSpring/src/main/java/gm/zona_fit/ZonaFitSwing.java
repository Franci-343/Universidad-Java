package gm.zona_fit;

import javax.swing.SwingUtilities;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import gm.zona_fit.gui.ZonaFitForma;
import com.formdev.flatlaf.FlatDarculaLaf;

//@SpringBootApplication
public class ZonaFitSwing {

	public static void main(String[] args) {
		// modo oscuro con flatlaf
		FlatDarculaLaf.setup();
		// TODO Auto-generated method stub
		ConfigurableApplicationContext contextoSpring = new SpringApplicationBuilder(ZonaFitSwing.class).
				headless(false).web(WebApplicationType.NONE).run(args);
		SwingUtilities.invokeLater(()-> {
			ZonaFitForma zonaFitForma = contextoSpring.getBean(ZonaFitForma.class);
			zonaFitForma.setVisible(true);
		});
	}

}
package service;

import java.math.BigDecimal;
import java.math.MathContext;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		try {
			
			SimpleDateFormat convertidor = new SimpleDateFormat("dd/MM/yyyy");
			
			String dato = "30-01-2026";
			
			Date fecha = convertidor.parse(dato);
			
			JOptionPane.showMessageDialog(null, fecha);
			
			Date hoy = new Date();
			
			JOptionPane.showMessageDialog(null, convertidor.format(hoy));
			
			LocalDate hoyLD = hoy.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
			LocalDate fechaLD = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

			JOptionPane.showMessageDialog(null, hoyLD);
			JOptionPane.showMessageDialog(null, fechaLD);
			hoyLD = hoyLD.minusDays(5);
			JOptionPane.showMessageDialog(null, hoyLD);


		}catch (ParseException pe) {
			JOptionPane.showMessageDialog(null, "Error al convertir" + pe.getMessage(), "Error!!!!", JOptionPane.ERROR_MESSAGE);
		}

		try {
			
			BigDecimal salario = new BigDecimal(1000000);
			BigDecimal aumento = new BigDecimal("50000");
			BigDecimal renta = new BigDecimal(0.05);
			BigDecimal salarioNeto = BigDecimal.ZERO; 
			
			salario = salario.add(aumento);
			salarioNeto = salario.multiply(renta, MathContext.DECIMAL64);
			
			JOptionPane.showMessageDialog(null, salarioNeto);
			

			
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}

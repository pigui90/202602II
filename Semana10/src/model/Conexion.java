package model;

public class Conexion {
	
	private static Conexion conn;
	private static String ip;
	private static int puerto;
	
	private Conexion() {
		
	}
	
	public static Conexion getConn() {
		if(Conexion.conn == null) {
			conn = new Conexion();
			conn.ip = "127.0.0.1";
			conn.puerto = 8080;
		}
		
		return Conexion.conn;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "IP: " + ip + "\nPuerto: " + puerto;
	}
	
	

}

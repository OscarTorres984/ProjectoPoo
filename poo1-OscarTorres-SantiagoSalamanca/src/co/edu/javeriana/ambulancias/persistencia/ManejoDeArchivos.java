package co.edu.javeriana.ambulancias.persistencia;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.StringTokenizer;

import co.edu.javeriana.banco.negocio.Banco;

public class ManejoDeArchivos {
	public static int ingresarClientes (Banco banco, String linea){
		File inFile = new File("./"+"clientes.txt");
		Scanner input= null;
		int indice=0;
		try {	
		input = new Scanner(inFile);
		input.nextLine().trim(); //#CLIENTES DEL BANCO
		linea=input.nextLine().trim();//viene #cedula------ o #FIN
		while (!linea.equals("#FIN")) {
		linea=input.nextLine().trim(); //vienen datos de un cliente
		indice = procesarClientes (linea, banco);
		linea=input.nextLine().trim(); //#transacciones:
		linea=input.nextLine().trim(); //#tipo(consignar/retirar)-----monto
		linea=input.nextLine().trim(); //vienen datos de transaccion o 0
			while (!linea.equals("0")) {
				procesarTransaccion(linea, banco ,indice);
				linea=input.nextLine().trim();
			}
			linea=input.nextLine().trim();
			}
		}catch(Exception e) {
			System.out.println("excepcion inesperada:" + e.getMessage());
		}
		finally {
		input.close();
		}
		return indice;
		}

		public static int procesarClientes(String linea, Banco banco){
			StringTokenizer st = new StringTokenizer(linea, "*");
		    String cedula = st.nextToken().trim();
		    String nombre = st.nextToken().trim();
		    String codigoCuenta = st.nextToken().trim();
		    String saldoInicial = st.nextToken().trim();
		    long codigoCuentaL = Long.parseLong(codigoCuenta);
		    long saldoInicialL = Long.parseLong(saldoInicial);
		    int i=0;
		    i= banco.agregarCliente (cedula, nombre, codigoCuentaL, saldoInicialL);
		    return i;
		}
		public static void procesarTransaccion(String linea, Banco banco, int i){
			StringTokenizer st = new StringTokenizer(linea, "*");
		        String operacion = st.nextToken().trim();
		        String valor = st.nextToken().trim();
		        long valorL = Long.parseLong(valor);
		        if (operacion.equals("retirar")){
		        	banco.retirar (i, valorL, banco);
		        }
		        if (operacion.equals("consignar")){
		        	banco.consignar (i, valorL, banco);
		        }
		}

		private static boolean guardarSistema(Banco banco) {
		File outFile = new File("./"+"datos.bin");
		FileOutputStream outStream = null;
		ObjectOutputStream dataOutStream = null;
		boolean resultado = false;
		try {
		outStream = new FileOutputStream(outFile);
		dataOutStream = new ObjectOutputStream(outStream);
		dataOutStream.writeObject(banco);
		resultado = true;
		} 
		catch (FileNotFoundException e) {
		System.out.println("Error en ruta de archivo:" + e.getMessage());
		}
		catch (IOException e) {
		System.out.println("Error grabando el archivo:" + e.getMessage());
		}
		catch (Exception e) {
		System.out.println("excepcion inesperada:" + e.getMessage());
		}
		finally {
		try {
		dataOutStream.close();
		outStream.close();
		}
		catch (IOException e) {
		System.out.println("excepcion cerrando el archivo:" + e.getMessage());
		}
		}
		return resultado;
		}

		private static Banco cargarSistema() {
			Banco banco=null;
			File inFile = new File("./"+"datos.bin");
			FileInputStream inStream = null;
			ObjectInputStream dataInStream = null;
			try {
			inStream = new FileInputStream(inFile);
			dataInStream = new ObjectInputStream(inStream);
			banco = (Banco)dataInStream.readObject();
			}
			catch (FileNotFoundException e) {
			System.out.println("Error en ruta de archivo:" + e.getMessage());
			}
			catch (IOException e) {
			System.out.println("Error leyendo del archivo:" + e.getMessage());
			}
			catch (Exception e) {
			System.out.println("excepcion inesperada:" + e.getMessage());
			}
			finally {
			try {
			dataInStream.close();
			inStream.close();
			}
			catch (IOException e) {
			System.out.println("excepcion cerrando el archivo:" + e.getMessage());
			}
			}
			return banco;
		}

		}

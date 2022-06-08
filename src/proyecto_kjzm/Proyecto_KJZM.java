/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_kjzm;
import  java.io.file;
import  java.io.FileInputStream;
import  java.io.FileOutputStream ;
import  Java . yo _ flujo de entrada ;
import  Java . yo _ flujo de salida ;
import  Java . útil import java.io.OutputStream;
_ calendario ;
import  organización . apache _ poi _ hpsf . fecha ;
import  organización . apache _ poi _ hssf _ modelo de usuario HSSFLibro de trabajo ;
import  organización . apache _ poi _ ss . modelo de usuario celular ;
import  organización . apache _ poi _ ss . modelo de usuario tipo de celda ;
import organización . apache _ poi _ ss . modelo de usuario fila ;
import  organización . apache _ poi _ ss . modelo de usuario hoja ;
import  organización . apache _ poi _ ss . modelo de usuario libro de trabajo ;
import  organización . apache _ poi _ ss . modelo de usuario WorkbookFactory ;
       

public class Proyecto_KJZM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Libro  de trabajo wb = nuevo  HSSFWorkbook ();
            probar ( OutputStream  fileOut = new  FileOutputStream ( "ARCHIVO.xls" )) {
            Hoja  hoja1 = wb . createSheet ( "Primer Hoja" );
            Hoja  hoja2 = wb . createSheet ( "Segunda Hoja" );
            Hoja  hoja = wb . createSheet ( "Tercer Hoja" );
            Fila  fila = hoja . crear Fila ( 0 );                          
            fila _ crear celda ( 0 ). setCellValue ( "Número" );  
            fila _ crear celda ( 1 ). setCellValue ( "Nombre" );   
            fila _ crear celda ( 2 ). setCellValue ( "Edad" );  
            fila _ crear celda ( 3 ). setCellValue ( "Correo" );
             fila _ crear celda ( 4). setCellValue ( "Sexo" );
              fila _ crear celda ( 5 ). setCellValue ( "Profesion" );

            fila = hoja . crearFila ( 1 ); //crear fila 2
            fila _ crear celda ( 0 ). establecerValorCelda ( 1 );  
            fila _ crear celda ( 1 ). setCellValue ( "Rogelio Gonzalez" );   
            fila _ crear celda ( 2 ). establecerValorCelda ( 12 );  
            fila _ crear celda ( 3 ). setCellValue ( "rocjog@gmail.com" ); 
            fila _ crear celda ( 4 ). setCellValue ( "masculino" ); 
            fila _ crear celda ( 5 ). setCellValue ( "estudiante" ); 


            fila = hoja . crearFila ( 2 ); //crear fila 3
            fila _ crear celda ( 0 ). establecerValorCelda ( 2 ); 
            fila _ crear celda ( 1 ). setCellValue ( "Laura Gomez" ); 
            fila _ crear celda ( 2 ). establecerValorCelda ( 35 );  
            fila _ crear celda ( 3 ). setCellValue ( "laulau@gmail.com" );
            fila _ crear celda ( 4 ). setCellValue ( "femenino" ); 
            fila _ crear celda ( 5 ). setCellValue ( "empleada" ); 


            fila = hoja . crearFila ( 3 ); //crear fila 2
            fila _ crear celda ( 0 ). establecerValorCelda ( 3 ); 
            fila _ crear celda ( 1 ). setCellValue ( "TAMARA ORTIX" ); 
            fila _ crear celda ( 2 ). establecerValorCelda ( 25 ); /
            fila _ crear celda ( 3 ). setCellValue ( "tamix12@gmail.com" );
            fila _ crear celda ( 4 ). setCellValue ( "femenino" ); 
            fila _ crear celda ( 5). setCellValue ( "meastra" ); 




            wb _ escribir ( salidaarchivo );
        } captura ( Excepción  e ) {
            sistema _ fuera _ println ( por ejemplo , getMessage ());
        }
    }

}    
    }
    
}

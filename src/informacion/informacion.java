/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package informacion;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author JM
 */
public class informacion {
File archivo;
 public void cargarinformacion(){
try{
archivo = new File("AgendaContactos.txt");
if(archivo.createNewFile()){
JOptionPane.showMessageDialog(null,"AGREGADO CON EXITO");
 }
 }catch(IOException e){
 System.out.println(e);
 }
 } 
 public void agregarInformacion(persona Persona){
 try{
 FileWriter escritura = new FileWriter(archivo, true);
 escritura.write(persona.getNombre()+"%"+persona.getEdad()+"%"+persona.getSexo()+"%"+persona.getCorreo()+"%"+persona.getCelular()"\r\n");
 escritura.close();
 }catch(Exception e){
 System.out.println(e);
 }
 }    
}

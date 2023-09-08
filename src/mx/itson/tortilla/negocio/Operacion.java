/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.tortilla.negocio;

/**
 * Contiene métodos para trabajar con cadenas de texto.
 * @author Pedro Blanco
 */
public class Operacion {

   /** 
* Separa una cadena de texto en donde encuentre el caracter guion medio.
* @param oracion Es la oración que sera separada en fracciones.
* @return  Array en String en cuyo componente sera una fraccion de la cadena otorgada.
*/


   public String [] separar (String oracion){
   String [] resultado = oracion.split(",");
  

       return resultado;

}


}

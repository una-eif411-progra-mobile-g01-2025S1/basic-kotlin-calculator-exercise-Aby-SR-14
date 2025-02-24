/* Universidad Nacional de Costa Rica
* Laboratorio viernes 21 de feberero, 2025
* Abigail Salas Ramirez
* 402570890
* */
/**
 * La clase calculadora permite realizar
 * operaciones aritméticas básicas con dos números
 */
class Calculator{
    /**
     * Suma de dos números y devuelve el resultado
     *  @param a primer numero a sumar
     *  @param b segundo numero a sumar
     *  @return la suma entre 'a' y 'b'
     */
    fun add (a : Double, b: Double): Double{
        return a+b
    }
    /**
     * Resta de dos números y devuelve el resultado
     *  @param a primer numero a restar
     *  @param b segundo numero a restar
     *  @return la resta entre 'a' y 'b'
     */
    fun subtract (a : Double, b: Double): Double{
        return a-b
    }
    /**
     * Multiplicación de dos números y devuelve el resultado
     *  @param a primer numero a multiplicar
     *  @param b segundo numero a multiplicar
     *  @return la multipliacación entre 'a' y 'b'
     */
    fun multiply (a : Double, b: Double): Double{
        return a*b
    }
    /**
     * División de dos números y devuelve el resultado
     *  @param a primer numero a dividir
     *  @param b segundo numero a dividir
     *  @return la división entre 'a' y 'b',
     *  si 'b' es 0 lanza un error
     */
    fun divide(a: Double, b:Double): Double{
        if(b == 0.0){
            throw error("No se puede dividir entre cero")
        }
        return a/b
    }
}
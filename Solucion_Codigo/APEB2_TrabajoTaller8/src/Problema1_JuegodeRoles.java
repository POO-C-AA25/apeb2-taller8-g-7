/**
*## Problema 1 - Juego de roles
* 
* En un juego de rol, se desea implementar un sistema de combate en el que participen diferentes tipos de **personajes**: **guerreros**, **magos** y **arqueros**. Cada personaje tiene atributos y habilidades únicas, así como diferentes métodos de _ataque_ y _defensa_.
* 
* El objetivo del juego es enfrentar a los personajes en batallas y determinar el ganador en función de sus habilidades, estrategias y atributos. Los **guerreros** se destacan por su fuerza y habilidades cuerpo a cuerpo, los **magos** por sus hechizos y poderes mágicos, y los **arqueros** por su precisión y habilidades a distancia.
* 
* El sistema debe permitir crear nuevos personajes de cada tipo, asignarles atributos iniciales, como _puntos de vida_ y _nivel de experiencia_, y permitirles _subir de nivel_ a medida que ganan batallas. Además, se debe implementar un algoritmo de combate que evalúe las habilidades de cada personaje y determine el resultado de la batalla.
* 
* Utilizando programación orientada a objetos, herencia y polimorfismo, implementa el sistema de combate y las clases necesarias para representar a los diferentes tipos de personajes. Asegúrate de que cada tipo de personaje tenga sus propias habilidades y métodos de ataque y defensa, y que puedan interactuar entre sí en las batallas.
* 
* 
* > [!Note]
* > Para solucionar lo anterior se debe generar lo siguiente:
* > 
* > - Un diagrama exclusivo que involucren las funcionalidades principales del juego.
* > - Una solución en lenguaje de programación Java. Usar Polimorfismo en la solución.
* > - Clase de prueba/ejecutor, que demuestre la funcionalidad del juego.
* 
* @author Lenovo
*/
public class Problema1_JuegodeRoles
{
    
}

abstract class Personaje
{    
    public int habilidades;
    public int estrategias;
    public int atributos;
    public int puntosVida;
    public int experiencia;
    public int nivelXP;
    public int batallasGanadas;
    public int puntosAtaque;
    public int puntosDefensa;
    public abstract boolean batalla(Personaje contrincante);
}

class Guerrero extends Personaje
{
    public int habilidades;
    @Override
    public boolean batalla(Personaje contrincante)
    {
        return false;
    }
    
    
}
class Arquero extends Personaje
{
    public int atributos;
    @Override
    public boolean batalla(Personaje contrincante)
    {
        
        return false;
    }
}

class Mago extends Personaje
{
    public int estrategias;
    @Override
    public boolean batalla(Personaje contrincante)
    {
        
        return false;
    }
}
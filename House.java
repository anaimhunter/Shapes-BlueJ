/**
 * La clase House es un objeto que contien objetos circle, square y triangle
 * @author Ana M.Hunter
 */
class House
{
    //Variables de instacia
    Circle window;
    Triangle roof;
    Square structure;
    Square door;
    int xPosition;
    int yPosition;
    
    /**
     * Constructor
     */
    House()
    {
        window=new Circle();
        roof= new Triangle();
        structure= new Square();
        door= new Square();
    }
    
    /**
     * Crea la casa 
     * @param xPosition Parametro que repesenta la posicion en el eje de las x
     * @param yPosition Parametro que repesenta la posicion en el eje de las y
     */
    void MakeHouse(int xPosition,int yPosition)
    {
        House house =new House();
        house.Draw();
        house.Accommodate(xPosition,yPosition);
    }
    
    /**
     * Crea los objetos de las clases circle, square y triangle
     */
    void Draw()
    {
        roof.makeVisible();
        window.makeVisible();
        structure.makeVisible();
        door.makeVisible();
        
    }
    
    /**
     * Acomoda los objetos circle, square triangle para formar la casa
     * @param xPosition Parametro que repesenta la posicion en el eje de las x
     * @param yPosition Parametro que repesenta la posicion en el eje de las y
     */
    void Accommodate(int xPosition, int yPosition)
    {
      roof.changeColor("black");
      roof.changeSize(100,100);
      roof.moveHorizontal(100+ xPosition);
      roof.moveVertical(yPosition);
      window.changeColor("red");
      window.moveHorizontal(115 + xPosition); 
      window.moveVertical(yPosition);
      structure.changeColor("green");
      structure.changeSize(75);
      structure.moveHorizontal(55 + xPosition);
      structure.moveVertical(65+ yPosition);
      door.changeColor("blue");
      door.moveHorizontal(75 + xPosition);
      door.moveVertical(110 + yPosition);
    }
}
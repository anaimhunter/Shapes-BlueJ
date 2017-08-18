class House
{
    //Variables de instacia
    Circle window;
    Triangle roof;
    Square structure;
    Square door;
    
    //Constructor
    House()
    {
        window=new Circle();
        roof= new Triangle();
        structure= new Square();
        door= new Square();
    }
    
    //Método
    void Draw()
    {
        roof.makeVisible();
        window.makeVisible();
        structure.makeVisible();
        door.makeVisible();
        
    }
    
    void Accommodate()
    {
      roof.changeColor("black");
      roof.changeSize(100,100);
      roof.moveHorizontal(100);
      window.changeColor("red");
      window.moveHorizontal(115);  
      structure.changeColor("green");
      structure.changeSize(75);
      structure.moveHorizontal(55);
      structure.moveVertical(65);
      door.changeColor("blue");
      door.moveHorizontal(75);
      door.moveVertical(110);
    }
}
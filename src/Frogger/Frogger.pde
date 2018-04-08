int frogx = 200;
int frogy = 380;


void setup(){
  size(400,400);

  
  
  
  
  
  
  
  
  
}
void draw(){
  background(0,255,50);
  fill(0,0,0);
  ellipse(200,380,50,50);
  if(frogx<0){
   frogx = 0; 
  }
  else if(frogx>400){
   frogx = 400; 
  }
  
}

void keyPressed()
{
  if(key == CODED){
      if(keyCode == UP)
      {
      //Frog Y position goes up
      }
      else if(keyCode == DOWN)
      {
        //Frog Y position goes down 
      }
      else if(keyCode == RIGHT)
      {
       //Frog X position goes right
      }
      else if(keyCode == LEFT)
      {
        //Frog X position goes left
      }
   }
}









class Car
{
int xposition;
int yposition;
int size;
int speed;
 
 
 Car(int xposition, int yposition, int size, int speed){
 this.xposition = xposition;
 this.yposition = yposition;
 this.size = size;
 this.speed = speed;
  
  void display() 
  {
    fill(0,255,0);
    rect(Position of X , Position of Y,  Size of your Car, 50);
  }

 
 
 
 
 
 
 
 
 
 
 
 }
  



}
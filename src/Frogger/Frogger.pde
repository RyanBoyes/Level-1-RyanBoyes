int frogx = 200;
int frogy = 350;

Car c1 = new Car(70,300,20,7);
Car c2 = new Car(120,260,20,7);
Car c3 = new Car(30,220,20,6);
Car c4 = new Car(305,180,20,4);
Car c5 = new Car(276,140,20,10);
Car c6 = new Car(0,100,20,5);
Car c7 = new Car(190,60,20,4);



void setup(){
  size(400,400);

  
  
  
  
  
  
  
  
  
}
void draw(){
  background(0,255,50);
  fill(0,0,0);
  ellipse(200,380,50,50);
  
  
  c1.movel();
  c1.display();
  if(intersects(c1)==true){
    frogx = 200;
    frogy = 350;
  }
  c2.mover();
  c2.display();
  if(intersects(c2)==true){
    frogx = 200;
    frogy = 350;
  }
  c3.movel();
  c3.display();
  if(intersects(c3)==true){
    frogx = 200;
    frogy = 350;
  }
  c4.mover();
  c4.display();
  if(intersects(c4)==true){
    frogx = 200;
    frogy = 350;
  }
  c5.movel();
  c5.display();
  if(intersects(c5)==true){
    frogx = 200;
    frogy = 350;
  }
  c6.mover();
  c6.display();
  if(intersects(c6)==true){
    frogx = 200;
    frogy = 350;
  }
  c7.movel();
  c7.display();
if(intersects(c7)==true){
    frogx = 200;
    frogy = 350;
  }

 
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
      frogy-=20;
      }
      else if(keyCode == DOWN)
      {
        frogy+=20; 
      }
      else if(keyCode == RIGHT)
      {
       frogx+=20;
      }
      else if(keyCode == LEFT)
      {
        frogx-=20;
      }
   }
}





boolean intersects(Car car) {
if ((frogy > car.getY() && frogy < car.getY()+50) && (frogx > car.getX() && frogx < car.getX()+car.getSize())){
          return true;
}
    else{ 
        return false;
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
 }
 
 
 
  void display() 
  {
    fill(0,255,0);
    rect(xposition, yposition,  size, 50);
  }

void movel()
{
 this.xposition-=speed;
 if(xposition<0){
  xposition=400; 
 }
  }
 void mover()
 {
  this.xposition+=speed;
  if(xposition>400){
   xposition=0; 
  }
 }
 private int Xposition;
 private int Yposition;
 private int Size;
 public void setX(int Xposition){
   this.Xposition = Xposition;
 }
 int getX(){
   return this.Xposition;
 }
 
public void setY(int Yposition){
 this.Yposition = Yposition; 
}
 int getY(){
   return this.Yposition;
 }
 
 public void setSize(int Size){
  this.Size = Size; 
 }
 int getSize(){
   return this.Size;
 }
 
 
 
 
 
 
 
  



}
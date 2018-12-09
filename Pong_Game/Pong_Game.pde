import ddf.minim.*;  
Minim minim;
AudioSample sound;
PImage backgroundImage;

int x=500;
int y=450;
int y2=450;
int y3=450;
int speed=5;
int speed2=5;
int speed3=0;
int speed4=0;
int paddle1=450;
int paddle2=450;

void setup(){
  size(1000,900);
  minim = new Minim (this);
  sound = minim.loadSample("pop.wav", 128);
  backgroundImage= loadImage("WWI.jpg");
  backgroundImage.resize(1000,900);
}

void draw(){
  image(backgroundImage, 0, 0);
  fill(255, 0, 0);
  stroke(255, 0, 0);
  ellipse(x, y, 25, 25);
  rect(900,paddle2, 20, 100);
  rect(100,paddle1, 20, 100);
  x+=speed;
  y+=speed2;
  paddle2+=speed3;
  paddle1+=speed4;
    
  if(x>width){
    speed*=-1;
    sound.trigger();
  }
  else if(x<width-1000){
    speed*=-1;
    sound.trigger();
  }
  if(y>height){
    speed2*=-1;
    sound.trigger();
  }
  if(y<height-900){
    speed2*=-1;
    sound.trigger();
  }

  if(intersects(x, y, 900, paddle2, 20, 100)){
    speed*=-1;
  }
  if(intersects(x, y, 100, paddle1, 20, 100)){
    speed*=-1;
  }
}

void keyPressed(){
    if(keyCode==38){
    speed3=-7;
  }
  if(keyCode==40){
    speed3=7;
  }  
    if(keyCode==87){
    speed4=-7;
  }  
    if(keyCode==83){
    speed4=7;
  }  
}
void keyReleased(){
  if(keyCode==38){
    speed3=0; 
  }
  if(keyCode==40){
    speed3=0;
  }  
    if(keyCode==87){
    speed4=0;
  }  
    if(keyCode==83){
    speed4=0;
  }  
}
  boolean intersects(int x, int y, int paddleX, int paddleY, int paddleLength, int paddleHeight) {
     if (y > paddleY && x > paddleX && x < paddleX + paddleLength && y < paddleY + paddleHeight)
          return true;
     else 
          return false;
}
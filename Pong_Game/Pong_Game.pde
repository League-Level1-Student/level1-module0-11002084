import ddf.minim.*;  
Minim minim;
AudioSample sound;

int x=500;
int y=450;
int speed=5;
int speed2=5;
void setup(){
  size(1000,900);
  minim = new Minim (this);
  sound = minim.loadSample("pop.wav", 128);
}
void draw(){
  background(0,0,0);
  fill(255, 255, 255);
  stroke(255, 255, 255);
  ellipse(x, y, 25, 25);
  x+=speed;
  y+=speed2;
  if(x>width){
    speed*=-1;
  }
  else if(x<width-1000){
    speed*=-1;
  }
  if(y>height){
    speed2*=-1;
    sound.trigger();
  }
  if(y<height-900){
    speed2*=-1;
  }
}
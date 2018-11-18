  PImage record;
  int rotation= 0;
      import ddf.minim.*;
    Minim minim;
    AudioPlayer song;
void setup(){
  size(600,600);
  record=loadImage("record.png");
  record.resize(600,600);
    minim = new Minim(this);
    song = minim.loadFile("guitar.wav", 512);
}
void draw(){
  if (mousePressed){
  rotateImage(record, rotation);
  rotation+=10;
  song.play();
  }else{
   song.pause(); 
  }
  image(record, 0, 0);
}
void rotateImage(PImage image, int amountToRotate) {
     translate(width/2, height/2);
     rotate(amountToRotate*TWO_PI/360);
     translate(-image.width/2, -image.height/2);
}
int y=0;
int x=500;
int rand=(int) random(1000);
int score=0;
void setup(){
  size(1000,900);
}
void draw(){
  background(200,200,0);
  fill(0,0,200);
  stroke(0,0,100);
  ellipse(x,y,25,75);
  fill(255,0,0);
  rect(mouseX, 800, 150, 100);
  y+=10;
  if(y==1000){
    checkCatch(x);
    rand=(int) random(1000);
    y=0;
    x=rand;
  }
  fill(0,0,0);
  textSize(16);
  text("Score: " + score, 20 ,20);
}
void checkCatch(int number){
  if (number>mouseX && number<mouseX+150){
    score++;
  }
  else if (score>0){
    score--;
  }
  println("Your score is now: " +score);
}
void setup() {
  size(1000, 1000);
  background(100, 100, 100);
}
void draw() {
  makeMagical();
  for (int i=0; i<700; i++) {
    float x=random(1000);
    float y=random(1000);
    fill(random(0, 255), random(0, 255), random(0, 255));
    ellipse(getWormX(i), getWormY(i), 5, 5);
  }
}
float frequency = .001;
float noiseInterval = PI;

void makeMagical() {
  fill( 0, 0, 0, 10 );
  rect(0, 0, width, height);
  noStroke();
}

float getWormX(int i) {
  return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
  return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}
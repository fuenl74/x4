void setup(){
  size(800,800);
  background(255);
 
}
void draw(){
 
  rectMode(CENTER);
  fill(100,125,130);
  rect(0,0,500,400);
  fill(100,1,190);
  textSize(30);
  text("CLICK for white",0,100 );
  text("CLICK outside for black",0,500 );
 
    
}
  void mousePressed() {
  if ( hit( mouseX,mouseY,100,100,100,100) ) {
background(255);
 } else {
      background(0);
 
    }
  }


//// OTHER METHODS:  detect "hit"
// Return true if "near"
boolean hit( float x1, float y1, float x2, float y2, float w, float h ) {
  boolean result;

  // +++++ STUB ALWAYS RETURNS TRUE!
  if ( abs(x1-y1) < w && abs(y1-y2)<h ) {
    result=  true;
  } else {
    result=false;
  }

  return result;
}


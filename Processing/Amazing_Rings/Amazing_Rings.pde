float X = 100;
float X2 = 400;

void setup(){
 size(500,500); 
}

void draw() {
  fill(255,255,255);
  rect(0,0,500,500);
  noFill();
  for(int i = 20; i>0; i--){
   
    if(X == 400){
      X=100;
    }else if(X2 == 100){
      X2=400;
    }
    ellipse(X,250,i*10,i*10);
    ellipse(X2,250,i*10,i*10);
    

  }
  
  X=X+1;
  X2=X2-1;
  
}
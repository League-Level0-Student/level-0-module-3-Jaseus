size(300,300);

draw(); {
  for(int i = 10; i>0; i--){
    if(i%2==0){
     fill(255,0,0); 
    }else{
     fill(255,255,255); 
    }
    ellipse(150,150,i*10,i*10);
  }
}
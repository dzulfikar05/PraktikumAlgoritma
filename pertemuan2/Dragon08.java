public class Dragon08 {
    int x, y, width, height;
    
    public Dragon08(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    void moveLeft(){

        if(detectX()){
            x--; 
        }
    }
    void moveRight(){
        if(detectX()){
            x++;
        }
    }
    void moveUp(){
        if(detectY()){
            y--; 
        }
    }
    void moveDown(){
        if(detectY()){
            y++;
        }
    }

    boolean detectX(){
        boolean status = false;
        if(x<0 || x>width){
            detectCollision();
        }else{
            status = true;
        }
        return status;
    }
    boolean detectY(){
        boolean status = false;
        if(y<0 || y>height){
            detectCollision();
        }else{
            status = true;
        }
        return status;
    }

    void detectCollision(){
        System.out.println("Game Over");
    }
}

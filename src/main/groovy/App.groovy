import processing.core.*

class App extends PApplet {

    void settings(){
        size(400, 400)
    }

    void draw(){
        background(0)
        rect(mouseX, mouseY, 10, 10)
    }

    static void main(String[] args) {
        PApplet.main("App")
    }
}

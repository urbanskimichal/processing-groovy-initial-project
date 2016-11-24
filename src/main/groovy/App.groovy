import processing.core.*

class App extends PApplet {

    void settings(){
        size(400, 400, P3D)
    }

    void draw(){
        background(0)
        translate(mouseX, mouseY)
        box(30)
    }

    static void main(String[] args) {
        PApplet.main("App")
    }
}

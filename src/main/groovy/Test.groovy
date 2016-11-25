import processing.core.PApplet

class Test {

    PApplet app

    Test(PApplet app) {
        this.app =  app
    }

    void settings() {
        app.size(400, 400, app.P3D)
    }

    void setup() {
        //setup code
    }

    void draw() {
        app.background(0)
        app.translate(app.mouseX, app.mouseY)
        app.noFill()
        app.stroke(255, 0, 0)
        app.box(60)
        app.translate(-app.mouseX, -app.mouseY)
    }

}

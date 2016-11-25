import processing.core.PApplet

class Test2 {

    PApplet app

    Test2(PApplet app) {
        this.app =  app
    }

    void draw() {
        app.translate(app.mouseX, app.mouseY)
        app.stroke(0, 255, 0)
        app.sphere(50)
        app.translate(-app.mouseX, -app.mouseY)
    }
}

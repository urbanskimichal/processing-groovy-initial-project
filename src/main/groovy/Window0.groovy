import processing.core.PApplet

class Window0 extends PApplet {

    Test test
    Test2 test2

    void settings(){
        test = new Test(this)
        test.settings()
    }

    void setup() {
        test2 = new Test2(this)
    }

    void draw(){
        test.draw()
        test2.draw()
    }

    static void run() {
        PApplet.main("Window0")
    }
}

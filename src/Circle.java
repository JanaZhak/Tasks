class Circle{

    private double x; // абсцисса центра
    private double y; // ордината центра
    private double radius; //радиус

    public interface Figure {
        void draw();
        double getArea();
    }

    public void Circle (double radius){
        this.radius = radius;
    }


    public void draw() {
        System.out.println("Рисуем круг");
    }

    public double getArea(){
        return Math.PI*this.radius*this.radius; // Вычисляем площадь
    }

    public double getRadius(){
        return this.radius;
    }


    public static void main(String[] args) {
        // реализуем интерфейс
        Circle one = new Circle() {


            public void draw() {
                System.out.println("Рисуем круг");
            }


        };

        one.draw();
        System.out.println("Площадь = " + one.getArea());

    }

}



//        3.Создайте интерфейс, который представляет геометрическую фигуру.
//        Сделайте так, чтобы класс Circle реализовывал ваш интерфейс.
//        Создайте класс Квадрат, который тоже реализует интерфейс Геометрическая фигура.
//        Поместите в переменную типа Фигура сначала круг, и вызовите несколько методов.
//        Потом поместите в нее квадрат, и вызовите несколько методов. Какие принципы ООП вы использовали в этом задании?
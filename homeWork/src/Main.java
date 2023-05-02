public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        EmployerService service = new EmployerService();
        Employer firstEmployer = new Employer("Зубренко Михаїл Петрович" , "Крадій в законі", "m.zybrenko@hillel.ua",
                "+380978899638", "51");
        service.printEmployer(firstEmployer);
        System.out.println(firstEmployer.getFullName() + " сів в машину і перевірив чи заведена тачка?");
        car.checkStatus();
        System.out.println(firstEmployer.getFullName() + ", " + firstEmployer.getPosada() + ", " + "не зрозумів жарту адже йому аж" + " " +
                firstEmployer.getYears()+ " " + "тож він з усіх сил почав намагатися запустити двигун.");
        car.start();car.checkStatus();
        System.out.println(firstEmployer.getFullName() + " " + "обрадів, зателефонував зі свого номеру телефона " + firstEmployer.getPhoneNumber()
                +" кенту, і похав, але не довго)... бо?");
        car.start();car.checkStatus();
    }
}
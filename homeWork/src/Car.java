public class Car {

    private Boolean status = false;
    private Boolean electricity = false;
    private Boolean command = false;
    private Boolean fuelSystem = false;

    public void checkStatus(){
        if(status) System.out.println("**Машину запущено**");
        if(!status) System.out.println("**Тачку хтось заглушив**");
    }
    public void start(){
        startElectricity();
        startCommand();
        startFuelSystem();
        if(electricity&&command&&fuelSystem) this.status = true;
        if(!electricity&&!command&&!fuelSystem) this.status = false;
    }
    private void startElectricity(){
        if (!electricity) {
            this.electricity = true;
        }else if(electricity) this.electricity = false;
    }
    private void startCommand(){
        if (!command) {
            this.command = true;
        }else if(command) this.command = false;
    }

    private void startFuelSystem(){
        if (!fuelSystem) {
            this.fuelSystem = true;
        }else if(fuelSystem) this.fuelSystem = false;
    }
}

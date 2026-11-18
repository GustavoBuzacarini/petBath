public class PetMachine {

    private static final int MAX_WATER = 30;
    private static final int MAX_SHAMPOO = 10;
    private static final int SUPPLY_AMOUNT = 2;
    private static final int SHOWER_WATER = 10;
    private static final int SHOWER_SHAMPOO = 2;
    private static final int WASH_WATER = 3;
    private static final int WASH_SHAMPOO = 1;

    private boolean clean = true;

    private int water = 0;

    private int shampoo = 0;

    private Pet pet;

    public void takeShower(){
        if (this.pet == null){
            System.out.println("Coloque o pet na máquina para iniciar o banho");
            return;
        }

        if (pet.isClean()){
            System.out.println("O pet " + pet.getNome() + " já está limpo");
            return;
        }

        if (this.water < SHOWER_WATER || this.shampoo < SHOWER_SHAMPOO){
            System.out.println("Água ou shampoo insuficiente para o banho (necessário "
                    + SHOWER_WATER + "L de água e " + SHOWER_SHAMPOO + "L de shampoo)");
            return;
        }

        this.water -= SHOWER_WATER;
        this.shampoo -= SHOWER_SHAMPOO;
        pet.setClean(true);
        System.out.println("O pet " + pet.getNome() + " está limpo");
    }

    public void addWater(){
        if (water >= MAX_WATER){
            System.out.println("A capacidade da água da máquina está no máximo");
            return;
        }

        water += SUPPLY_AMOUNT;
    }

    public void addShampoo(){
        if (shampoo >= MAX_SHAMPOO){
            System.out.println("A capacidade de shampoo da máquina está no máximo");
            return;
        }

        shampoo += SUPPLY_AMOUNT;
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean hasPet(){
        return pet != null;
    }

    public void setPet(Pet pet) {
        if (hasPet()){
            System.out.println("O pet " + this.pet.getNome() + " está na máquina");
            return;
        }

        if (!this.clean){
            System.out.println("A máquina está suja, para colocar o pet é necessário limpá-la");
            return;
        }

        this.pet = pet;
    }

    public void removePet(){
        if (!hasPet()){
            System.out.println("Não há pet na máquina");
            return;
        }

        this.clean = this.pet.isClean();
        if (this.pet.isClean()){
            System.out.println("O pet " + this.pet.getNome() + " saiu limpo");
        } else {
            System.out.println("O pet " + this.pet.getNome() + " saiu sujo, é necessário limpar a máquina");
        }
        this.pet = null;
    }

    public void wash(){
        if (hasPet()){
            System.out.println("Retire o pet da máquina antes de limpá-la");
            return;
        }

        if (this.clean){
            System.out.println("A máquina já está limpa");
            return;
        }

        if (this.water < WASH_WATER || this.shampoo < WASH_SHAMPOO){
            System.out.println("Água ou shampoo insuficiente para limpar a máquina (necessário "
                    + WASH_WATER + "L de água e " + WASH_SHAMPOO + "L de shampoo)");
            return;
        }

        this.water -= WASH_WATER;
        this.shampoo -= WASH_SHAMPOO;
        this.clean = true;
        System.out.println("A máquina está limpa");
    }

}

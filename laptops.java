class laptop {
    private String name;
    private int id;
    private int model;

    public laptop(String name, int id, int model){
        this.name = name;
        this.id=id;
        this.model = model;
    }

    public laptop(){}
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getModel(){
        return model;
    }
    public void setModel(int model){
        this.model = model;
    }
    @Override public String toString (){
        return "Laptop [ name = "+name+" id = "+ id + " model = "+model+ "]";
    }
    public void display_model(){
        System.out.println(name+" The current model is: "+ model);
    }
}
public class laptops{
    public static void main(String[] args){
        laptop ABC = new laptop("ABC",10,1947);
        laptop XYZ = new laptop("XYZ", 5,100);
        System.out.println(ABC.toString());
        ABC.display_model();
        ABC.setModel(11);
        System.out.println("Updated model is "+ ABC.getModel());

        System.out.println(XYZ.toString());
        XYZ.display_model();
        XYZ.setModel(10);
        System.out.println("Updated model for "+XYZ.getName() + " is: "+ XYZ.getModel());
    }
}

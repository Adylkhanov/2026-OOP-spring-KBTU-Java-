package labs.lab2.Problem1.PartC;

public class Dotahero {
    private String name;
    private String role;
    private String primaryAttribute;
    private int baseHealth;
    private int baseMana;

    public Dotahero(String name, String role, String primaryAttribute, int baseHealth, int baseMana) {
        this.name = name;
        this.role = role;
        this.primaryAttribute = primaryAttribute;
        this.baseHealth = baseHealth;
        this.baseMana = baseMana;
    }

    public String getName() { return name; }
    public String getRole() { return role; }
    public String getPrimaryAttribute() { return primaryAttribute; }
    public int getBaseHealth() { return baseHealth; }
    public int getBaseMana() { return baseMana; }
    public void setName(String name) { this.name = name; }
    public void setRole(String role) { this.role = role; }
    public void setPrimaryAttribute(String primaryAttribute) { this.primaryAttribute = primaryAttribute; }
    public void setBaseHealth(int baseHealth) { this.baseHealth = baseHealth; }
    public void setBaseMana(int baseMana) { this.baseMana = baseMana; }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Dotahero dotahero = (Dotahero) obj;
        return name.equals(dotahero.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "Dotahero{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", primaryAttribute='" + primaryAttribute + '\'' +
                ", baseHealth=" + baseHealth +
                ", baseMana=" + baseMana +
                '}';
    }
    





    
}

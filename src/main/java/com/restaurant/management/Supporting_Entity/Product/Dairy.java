package com.restaurant.management.Supporting_Entity.Product;
import com.restaurant.management.Enums.Item_Type;

import jakarta.persistence.*;

@Entity
@Table(name="dairy")
public class Dairy extends Item {
    
    private double mass;
    private int threshMass;
    
   public Dairy()
   {
       super();
       
   }
   
    
    
      public Dairy(double mass, int threshMass) {
    this.mass = mass;
    this.threshMass = threshMass;
}



    public Dairy(Long id, String name, Item_Type type, double mass, int threshMass) {
    super(id, name, type);
    this.mass = mass;
    this.threshMass = threshMass;
}



    public double getMass() {
        return mass;
    }



    public void setMass(double mass) {
        this.mass = mass;
    }



    public int getThreshMass() {
        return threshMass;
    }



    public void setThreshMass(int threshMass) {
        this.threshMass = threshMass;
    }



    @Override
    public Item createItem()
    {
        return new Dairy();
    }
}
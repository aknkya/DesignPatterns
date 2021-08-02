package com.company.Creational;

public class Person {
    private  String name;
    private String lastname;
    private Integer age;
    private Integer weight;
    private String hairColor;
    private String  footSize;

    private Person(){

    }




  public static   class PersonBuilder{
        private    String name;
        private  String lastname;
        private  Integer age;
        private Integer weight;
        private String hairColor;
        private String  footSize;

      public Integer getWeight() {
          return weight;
      }

      public void setWeight(Integer weight) {
          this.weight = weight;
      }

      public String getHairColor() {
          return hairColor;
      }

      public void setHairColor(String hairColor) {
          this.hairColor = hairColor;
      }

      public PersonBuilder(String name, String lastname, Integer age) {
          this.name = name;
          this.lastname = lastname;
          this.age = age;
      }



        public PersonBuilder setWeigt(Integer weight){
            this.weight=weight;
            return this;


    }


    public Person build(){
            Person person =new Person();

            person.weight=this.weight;
            person.hairColor=this.hairColor;
            person.footSize=this.footSize;
            return person;
    }


}

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", hairColor='" + hairColor + '\'' +
                ", footSize='" + footSize + '\'' +
                '}';
    }
}



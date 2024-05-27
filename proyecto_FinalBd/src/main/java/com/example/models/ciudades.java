package com.example.models;

    import jakarta.persistence.Column;
    import jakarta.persistence.Entity;
    import jakarta.persistence.GeneratedValue;
    import jakarta.persistence.GenerationType;
    import jakarta.persistence.Id;
    import jakarta.persistence.Table;
    
    @Entity
    @Table(name = "ciudades ")
    public class ciudades  {
    
            
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="id",  unique = true, nullable = false)
        private Integer id;
    
        @Column(name="nombre", nullable=false, length = 45)
        private String nombre;

        @Column(name="clima", nullable=false, length = 45)
        private String clima;
    
    
        public ciudades () {
            super();
        
        }


        public ciudades(Integer id, String nombre, String clima) {
            this.id = id;
            this.nombre = nombre;
            this.clima = clima;
        }


        public Integer getId() {
            return id;
        }


        public void setId(Integer id) {
            this.id = id;
        }


        public String getNombre() {
            return nombre;
        }


        public void setNombre(String nombre) {
            this.nombre = nombre;
        }


        public String getClima() {
            return clima;
        }


        public void setClima(String clima) {
            this.clima = clima;
        } 
        
}

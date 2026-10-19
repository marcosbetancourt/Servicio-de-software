void main() {
    Servicio s1 = new Servicio();

    s1.setNombre("API-Rest");
    s1.setPuerto(8080);
    s1.setCantidadPeticiones(0);


    System.out.println("-------------------");

    s1.iniciar();
    s1.registrarPeticion();

    System.out.println("-------------------");
    s1.mostrarInformacion();
}
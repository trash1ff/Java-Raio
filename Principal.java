class Principal {
  public static void main(String args[]) {
    Circulo circ = new Circulo();
    circ.nome = "FN-2187";
    circ.posX = 7;
    circ.posY = 3;
    circ.raio = 2.5;
    
    System.out.println("O circulo circ está em (" 
                      + circ.posX + ", " + circ.posY 
                      + "). Possui raio " + circ.raio
                      + " e area " + circ.getArea()
                      +", Diametro:" + circ.getDiametro());
  }
}

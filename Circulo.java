class Circulo {
  String nome;
  int posX, posY;
  double raio;

  double getDiametro() {
    return 2 * raio;
  }
  
  double getArea() {
    return 3.14159 * raio * raio;
  }
}

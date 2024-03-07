/*
////////////////////////
AUTORS:

Jan Fehér
Adam Klíma
////////////////////////
*/

double senzor = A0;
double fotoOdpor = 1450;
double odpor = 9930;
double vypocet;
double svetlo;

void setup() {
  Serial.begin(9600);  
}

void loop() {
  svetlo = analogRead(senzor);

  svetlo = 1023 / svetlo - 1;
  svetlo = odpor / svetlo;
  
  Serial.print(svetlo);
  Serial.print("\n");

  vypocet = 0;
  vypocet = svetlo / fotoOdpor;
  vypocet = log(vypocet);
  // int vypocet = map(svetlo, 0, 1023, 0, 100);
   
  Serial.print("Světlo: ");
  Serial.print(vypocet);
  Serial.print("\n");

  delay(1000);
}

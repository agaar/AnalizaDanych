# AnalizaDanych
Program analizuje dane z pliku CSV

Jako parametr uruchomienia programu użytkownik musi podać nazwę pliku do wczytania oraz numer operacji do wykonania. 
Opcjonalnie mogą być podane również parametry dla niektórych opcji programu. 
Program wczytuje plik CSV z danymi reprezentującymi jeden z trzech obiektów: człowiek, pies, rowerzysta (przykładowe dane poniżej). 
W zależności od wybranej opcji program wykonuje jedno z kilku zadań:

1. wyświetla pierwsze 10 elementów z pliku w przyjaznej dla użytkownika formie (różnej w zależności od typu obiektu).  
		java -jar program.jar ludzie_w_warszawie.csv 1  
		java -jar program.jar psy_schronisko_01.csv 1  
2. wyświetla liczbę elementów zapisanych w pliku  
		java -jar program.jar ludzie_w_warszawie.csv 2  
		java -jar program.jar psy_schronisko_01.csv 2  
3. wyświetla elementy których id jest większe niż podane, wyniki posortowane po id  
		java -jar program.jar ludzie_w_warszawie.csv 3 12  
		java -jar program.jar psy_schronisko_01.csv 3 1231  
4. wyświetla wszystkie imiona i liczbę wystąpień elementów o danym imieniu, których liczba powtórzeń jest większa niż 100, posortowane po liczbie wystąpień  
		java -jar program.jar ludzie_w_warszawie.csv 4  
		java -jar program.jar psy_schronisko_01.csv 4  
		przykładowy wynik:  
		Piotr 1234432  
		Paweł 148  
5. wyświetla imię elementu o zadanym id oraz jeśli element ten posiada parametr parent_id to liczbę jego 'rodziców' do samej góry hierarchii (do elementu o parent_id = 0, w hierarchii tylko jeden obiekt może mieć parent_id = 0 i wszystkie elementy tworzą jedno drzewo)  
		java -jar program.jar ludzie_w_warszawie.csv 5 3  
		przykładowe dane:  
		id,name,age,parent_id  
		1,Piotr,47,5  
		2,Pawel,32,5  
		3,Wladyslaw,11,2  
		4,Boleslaw,12,2  
		5,Zdzislaw,48,7  
		6,Zbigniew,50,0  
		7,Bogumil,83,6  
		8,Waclaw,89,6  
		Wynik: Wladyslaw - 4  
6. wyświetla średnią wieku wszystkich elementów  
		java -jar program.jar ludzie_w_warszawie.csv 6  
7**. wyświetla zakresy wieku występujących elementów, podzielone na 25% wartości między min a max występujących wartości wieku. Podaje również procent elementów z pliku, który mieści się danym zakresie wieku):  
	java -jar program.jar ludzie_w_warszawie.csv 7  
	przykładowe dane jak w punkcie 5.  
	wynik (max wiek to 89 lat, min to 11, przedział 25% to 19,5 roku):  
	11-30,5 : 25%  
	30,5-50 : 50%  
	50-69,5 : 0%  
	69,5-89 : 25%  

# Clase si obiecte. Extinderea claselor. Polimorfism

#### Principiile programarii orientate pe obiecte:
- Abstractizarea: reducerea la un model simplu a proprietatilor si functionalitatilor unui obiect, prin definirea unui sablon (template); ascunderea anumitor detalii 
- Incapsularea: proprietatea claselor de a grupa datele şi metodele într-o singură structură de date; datele se definesc impreuna cu codul ce actioneaza asupra lor
- Mostenirea: o clasa copil poate mosteni starile si comportamentele unei clase parinte
- Polimorfismul: capacitatea unui obiect de a lua forme diferite.


#### Clase si obiecte
In Java, tipurile complexe de date sunt modelate folosind clase.

Clasa este o abstractizare folosita pentru a crea obiecte, un template.

Obiect = instanta a unei clase; in monetul instantierii se aloca spatiu in memorie pentru obiectul respectiv.

O clasa contine:
- atribute (datele, state-ul obiectului)
- metode (cod executabil)
- constructori (cod executabil folosit pentru instantierea obiectelor)

Keyword: this - referinta la obiectul curent

#### Modificatori de access:

###### Private

- vizibilitate doar in interiorul clasei
- poate fi folosit pentru: metode, atribute, clase (doar interne)
###### Default (package)

- daca nu punem nici un modificator de access => default (vizibilitate la nivel de package)
- poate fi folosit pentru: metode, atribute, clase

###### Protected

- vizibilitate in interiorul pachetului si in exterior din cadrul claselor copil
- poate fi folosit pentru: metode, atribute, clase (doar interne)

###### Public

- poate fi accesat de oriunde
- poate fi folosit pentru: metode, atribute, clase

#### Mostenirea

- prin mostenire, o clasa de baza (parinte) este extinsa, adaugand functionalitate mai specializata
- keyword: extends
- nu putem mosteni mai multe clase simultan
- in Java, orice clasa extinde by default clasa Object.

#### Static keyword

Static fields: 

- va exista intr-un singur exemplar in memorie, indiferent de numarul de instante ale clasei
- campul este vizibil tuturor instantelor clasei si poate fi modificat de oricare dintre acestea

Static methods:

- pot fi apelate fara a fi nevoie sa creezi o instanta a clasei

#### Final keyword

- pe atribut/variabila: nu poate fi modificata (devine constanta)
- pe metoda: nu poate fi suprascrisa
- pe clasa: nu poate fi extinsa

#### Enum

- tip special de clasa ce mapeaza o lista de constante